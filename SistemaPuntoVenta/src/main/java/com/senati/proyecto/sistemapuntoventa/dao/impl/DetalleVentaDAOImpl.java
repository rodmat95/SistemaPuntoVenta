/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.dao.impl;

import com.senati.proyecto.sistemapuntoventa.dao.DetalleVentaDAO;
import com.senati.proyecto.sistemapuntoventa.model.DetalleVenta;
import com.senati.proyecto.sistemapuntoventa.dao.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DetalleVentaDAOImpl implements DetalleVentaDAO {
    private PreparedStatement statement = null;
    private Connection conexion;
    
    public DetalleVentaDAOImpl(){
        this.conexion = Conexion.obtenerConexion();
    }

    @Override
    public List<DetalleVenta> ListarDetalleVentas() {
        
        List<DetalleVenta> listaDetalleVenta = new ArrayList<>();

        try {
            String consulta = "select * from detalle_ventas";
            statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int venta_id = resultSet.getInt("venta_id");
                int producto_id = resultSet.getInt("producto_id");
                int cantidad = resultSet.getInt("cantidad");
                double precio_unitario = resultSet.getDouble("precio_unitario");
                double descuento = resultSet.getDouble("descuento");
                double precio_total = resultSet.getDouble("precio_total");
                int estado = resultSet.getInt("estado");
                Timestamp creado_en = resultSet.getTimestamp("creado_en");
                Timestamp actualizado_en = resultSet.getTimestamp("actualizado_en");
                
                DetalleVenta detvent = new DetalleVenta();
                detvent.setId(id);
                detvent.setVenta_id(venta_id);
                detvent.setProducto_id(producto_id);
                detvent.setCantidad(cantidad);
                detvent.setPrecio_unitario(precio_unitario);
                detvent.setDescuento(descuento);
                detvent.setPrecio_total(precio_total);
                detvent.setEstado(estado);
                detvent.setCreado_en(creado_en);
                detvent.setActualizado_en(actualizado_en);
                listaDetalleVenta.add(detvent);   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaDetalleVenta;
    }
    
    public void agregarDetalleVenta(DetalleVenta detalleventa) {
        try {
            String consulta = "INSERT INTO detalle_ventas (venta_id, producto_id, cantidad, precio_unitario, descuento, precio_total) VALUES (?, ?, ?, ?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, detalleventa.getVenta_id());
            statement.setInt(2, detalleventa.getProducto_id());
            statement.setInt(3, detalleventa.getCantidad());
            statement.setDouble(4, detalleventa.getPrecio_unitario());
            statement.setDouble(5, detalleventa.getDescuento());
            statement.setDouble(6, detalleventa.getPrecio_total());
        
            int filasAfectadas = statement.executeUpdate();
            
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int detalleVentaId = generatedKeys.getInt(1);
                    System.out.println("Detalle de venta registrado exitosamente. ID de detalle de venta: " + detalleVentaId);
                } else {
                    System.out.println("Error al registrar el detalle de venta.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error SQL al registrar el detalle de venta.");
        }
    }
    
    public void modificarDetalleVenta(DetalleVenta detalleventa) {
        try {
            String consulta = "UPDATE detalle_ventas SET venta_id=?, producto_id=?, cantidad=?, precio_unitario=?, precio_total=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, detalleventa.getVenta_id());
            statement.setInt(2, detalleventa.getProducto_id());
            statement.setInt(3, detalleventa.getCantidad());
            statement.setDouble(4, detalleventa.getPrecio_unitario());
            statement.setDouble(5, detalleventa.getPrecio_total());
            statement.setInt(6, detalleventa.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void estadoDetalleVenta(DetalleVenta detalleventa) {
        try {
            String consulta = "UPDATE ventas SET estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setDouble(1, detalleventa.getEstado());
            statement.setInt(2, detalleventa.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarDetalleVenta(int id) {
        try {
            String consulta = "DELETE FROM detalle_ventas WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}