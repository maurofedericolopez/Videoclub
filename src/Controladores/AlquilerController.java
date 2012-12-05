package Controladores;

import Modelo.Alquiler;
import Modelo.Cliente;
import Modelo.Ejemplar;
import Modelo.Enumerados.EstadoAlquiler;
import Modelo.Enumerados.EstadoEjemplar;
import Modelo.Videoclub;
import Modelo.comparator.FechaAlquilerComparator;
import java.util.*;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class AlquilerController extends Observable {

    private Videoclub modelo;
    private ArrayList<Ejemplar> ejemplaresAlquiler;
    private ArrayList<Alquiler> alquileresNoDevueltos;
    private Cliente cliente;
    private Integer periodo;

    public AlquilerController(Videoclub modelo) {
        this.modelo = modelo;
    }

    public Boolean clientePuedeAlquilar (Cliente cliente) throws Exception {
        Iterator<Alquiler> i = cliente.getAlquileres().iterator();
        Date hoy = new Date();
        while(i.hasNext()) {
            Alquiler a = i.next();
            if(a.getEstado() == EstadoAlquiler.NO_DEVUELTO && a.getFechaAlquiler() != hoy)
                throw new Exception("El cliente no está en condiciones de alquilar");
        }
        return true;
    }

    public Boolean ejemplarPuedeAlquilarse(Ejemplar ejemplar) throws Exception {
        if(ejemplar.getEstado() == EstadoEjemplar.DISPONIBLE)
            return true;
        else
            throw new Exception("El ejemplar no está disponible");
    }

    public ArrayList<Alquiler> obtenerAlquileresNoDevueltos() {
        ArrayList<Alquiler> alquileresPendientes = new ArrayList();
        Iterator<Alquiler> i = modelo.getListaAlquileres().iterator();
        while(i.hasNext()) {
            Alquiler a = i.next();
            if(a.getEstado() == EstadoAlquiler.NO_DEVUELTO)
                alquileresPendientes.add(a);
        }
        Collections.sort(alquileresPendientes, new FechaAlquilerComparator());
        return alquileresPendientes;
    }

    /**
     * @param ejemplaresAlquiler the ejemplaresAlquiler to set
     */
    public void setEjemplaresAlquiler(ArrayList<Ejemplar> ejemplaresAlquiler) {
        this.ejemplaresAlquiler = ejemplaresAlquiler;
        notificarCambios();
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        ejemplaresAlquiler = new ArrayList();
        periodo = null;
    }

    public void eliminarEjemplarAlquiler(int[] indices) throws Exception {
        if(indices.length > 0) {
            ArrayList<Ejemplar> ejemplares = new ArrayList();
            for(int i = 0; i < indices.length; i++) {
                ejemplares.add(getEjemplaresAlquiler().get(indices[i]));
            }
            Iterator<Ejemplar> i = ejemplares.iterator();
            while(i.hasNext())
                getEjemplaresAlquiler().remove(i.next());
            notificarCambios();
        } else
            throw new Exception("No ha seleccionado ningún ejemplar para eliminar del alquiler");
    }

    /**
     * @return the ejemplaresAlquiler
     */
    public ArrayList<Ejemplar> getEjemplaresAlquiler() {
        return ejemplaresAlquiler;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    public void agregarEjemplar(Ejemplar e) {
        getEjemplaresAlquiler().add(e);
        notificarCambios();
    }

    public Boolean seCumpleCondicionesDeAlquiler() throws Exception {
        if(cliente != null && !ejemplaresAlquiler.isEmpty() && periodo != null)
            return true;
        else
            throw new Exception("No se cumplen las condiciones necesarias para finalizar la operación");
    }

    public Boolean creditoSuficienteParaAlquiler(Integer periodo) throws Exception {
        Iterator<Ejemplar> i = ejemplaresAlquiler.iterator();
        Integer credito = cliente.getBonos().get(periodo);
        Integer suma = 0;
        while(i.hasNext())
            suma += i.next().getCreditoAlquiler();
        if((suma <= credito))
            return true;
        else
            throw new Exception("El bono elegido no tiene crédito suficiente para realizar la operación");
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public void registrarNuevoAlquiler() throws Exception {
        if (seCumpleCondicionesDeAlquiler())
            if(creditoSuficienteParaAlquiler(periodo)) {
                Iterator<Ejemplar> i = ejemplaresAlquiler.iterator();
                Integer suma = 0;
                while(i.hasNext()) {
                    Ejemplar e = i.next();
                    e.cambiarEstado();
                    suma += e.getCreditoAlquiler();
                    Alquiler a = new Alquiler(cliente, e, periodo);
                    modelo.getListaAlquileres().add(a);
                    cliente.getAlquileres().add(a);
                }
                cliente.getBonos().put(periodo, cliente.getBonos().get(periodo) - suma);
                notificarCambios();
            }
    }

    public void devolverAlquiler(int indice) throws Exception {
        if(indice >= 0) {
            Alquiler alquiler = alquileresNoDevueltos.get(indice);
            alquiler.cambiarEstado();
            if(new Date().after(alquiler.obtenerFechaDevolucion())) {
                Controladores.clienteController.calcularSancion(cliente, alquiler.obtenerFechaDevolucion());
            }
        } else
            throw new Exception("No ha seleccionado ningún ejemplar para devolver.");
    }

    public void notificarCambios() {
        setChanged();
        notifyObservers();
    }

}
