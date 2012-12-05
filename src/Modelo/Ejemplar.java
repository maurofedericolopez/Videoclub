package Modelo;

import Modelo.Enumerados.EstadoEjemplar;
import java.io.Serializable;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Ejemplar implements Serializable {

    private String codigo;
    private EstadoEjemplar estado;
    private Integer creditoAlquiler;
    private Pelicula pelicula;

    public Ejemplar(String codigo, Integer creditoAlquiler, Pelicula pelicula) {
        this.codigo = codigo;
        this.creditoAlquiler = creditoAlquiler;
        this.pelicula = pelicula;
        this.estado = EstadoEjemplar.DISPONIBLE;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the id to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the estado
     */
    public EstadoEjemplar getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    /**
     * Cambia el estado de un ejemplar.
     */
    public void cambiarEstado() {
        if(this.getEstado() == EstadoEjemplar.ALQUILADO)
            this.setEstado(EstadoEjemplar.DISPONIBLE);
        else
            this.setEstado(EstadoEjemplar.ALQUILADO);
    }

    /**
     * @return the pelicula
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * @param pelicula the pelicula to set
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * @return the creditoAlquiler
     */
    public Integer getCreditoAlquiler() {
        return creditoAlquiler;
    }

    /**
     * @param creditoAlquiler the creditoAlquiler to set
     */
    public void setCreditoAlquiler(Integer creditoAlquiler) {
        this.creditoAlquiler = creditoAlquiler;
    }

}
