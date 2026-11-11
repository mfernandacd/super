
package formularios;

import gestion.GestionVentas;
import javax.swing.JOptionPane;


public class frmVentas extends javax.swing.JFrame {

    private int idClienteSeleccionado = 0;
    private int idProductoSeleccionado = 0;

  public frmVentas() {

    initComponents();

    txtCodigoVenta.setEditable(false);
    txtFechaVenta.setEditable(false);
    txtHora.setEditable(false);
    txtPrecioUnitario.setEditable(false);
    txtTotalVenta.setEditable(false);
    txtTotalCompra.setEditable(false);
    
    cargarFechaHora();
    
    cmbMetodoPago.removeAllItems();

    cmbMetodoPago.addItem("Efectivo");
    cmbMetodoPago.addItem("Débito");
    cmbMetodoPago.addItem("Crédito");
    cmbMetodoPago.addItem("Transferencia");
    cmbMetodoPago.addItem("Cuenta Corriente");
    
   setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
}

private void cargarFechaHora() {

    java.time.LocalDate fecha =
            java.time.LocalDate.now();

    java.time.LocalTime hora =
            java.time.LocalTime.now();

    txtFechaVenta.setText(fecha.toString());

    txtHora.setText(
            hora.format(
                    java.time.format.DateTimeFormatter
                            .ofPattern("HH:mm:ss")));
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
        jLabel9 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        txtFechaVenta = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtCantidadVendida = new javax.swing.JTextField();
        txtPrecioUnitario = new javax.swing.JTextField();
        txtTotalVenta = new javax.swing.JTextField();
        txtBusquedaProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtBusquedaCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        txtHora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetalleVenta = new javax.swing.JTable();
        btnAgregarProducto = new javax.swing.JButton();
        txtTotalCompra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbMetodoPago = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VENTAS");

        jLabel2.setText("Codigo de venta:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Cliente:");

        jLabel5.setText("Producto:");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Precio Unitario:");

        jLabel8.setText("Total:");

        jLabel9.setText("Buscar producto:");

        txtCodigoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVentaActionPerformed(evt);
            }
        });

        txtFechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVentaActionPerformed(evt);
            }
        });

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        txtCantidadVendida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVendidaActionPerformed(evt);
            }
        });

        txtPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnitarioActionPerformed(evt);
            }
        });

        txtTotalVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVentaActionPerformed(evt);
            }
        });

        txtBusquedaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaProductoActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Finalizar Compra");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código ", "Nombre producto", "Categoria", "Precio Unitario", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVentas);

        jLabel10.setText("Buscar cliente:");

        txtBusquedaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel11.setText("Hora:");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre cliente", "DNI", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        tblDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre producto", "Cantidad", "Precio unitario", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDetalleVenta);

        btnAgregarProducto.setText("Agregar producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        txtTotalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCompraActionPerformed(evt);
            }
        });

        jLabel12.setText("Total de la compra:");

        cmbMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMetodoPagoActionPerformed(evt);
            }
        });

        jLabel13.setText("Método de pago:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaVenta)
                                    .addComponent(txtCodigoVenta)
                                    .addComponent(txtCliente)
                                    .addComponent(txtCantidadVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotalVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBusquedaProducto)
                                    .addComponent(txtBusquedaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarProducto)
                                    .addComponent(btnBuscarCliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnEliminar)
                                        .addComponent(btnAgregarProducto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(btnLimpiar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addGap(0, 503, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(txtBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnAgregarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btnLimpiar))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVentaActionPerformed

    private void txtFechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVentaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtCantidadVendidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVendidaActionPerformed
        
    try {

        int cantidad = Integer.parseInt(
                txtCantidadVendida.getText());

        double precio = Double.parseDouble(
                txtPrecioUnitario.getText());

        double total = cantidad * precio;

        txtTotalVenta.setText(
                String.valueOf(total));

    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(
                this,
                "Ingrese una cantidad válida.");
    }

    }//GEN-LAST:event_txtCantidadVendidaActionPerformed

    private void txtPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUnitarioActionPerformed

    private void txtTotalVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVentaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed


    int fila =
            tblDetalleVenta.getSelectedRow();

    if (fila < 0) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione un producto de la venta.");

        return;
    }

    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel)
            tblDetalleVenta.getModel();

    modelo.removeRow(fila);

    double totalCompra = 0;

    for (int i = 0;
            i < tblDetalleVenta.getRowCount();
            i++) {

        totalCompra += Double.parseDouble(
                tblDetalleVenta
                        .getValueAt(i, 4)
                        .toString());
    }

    txtTotalCompra.setText(
            String.valueOf(totalCompra));


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       

    try {

        if (idClienteSeleccionado == 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Seleccione un cliente.");

            return;
        }

        if (tblDetalleVenta.getRowCount() == 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "No hay productos cargados.");

            return;
        }

        GestionVentas gv =
                new GestionVentas();

        String codigoVenta =
                "V" + System.currentTimeMillis();

        double totalCompra =
                Double.parseDouble(
                        txtTotalCompra.getText());

        String hora =
                txtHora.getText();

        String metodoPago =
                cmbMetodoPago.getSelectedItem()
                        .toString();

        int idVenta =
                gv.guardarVenta(
                        codigoVenta,
                        idClienteSeleccionado,
                        totalCompra,
                        hora,
                        metodoPago);

        for (int i = 0;
                i < tblDetalleVenta.getRowCount();
                i++) {

            int idProducto =
                    Integer.parseInt(
                            tblDetalleVenta
                                    .getValueAt(i, 0)
                                    .toString());

            int cantidad =
                    Integer.parseInt(
                            tblDetalleVenta
                                    .getValueAt(i, 2)
                                    .toString());

            double precio =
                    Double.parseDouble(
                            tblDetalleVenta
                                    .getValueAt(i, 3)
                                    .toString());

            double subtotal =
                    Double.parseDouble(
                            tblDetalleVenta
                                    .getValueAt(i, 4)
                                    .toString());

            gv.guardarDetalleVenta(
                    idVenta,
                    idProducto,
                    cantidad,
                    precio,
                    subtotal);

            gv.descontarStock(
                    idProducto,
                    cantidad);
        }

       

/* TICKET */

String ticket = "";

ticket += "=================================\n";
ticket += "      SUPERMERCADO SUPER\n";
ticket += "=================================\n\n";

ticket += "Cliente: "
        + txtCliente.getText()
        + "\n";

ticket += "Fecha: "
        + txtFechaVenta.getText()
        + "\n";

ticket += "Hora: "
        + txtHora.getText()
        + "\n\n";

ticket += "PRODUCTOS\n";
ticket += "---------------------------------\n";

for (int i = 0; i < tblDetalleVenta.getRowCount(); i++) {

    ticket += tblDetalleVenta.getValueAt(i, 1)
            + " x"
            + tblDetalleVenta.getValueAt(i, 2)
            + " = $"
            + tblDetalleVenta.getValueAt(i, 4)
            + "\n";
}

ticket += "\n---------------------------------\n";

ticket += "TOTAL: $"
        + txtTotalCompra.getText()
        + "\n";

ticket += "Metodo de pago: "
        + cmbMetodoPago.getSelectedItem()
        + "\n\n";

ticket += "Gracias por su compra\n";

ticket += "=================================";

/* fin del TICKET */

JOptionPane.showMessageDialog(
        this,
        ticket,
        "TICKET DE VENTA",
        JOptionPane.INFORMATION_MESSAGE);


        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel)
                tblDetalleVenta.getModel();

        modelo.setRowCount(0);

        txtCliente.setText("");
        txtProducto.setText("");
        txtCantidadVendida.setText("");
        txtPrecioUnitario.setText("");
        txtTotalVenta.setText("");
        txtTotalCompra.setText("");

        txtBusquedaCliente.setText("");
        txtBusquedaProducto.setText("");

        idClienteSeleccionado = 0;
        idProductoSeleccionado = 0;

        btnBuscarCliente.setEnabled(true);
        txtBusquedaCliente.setEnabled(true);
        tblCliente.setEnabled(true);

cargarFechaHora();

    } catch (Exception e) {

        JOptionPane.showMessageDialog(
                this,
                "Error al guardar venta: "
                + e.getMessage());
    }

    }//GEN-LAST:event_btnGuardarActionPerformed


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      
    txtCodigoVenta.setText("");
    txtFechaVenta.setText("");
    txtHora.setText("");

    txtCliente.setText("");
    txtProducto.setText("");

    txtCantidadVendida.setText("");
    txtPrecioUnitario.setText("");
    txtTotalVenta.setText("");
    txtTotalCompra.setText("");

    txtBusquedaCliente.setText("");
    txtBusquedaProducto.setText("");

    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel)
            tblDetalleVenta.getModel();

    modelo.setRowCount(0);

    idClienteSeleccionado = 0;
    idProductoSeleccionado = 0;

    btnBuscarCliente.setEnabled(true);
    txtBusquedaCliente.setEnabled(true);
    tblCliente.setEnabled(true);

    cargarFechaHora();

    txtBusquedaCliente.requestFocus();


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBusquedaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
       
    String textoBusqueda = txtBusquedaProducto.getText();

    if (textoBusqueda.isEmpty()) {

        JOptionPane.showMessageDialog(this,
                "Ingrese un producto para buscar.");

        return;
    }

    try {

        GestionVentas gv = new GestionVentas();

        java.sql.ResultSet rs =
                gv.buscarProducto(textoBusqueda);

        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel)
                tblVentas.getModel();

        modelo.setRowCount(0);

        while (rs.next()) {

            Object[] fila = {

                rs.getInt("id_producto"),
                rs.getString("codigo_producto"),
                rs.getString("nombre"),
                rs.getString("categoria"),
                rs.getDouble("precio_venta"),
                rs.getInt("stock")
};

            modelo.addRow(fila);
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                "Error al buscar producto: "
                        + e.getMessage());
    }

    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void txtBusquedaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
      
   
    String textoBusqueda = txtBusquedaCliente.getText();

    if (textoBusqueda.isEmpty()) {

        JOptionPane.showMessageDialog(this,
                "Ingrese un cliente para buscar.");

        return;
    }

    try {

        GestionVentas gv = new GestionVentas();

        java.sql.ResultSet rs =
                gv.buscarCliente(textoBusqueda);

        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel)
                tblCliente.getModel();

        modelo.setRowCount(0);

        while (rs.next()) {

            Object[] fila = {

                rs.getInt("id_cliente"),
                rs.getString("nombre"),
                rs.getString("dni"),
                rs.getString("telefono")
            };

            modelo.addRow(fila);
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                "Error al buscar cliente: "
                + e.getMessage());
    }

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
     

    int fila = tblCliente.getSelectedRow();

    if (fila >= 0) {

        idClienteSeleccionado =
                Integer.parseInt(
                        tblCliente.getValueAt(fila, 0).toString());

        txtCliente.setText(
                tblCliente.getValueAt(fila, 1).toString());
    }

    }//GEN-LAST:event_tblClienteMouseClicked

    private void tblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMouseClicked
       

    int fila = tblVentas.getSelectedRow();

    if (fila >= 0) {

        txtProducto.setText(
                tblVentas.getValueAt(fila, 2).toString());

        txtPrecioUnitario.setText(
                tblVentas.getValueAt(fila, 4).toString());

        idProductoSeleccionado =
                Integer.parseInt(
                        tblVentas.getValueAt(fila, 0).toString());
    }


    }//GEN-LAST:event_tblVentasMouseClicked

    private void cmbMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMetodoPagoActionPerformed

    private void txtTotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCompraActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed


    try {

        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel)
                tblDetalleVenta.getModel();

        Object[] fila = {

            tblVentas.getValueAt(
                    tblVentas.getSelectedRow(), 0),

            txtProducto.getText(),

            Integer.parseInt(
                    txtCantidadVendida.getText()),

            Double.parseDouble(
                    txtPrecioUnitario.getText()),

            Double.parseDouble(
                    txtTotalVenta.getText())
        };

        modelo.addRow(fila);
        
        btnBuscarCliente.setEnabled(false);
        txtBusquedaCliente.setEnabled(false);
        tblCliente.setEnabled(false);

        double totalCompra = 0;

        for (int i = 0;
                i < tblDetalleVenta.getRowCount();
                i++) {

            totalCompra += Double.parseDouble(
                    tblDetalleVenta.getValueAt(i, 4)
                            .toString());
        }

        txtTotalCompra.setText(
                String.valueOf(totalCompra));

        txtCantidadVendida.setText("");
        txtTotalVenta.setText("");

    } catch (Exception e) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione un producto y una cantidad válida.");
    }
    
         
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

   
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
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblDetalleVenta;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtBusquedaCliente;
    private javax.swing.JTextField txtBusquedaProducto;
    private javax.swing.JTextField txtCantidadVendida;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTotalCompra;
    private javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables
}
