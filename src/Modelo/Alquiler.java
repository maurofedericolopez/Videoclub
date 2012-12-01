package Modelo;

import Modelo.Enumerados.EstadoAlquiler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Alquiler implements Serializable {

    private Cliente miCliente;
    private ArrayList<Ejemplar> listaEjemplares;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private EstadoAlquiler estado;

    public Alquiler(Cliente miCliente, ArrayList<Ejemplar> listaEjemplares) {
        this.listaEjemplares = listaEjemplares;
        this.miCliente = miCliente;
        fechaAlquiler = new Date();
        this.estado = EstadoAlquiler.NODEVUELTO;
    }

    /**
     * @return the miCliente
     */
    public Cliente getMiCliente() {
        return miCliente;
    }

    /**
     * @param miCliente the miCliente to set
     */
    public void setMiCliente(Cliente miCliente) {
        this.miCliente = miCliente;
    }

    /**
     * @return the listaEjemplares
     */
    public ArrayList<Ejemplar> getListaEjemplares() {
        return listaEjemplares;
    }

    /**
     * @param listaEjemplares the listaEjemplares to set
     */
    public void setListaEjemplares(ArrayList<Ejemplar> listaEjemplares) {
        this.listaEjemplares = listaEjemplares;
    }

    /**
     * @return the fechaAlquiler
     */
    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    /**
     * @param fechaAlquiler the fechaAlquiler to set
     */
    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    /**
     * @return the fechaDevolucion
     */
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * @param fechaDevolucion the fechaDevolucion to set
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * @return the estado
     */
    public EstadoAlquiler getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoAlquiler estado) {
        this.estado = estado;
    }

}
