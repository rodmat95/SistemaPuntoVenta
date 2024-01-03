/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.dao.impl;

import com.senati.proyecto.sistemapuntoventa.dao.ProductoDAO;
import com.senati.proyecto.sistemapuntoventa.model.Producto;
import com.senati.proyecto.sistemapuntoventa.dao.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO {
    private PreparedStatement statement = null;
    private Connection conexion;
    
    public ProductoDAOImpl(){
        this.conexion = Conexion.obtenerConexion();
    }

    @Override
    public List<Producto> ListarProductos() {
        
        List<Producto> listaProducto = new ArrayList<>();

        try {
            String consulta = "select * from productos";
            statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int categoria_id = resultSet.getInt("categoria_id");
                String nombre = resultSet.getString("nombre");
                String descripcion = resultSet.getString("descripcion");
                double precio = resultSet.getDouble("precio");
                int stock = resultSet.getInt("stock");
                int estado = resultSet.getInt("estado");
                Timestamp creado_en = resultSet.getTimestamp("creado_en");
                Timestamp actualizado_en = resultSet.getTimestamp("actualizado_en");
                
                Producto prod = new Producto();
                prod.setId(id);
                prod.setCategoria_id(categoria_id);
                prod.setNombre(nombre);
                prod.setDescripcion(descripcion);
                prod.setPrecio(precio);
                prod.setStock(stock);
                prod.setEstado(estado);
                prod.setCreado_en(creado_en);
                prod.setActualizado_en(actualizado_en);
                listaProducto.add(prod);   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaProducto;
    }
    
    public void agregarProducto(Producto producto) {
        try {
            String consulta = "INSERT INTO productos (categoria_id, nombre, descripcion, precio, stock) VALUES (?, ?, ?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, producto.getCategoria_id());
            statement.setString(2, producto.getNombre());
            statement.setString(3, producto.getDescripcion());
            statement.setDouble(4, producto.getPrecio());
            statement.setInt(5, producto.getStock());
        
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void modificarProducto(Producto producto) {
        try {
            String consulta = "UPDATE productos SET categoria_id=?, nombre=?, descripcion=?, precio=?, stock=?, estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, producto.getCategoria_id());
            statement.setString(2, producto.getNombre());
            statement.setString(3, producto.getDescripcion());
            statement.setDouble(4, producto.getPrecio());
            statement.setInt(5, producto.getStock());
            statement.setInt(6, producto.getEstado());
            statement.setInt(7, producto.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void estadoProducto(Producto producto) {
        try {
            String consulta = "UPDATE ventas SET estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setDouble(1, producto.getEstado());
            statement.setInt(2, producto.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarProducto(int id) {
        try {
            String consulta = "DELETE FROM productos WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}