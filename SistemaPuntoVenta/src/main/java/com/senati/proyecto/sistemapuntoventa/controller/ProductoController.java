/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.controller;

import com.senati.proyecto.sistemapuntoventa.dao.impl.ProductoDAOImpl;
import com.senati.proyecto.sistemapuntoventa.model.Producto;

import java.util.List;

public class ProductoController {
    private final ProductoDAOImpl productoDAOImpl = new ProductoDAOImpl();
    
    public List<Producto> contarProductos(){
        List<Producto> contarProducto = null;
        contarProducto = productoDAOImpl.ListarProductos();
        
        System.out.println(contarProducto.size());
        return contarProducto;
    }
    
    public List<Producto> listarProductos(){
        List<Producto> listaProducto = null;
        listaProducto = productoDAOImpl.ListarProductos();
        
        for (Producto productos : listaProducto) {
            System.out.println("ID: " + productos.getId()
                    + ", Categoria ID: " + productos.getCategoria_id()
                    + ", Nombre: " + productos.getNombre()
                    + ", Descripcion: " + productos.getDescripcion()
                    + ", Precio: " + productos.getPrecio()
                    + ", Stock: " + productos.getStock()
                    + ", Estado: " + productos.getEstado()
                    + ", Creado en: " + productos.getCreado_en()
                    + ", Actualizado en: " + productos.getActualizado_en());
        }
        return listaProducto;
    }
    
    public void agregarProducto(Producto producto) {
        productoDAOImpl.agregarProducto(producto);
    }
    
    public void modificarProducto(Producto producto) {
        productoDAOImpl.modificarProducto(producto);
    }
    
    public void estadoProducto(Producto producto) {
        productoDAOImpl.estadoProducto(producto);
    }
    
    public void eliminarProducto(int id) {
        productoDAOImpl.eliminarProducto(id);
    }

    public void listarproductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}