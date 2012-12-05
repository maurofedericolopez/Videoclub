package Vistas.modelos;

import Controladores.ClienteController;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ClienteTableModel extends AbstractTableModel implements Observer {

    private ClienteController controlador;
    private static final String[] columns = {"DNI","Apellido","Nombre","Email","Teléfono"};

    public ClienteTableModel() {
        super();
        this.controlador = Controladores.clienteController;
        this.controlador.addObserver(this);
    }

    @Override
    public int getRowCount() {
        return this.controlador.getClienteCount();
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
            return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 :
                return controlador.obtenerCliente(rowIndex).getDni();
            case 1 :
                return controlador.obtenerCliente(rowIndex).getApellido();
            case 2 : 
                return controlador.obtenerCliente(rowIndex).getNombre();
            case 3 :
                return controlador.obtenerCliente(rowIndex).getEmail();
            case 4 :
                return controlador.obtenerCliente(rowIndex).getTelefono();
            default :
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Long.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Long.class;
            default:
                return null;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }

}
