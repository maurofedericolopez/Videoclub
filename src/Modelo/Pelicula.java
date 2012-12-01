package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Pelicula implements Serializable {

    private String codigo;
    private String titulo;
    private Long año;
    private Long minDuracion;
    private String sinopsis;
    private Genero genero;
    private ArrayList<Ejemplar> ejemplares;

    public Pelicula(String codigo, String titulo, Long año, Long minDuracion, Genero genero, String sinopsis) {
        this.codigo = codigo;
        this.titulo = titulo.toUpperCase();
        this.año = año;
        this.minDuracion = minDuracion;
        this.genero = genero;
        this.sinopsis = sinopsis.toLowerCase();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the año
     */
    public Long getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(Long año) {
        this.año = año;
    }

    /**
     * @return the duracion
     */
    public Long getMinDuracion() {
        return minDuracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setMinDuracion(Long duracion) {
        this.minDuracion = duracion;
    }

    /**
     * @return the sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * @param sinopsis the sinopsis to set
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @return the ejemplares
     */
    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    /**
     * @param ejemplares the ejemplares to set
     */
    public void setEjemplares(ArrayList<Ejemplar> misEjemplares) {
        this.ejemplares = misEjemplares;
    }

}
