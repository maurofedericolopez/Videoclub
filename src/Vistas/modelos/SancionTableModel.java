package Vistas.modelos;

import Modelo.Sancion;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauro Federico Lopez
 */
public class SancionTableModel extends AbstractTableModel {

    private ArrayList<Sancion> sanciones;
    private static final String[] columns = {"Fecha","Importe","Estado"};

    public SancionTableModel() {
        super();
        sanciones = new ArrayList();
    }

    @Override
    public int getRowCount() {
        return sanciones.size();
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
                return sanciones.get(rowIndex).getFecha();
            case 1 :
                return sanciones.get(rowIndex).getImporte();
            case 2 : 
                return sanciones.get(rowIndex).getEstado().toString();
            default :
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Date.class;
            case 1:
                return Double.class;
            case 2:
                return String.class;
            default:
                return null;
        }
    }

    /**
     * @param sanciones the sanciones to set
     */
    public void setSanciones(ArrayList<Sancion> sanciones) {
        this.sanciones = sanciones;
        fireTableDataChanged();
    }

    public Sancion obtenerFecha(int indice) {
        return sanciones.get(indice);
    }

}
