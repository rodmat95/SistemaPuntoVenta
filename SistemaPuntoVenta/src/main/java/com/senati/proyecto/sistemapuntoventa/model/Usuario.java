/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.model;

import java.sql.Timestamp;

public class Usuario {
    public int id;
    public String nombre;
    public String contrasenia;
    public String puesto;
    public int estado;
    public Timestamp creado_en;
    public Timestamp actualizado_en;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getPuesto() {
        return puesto;
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

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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