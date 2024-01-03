/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.model;

import java.sql.Timestamp;

public class Venta {
    public int id;
    public int usuario_id;
    public int cliente_id;
    public Timestamp fecha_venta;
    public double subtotal;
    public double descuento;
    public double igv;
    public double cantidad_total;
    public int estado;
    public Timestamp creado_en;
    public Timestamp actualizado_en;

    public int getId() {
        return id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public Timestamp getFecha_venta() {
        return fecha_venta;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getIgv() {
        return igv;
    }

    public double getCantidad_total() {
        return cantidad_total;
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

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public void setFecha_venta(Timestamp fechaa_venta) {
        this.fecha_venta = fechaa_venta;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public void setCantidad_total(double cantidad_total) {
        this.cantidad_total = cantidad_total;
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