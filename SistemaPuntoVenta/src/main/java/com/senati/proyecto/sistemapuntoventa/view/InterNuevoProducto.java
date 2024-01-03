    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.senati.proyecto.sistemapuntoventa.view;

import com.senati.proyecto.sistemapuntoventa.model.Producto;
import com.senati.proyecto.sistemapuntoventa.model.Categoria;
import com.senati.proyecto.sistemapuntoventa.controller.ProductoController;
import com.senati.proyecto.sistemapuntoventa.controller.CategoriaController;

import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class InterNuevoProducto extends javax.swing.JInternalFrame {
    private ProductoController productoController = new ProductoController();
    private CategoriaController categoriaController = new CategoriaController();
    
    public InterNuevoProducto() {
        initComponents();
        this.setSize(new Dimension(738,445));
        this.setTitle("Nuevo Producto");
        llenarCBXCategoria();
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
        lblCategoria = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        tbxNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        scrDescripcion = new javax.swing.JScrollPane();
        tarDescripcion = new javax.swing.JTextArea();
        lblPrecio = new javax.swing.JLabel();
        spnPrecio = new javax.swing.JSpinner();
        lblStock = new javax.swing.JLabel();
        spnStock = new javax.swing.JSpinner();
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
        lblTitulo.setText("Nuevo Producto");
        lblTitulo.setAlignmentY(0.0F);
        lblTitulo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlAgregar.setAlignmentX(0.0F);
        pnlAgregar.setAlignmentY(0.0F);
        pnlAgregar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnlAgregar.setMaximumSize(new java.awt.Dimension(728, 360));
        pnlAgregar.setMinimumSize(new java.awt.Dimension(728, 360));
        pnlAgregar.setPreferredSize(new java.awt.Dimension(728, 360));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblCategoria.setText("Categoria:");
        lblCategoria.setAlignmentY(0.0F);
        lblCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        cbxCategoria.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria" }));
        cbxCategoria.setAlignmentX(0.0F);
        cbxCategoria.setAlignmentY(0.0F);
        cbxCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

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

        scrDescripcion.setAlignmentX(0.0F);
        scrDescripcion.setAlignmentY(0.0F);
        scrDescripcion.setAutoscrolls(true);
        scrDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        scrDescripcion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        scrDescripcion.setMaximumSize(new java.awt.Dimension(318, 100));
        scrDescripcion.setMinimumSize(new java.awt.Dimension(318, 100));
        scrDescripcion.setPreferredSize(new java.awt.Dimension(318, 100));

        tarDescripcion.setColumns(20);
        tarDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tarDescripcion.setRows(5);
        tarDescripcion.setAlignmentX(0.0F);
        tarDescripcion.setAlignmentY(0.0F);
        tarDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tarDescripcion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tarDescripcion.setMaximumSize(new java.awt.Dimension(318, 100));
        tarDescripcion.setMinimumSize(new java.awt.Dimension(318, 100));
        tarDescripcion.setPreferredSize(new java.awt.Dimension(306, 100));
        scrDescripcion.setViewportView(tarDescripcion);

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblPrecio.setText("Precio:");
        lblPrecio.setAlignmentY(0.0F);
        lblPrecio.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        spnPrecio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.01d));
        spnPrecio.setAlignmentX(0.0F);
        spnPrecio.setAlignmentY(0.0F);
        spnPrecio.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        lblStock.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblStock.setText("Stock:");
        lblStock.setAlignmentY(0.0F);
        lblStock.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        spnStock.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        spnStock.setModel(new javax.swing.SpinnerNumberModel());
        spnStock.setAlignmentX(0.0F);
        spnStock.setAlignmentY(0.0F);
        spnStock.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

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
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAgregarLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDescripcion)
                        .addGap(18, 18, 18)))
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAgregarLayout.createSequentialGroup()
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tbxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAgregarLayout.createSequentialGroup()
                        .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAgregarLayout.createSequentialGroup()
                                .addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAgregarLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btnGuardar)))
                        .addGap(20, 20, 20)
                        .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAgregarLayout.setVerticalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(20, 20, 20)
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(scrDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(lblStock)
                    .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnGuardar)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 726, Short.MAX_VALUE)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarCBXCategoria() {
        List<Categoria> listaCategorias = categoriaController.listarCategorias();

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Categoria categoria : listaCategorias) {
            model.addElement(categoria.getNombre());
        }
        cbxCategoria.setModel(model);
    }
    
    private void agregarNuevoProducto() {
        String nombreCategoria = (String) cbxCategoria.getSelectedItem();

        Categoria categoriaSeleccionada = null;
        for (Categoria categoria : categoriaController.listarCategorias()) {
            if (categoria.getNombre().equals(nombreCategoria)) {
                categoriaSeleccionada = categoria;
                break;
            }
        }
        if (categoriaSeleccionada != null) {
            int categoria_id = categoriaSeleccionada.getId();

            String nombre = tbxNombre.getText();
            String descripcion = tarDescripcion.getText();
            double precio = (double) spnPrecio.getValue();
            int stock = (int) spnStock.getValue();
            int estado = 1;

            Producto nuevoProducto = new Producto();
            nuevoProducto.setCategoria_id(categoria_id);
            nuevoProducto.setNombre(nombre);
            nuevoProducto.setDescripcion(descripcion);
            nuevoProducto.setPrecio(precio);
            nuevoProducto.setStock(stock);
            nuevoProducto.setEstado(estado);

            productoController.agregarProducto(nuevoProducto);

            JOptionPane.showMessageDialog(this, "Producto agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        agregarNuevoProducto();
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblWallpaper;
    private javax.swing.JPanel pnlAgregar;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JScrollPane scrDescripcion;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTextArea tarDescripcion;
    private javax.swing.JTextField tbxNombre;
    // End of variables declaration//GEN-END:variables
}