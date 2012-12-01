package Vistas.modelos;

import Controladores.BonoController;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class BonoTableModel extends AbstractTableModel implements Observer {

    private BonoController controlador;
    private static final String[] columns = {"Crédito","Periodo[dias]","Precio[$]"};

    public BonoTableModel() {
        this.controlador = Controladores.bonoController;
        this.controlador.addObserver(this);
    }

    @Override
    public int getRowCount() {
        return this.controlador.getBonoCount();
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
                return controlador.obtenerBono(rowIndex).getCredito();
            case 1 :
                return controlador.obtenerBono(rowIndex).getPeriodo();
            case 2 : 
                return controlador.obtenerBono(rowIndex).getPrecio();
            default :
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) throws NumberFormatException {
        switch (columnIndex) {
            case 0:
                controlador.obtenerBono(rowIndex).setCredito(((Number) aValue).intValue());
                break;
            case 1:
                controlador.obtenerBono(rowIndex).setPeriodo(((Number) aValue).intValue());
                break;
            case 2:
                controlador.obtenerBono(rowIndex).setPrecio(((Number) aValue).doubleValue());
                break;
            default:;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return Double.class;
            default:
                return null;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }
}
