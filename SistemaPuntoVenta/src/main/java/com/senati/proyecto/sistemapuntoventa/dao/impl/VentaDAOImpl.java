/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.dao.impl;

import com.senati.proyecto.sistemapuntoventa.dao.VentaDAO;
import com.senati.proyecto.sistemapuntoventa.model.Venta;
import com.senati.proyecto.sistemapuntoventa.dao.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class VentaDAOImpl implements VentaDAO {
    private PreparedStatement statement = null;
    private Connection conexion;
    
    public VentaDAOImpl(){
        this.conexion = Conexion.obtenerConexion();
    }

    @Override
    public List<Venta> ListarVentas() {
        
        List<Venta> listaVenta = new ArrayList<>();

        try {
            String consulta = "select * from ventas";
            statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int usuario_id = resultSet.getInt("usuario_id");
                int cliente_id = resultSet.getInt("cliente_id");
                Timestamp fecha_venta = resultSet.getTimestamp("fecha_venta");
                double subtotal = resultSet.getDouble("subtotal");
                double descuento = resultSet.getDouble("descuento");
                double igv = resultSet.getDouble("igv");
                double cantidad_total = resultSet.getDouble("cantidad_total");
                int estado = resultSet.getInt("estado");
                Timestamp creado_en = resultSet.getTimestamp("creado_en");
                Timestamp actualizado_en = resultSet.getTimestamp("actualizado_en");
                
                Venta vent = new Venta();
                vent.setId(id);
                vent.setUsuario_id(usuario_id);
                vent.setCliente_id(cliente_id);
                vent.setFecha_venta(fecha_venta);
                vent.setSubtotal(subtotal);
                vent.setDescuento(descuento);
                vent.setIgv(igv);
                vent.setCantidad_total(cantidad_total);
                vent.setEstado(estado);
                vent.setCreado_en(creado_en);
                vent.setActualizado_en(actualizado_en);
                listaVenta.add(vent);   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaVenta;
    }
    
    public int agregarVenta(Venta venta) {
        int ventaId = -1;
        
        try {
            String consulta = "INSERT INTO ventas (usuario_id, cliente_id, fecha_venta, subtotal, descuento, igv, cantidad_total) VALUES (?, ?, ?, ?, ?, ?, ?)";
            statement = conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, venta.getUsuario_id());
            statement.setInt(2, venta.getCliente_id());
            statement.setTimestamp(3, venta.getFecha_venta());
            statement.setDouble(4, venta.getSubtotal());
            statement.setDouble(5, venta.getDescuento());
            statement.setDouble(6, venta.getIgv());
            statement.setDouble(7, venta.getCantidad_total());
        
            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    ventaId = generatedKeys.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } return ventaId;
    }
    
    public void modificarVenta(Venta venta) {
        try {
            String consulta = "UPDATE ventas SET usuario_id=?, cliente_id=?, fecha_venta=?, subtotal=?, descuento=?, igv=?, cantidad_total=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, venta.getUsuario_id());
            statement.setInt(2, venta.getCliente_id());
            statement.setTimestamp(3, venta.getFecha_venta());
            statement.setDouble(4, venta.getSubtotal());
            statement.setDouble(5, venta.getDescuento());
            statement.setDouble(6, venta.getIgv());
            statement.setDouble(7, venta.getCantidad_total());
            statement.setInt(8, venta.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void estadoVenta(Venta venta) {
        try {
            String consulta = "UPDATE ventas SET estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setDouble(1, venta.getEstado());
            statement.setInt(2, venta.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarVenta(int id) {
        try {
            String consulta = "DELETE FROM ventas WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}