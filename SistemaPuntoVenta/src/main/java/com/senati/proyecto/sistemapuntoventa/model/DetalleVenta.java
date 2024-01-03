/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.model;

import java.sql.Timestamp;

public class DetalleVenta {
    public int id;
    public int venta_id;
    public int producto_id;
    public int cantidad;
    public double precio_unitario;
    public double descuento;
    public double precio_total;
    public int estado;
    public Timestamp creado_en;
    public Timestamp actualizado_en;

    public int getId() {
        return id;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public int getEstado() {
        return estado;
    }

    public Timestamp getCreado_en() {
        return creado_en;
    }

    public Timestamp getActualizado_en() {
        return actualizado_en;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setCreado_en(Timestamp creado_en) {
        this.creado_en = creado_en;
    }

    public void setActualizado_en(Timestamp actualizado_en) {
        this.actualizado_en = actualizado_en;
    }
}