/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.view;

import com.senati.proyecto.sistemapuntoventa.controller.ProductoController;
import com.senati.proyecto.sistemapuntoventa.model.Producto;
import com.toedter.calendar.JDateChooser;

import java.awt.CardLayout;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JPanel;

public class InterHistorialProducto extends javax.swing.JInternalFrame {

    private ProductoController productoController = new ProductoController();
    
    public InterHistorialProducto() {
        initComponents();
        inicializarCardLayouts();
        llenarTBLCreaccion();
        llenarTBLActualizacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlFrame = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlCuerpo = new javax.swing.JPanel();
        btnCreaccion = new javax.swing.JButton();
        btnActualizacion = new javax.swing.JButton();
        dcsFecha = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        pnlCreaccion = new javax.swing.JPanel();
        lblTituloCreaccion = new javax.swing.JLabel();
        scrCreaccion = new javax.swing.JScrollPane();
        tblCreaccion = new javax.swing.JTable();
        pnlActualizacion = new javax.swing.JPanel();
        lblTituloActualizacion = new javax.swing.JLabel();
        scrActualizacion = new javax.swing.JScrollPane();
        tblActualizacion = new javax.swing.JTable();
        pnlReportes = new javax.swing.JPanel();
        pnlBTNCreaccion = new javax.swing.JPanel();
        btnCPDF = new javax.swing.JButton();
        btnCExel = new javax.swing.JButton();
        pnlBTNActualizacion = new javax.swing.JPanel();
        btnAPDF = new javax.swing.JButton();
        btnAExel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Historial de Productos");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        pnlFrame.setAlignmentX(0.0F);
        pnlFrame.setAlignmentY(0.0F);
        pnlFrame.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnlFrame.setMaximumSize(new java.awt.Dimension(740, 445));
        pnlFrame.setMinimumSize(new java.awt.Dimension(740, 445));
        pnlFrame.setPreferredSize(new java.awt.Dimension(740, 445));

        pnlTitulo.setBackground(new java.awt.Color(230, 235, 239));
        pnlTitulo.setForeground(new java.awt.Color(230, 235, 239));
        pnlTitulo.setAlignmentX(0.0F);
        pnlTitulo.setAlignmentY(0.0F);
        pnlTitulo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnlTitulo.setMaximumSize(new java.awt.Dimension(728, 50));
        pnlTitulo.setMinimumSize(new java.awt.Dimension(728, 50));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Historial Productos");
        lblTitulo.setAlignmentY(0.0F);
        lblTitulo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCuerpo.setAlignmentX(0.0F);
        pnlCuerpo.setAlignmentY(0.0F);
        pnlCuerpo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnlCuerpo.setMaximumSize(new java.awt.Dimension(175, 70));
        pnlCuerpo.setMinimumSize(new java.awt.Dimension(175, 70));
        pnlCuerpo.setPreferredSize(new java.awt.Dimension(175, 70));

        btnCreaccion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCreaccion.setText("Consultar Creacción");
        btnCreaccion.setAlignmentY(0.0F);
        btnCreaccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreaccion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnCreaccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreaccion.setMargin(new java.awt.Insets(0, 5, 0, 5));
        btnCreaccion.setMaximumSize(new java.awt.Dimension(175, 30));
        btnCreaccion.setMinimumSize(new java.awt.Dimension(175, 30));
        btnCreaccion.setPreferredSize(new java.awt.Dimension(175, 30));
        btnCreaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaccionActionPerformed(evt);
            }
        });

        btnActualizacion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnActualizacion.setText("Consultar Actualizacion");
        btnActualizacion.setAlignmentY(0.0F);
        btnActualizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizacion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnActualizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizacion.setMargin(new java.awt.Insets(0, 5, 0, 5));
        btnActualizacion.setMaximumSize(new java.awt.Dimension(175, 30));
        btnActualizacion.setMinimumSize(new java.awt.Dimension(175, 30));
        btnActualizacion.setPreferredSize(new java.awt.Dimension(175, 30));
        btnActualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizacionActionPerformed(evt);
            }
        });

        dcsFecha.setAlignmentX(0.0F);
        dcsFecha.setAlignmentY(0.0F);
        dcsFecha.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        dcsFecha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        dcsFecha.setMaximumSize(new java.awt.Dimension(175, 30));
        dcsFecha.setMinimumSize(new java.awt.Dimension(175, 30));
        dcsFecha.setPreferredSize(new java.awt.Dimension(175, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnBuscar.setText("Buscar Fecha");
        btnBuscar.setAlignmentY(0.0F);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setMargin(new java.awt.Insets(0, 5, 0, 5));
        btnBuscar.setMaximumSize(new java.awt.Dimension(175, 30));
        btnBuscar.setMinimumSize(new java.awt.Dimension(175, 30));
        btnBuscar.setPreferredSize(new java.awt.Dimension(175, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        pnlContenido.setAlignmentX(0.0F);
        pnlContenido.setAlignmentY(0.0F);
        pnlContenido.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnlContenido.setLayout(new java.awt.CardLayout());

        pnlCreaccion.setAlignmentX(0.0F);
        pnlCreaccion.setAlignmentY(0.0F);
        pnlCreaccion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        lblTituloCreaccion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblTituloCreaccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloCreaccion.setText("Registro de Productos Creados");
        lblTituloCreaccion.setAlignmentY(0.0F);
        lblTituloCreaccion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblTituloCreaccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTituloCreaccion.setMaximumSize(new java.awt.Dimension(525, 25));
        lblTituloCreaccion.setMinimumSize(new java.awt.Dimension(525, 25));
        lblTituloCreaccion.setPreferredSize(new java.awt.Dimension(525, 25));

        scrCreaccion.setAlignmentX(0.0F);
        scrCreaccion.setAlignmentY(0.0F);
        scrCreaccion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        scrCreaccion.setMaximumSize(new java.awt.Dimension(525, 330));
        scrCreaccion.setMinimumSize(new java.awt.Dimension(525, 330));
        scrCreaccion.setPreferredSize(new java.awt.Dimension(525, 330));

        tblCreaccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio", "Stock", "Estado", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCreaccion.setAlignmentX(0.0F);
        tblCreaccion.setAlignmentY(0.0F);
        tblCreaccion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblCreaccion.setMaximumSize(new java.awt.Dimension(525, 330));
        tblCreaccion.setMinimumSize(new java.awt.Dimension(525, 330));
        tblCreaccion.setPreferredSize(new java.awt.Dimension(525, 330));
        scrCreaccion.setViewportView(tblCreaccion);
        if (tblCreaccion.getColumnModel().getColumnCount() > 0) {
            tblCreaccion.getColumnModel().getColumn(0).setResizable(false);
            tblCreaccion.getColumnModel().getColumn(1).setResizable(false);
            tblCreaccion.getColumnModel().getColumn(2).setResizable(false);
            tblCreaccion.getColumnModel().getColumn(3).setResizable(false);
            tblCreaccion.getColumnModel().getColumn(4).setResizable(false);
            tblCreaccion.getColumnModel().getColumn(5).setResizable(false);
            tblCreaccion.getColumnModel().getColumn(6).setResizable(false);
            tblCreaccion.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout pnlCreaccionLayout = new javax.swing.GroupLayout(pnlCreaccion);
        pnlCreaccion.setLayout(pnlCreaccionLayout);
        pnlCreaccionLayout.setHorizontalGroup(
            pnlCreaccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreaccionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCreaccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloCreaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrCreaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pnlCreaccionLayout.setVerticalGroup(
            pnlCreaccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreaccionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTituloCreaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrCreaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pnlContenido.add(pnlCreaccion, "card2");

        pnlActualizacion.setAlignmentX(0.0F);
        pnlActualizacion.setAlignmentY(0.0F);
        pnlActualizacion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        lblTituloActualizacion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblTituloActualizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloActualizacion.setText("Registro de Productos Actualizados");
        lblTituloActualizacion.setAlignmentY(0.0F);
        lblTituloActualizacion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblTituloActualizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTituloActualizacion.setMaximumSize(new java.awt.Dimension(525, 25));
        lblTituloActualizacion.setMinimumSize(new java.awt.Dimension(525, 25));
        lblTituloActualizacion.setPreferredSize(new java.awt.Dimension(525, 25));

        scrActualizacion.setAlignmentX(0.0F);
        scrActualizacion.setAlignmentY(0.0F);
        scrActualizacion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        scrActualizacion.setMaximumSize(new java.awt.Dimension(525, 330));
        scrActualizacion.setMinimumSize(new java.awt.Dimension(525, 330));
        scrActualizacion.setPreferredSize(new java.awt.Dimension(525, 330));

        tblActualizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Stock", "Precio", "Estado", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblActualizacion.setAlignmentX(0.0F);
        tblActualizacion.setAlignmentY(0.0F);
        tblActualizacion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblActualizacion.setMaximumSize(new java.awt.Dimension(525, 330));
        tblActualizacion.setMinimumSize(new java.awt.Dimension(525, 330));
        tblActualizacion.setPreferredSize(new java.awt.Dimension(525, 330));
        scrActualizacion.setViewportView(tblActualizacion);
        if (tblActualizacion.getColumnModel().getColumnCount() > 0) {
            tblActualizacion.getColumnModel().getColumn(0).setResizable(false);
            tblActualizacion.getColumnModel().getColumn(1).setResizable(false);
            tblActualizacion.getColumnModel().getColumn(2).setResizable(false);
            tblActualizacion.getColumnModel().getColumn(3).setResizable(false);
            tblActualizacion.getColumnModel().getColumn(4).setResizable(false);
            tblActualizacion.getColumnModel().getColumn(5).setResizable(false);
            tblActualizacion.getColumnModel().getColumn(6).setResizable(false);
            tblActualizacion.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout pnlActualizacionLayout = new javax.swing.GroupLayout(pnlActualizacion);
        pnlActualizacion.setLayout(pnlActualizacionLayout);
        pnlActualizacionLayout.setHorizontalGroup(
            pnlActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizacionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloActualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrActualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnlActualizacionLayout.setVerticalGroup(
            pnlActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTituloActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrActualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pnlContenido.add(pnlActualizacion, "card2");

        pnlReportes.setMaximumSize(new java.awt.Dimension(175, 70));
        pnlReportes.setMinimumSize(new java.awt.Dimension(175, 70));
        pnlReportes.setPreferredSize(new java.awt.Dimension(175, 70));
        pnlReportes.setLayout(new java.awt.CardLayout());

        btnCPDF.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        btnCPDF.setText("Descargar PDF");
        btnCPDF.setAlignmentY(0.0F);
        btnCPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCPDF.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnCPDF.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCPDF.setMargin(new java.awt.Insets(0, 5, 0, 5));
        btnCPDF.setMaximumSize(new java.awt.Dimension(175, 30));
        btnCPDF.setMinimumSize(new java.awt.Dimension(175, 30));
        btnCPDF.setPreferredSize(new java.awt.Dimension(175, 30));
        btnCPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPDFActionPerformed(evt);
            }
        });

        btnCExel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sobresalir.png"))); // NOI18N
        btnCExel.setText("Descargar Excel");
        btnCExel.setAlignmentY(0.0F);
        btnCExel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCExel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnCExel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCExel.setMargin(new java.awt.Insets(0, 5, 0, 5));
        btnCExel.setMaximumSize(new java.awt.Dimension(175, 30));
        btnCExel.setMinimumSize(new java.awt.Dimension(175, 30));
        btnCExel.setPreferredSize(new java.awt.Dimension(175, 30));
        btnCExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCExelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBTNCreaccionLayout = new javax.swing.GroupLayout(pnlBTNCreaccion);
        pnlBTNCreaccion.setLayout(pnlBTNCreaccionLayout);
        pnlBTNCreaccionLayout.setHorizontalGroup(
            pnlBTNCreaccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCExel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlBTNCreaccionLayout.setVerticalGroup(
            pnlBTNCreaccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBTNCreaccionLayout.createSequentialGroup()
                .addComponent(btnCPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCExel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlReportes.add(pnlBTNCreaccion, "card2");

        btnAPDF.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnAPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        btnAPDF.setText("Descargar PDF");
        btnAPDF.setAlignmentY(0.0F);
        btnAPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAPDF.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnAPDF.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAPDF.setMargin(new java.awt.Insets(0, 5, 0, 5));
        btnAPDF.setMaximumSize(new java.awt.Dimension(175, 30));
        btnAPDF.setMinimumSize(new java.awt.Dimension(175, 30));
        btnAPDF.setPreferredSize(new java.awt.Dimension(175, 30));
        btnAPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAPDFActionPerformed(evt);
            }
        });

        btnAExel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnAExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sobresalir.png"))); // NOI18N
        btnAExel.setText("Descargar Excel");
        btnAExel.setAlignmentY(0.0F);
        btnAExel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAExel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnAExel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAExel.setMargin(new java.awt.Insets(0, 5, 0, 5));
        btnAExel.setMaximumSize(new java.awt.Dimension(175, 30));
        btnAExel.setMinimumSize(new java.awt.Dimension(175, 30));
        btnAExel.setPreferredSize(new java.awt.Dimension(175, 30));
        btnAExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAExelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBTNActualizacionLayout = new javax.swing.GroupLayout(pnlBTNActualizacion);
        pnlBTNActualizacion.setLayout(pnlBTNActualizacionLayout);
        pnlBTNActualizacionLayout.setHorizontalGroup(
            pnlBTNActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAExel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlBTNActualizacionLayout.setVerticalGroup(
            pnlBTNActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBTNActualizacionLayout.createSequentialGroup()
                .addComponent(btnAPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnAExel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlReportes.add(pnlBTNActualizacion, "card2");

        javax.swing.GroupLayout pnlCuerpoLayout = new javax.swing.GroupLayout(pnlCuerpo);
        pnlCuerpo.setLayout(pnlCuerpoLayout);
        pnlCuerpoLayout.setHorizontalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnActualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcsFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        pnlCuerpoLayout.setVerticalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnCreaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(dcsFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlContenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlFrameLayout = new javax.swing.GroupLayout(pnlFrame);
        pnlFrame.setLayout(pnlFrameLayout);
        pnlFrameLayout.setHorizontalGroup(
            pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        pnlFrameLayout.setVerticalGroup(
            pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializarCardLayouts() {
        CardLayout cardLayoutContenido = (CardLayout) pnlContenido.getLayout();
        cardLayoutContenido.addLayoutComponent(pnlCreaccion, "pnlCreaccion");
        cardLayoutContenido.addLayoutComponent(pnlActualizacion, "pnlActualizacion");

        CardLayout cardLayoutReportes = (CardLayout) pnlReportes.getLayout();
        cardLayoutReportes.addLayoutComponent(pnlBTNCreaccion, "pnlBTNCreaccion");
        cardLayoutReportes.addLayoutComponent(pnlBTNActualizacion, "pnlBTNActualizacion");
    }
    
    private void cambiarPanel(CardLayout cardLayout, JPanel panel, String nombrePanel) {
        cardLayout.show(panel, nombrePanel);
    }
    
    private void llenarTBLCreaccion() {
        List<Producto> listaProductos = productoController.listarProductos();

        DefaultTableModel model = (DefaultTableModel) tblCreaccion.getModel();
        model.setRowCount(0);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        
        for (Producto producto : listaProductos) {
            String estadoTexto = (producto.getEstado() == 1) ? "Activo" : "Inactivo";
            Timestamp creadoEn = producto.getCreado_en();
            
            String fecha = dateFormat.format(creadoEn);
            String hora = timeFormat.format(creadoEn);
            
            Object[] rowData = {
                producto.getId(),
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                estadoTexto,
                fecha,
                hora
            };
            model.addRow(rowData);
        }
    }
    
    private void btnCreaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaccionActionPerformed
        cambiarPanel((CardLayout) pnlContenido.getLayout(), pnlContenido, "pnlCreaccion");
        cambiarPanel((CardLayout) pnlReportes.getLayout(), pnlReportes, "pnlBTNCreaccion");
        
        llenarTBLCreaccion();
    }//GEN-LAST:event_btnCreaccionActionPerformed

    private void llenarTBLActualizacion() {
        List<Producto> listaProductos = productoController.listarProductos();

        DefaultTableModel model = (DefaultTableModel) tblActualizacion.getModel();
        model.setRowCount(0);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        
        for (Producto producto : listaProductos) {
            String estadoTexto = (producto.getEstado() == 1) ? "Activo" : "Inactivo";
            Timestamp actualizadoEn = producto.getActualizado_en();
            
            String fecha = dateFormat.format(actualizadoEn);
            String hora = timeFormat.format(actualizadoEn);
            
            Object[] rowData = {
                producto.getId(),
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                estadoTexto,
                fecha,
                hora
            };
            model.addRow(rowData);
        }
    }
    
    private void btnActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizacionActionPerformed
        cambiarPanel((CardLayout) pnlContenido.getLayout(), pnlContenido, "pnlActualizacion");
        cambiarPanel((CardLayout) pnlReportes.getLayout(), pnlReportes, "pnlBTNActualizacion");
        
        llenarTBLActualizacion();
    }//GEN-LAST:event_btnActualizacionActionPerformed

    private String obtenerFecha(JDateChooser dateChooser) {
        java.util.Date fecha = dateChooser.getDate();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }    
    
    private void filtrarPorFecha(JTable tabla, String fechaSeleccionada, int columnaFecha) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        DefaultTableModel newModel = new DefaultTableModel();

        for (int i = 0; i < model.getColumnCount(); i++) {
            newModel.addColumn(model.getColumnName(i));
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            String fechaEnTabla = model.getValueAt(i, columnaFecha).toString();
            if (fechaEnTabla.equals(fechaSeleccionada)) {
                Object[] rowData = new Object[model.getColumnCount()];
                for (int j = 0; j < model.getColumnCount(); j++) {
                    rowData[j] = model.getValueAt(i, j);
                }
                newModel.addRow(rowData);
            }
        }

        tabla.setModel(newModel);
    }    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String fechaSeleccionada = obtenerFecha(dcsFecha);
        filtrarPorFecha(tblCreaccion, fechaSeleccionada, 6);
        filtrarPorFecha(tblActualizacion, fechaSeleccionada, 6);
    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void exportToExcel(JTable table, String fileName) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Datos");

            // Crea la fila de encabezados
            Row headerRow = sheet.createRow(0);
            for (int col = 0; col < model.getColumnCount(); col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellValue(model.getColumnName(col));
            }

            // Llena los datos
            for (int row = 0; row < model.getRowCount(); row++) {
                Row dataRow = sheet.createRow(row + 1);
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Cell cell = dataRow.createCell(col);
                    cell.setCellValue(String.valueOf(model.getValueAt(row, col)));
                }
            }

            // Guarda el archivo
            try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
                workbook.write(fileOut);
                System.out.println("Excel creado exitosamente. Archivo: " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al crear el archivo Excel: " + e.getMessage());
        }
    }    
    
    private void btnCPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCPDFActionPerformed

    private void btnCExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCExelActionPerformed
        String descargasDirectory = System.getProperty("user.home") + "\\Downloads";
        exportToExcel(tblCreaccion, descargasDirectory + "\\Productos_creaccion.xlsx");
    }//GEN-LAST:event_btnCExelActionPerformed

    private void btnAPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAPDFActionPerformed

    private void btnAExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAExelActionPerformed
        String descargasDirectory = System.getProperty("user.home") + "\\Downloads";
        exportToExcel(tblActualizacion, descargasDirectory + "\\Productos_actualizacion.xlsx");
    }//GEN-LAST:event_btnAExelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAExel;
    private javax.swing.JButton btnAPDF;
    private javax.swing.JButton btnActualizacion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCExel;
    private javax.swing.JButton btnCPDF;
    private javax.swing.JButton btnCreaccion;
    private com.toedter.calendar.JDateChooser dcsFecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloActualizacion;
    private javax.swing.JLabel lblTituloCreaccion;
    private javax.swing.JPanel pnlActualizacion;
    private javax.swing.JPanel pnlBTNActualizacion;
    private javax.swing.JPanel pnlBTNCreaccion;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlCreaccion;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JPanel pnlFrame;
    private javax.swing.JPanel pnlReportes;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JScrollPane scrActualizacion;
    private javax.swing.JScrollPane scrCreaccion;
    private javax.swing.JTable tblActualizacion;
    private javax.swing.JTable tblCreaccion;
    // End of variables declaration//GEN-END:variables
}
