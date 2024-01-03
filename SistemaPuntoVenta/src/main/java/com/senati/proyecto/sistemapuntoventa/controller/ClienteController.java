/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.controller;

import com.senati.proyecto.sistemapuntoventa.dao.impl.ClienteDAOImpl;
import com.senati.proyecto.sistemapuntoventa.model.Cliente;

import java.util.List;

public class ClienteController {
    private ClienteDAOImpl clienteDAOImpl = null;
    
    public ClienteController(){
        clienteDAOImpl = new  ClienteDAOImpl();
    }
    
    public List<Cliente> contarClientes(){
        List<Cliente> contarCliente = null;
        contarCliente = clienteDAOImpl.ListarClientes();
        
        System.out.println(contarCliente.size());
        return contarCliente;
    }
    
    public List<Cliente> listarClientes(){
        List<Cliente> listaCliente = null;
        listaCliente = clienteDAOImpl.ListarClientes();
        
        for (Cliente clientes : listaCliente) {
            System.out.println("ID: " + clientes.getId()
                    + ", Nombre: " + clientes.getNombre()
                    + ", Numero: " + clientes.getNumero()
                    + ", Direccion: " + clientes.getDireccion()
                    + ", DNI: " + clientes.getDni()
                    + ", Estado: " + clientes.getEstado()
                    + ", Creado en: " + clientes.getCreado_en()
                    + ", Actualizado en: " + clientes.getActualizado_en());
        }
        return listaCliente;
    }
    
    public void agregarCliente(Cliente cliente) {
        clienteDAOImpl.agregarCliente(cliente);
    }
    
    public void modificarCliente(Cliente cliente) {
        clienteDAOImpl.modificarCliente(cliente);
    }
    
    public void estadoCliente(Cliente cliente) {
        clienteDAOImpl.estadoCliente(cliente);
    }
    
    public void eliminarCliente(int id) {
        clienteDAOImpl.eliminarCliente(id);
    }

    public void listarclientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}