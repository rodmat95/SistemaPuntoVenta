/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.model;

import java.sql.Timestamp;

public class Categoria {
    public int id;
    public String nombre;
    public String descripcion;
    public int estado;
    public Timestamp creado_en;
    public Timestamp actualizado_en;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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