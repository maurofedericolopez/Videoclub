package Vistas.modelos;

import Controladores.ProveedorController;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ProveedorTableModel extends AbstractTableModel implements Observer {

    private ProveedorController controlador;
    private static final String[] columns = {"Nombre","Teléfono","Email"};

    public ProveedorTableModel() {
        super();
        this.controlador = Controladores.proveedorController;
        this.controlador.addObserver(this);
    }

    @Override
    public int getRowCount() {
        return controlador.getProveedorCount();
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
        if(columnIndex > 0)
            return false;
        else
            return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return controlador.obtenerProveedor(rowIndex).getNombre();
            case 1:
                return controlador.obtenerProveedor(rowIndex).getTelefono();
            case 2:
                return controlador.obtenerProveedor(rowIndex).getEmail();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 1:
                controlador.obtenerProveedor(rowIndex).setTelefono(((Number) aValue).longValue());
                controlador.notificarCambios();
                break;
            case 2:
                controlador.obtenerProveedor(rowIndex).setEmail(String.valueOf(aValue));
                controlador.notificarCambios();
                break;
            default:;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Long.class;
            case 2:
                return String.class;
            default:
                return null;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }

}
