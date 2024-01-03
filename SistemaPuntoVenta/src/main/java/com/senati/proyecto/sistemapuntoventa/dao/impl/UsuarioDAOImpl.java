/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.dao.impl;

import com.senati.proyecto.sistemapuntoventa.dao.UsuarioDAO;
import com.senati.proyecto.sistemapuntoventa.model.Usuario;
import com.senati.proyecto.sistemapuntoventa.dao.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO{
    private PreparedStatement statement = null;
    private Connection conexion;
    
    public UsuarioDAOImpl(){
        this.conexion = Conexion.obtenerConexion();
    }

    @Override
    public List<Usuario> ListarUsuarios() {
        List<Usuario> listaUsuario = new ArrayList<>();

        try {
            String consulta = "select * from usuarios";
            statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String contrasenia = resultSet.getString("contrasenia");
                String puesto = resultSet.getString("puesto");
                int estado = resultSet.getInt("estado");
                Timestamp creado_en = resultSet.getTimestamp("creado_en");
                Timestamp actualizado_en = resultSet.getTimestamp("actualizado_en");
                
                Usuario usu = new Usuario();
                usu.setId(id);
                usu.setNombre(nombre);
                usu.setContrasenia(contrasenia);
                usu.setPuesto(puesto);
                usu.setEstado(estado);
                usu.setCreado_en(creado_en);
                usu.setActualizado_en(actualizado_en);
                listaUsuario.add(usu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaUsuario;
    }
    
    public void agregarUsuario(Usuario usuario) {
        try {
            String consulta = "INSERT INTO usuarios (nombre, contrasenia, puesto) VALUES (?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getContrasenia());
            statement.setString(3, usuario.getPuesto());
        
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void modificarUsuario(Usuario usuario) {
        try {
            String consulta = "UPDATE usuarios SET nombre=?, contrasenia=?, puesto=?, WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getContrasenia());
            statement.setString(3, usuario.getPuesto());
            statement.setInt(4, usuario.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void estadoUsuario(Usuario usuario) {
        try {
            String consulta = "UPDATE ventas SET estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setDouble(1, usuario.getEstado());
            statement.setInt(2, usuario.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarUsuario(int id) {
        try {
            String consulta = "DELETE FROM usuarios WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}