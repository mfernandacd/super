
package formularios;

import clases.Producto;
import gestion.GestionStock;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmStock extends javax.swing.JFrame {

    public frmStock() {

        initComponents();

        GestionStock gs = new GestionStock();

        txtCodigoProducto.setText(
                gs.generarCodigoProducto());

        txtCodigoProducto.setEditable(false);
    }
  


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtCategoriaProducto = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtStockProducto = new javax.swing.JTextField();
        txtProveedorProducto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtBuscarProducto = new javax.swing.JLabel();
        txtBusquedaProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código producto:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Categoría:");

        jLabel4.setText("Precio de compra:");

        jLabel5.setText("Precio de venta:");

        jLabel6.setText("Stock:");

        jLabel7.setText("Proveedor:");

        jLabel8.setText("GESTIÓN DE STOCK");

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        txtCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaProductoActionPerformed(evt);
            }
        });

        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });

        txtStockProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockProductoActionPerformed(evt);
            }
        });

        txtProveedorProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorProductoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtBusquedaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaProductoActionPerformed(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Categoría", "Precio compra", "Precio venta", "Stock", "Proveedor"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jLabel9.setText("Buscar producto:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtProveedorProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(txtCodigoProducto)
                                            .addComponent(txtPrecioCompra)
                                            .addComponent(txtPrecioVenta)
                                            .addComponent(txtStockProducto))
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCategoriaProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addContainerGap(131, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(txtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBuscarProducto)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void txtCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaProductoActionPerformed

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraActionPerformed

    private void txtStockProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockProductoActionPerformed

    private void txtProveedorProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorProductoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    String codigoProducto = txtCodigoProducto.getText();

    if (codigoProducto.isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione un producto para eliminar."
        );

        return;
    }

    Object[] opciones = {"Sí", "No"};

int opcion = JOptionPane.showOptionDialog(
        this,
        "¿Está segura de eliminar este producto?",
        "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opciones,
        opciones[0]
);

    if (opcion == JOptionPane.YES_OPTION) {

        GestionStock gs = new GestionStock();

        if (gs.eliminarProducto(codigoProducto)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Producto eliminado correctamente"
            );

            txtCodigoProducto.setText(
        gs.generarCodigoProducto());

        txtNombreProducto.setText("");
        txtCategoriaProducto.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        txtStockProducto.setText("");
        txtProveedorProducto.setText("");
        txtBusquedaProducto.setText("");

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No se pudo eliminar el producto"
            );
        }
    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    // Se obtienen los datos ingresados por el usuario
    // desde los campos de texto del formulario
    String codigo = txtCodigoProducto.getText();
    String nombre = txtNombreProducto.getText();
    String categoria = txtCategoriaProducto.getText();
    String precioCompraTexto = txtPrecioCompra.getText();
    String precioVentaTexto = txtPrecioVenta.getText();
    String stockTexto = txtStockProducto.getText();
    String proveedorTexto = txtProveedorProducto.getText();

   
    // Se valida que todos los campos estén completos
    if (codigo.isEmpty() || nombre.isEmpty()
            || categoria.isEmpty()
            || precioCompraTexto.isEmpty()
            || precioVentaTexto.isEmpty()
            || stockTexto.isEmpty()
            || proveedorTexto.isEmpty()) {

        JOptionPane.showMessageDialog(this,
                "Complete todos los campos.");

        return;
    }

    try {

        //Se crea el objeto de tipo producto
        Producto producto = new Producto();

        //Se cargan los datos ingresados por el usuario
        //dentro de los atributos del objeto
        producto.setCodigoProducto(codigo);
        producto.setNombre(nombre);
        producto.setCategoria(categoria);
        producto.setPrecioCompra(
                Double.parseDouble(precioCompraTexto));
        producto.setPrecioVenta(
                Double.parseDouble(precioVentaTexto));
        producto.setStock(
                Integer.parseInt(stockTexto));
        producto.setIdProveedor(
                Integer.parseInt(proveedorTexto));

       
        //Se crea un objeto de la clase Gestion de Stock
        //se llama a la clase gestionStock para realizar las operaciones
        GestionStock gs = new GestionStock();

        
        if (gs.guardarProducto(producto)) {

            JOptionPane.showMessageDialog(this,
                    "Producto guardado correctamente");

            txtCodigoProducto.setText(
        gs.generarCodigoProducto());

        txtNombreProducto.setText("");
        txtCategoriaProducto.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        txtStockProducto.setText("");
        txtProveedorProducto.setText("");


        } else {

            JOptionPane.showMessageDialog(this,
                    "Ya existe un producto con ese código");
        }

    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(this,
                "Revise los datos numéricos.");
    }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
     
    try {

        Producto producto = new Producto();

        producto.setCodigoProducto(txtCodigoProducto.getText());
        producto.setNombre(txtNombreProducto.getText());
        producto.setCategoria(txtCategoriaProducto.getText());

        producto.setPrecioCompra(
                Double.parseDouble(txtPrecioCompra.getText()));

        producto.setPrecioVenta(
                Double.parseDouble(txtPrecioVenta.getText()));

        producto.setStock(
                Integer.parseInt(txtStockProducto.getText()));

        producto.setIdProveedor(
                Integer.parseInt(txtProveedorProducto.getText()));

        GestionStock gs = new GestionStock();

        if (gs.modificarProducto(producto)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Producto modificado correctamente",
                    "Modificación",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No se pudo modificar el producto",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(
                this,
                "Verifique los datos numéricos",
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    String textoBusqueda = txtBusquedaProducto.getText();

    if (textoBusqueda.isEmpty()) {

        JOptionPane.showMessageDialog(this,
                "Ingrese un dato para buscar.");

        return;
    }

    try {

        GestionStock gs = new GestionStock();

        java.sql.ResultSet rs = gs.buscarProductos(textoBusqueda);

        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel) tblProductos.getModel();

        modelo.setRowCount(0);

        while (rs.next()) {

            Object[] fila = {
                rs.getString("codigo_producto"),
                rs.getString("nombre"),
                rs.getString("categoria"),
                rs.getDouble("precio_compra"),
                rs.getDouble("precio_venta"),
                rs.getInt("stock"),
                rs.getInt("id_proveedor")
            };

            modelo.addRow(fila);
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                "Error al buscar: " + e.getMessage());
    }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBusquedaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaProductoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       
   

  
    GestionStock gs = new GestionStock();

    txtCodigoProducto.setText(
            gs.generarCodigoProducto());

    txtNombreProducto.setText("");
    txtCategoriaProducto.setText("");
    txtPrecioCompra.setText("");
    txtPrecioVenta.setText("");
    txtStockProducto.setText("");
    txtProveedorProducto.setText("");
    txtBusquedaProducto.setText("");

    txtNombreProducto.requestFocus();




    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked

    int fila = tblProductos.getSelectedRow();

    if (fila >= 0) {

         txtCodigoProducto.setText(
                tblProductos.getValueAt(fila, 0).toString());

        txtNombreProducto.setText(
                tblProductos.getValueAt(fila, 1).toString());

        txtCategoriaProducto.setText(
                tblProductos.getValueAt(fila, 2).toString());

        txtPrecioCompra.setText(
                tblProductos.getValueAt(fila, 3).toString());

        txtPrecioVenta.setText(
                tblProductos.getValueAt(fila, 4).toString());

        txtStockProducto.setText(
                tblProductos.getValueAt(fila, 5).toString());

        txtProveedorProducto.setText(
                tblProductos.getValueAt(fila, 6).toString());
        
        txtCodigoProducto.setEditable(false);
    }

    }//GEN-LAST:event_tblProductosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JLabel txtBuscarProducto;
    private javax.swing.JTextField txtBusquedaProducto;
    private javax.swing.JTextField txtCategoriaProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProveedorProducto;
    private javax.swing.JTextField txtStockProducto;
    // End of variables declaration//GEN-END:variables
}
