package Vistas.modelos;

import Modelo.Ejemplar;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauro Federico Lopez
 */
public class EjemplarTableModel extends AbstractTableModel {

    private String[] columns = {"Código", "Título", "Estado", "Crédito Alquiler"};
    private ArrayList<Ejemplar> ejemplares;

    public EjemplarTableModel() {
        super();
        ejemplares = new ArrayList();
    }

    @Override
    public int getRowCount() {
        return ejemplares.size();
    }

    @Override
    public Class getColumnClass(int index) {
        switch(index) {
            case 0 :
                return String.class;
            case 1 :
                return String.class;
            case 2 :
                return String.class;
            case 3 :
                return Integer.class;
            default :
                return null;
        }
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
                return ejemplares.get(rowIndex).getCodigo();
            case 1 :
                return ejemplares.get(rowIndex).getPelicula().toString();
            case 2 :
                return ejemplares.get(rowIndex).getEstado().toString();
            case 3 :
                return ejemplares.get(rowIndex).getCreditoAlquiler();
            default :
                return null;
        }
    }

    /**
     * @param ejemplares the ejemplares to set
     */
    public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
        fireTableDataChanged();
    }

}
