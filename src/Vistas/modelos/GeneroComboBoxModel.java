package Vistas.modelos;

import Controladores.PeliculaController;
import Modelo.Genero;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class GeneroComboBoxModel extends AbstractListModel implements ComboBoxModel, Observer {

    private PeliculaController peliculaController;
    private ArrayList<Genero> generos;
    private Genero generoSeleccionado;

    public GeneroComboBoxModel() {
        super();
        peliculaController = Controladores.peliculaController;
        peliculaController.addObserver(this);
        generos = peliculaController.obtenerGeneros();
        generoSeleccionado = null;
    }

    @Override
    public int getSize() {
        return generos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return generos.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        generoSeleccionado = (Genero) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return generoSeleccionado;
    }

    @Override
    public void update(Observable o, Object arg) {
        
    }

}
