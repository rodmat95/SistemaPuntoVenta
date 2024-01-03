/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.controller;

import com.senati.proyecto.sistemapuntoventa.dao.impl.UsuarioDAOImpl;
import com.senati.proyecto.sistemapuntoventa.model.Usuario;

import java.util.List;

public class UsuarioController {
    private final UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
    
    public Usuario validarCredenciales(String nombreUsuario, String contrasenia) {
        List<Usuario> listaUsuarios = usuarioDAOImpl.ListarUsuarios();
        
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombreUsuario) && usuario.getContrasenia().equals(contrasenia)) { 
                return usuario;
            }
        }
        return null;
    }
    
    public List<Usuario> contarUsuarios(){
        List<Usuario> contarUsuario = null;
        contarUsuario = usuarioDAOImpl.ListarUsuarios();
        
        System.out.println(contarUsuario.size());
        return contarUsuario;
    }
    
    public List<Usuario> listarUsuarios(){
        List<Usuario> listaUsuario = null;
        listaUsuario = usuarioDAOImpl.ListarUsuarios();
        
        for (Usuario usuarios : listaUsuario) {
            System.out.println("ID: " + usuarios.getId()
                    + ", Nombre: " + usuarios.getNombre()
                    + ", Contraseña: " + usuarios.getContrasenia()
                    + ", Puesto: " + usuarios.getPuesto()
                    + ", Estado: " + usuarios.getEstado()
                    + ", Creado en: " + usuarios.getCreado_en()
                    + ", Actualizado en: " + usuarios.getActualizado_en());
        }
        return listaUsuario;
    }
    
    public void agregarUsuario(Usuario usuario) {
        usuarioDAOImpl.agregarUsuario(usuario);
    }
    
    public void modificarUsuario(Usuario usuario) {
        usuarioDAOImpl.modificarUsuario(usuario);
    }
    
    public void estadoUsuario(Usuario usuario) {
        usuarioDAOImpl.estadoUsuario(usuario);
    }
    
    public void eliminarUsuario(int id) {
        usuarioDAOImpl.eliminarUsuario(id);
    }

    public void listarusuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}