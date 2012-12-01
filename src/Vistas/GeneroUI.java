package Vistas;

import Controladores.PeliculaController;
import Modelo.Genero;
import javax.swing.JOptionPane;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class GeneroUI extends javax.swing.JPanel {

    private PeliculaController controlador;

    /**
     * Creates new form GeneroUI
     */
    public GeneroUI() {
        initComponents();
        controlador = Controladores.peliculaController;
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
        jsp = new javax.swing.JScrollPane();
        tablaGeneros = new javax.swing.JTable();
        panelDatos = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaDescripcion = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescripcion = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        botonEliminarGenero = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(750, 380));
        setMinimumSize(new java.awt.Dimension(750, 380));
        setLayout(new java.awt.BorderLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Géneros");
        add(etiquetaTitulo, java.awt.BorderLayout.PAGE_START);

        tablaGeneros.setModel(new Vistas.modelos.GeneroTableModel());
        jsp.setViewportView(tablaGeneros);

        add(jsp, java.awt.BorderLayout.CENTER);

        panelDatos.setMaximumSize(new java.awt.Dimension(177, 351));
        panelDatos.setMinimumSize(new java.awt.Dimension(177, 351));

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaNombre.setText("Nombre");

        etiquetaDescripcion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaDescripcion.setText("Descripción");

        campoNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

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

        campoDescripcion.setColumns(20);
        campoDescripcion.setRows(5);
        jScrollPane1.setViewportView(campoDescripcion);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombre)
                            .addComponent(etiquetaDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(botonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonAgregar))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        add(panelDatos, java.awt.BorderLayout.LINE_END);

        botonEliminarGenero.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonEliminarGenero.setText("Eliminar Género");
        botonEliminarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonEliminarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 604, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonEliminarGenero)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        try {
            if (controlador.nombreGeneroValido(campoNombre.getText())) {
                controlador.registrarNuevaGenero(new Genero(campoNombre.getText(), campoDescripcion.getText()));
            }
            else {
                throw new Exception("El nombre del género ya está registrado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            limpiarCampos();
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEliminarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarGeneroActionPerformed
        try {
            int[] indices = tablaGeneros.getSelectedRows();
            if(indices.length > 0) {
                controlador.eliminarGenero(indices);
            }
            else
                throw new Exception("No ha seleccionado ningun género para eliminar");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarGeneroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminarGenero;
    private javax.swing.JTextArea campoDescripcion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTable tablaGeneros;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        campoNombre.setText("");
        campoDescripcion.setText("");
    }

}