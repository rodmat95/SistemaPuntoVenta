/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.controller;

import com.senati.proyecto.sistemapuntoventa.dao.impl.DetalleVentaDAOImpl;
import com.senati.proyecto.sistemapuntoventa.model.DetalleVenta;

import java.util.List;

public class DetalleVentaController {
    private DetalleVentaDAOImpl detalleventaDAOImpl = null;
    
    public DetalleVentaController(){
        detalleventaDAOImpl = new  DetalleVentaDAOImpl();
    }
    
    public List<DetalleVenta> contarDetalleVentas(){
        List<DetalleVenta> contarDetalleVenta = null;
        contarDetalleVenta = detalleventaDAOImpl.ListarDetalleVentas();
        
        System.out.println(contarDetalleVenta.size());
        return contarDetalleVenta;
    }
    
    public List<DetalleVenta> listarDetalleVentas(){
        List<DetalleVenta> listaDetalleVenta = null;
        listaDetalleVenta = detalleventaDAOImpl.ListarDetalleVentas();
        
        for (DetalleVenta detalleventas : listaDetalleVenta) {
            System.out.println("ID: " + detalleventas.getId()
                    + ", Venta id: " + detalleventas.getVenta_id()
                    + ", Producto id: " + detalleventas.getProducto_id()
                    + ", Cantidad: " + detalleventas.getCantidad()
                    + ", Precio unitario: " + detalleventas.getPrecio_unitario()
                    + ", Precio total: " + detalleventas.getPrecio_total()
                    + ", Estado: " + detalleventas.getEstado()
                    + ", Creado en: " + detalleventas.getCreado_en()
                    + ", Actualizado en: " + detalleventas.getActualizado_en());
        }
        return listaDetalleVenta;
    }
    
    public void agregarDetalleVenta(DetalleVenta detalleventa) {
        detalleventaDAOImpl.agregarDetalleVenta(detalleventa);
    }
    
    public void modificarDetalleVenta(DetalleVenta detalleventa) {
        detalleventaDAOImpl.modificarDetalleVenta(detalleventa);
    }
    
    public void estadoDetalleVenta(DetalleVenta detalleventa) {
        detalleventaDAOImpl.estadoDetalleVenta(detalleventa);
    }
    
    public void eliminarDetalleVenta(int id) {
        detalleventaDAOImpl.eliminarDetalleVenta(id);
    }

    public void listardetalleventas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}