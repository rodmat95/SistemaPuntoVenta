/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.dao.impl;

import com.senati.proyecto.sistemapuntoventa.dao.ClienteDAO;
import com.senati.proyecto.sistemapuntoventa.model.Cliente;
import com.senati.proyecto.sistemapuntoventa.dao.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private PreparedStatement statement = null;
    private Connection conexion;
    
    public ClienteDAOImpl(){
        this.conexion = Conexion.obtenerConexion();
    }

    @Override
    public List<Cliente> ListarClientes() {
        
        List<Cliente> listaCliente = new ArrayList<>();

        try {
            String consulta = "select * from clientes";
            statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String numero = resultSet.getString("numero");
                String direccion = resultSet.getString("direccion");
                int dni = resultSet.getInt("dni");
                int estado = resultSet.getInt("estado");
                Timestamp creado_en = resultSet.getTimestamp("creado_en");
                Timestamp actualizado_en = resultSet.getTimestamp("actualizado_en");
                
                Cliente clie = new Cliente();
                clie.setId(id);
                clie.setNombre(nombre);
                clie.setNumero(numero);
                clie.setDireccion(direccion);
                clie.setDni(dni);
                clie.setEstado(estado);
                clie.setCreado_en(creado_en);
                clie.setActualizado_en(actualizado_en);
                listaCliente.add(clie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaCliente;
    }
    
    public void agregarCliente(Cliente cliente) {
        try {
            String consulta = "INSERT INTO clientes (nombre, numero, direccion, dni) VALUES (?, ?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getNumero());
            statement.setString(3, cliente.getDireccion());
            statement.setInt(4, cliente.getDni());
        
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void modificarCliente(Cliente cliente) {
        try {
            String consulta = "UPDATE clientes SET nombre=?, numero=?, direccion=?, dni=?, estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getNumero());
            statement.setString(3, cliente.getDireccion());
            statement.setInt(4, cliente.getDni());
            statement.setDouble(5, cliente.getEstado());
            statement.setInt(6, cliente.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void estadoCliente(Cliente cliente) {
        try {
            String consulta = "UPDATE ventas SET estado=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setDouble(1, cliente.getEstado());
            statement.setInt(2, cliente.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarCliente(int id) {
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