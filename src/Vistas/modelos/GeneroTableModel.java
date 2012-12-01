package Vistas.modelos;

import Controladores.PeliculaController;
import Modelo.Genero;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class GeneroTableModel extends AbstractTableModel implements Observer {

    private PeliculaController controlador;
    private static final String[] columns = {"Nombre","Descripción"};

    public GeneroTableModel() {
        super();
        this.controlador = Controladores.peliculaController;
        this.controlador.addObserver(this);
    }

    @Override
    public int getRowCount() {
        return controlador.getPeliculaCount();
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
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return controlador.obtenerGenero(rowIndex).getNombre();
            case 1:
                return controlador.obtenerGenero(rowIndex).getDescripcion();
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0 :
                return String.class;
            case 1 :
                return String.class;
            default :
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Genero genero = controlador.obtenerGenero(rowIndex);
        switch (columnIndex) {
            case 0 :
                genero.setNombre(String.valueOf(aValue));
                controlador.notificarCambios();
                break;
            case 1 :
                genero.setDescripcion(String.valueOf(aValue));
                controlador.notificarCambios();
                break;
            default :
                break;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }

}
