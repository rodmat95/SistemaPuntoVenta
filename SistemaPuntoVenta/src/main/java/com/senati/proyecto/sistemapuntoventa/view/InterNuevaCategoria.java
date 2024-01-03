/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.view;

import com.senati.proyecto.sistemapuntoventa.model.Categoria;
import com.senati.proyecto.sistemapuntoventa.controller.CategoriaController;

import javax.swing.JOptionPane;
import java.awt.Dimension;

public class InterNuevaCategoria extends javax.swing.JInternalFrame {
    
    private CategoriaController categoriaController = new CategoriaController();
    
    public InterNuevaCategoria() {
        initComponents();
        this.setSize(new Dimension(738,445));
        this.setTitle("Nueva Categoria");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWallpaper = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlAgregar = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        tbxNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        tbxDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        lblWallpaper.setForeground(new java.awt.Color(255, 255, 255));
        lblWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.jpg"))); // NOI18N
        lblWallpaper.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblWallpaper.setMaximumSize(new java.awt.Dimension(650, 410));
        lblWallpaper.setMinimumSize(new java.awt.Dimension(650, 410));
        lblWallpaper.setPreferredSize(new java.awt.Dimension(650, 410));

        setClosable(true);
        setIconifiable(true);
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setMaximumSize(new java.awt.Dimension(738, 445));
        setMinimumSize(new java.awt.Dimension(738, 445));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(738, 445));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        pnlTitulo.setBackground(new java.awt.Color(230, 235, 239));
        pnlTitulo.setForeground(new java.awt.Color(230, 235, 239));
        pnlTitulo.setAlignmentX(0.0F);
        pnlTitulo.setAlignmentY(0.0F);
        pnlTitulo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnlTitulo.setMaximumSize(new java.awt.Dimension(738, 50));
        pnlTitulo.setMinimumSize(new java.awt.Dimension(738, 50));
        pnlTitulo.setPreferredSize(new java.awt.Dimension(728, 50));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nueva Categoria");
        lblTitulo.setAlignmentY(0.0F);
        lblTitulo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
            .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        pnlAgregar.setAlignmentX(0.0F);
        pnlAgregar.setAlignmentY(0.0F);
        pnlAgregar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnlAgregar.setMaximumSize(new java.awt.Dimension(728, 360));
        pnlAgregar.setMinimumSize(new java.awt.Dimension(728, 360));
        pnlAgregar.setPreferredSize(new java.awt.Dimension(728, 360));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setAlignmentY(0.0F);
        lblNombre.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        tbxNombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tbxNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tbxNombre.setAlignmentX(0.0F);
        tbxNombre.setAlignmentY(0.0F);
        tbxNombre.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblDescripcion.setText("Descripción:");
        lblDescripcion.setAlignmentY(0.0F);
        lblDescripcion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        tbxDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tbxDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tbxDescripcion.setAlignmentX(0.0F);
        tbxDescripcion.setAlignmentY(0.0F);
        tbxDescripcion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setAlignmentY(0.0F);
        btnGuardar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAgregarLayout = new javax.swing.GroupLayout(pnlAgregar);
        pnlAgregar.setLayout(pnlAgregarLayout);
        pnlAgregarLayout.setHorizontalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbxDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tbxNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarLayout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(322, 322, 322))
        );
        pnlAgregarLayout.setVerticalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(tbxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(tbxDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnGuardar)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarNuevoCategoria() {
        String nombre = tbxNombre.getText();
        String descripcion = tbxDescripcion.getText();

        Categoria nuevaCategoria = new Categoria();
        nuevaCategoria.setNombre(nombre);
        nuevaCategoria.setDescripcion(descripcion);

        categoriaController.agregarCategoria(nuevaCategoria);

        JOptionPane.showMessageDialog(this, "Categoria agregada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        agregarNuevoCategoria();
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblWallpaper;
    private javax.swing.JPanel pnlAgregar;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField tbxDescripcion;
    private javax.swing.JTextField tbxNombre;
    // End of variables declaration//GEN-END:variables
}