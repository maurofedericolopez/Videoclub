package Vistas.modelos;

import Controladores.PeliculaController;
import Modelo.Genero;
import Modelo.Pelicula;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class PeliculaTableModel extends AbstractTableModel implements Observer {

    private PeliculaController controlador;
    private static final String[] columns = {"Código","Título","Año","Duración[min]","Sinopsis","Género"};

    public PeliculaTableModel() {
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
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 :
                return controlador.obtenerPelicula(rowIndex).getCodigo();
            case 1 :
                return controlador.obtenerPelicula(rowIndex).getTitulo();
            case 2 :
                return controlador.obtenerPelicula(rowIndex).getAño();
            case 3 :
                return controlador.obtenerPelicula(rowIndex).getMinDuracion();
            case 4 :
                return controlador.obtenerPelicula(rowIndex).getSinopsis();
            case 5 :
                return controlador.obtenerPelicula(rowIndex).getGenero();
            default :
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Pelicula pelicula = controlador.obtenerPelicula(rowIndex);
        switch (columnIndex) {
            case 1 :
                pelicula.setTitulo(String.valueOf(aValue));
                controlador.notificarCambios();
                break;
            case 2 :
                pelicula.setAño(((Number) aValue).longValue());
                controlador.notificarCambios();
                break;
            case 3 :
                pelicula.setMinDuracion(((Number) aValue).longValue());
                controlador.notificarCambios();
                break;
            case 4 :
                pelicula.setSinopsis(String.valueOf(aValue));
                controlador.notificarCambios();
                break;
            case 5 :
                pelicula.setGenero((Genero) aValue);
                controlador.notificarCambios();
                break;
            default :
                break;
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
                return Long.class;
            case 3 :
                return Long.class;
            case 4 :
                return String.class;
            case 5 :
                return Genero.class;
            default :
                return null;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }

}
