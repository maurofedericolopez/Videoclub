package Controladores;

import Modelo.Bono;
import Modelo.Videoclub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

/**
 *
 * @author Mauro Federico Lopez
 */
public class BonoController extends Observable {

    private Videoclub modelo;

    public BonoController(Videoclub modelo) {
        this.modelo = modelo;
    }

    public int getBonoCount() {
        return modelo.getBonosConfeccionados().size();
    }

    public Bono obtenerBono(int rowIndex) {
        return modelo.getBonosConfeccionados().get(rowIndex);
    }

    public void registrarNuevoBono(Bono bono) {
        modelo.getBonosConfeccionados().add(bono);
        notificarCambios();
    }

    public void eliminarBono(int[] index) {
        ArrayList<Bono> bonos = new ArrayList();
        for(int i = 0; i < index.length; i++) {
            bonos.add(modelo.getBonosConfeccionados().get(index[i]));
        }
        Iterator<Bono> i = bonos.iterator();
        while(i.hasNext())
            modelo.getBonosConfeccionados().remove(i.next());
        notificarCambios();
    }

    public void notificarCambios() {
        setChanged();
        notifyObservers();
    }

    public Boolean datosBonoValido(Integer credito, Integer periodo) {
        Iterator<Bono> i = modelo.getBonosConfeccionados().iterator();
        while(i.hasNext()) {
            Bono b = i.next();
            if(b.getCredito().equals(credito) && b.getPeriodo().equals(periodo))
                return false;
        }
        return true;
    }

    public ArrayList<Bono> obtenerBonos() {
        return modelo.getBonosConfeccionados();
    }
}
