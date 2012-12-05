package Vistas;

import Controladores.ClienteController;
import Modelo.Cliente;
import java.text.DecimalFormat;
import javax.swing.DefaultCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import videoclub.Controladores;
import videoclub.VideoclubApp;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ClienteUI extends javax.swing.JPanel {

    private ClienteController controlador;

    /**
     * Creates new form PeliculaUI
     */
    public ClienteUI() {
            initComponents();
            controlador = Controladores.clienteController;
            TableColumn columnaDni = tablaClientes.getColumnModel().getColumn(0);
            columnaDni.setCellEditor(new DefaultCellEditor(new JFormattedTextField(new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat("########"))))));
            TableColumn columnaTelefono = tablaClientes.getColumnModel().getColumn(4);
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
        jpBotones = new javax.swing.JPanel();
        etiquetaDni = new javax.swing.JLabel();
        campoDni = new javax.swing.JFormattedTextField();
        etiquetaApellido = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        etiquetaTelefono = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        campoTelefono = new javax.swing.JFormattedTextField();
        jsp = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        botonEliminarCliente = new javax.swing.JButton();
        botonVerBonosComprados = new javax.swing.JButton();
        botonVerSanciones = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1050, 530));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(617, 0));
        setLayout(new java.awt.BorderLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Clientes");
        add(etiquetaTitulo, java.awt.BorderLayout.PAGE_START);

        jpBotones.setMaximumSize(new java.awt.Dimension(206, 286));
        jpBotones.setPreferredSize(new java.awt.Dimension(206, 286));

        etiquetaDni.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaDni.setText("DNI");

        campoDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########"))));

        etiquetaApellido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaApellido.setText("Apellido");

        campoApellido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaNombre.setText("Nombre");

        campoNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        etiquetaEmail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaEmail.setText("Email");

        campoEmail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        etiquetaTelefono.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaTelefono.setText("Teléfono");

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
                .addContainerGap()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addComponent(botonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCancelar))
                    .addGroup(jpBotonesLayout.createSequentialGroup()
                        .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDni)
                            .addComponent(etiquetaApellido)
                            .addComponent(etiquetaNombre)
                            .addComponent(etiquetaTelefono)
                            .addComponent(etiquetaEmail))
                        .addGap(35, 35, 35)
                        .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoApellido)
                            .addComponent(campoNombre)
                            .addComponent(campoEmail)
                            .addComponent(campoDni)
                            .addComponent(campoTelefono))))
                .addContainerGap())
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDni)
                    .addComponent(campoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApellido)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonCancelar))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        add(jpBotones, java.awt.BorderLayout.LINE_END);

        tablaClientes.setAutoCreateRowSorter(true);
        tablaClientes.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tablaClientes.setModel(new Vistas.modelos.ClienteTableModel());
        tablaClientes.setMaximumSize(new java.awt.Dimension(50, 50));
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        jsp.setViewportView(tablaClientes);

        add(jsp, java.awt.BorderLayout.CENTER);

        botonEliminarCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonEliminarCliente.setText("Eliminar Cliente");
        botonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarClienteActionPerformed(evt);
            }
        });

        botonVerBonosComprados.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonVerBonosComprados.setText("Ver Bonos Comprados");
        botonVerBonosComprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerBonosCompradosActionPerformed(evt);
            }
        });

        botonVerSanciones.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonVerSanciones.setText("Ver Sanciones");
        botonVerSanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerSancionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonEliminarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVerBonosComprados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVerSanciones)
                .addGap(0, 409, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botonEliminarCliente)
                .addComponent(botonVerBonosComprados)
                .addComponent(botonVerSanciones))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        try {
            Long dni = ((Number) campoDni.getValue()).longValue();
            if(controlador.dniClienteValido(dni)) {
                String apellido = campoApellido.getText();
                String nombre = campoNombre.getText();
                String email = campoEmail.getText();
                Long telefono = ((Number) campoTelefono.getValue()).longValue();;
                controlador.registrarNuevoCliente(new Cliente(dni, apellido, nombre, email, telefono));
                limpiarCampos();
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarClienteActionPerformed
        try {
            controlador.eliminarCliente(tablaClientes.getSelectedRows());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarClienteActionPerformed

    private void botonVerBonosCompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerBonosCompradosActionPerformed
        try {
            if(tablaClientes.getSelectedRow() >= 0) {
                BonosClienteUI ventanaBono = new BonosClienteUI();
                ventanaBono.setCliente(controlador.obtenerCliente(tablaClientes.getSelectedRow()));
                VideoclubApp.principal.agregarComponenteAlCentro(ventanaBono);
            } else
                throw new Exception("No ha seleccionado ningún cliente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonVerBonosCompradosActionPerformed

    private void botonVerSancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerSancionesActionPerformed
        try {
            if(tablaClientes.getSelectedRow() >= 0) {
                SancionUI ventanaSancion = new SancionUI();
                ventanaSancion.setCliente(controlador.obtenerCliente(tablaClientes.getSelectedRow()));
                VideoclubApp.principal.agregarComponenteAlCentro(ventanaSancion);
            } else
                throw new Exception("No ha seleccionado ningún cliente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonVerSancionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminarCliente;
    private javax.swing.JButton botonVerBonosComprados;
    private javax.swing.JButton botonVerSanciones;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JFormattedTextField campoDni;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JFormattedTextField campoTelefono;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaDni;
    private javax.swing.JLabel etiquetaEmail;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        campoDni.setValue(0);
        campoApellido.setText("");
        campoNombre.setText("");
        campoEmail.setText("");
        campoTelefono.setValue(0);
    }

}
