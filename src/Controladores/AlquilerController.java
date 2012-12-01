package Controladores;

import Modelo.Alquiler;
import Modelo.Cliente;
import Modelo.Ejemplar;
import Modelo.Enumerados.EstadoAlquiler;
import Modelo.Videoclub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;
import videoclub.VideoclubApp;

/**
 *
 * @author Mauro Federico Lopez
 */
public class AlquilerController {

    private Videoclub modelo;

    public AlquilerController(Videoclub modelo) {
        this.modelo = modelo;
    }

    public Boolean puedeAlquilar (Cliente cliente) {
        ArrayList<Alquiler> alquileres = getAlquileresCliente(cliente);
        Iterator<Alquiler> i = alquileres.iterator();
        while(i.hasNext()) {
            Alquiler a = i.next();
            if(a.getEstado() == EstadoAlquiler.NODEVUELTO)
                return false;
        }
        return true;
    }

    public ArrayList<Alquiler> getAlquileresCliente(Cliente cliente) {
        ArrayList<Alquiler> lista = new ArrayList();
        ArrayList<Alquiler> alquileres = modelo.getListaAlquileres();
        Iterator<Alquiler> i = alquileres.iterator();
        while(i.hasNext()) {
            Alquiler a = i.next();
            if(a.getMiCliente() == cliente)
                lista.add(a);
        }
        return lista;
    }

    public void registrarNuevoAlquiler(Cliente cliente, ArrayList<Ejemplar> ejemplares) {
        Iterator<Ejemplar> i = ejemplares.iterator();
        while(i.hasNext()) {
            i.next().cambiarEstado();
        }
        Alquiler nuevoAlquiler = new Alquiler(cliente, ejemplares);
        this.modelo.getListaAlquileres().add(nuevoAlquiler);
        this.modelo.notificarCambios();
    }

    public void devolverAlquiler() {}

    public void guardarEjemplar(Ejemplar ejemplar) {
        
    }

    public void addObserver(Observer observer) {
        this.modelo.addObserver(observer);
    }

}
