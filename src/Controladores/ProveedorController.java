package Controladores;

import Modelo.Proveedor;
import Modelo.Videoclub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ProveedorController extends Observable {

    private Videoclub modelo;

    public ProveedorController(Videoclub modelo) {
        this.modelo = modelo;
    }

    public void registrarNuevoProveedor(Proveedor proveedor) {
        this.modelo.getProveedores().add(proveedor);
        notificarCambios();
    }

    public void eliminarProveedor(int[] index) {
        ArrayList<Proveedor> proveedores = new ArrayList();
        for(int i = 0; i < index.length; i++) {
            proveedores.add(modelo.getProveedores().get(index[i]));
        }
        Iterator<Proveedor> i = proveedores.iterator();
        while(i.hasNext())
            modelo.getProveedores().remove(i.next());
        notificarCambios();
    }

    public int getProveedorCount() {
        return modelo.getProveedores().size();
    }

    public Proveedor obtenerProveedor(int index) {
        return modelo.getProveedores().get(index);
    }

    /**
     * @return the modelo
     */
    public Videoclub getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Videoclub modelo) {
        this.modelo = modelo;
    }

    public void notificarCambios() {
        setChanged();
        notifyObservers();
    }

    public boolean nombreProveedorValido(String nombre) {
        if(buscarProveedorPorNombre(nombre) == null)
            return true;
        else
            return false;
    }

    public Object buscarProveedorPorNombre(String nombre) {
        Iterator<Proveedor> i = modelo.getProveedores().iterator();
        while(i.hasNext()) {
            Proveedor p = i.next();
            if (p.getNombre().equals(nombre))
                return p;
        }
        return null;
    }

}
