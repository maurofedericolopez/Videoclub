package Vistas.modelos;

import Controladores.AlquilerController;
import Modelo.Alquiler;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class AlquileresNoDevueltosTableModel extends AbstractTableModel implements Observer {

    private AlquilerController alquilerController;
    private String[] columns = {"Código Ejemplar", "Título", "Cliente", "Fecha Alquiler", "Fecha Devolución"};
    private ArrayList<Alquiler> alquileresNoDevueltos;

    public AlquileresNoDevueltosTableModel() {
        super();
        this.alquilerController = Controladores.alquilerController;
        this.alquilerController.addObserver(this);
        alquileresNoDevueltos = alquilerController.obtenerAlquileresNoDevueltos();
    }

    @Override
    public int getRowCount() {
        return alquileresNoDevueltos.size();
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
                return Date.class;
            case 4 :
                return Date.class;
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
                return alquileresNoDevueltos.get(rowIndex).getEjemplar().getCodigo();
            case 1 :
                return alquileresNoDevueltos.get(rowIndex).getEjemplar().getPelicula().toString();
            case 2 :
                return alquileresNoDevueltos.get(rowIndex).getCliente().toString();
            case 3 :
                return alquileresNoDevueltos.get(rowIndex).getFechaAlquiler();
            case 4 :
                return alquileresNoDevueltos.get(rowIndex).obtenerFechaDevolucion();
            default :
                return null;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        alquileresNoDevueltos = alquilerController.obtenerAlquileresNoDevueltos();
        fireTableDataChanged();
    }

}
