package Vistas.modelos;

import Controladores.PeliculaController;
import Modelo.Ejemplar;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro
 */
public class PeliculasDemandadasTableModel extends AbstractTableModel implements Observer {

    private PeliculaController controlador;
    private ArrayList<Ejemplar> ejemplares;
    private static final String[] columns = {"Código", "Título", "Porcentaje[%]"};

    public PeliculasDemandadasTableModel() {
        super();
        controlador = Controladores.peliculaController;
        controlador.addObserver(this);
        ejemplares = controlador.obtenerTodosLosEjemplares();
    }

    @Override
    public int getRowCount() {
        return ejemplares.size();
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
        switch (columnIndex) {
            case 0 :
                return ejemplares.get(rowIndex).getCodigo();
            case 1 :
                return ejemplares.get(rowIndex).getPelicula().getTitulo();
            case 2 :
                return controlador.porcentajeDemanda(ejemplares.get(rowIndex));
            default :
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
            case 2 :
                return Double.class;
            default :
                return null;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }

}
