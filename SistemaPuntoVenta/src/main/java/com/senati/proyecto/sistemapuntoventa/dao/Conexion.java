/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/spv";
    private static final String usuario = "root";
    private static final String contra = "";

    
    //private static final String myBD = "jdbc:sqlserver://localhost:1433;databaseName=spv;user=sa;password=123;";
    
    private static Connection conexion;
    
    private Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,usuario,contra);
            //conexion = DriverManager.getConnection(myBD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("ERROR AL CONECTAR CON MYSQL");
        }
    }
    
    public static Connection obtenerConexion(){
        if(conexion == null){
            new Conexion();
        }
        return conexion;
    }
    
    public static void cerrarConexion(){
        if(conexion == null){
            try {
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    } 
}