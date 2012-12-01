package Modelo;

import Modelo.Enumerados.EstadoEjemplar;
import java.io.Serializable;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Ejemplar implements Serializable {

    private String codigo;
    private EstadoEjemplar miEstado;
    private Double precioAlquiler;
    private Pelicula miPelicula;

    public Ejemplar(String codigo, Double precioAlquiler, Pelicula miPelicula) {
        this.codigo = codigo;
        this.precioAlquiler = precioAlquiler;
        this.miPelicula = miPelicula;
        this.miEstado = EstadoEjemplar.DISPONIBLE;
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
        return miEstado;
    }

    /**
     * Cambia el estado de un ejemplar.
     */
    public void cambiarEstado() {
        if(this.miEstado == EstadoEjemplar.ALQUILADO)
            this.miEstado = EstadoEjemplar.DISPONIBLE;
        else
            this.miEstado = EstadoEjemplar.ALQUILADO;
    }

    /**
     * @return the miPelicula
     */
    public Pelicula getMiPelicula() {
        return miPelicula;
    }

    /**
     * @param miPelicula the miPelicula to set
     */
    public void setMiPelicula(Pelicula miPelicula) {
        this.miPelicula = miPelicula;
    }

}
