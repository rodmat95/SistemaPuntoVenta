/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.controller;

import com.senati.proyecto.sistemapuntoventa.dao.impl.VentaDAOImpl;
import com.senati.proyecto.sistemapuntoventa.model.Venta;

import java.util.List;

public class VentaController {
    private final VentaDAOImpl ventaDAOImpl = new VentaDAOImpl();
    
    public List<Venta> contarVentas(){
        List<Venta> contarVenta = null;
        contarVenta = ventaDAOImpl.ListarVentas();
        
        System.out.println(contarVenta.size());
        return contarVenta;
    }
    
    public List<Venta> listarVentas(){
        List<Venta> listaVenta = null;
        listaVenta = ventaDAOImpl.ListarVentas();
        
        for (Venta ventas : listaVenta) {
            System.out.println("ID: " + ventas.getId()
                    + ", Usuario id: " + ventas.getUsuario_id()
                    + ", Cliente id: " + ventas.getCliente_id()
                    + ", Fecha de venta: " + ventas.getFecha_venta()
                    + ", Subtotal: " + ventas.getSubtotal()
                    + ", Descuento: " + ventas.getDescuento()
                    + ", IGV: " + ventas.getIgv()
                    + ", Cantidad total: " + ventas.getCantidad_total()
                    + ", Estado: " + ventas.getEstado()
                    + ", Creado en: " + ventas.getCreado_en()
                    + ", Actualizado en: " + ventas.getActualizado_en());
        }
        return listaVenta;
    }
    
    public int agregarVenta(Venta venta) {
        return ventaDAOImpl.agregarVenta(venta);
    }
    
    public void modificarVenta(Venta venta) {
        ventaDAOImpl.modificarVenta(venta);
    }
    
    public void estadoVenta(Venta venta) {
        ventaDAOImpl.estadoVenta(venta);
    }
    
    public void eliminarVenta(int id) {
        ventaDAOImpl.eliminarVenta(id);
    }

    public void listarventas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}