package Vistas;

import Controladores.BonoController;
import Controladores.ClienteController;
import Modelo.Bono;
import Modelo.Cliente;
import javax.swing.JOptionPane;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ComprarBonoUI extends javax.swing.JPanel {

    private ClienteController clienteController;
    private BonoController bonoController;
    private Cliente cliente;

    /**
     * Creates new form ComprarBonoUI
     */
    public ComprarBonoUI() {
        initComponents();
        clienteController = Controladores.clienteController;
        bonoController = Controladores.bonoController;
        cliente = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jpCenter = new javax.swing.JPanel();
        campoCliente = new javax.swing.JLabel();
        etiquetaBono = new javax.swing.JLabel();
        etiquetaDni = new javax.swing.JLabel();
        botonComprarBono = new javax.swing.JButton();
        botonBuscarCliente = new javax.swing.JButton();
        campoBonos = new javax.swing.JComboBox();
        campoDniCliente = new javax.swing.JFormattedTextField();
        etiquetaPrecioBono = new javax.swing.JLabel();
        campoPrecioBono = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(750, 380));
        setMinimumSize(new java.awt.Dimension(750, 380));
        setLayout(new java.awt.BorderLayout());

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Comprar Bono");
        add(jlTitulo, java.awt.BorderLayout.PAGE_START);

        jpCenter.setMaximumSize(new java.awt.Dimension(750, 355));
        jpCenter.setMinimumSize(new java.awt.Dimension(750, 355));

        campoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoCliente.setText("Cliente");

        etiquetaBono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaBono.setText("Seleccione el bono");

        etiquetaDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaDni.setText("Ingrese el DNI del cliente");

        botonComprarBono.setText("Comprar Bono");
        botonComprarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarBonoActionPerformed(evt);
            }
        });

        botonBuscarCliente.setText("Buscar Cliente");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        campoBonos.setModel(new Vistas.modelos.BonoComboBoxModel());

        campoDniCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########"))));

        etiquetaPrecioBono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaPrecioBono.setText("Precio del bono");

        campoPrecioBono.setBackground(new java.awt.Color(255, 255, 255));
        campoPrecioBono.setOpaque(true);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCenterLayout = new javax.swing.GroupLayout(jpCenter);
        jpCenter.setLayout(jpCenterLayout);
        jpCenterLayout.setHorizontalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpCenterLayout.createSequentialGroup()
                            .addComponent(etiquetaDni)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonBuscarCliente))
                        .addGroup(jpCenterLayout.createSequentialGroup()
                            .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaBono)
                                .addComponent(etiquetaPrecioBono))
                            .addGap(46, 46, 46)
                            .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoPrecioBono, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoBonos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(campoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpCenterLayout.createSequentialGroup()
                        .addComponent(botonComprarBono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jpCenterLayout.setVerticalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDni)
                    .addComponent(campoDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCliente)
                .addGap(14, 14, 14)
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaBono)
                    .addComponent(campoBonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaPrecioBono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPrecioBono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonComprarBono)
                    .addComponent(botonCancelar))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        add(jpCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        try {
            cliente = clienteController.buscarClientePorDni(((Number) campoDniCliente.getValue()).longValue());
            campoCliente.setText("Cliente: " + cliente.toString());
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    private void botonComprarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarBonoActionPerformed
        try {
            if(cliente != null)
                if(campoBonos.getSelectedItem() != null) {
                    clienteController.comprarBono(cliente, (Bono) campoBonos.getSelectedItem());
                    limpiarCampos();
                    JOptionPane.showMessageDialog(null, "Se ha completado la operación correctamente", "Enhorabuena", JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonComprarBonoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonComprarBono;
    private javax.swing.JComboBox campoBonos;
    private javax.swing.JLabel campoCliente;
    private javax.swing.JFormattedTextField campoDniCliente;
    private javax.swing.JLabel campoPrecioBono;
    private javax.swing.JLabel etiquetaBono;
    private javax.swing.JLabel etiquetaDni;
    private javax.swing.JLabel etiquetaPrecioBono;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpCenter;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        campoDniCliente.setValue(0);
        campoCliente.setText("Cliente: ");
        campoPrecioBono.setText("");
        campoBonos.setSelectedItem(null);
        campoBonos.updateUI();
        cliente = null;
    }

}
