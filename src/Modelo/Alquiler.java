package Modelo;

import Modelo.Enumerados.EstadoAlquiler;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Alquiler implements Serializable {

    private Cliente cliente;
    private Ejemplar ejemplar;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private EstadoAlquiler estado;
    private Integer periodo;

    public Alquiler(Cliente cliente, Ejemplar ejemplar, Integer periodo) {
        this.cliente = cliente;
        this.ejemplar = ejemplar;
        this.periodo = periodo;
        fechaAlquiler = new Date();
        fechaDevolucion = null;
        estado = EstadoAlquiler.NO_DEVUELTO;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the ejemplar
     */
    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    /**
     * @param ejemplar the ejemplar to set
     */
    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
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

    /**
     * 
     */
    public void cambiarEstado() {
        if(estado == EstadoAlquiler.NO_DEVUELTO)
            estado = EstadoAlquiler.DEVUELTO;
        else
            estado = EstadoAlquiler.NO_DEVUELTO;
    }

    public Date obtenerFechaDevolucion() {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaAlquiler);
        calendario.add(Calendar.DATE, getPeriodo());
        return calendario.getTime();
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
     * @return the periodo
     */
    public Integer getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

}
