package Vistas.modelos;

import Controladores.AlquilerController;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauro Federico Lopez
 */
/*public class AlquilerTableModel extends AbstractTableModel implements Observer {

    // Variables
    private AlquilerController controlador;
    private static final String[] columns = {"Cliente","Fecha Alquiler"};

    public AlquilerTableModel(AlquilerController controlador) {
        super();
        this.controlador = controlador;
        this.controlador.addObserver(this);
    }

    @Override
    public int getRowCount() {
        return this.controlador.getAlquilerCount();
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
                return controlador.getAlquiler(rowIndex).getMiCliente().getApellido() +" "+ controlador.getAlquiler(rowIndex).getMiCliente().getNombre();
            case 1 :
                return controlador.getAlquiler(rowIndex).getFechaAlquiler();
            default :
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Date.class;
            default:
                return null;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }
    
}
*/