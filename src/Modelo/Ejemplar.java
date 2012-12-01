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
    private Double precioAlquiler;
    private Pelicula pelicula;

    public Ejemplar(String codigo, Double precioAlquiler, Pelicula pelicula) {
        this.codigo = codigo;
        this.precioAlquiler = precioAlquiler;
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
     * @return the precioAlquiler
     */
    public Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    /**
     * @param precioAlquiler the precioAlquiler to set
     */
    public void setPrecioAlquiler(Double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

}
