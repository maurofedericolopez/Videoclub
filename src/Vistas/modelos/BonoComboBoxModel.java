package Vistas.modelos;

import Controladores.BonoController;
import Modelo.Bono;
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
public class BonoComboBoxModel extends AbstractListModel implements ComboBoxModel, Observer {

    private BonoController controlador;
    private ArrayList<Bono> bonos;
    private Bono bonoSeleccionado;

    public BonoComboBoxModel() {
        super();
        controlador = Controladores.bonoController;
        controlador.addObserver(this);
        bonos = controlador.obtenerBonos();
        bonoSeleccionado = null;
    }

    @Override
    public int getSize() {
        return bonos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return bonos.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        bonoSeleccionado = (Bono) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return bonoSeleccionado;
    }

    @Override
    public void update(Observable o, Object arg) {
        
    }
}
