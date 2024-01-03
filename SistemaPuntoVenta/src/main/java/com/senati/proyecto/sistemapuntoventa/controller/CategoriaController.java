/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.controller;

import com.senati.proyecto.sistemapuntoventa.dao.impl.CategoriaDAOImpl;
import com.senati.proyecto.sistemapuntoventa.model.Categoria;

import java.util.List;

public class CategoriaController {
    private CategoriaDAOImpl categoriaDAOImpl = null;
    
    public CategoriaController(){
        categoriaDAOImpl = new  CategoriaDAOImpl();
    }
    
    public List<Categoria> contarCategorias(){
        List<Categoria> contarCategoria = null;
        contarCategoria = categoriaDAOImpl.ListarCategorias();
        
        System.out.println(contarCategoria.size());
        return contarCategoria;
    }
    
    public List<Categoria> listarCategorias(){
        List<Categoria> listaCategoria = null;
        listaCategoria = categoriaDAOImpl.ListarCategorias();
        
        for (Categoria categorias : listaCategoria) {
            System.out.println("ID: " + categorias.getId()
                    + ", Nombre: " + categorias.getNombre()
                    + ", Descripcion: " + categorias.getDescripcion()
                    + ", Estado: " + categorias.getEstado()
                    + ", Creado en: " + categorias.getCreado_en()
                    + ", Actualizado en: " + categorias.getActualizado_en());
        }
        return listaCategoria;
    }
    
    public void agregarCategoria(Categoria categoria) {
        categoriaDAOImpl.agregarCategoria(categoria);
    }
    
    public void modificarCategoria(Categoria categoria) {
        categoriaDAOImpl.modificarCategoria(categoria);
    }
    
    public void estadoCategoria(Categoria categoria) {
        categoriaDAOImpl.estadoCategoria(categoria);
    }
    
    public void eliminarCategoria(int id) {
        categoriaDAOImpl.eliminarCategoria(id);
    }

    public void listarcategorias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}