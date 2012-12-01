package Vistas.modelos;

import Controladores.PeliculaController;
import Modelo.Ejemplar;
import Modelo.Pelicula;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class EjemplaresPeliculaTableModel extends AbstractTableModel implements Observer {

    private PeliculaController controlador;
    private static final String[] columns = {"Código","Estado","Precio Alquiler"};
    private Pelicula pelicula;
    private ArrayList<Ejemplar> ejemplares;

    public EjemplaresPeliculaTableModel() {
        super();
        controlador = Controladores.peliculaController;
        controlador.addObserver(this);
        ejemplares = new ArrayList();
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
        switch(columnIndex) {
            case 0 :
                return ejemplares.get(rowIndex).getCodigo();
            case 1 :
                return ejemplares.get(rowIndex).getEstado().toString();
            case 2 : 
                return ejemplares.get(rowIndex).getPrecioAlquiler();
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
                return String.class;
            case 2:
                return Double.class;
            default:
                return null;
        }
    }

    /**
     * @param pelicula the pelicula to set
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
        if(this.pelicula != null)
            ejemplares = pelicula.getEjemplares();
        else
            ejemplares = new ArrayList();
        fireTableDataChanged();
    }

    @Override
    public void update(Observable o, Object arg) {
        ejemplares = pelicula.getEjemplares();
        fireTableDataChanged();
    }

}
