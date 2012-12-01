package Vistas;

import Datos.Serializacion;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    new Serializacion().serializarModelo(Controladores.videoclub);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,
                    "No se pudo guardar los cambios realizados.",
                    "Error al guardar",
                    JOptionPane.ERROR_MESSAGE);
                }
                System.exit(0);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBotones = new javax.swing.JPanel();
        botonClientes = new javax.swing.JButton();
        botonPeliculas = new javax.swing.JButton();
        botonProveedores = new javax.swing.JButton();
        botonComprarBono = new javax.swing.JButton();
        botonAlquilar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        botonConfeccionarBono = new javax.swing.JButton();
        botonVerBonosDelCliente = new javax.swing.JButton();
        botonGeneros = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Videoclub");
        setBackground(new java.awt.Color(0, 102, 153));
        setMaximumSize(new java.awt.Dimension(1060, 563));
        setMinimumSize(new java.awt.Dimension(1060, 563));
        setName("Videoclub");
        setResizable(false);

        botonClientes.setText("Clientes");
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonPeliculas.setText("Peliculas");
        botonPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPeliculasActionPerformed(evt);
            }
        });

        botonProveedores.setText("Proveedores");
        botonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedoresActionPerformed(evt);
            }
        });

        botonComprarBono.setText("Comprar Bono");
        botonComprarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarBonoActionPerformed(evt);
            }
        });

        botonAlquilar.setText("Alquilar Peliculas");
        botonAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlquilarActionPerformed(evt);
            }
        });

        jButton7.setText("Top Peliculas");

        botonConfeccionarBono.setText("Confeccionar Bono");
        botonConfeccionarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfeccionarBonoActionPerformed(evt);
            }
        });

        botonVerBonosDelCliente.setText("Ver Bonos de Cliente");
        botonVerBonosDelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerBonosDelClienteActionPerformed(evt);
            }
        });

        botonGeneros.setText("Generos");
        botonGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonComprarBono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAlquilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonConfeccionarBono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVerBonosDelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGeneros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(botonClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPeliculas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonComprarBono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAlquilar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonConfeccionarBono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVerBonosDelCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonGeneros)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        getContentPane().add(jpBotones, java.awt.BorderLayout.LINE_START);

        panelCentral.setMaximumSize(new java.awt.Dimension(750, 380));
        panelCentral.setPreferredSize(new java.awt.Dimension(750, 380));
        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPeliculasActionPerformed
        agregarComponenteAlCentro(new PeliculaUI());
    }//GEN-LAST:event_botonPeliculasActionPerformed

    private void botonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedoresActionPerformed
        agregarComponenteAlCentro(new ProveedorUI());
    }//GEN-LAST:event_botonProveedoresActionPerformed

    private void botonAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlquilarActionPerformed
        agregarComponenteAlCentro(new AlquileresUI());
    }//GEN-LAST:event_botonAlquilarActionPerformed

    private void botonComprarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarBonoActionPerformed
        agregarComponenteAlCentro(new ComprarBonoUI());
    }//GEN-LAST:event_botonComprarBonoActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        agregarComponenteAlCentro(new ClienteUI());
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonConfeccionarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfeccionarBonoActionPerformed
        agregarComponenteAlCentro(new ConfeccionarBonoUI());
    }//GEN-LAST:event_botonConfeccionarBonoActionPerformed

    private void botonVerBonosDelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerBonosDelClienteActionPerformed
        agregarComponenteAlCentro(new BonosClienteUI());
    }//GEN-LAST:event_botonVerBonosDelClienteActionPerformed

    private void botonGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerosActionPerformed
        agregarComponenteAlCentro(new GeneroUI());
    }//GEN-LAST:event_botonGenerosActionPerformed

    public void agregarComponenteAlCentro(JComponent componente) {
        getContentPane().removeAll();
        add(jpBotones, BorderLayout.WEST);
        add(componente, BorderLayout.CENTER);
        componente.setVisible(true);
        componente.updateUI();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlquilar;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonComprarBono;
    private javax.swing.JButton botonConfeccionarBono;
    private javax.swing.JButton botonGeneros;
    private javax.swing.JButton botonPeliculas;
    private javax.swing.JButton botonProveedores;
    private javax.swing.JButton botonVerBonosDelCliente;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
