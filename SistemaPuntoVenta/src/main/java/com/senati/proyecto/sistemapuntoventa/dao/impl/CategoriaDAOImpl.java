/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.dao.impl;

import com.senati.proyecto.sistemapuntoventa.dao.CategoriaDAO;
import com.senati.proyecto.sistemapuntoventa.model.Categoria;
import com.senati.proyecto.sistemapuntoventa.dao.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAOImpl implements CategoriaDAO {
    private PreparedStatement statement = null;
    private Connection conexion;
    
    public CategoriaDAOImpl(){
        this.conexion = Conexion.obtenerConexion();
    }

    @Override
    public List<Categoria> ListarCategorias() {
        
        List<Categoria> listaCategoria = new ArrayList<>();

        try {
            String consulta = "select * from categorias";
            statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String descripcion = resultSet.getString("descripcion");
                int estado = resultSet.getInt("estado");
                Timestamp creado_en = resultSet.getTimestamp("creado_en");
                Timestamp actualizado_en = resultSet.getTimestamp("actualizado_en");
                
                Categoria cate = new Categoria();
                cate.setId(id);
                cate.setNombre(nombre);
                cate.setDescripcion(descripcion);
                cate.setEstado(estado);
                cate.setCreado_en(creado_en);
                cate.setActualizado_en(actualizado_en);
                listaCategoria.add(cate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaCategoria;
    }
    
    public void agregarCategoria(Categoria categoria) {
        try {
            String consulta = "INSERT INTO categorias (nombre, descripcion) VALUES (?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, categoria.getNombre());
            statement.setString(2, categoria.getDescripcion());
        
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void modificarCategoria(Categoria categoria) {
        try {
            String consulta = "UPDATE categorias SET nombre=?, descripcion=?, estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, categoria.getNombre());
            statement.setString(2, categoria.getDescripcion());
            statement.setDouble(3, categoria.getEstado());
            statement.setInt(4, categoria.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void estadoCategoria(Categoria categoria) {
        try {
            String consulta = "UPDATE ventas SET estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setDouble(1, categoria.getEstado());
            statement.setInt(2, categoria.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarCategoria(int id) {
        try {
            String consulta = "DELETE FROM categorias WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}