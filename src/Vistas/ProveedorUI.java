package Vistas;

import Controladores.ProveedorController;
import Modelo.Proveedor;
import java.text.DecimalFormat;
import javax.swing.DefaultCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ProveedorUI extends javax.swing.JPanel {

    private ProveedorController controlador;

    /**
     * Creates new form PeliculaUI
     */
    public ProveedorUI() {
        initComponents();
        controlador = Controladores.proveedorController;

        TableColumn columnaTelefono = tablaProveedores.getColumnModel().getColumn(1);
        columnaTelefono.setCellEditor(new DefaultCellEditor(new JFormattedTextField(new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat("##########"))))));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonEliminarProveedor = new javax.swing.JButton();
        jpBotones = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        campoTelefono = new javax.swing.JFormattedTextField();
        jsp = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1050, 530));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName("");
        setPreferredSize(new java.awt.Dimension(617, 0));
        setLayout(new java.awt.BorderLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Proveedores");
        add(etiquetaTitulo, java.awt.BorderLayout.PAGE_START);

        botonEliminarProveedor.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonEliminarProveedor.setText("Eliminar Proveedor");
        botonEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonEliminarProveedor)
                .addGap(0, 631, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonEliminarProveedor)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jpBotones.setMaximumSize(new java.awt.Dimension(206, 32767));
        jpBotones.setPreferredSize(new java.awt.Dimension(206, 286));

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaNombre.setText("Nombre");

        campoNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        etiquetaTelefono.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaTelefono.setText("Teléfono");

        etiquetaEmail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaEmail.setText("Email");

        campoEmail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        botonAgregar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        campoTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addComponent(botonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar))
                    .addGroup(jpBotonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBotonesLayout.createSequentialGroup()
                                .addComponent(etiquetaEmail)
                                .addGap(54, 54, 54)
                                .addComponent(campoEmail))
                            .addGroup(jpBotonesLayout.createSequentialGroup()
                                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaNombre)
                                    .addComponent(etiquetaTelefono))
                                .addGap(38, 38, 38)
                                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTelefono)
                                    .addComponent(campoNombre))))))
                .addContainerGap())
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonCancelar))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        add(jpBotones, java.awt.BorderLayout.LINE_END);

        tablaProveedores.setAutoCreateRowSorter(true);
        tablaProveedores.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tablaProveedores.setModel(new Vistas.modelos.ProveedorTableModel());
        tablaProveedores.getTableHeader().setReorderingAllowed(false);
        jsp.setViewportView(tablaProveedores);

        add(jsp, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        try {
            String nombre = campoNombre.getText();
            if(controlador.nombreProveedorValido(nombre)) {
                Long telefono = ((Number) campoTelefono.getValue()).longValue();
                String email = campoEmail.getText();
                controlador.registrarNuevoProveedor(new Proveedor(nombre, telefono, email));
                limpiarCampos();
            }
            else
                throw new Exception("El nombre del proveedor ya está registrado");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProveedorActionPerformed
        try {
            int[] indices = tablaProveedores.getSelectedRows();
            if(indices.length > 0) {
                controlador.eliminarProveedor(indices);
            }
            else
                throw new Exception("No ha seleccionado ningun proveedor para eliminar");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarProveedorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminarProveedor;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JFormattedTextField campoTelefono;
    private javax.swing.JLabel etiquetaEmail;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JTable tablaProveedores;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        campoNombre.setText("");
        campoTelefono.setValue(0);
        campoEmail.setText("");
    }

}
