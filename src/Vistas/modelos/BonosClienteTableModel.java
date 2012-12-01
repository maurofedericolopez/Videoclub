package Vistas.modelos;

import Controladores.ClienteController;
import Modelo.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class BonosClienteTableModel extends AbstractTableModel {

    private ClienteController controlador;
    private static final String[] columns = {"Periodo","Crédito"};
    private Cliente cliente;
    private ArrayList<Integer> bonos;

    public BonosClienteTableModel() {
        controlador = Controladores.clienteController;
        cliente = null;
        bonos = new ArrayList();
    }

    @Override
    public int getRowCount() {
        return bonos.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 :
                return bonos.get(rowIndex);
            case 1 :
                return cliente.getBonos().get(bonos.get(rowIndex));
            default :
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            default:
                return null;
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null)
            bonos = controlador.obtenerBonosDelCliente(cliente);
        else
            bonos = new ArrayList();
        fireTableDataChanged();
    }

}
