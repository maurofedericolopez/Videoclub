package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Videoclub implements Serializable {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Bono> bonosConfeccionados;
    private HashMap<Date, Double> ingresos;
    private ArrayList<Alquiler> listaAlquileres;
    private ArrayList<Genero> generos;
    private Double recargoSancion;

    public Videoclub() {
        super();
        peliculas = new ArrayList();
        clientes = new ArrayList();
        generos = new ArrayList();
        proveedores = new ArrayList();
        listaAlquileres = new ArrayList();
        bonosConfeccionados = new ArrayList();
        ingresos = new HashMap();
        recargoSancion = 1.0;
    }

    /**
     * @return the peliculas
     */
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    /**
     * @param peliculas the peliculas to set
     */
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the proveedores
     */
    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    /**
     * @param proveedores the proveedores to set
     */
    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    /**
     * @return the bonosConfeccionados
     */
    public ArrayList<Bono> getBonosConfeccionados() {
        return bonosConfeccionados;
    }

    /**
     * @param bonosConfeccionados the bonosConfeccionados to set
     */
    public void setBonosConfeccionados(ArrayList<Bono> bonosConfeccionados) {
        this.bonosConfeccionados = bonosConfeccionados;
    }

    /**
     * @return the listaAlquileres
     */
    public ArrayList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    /**
     * @param listaAlquileres the listaAlquileres to set
     */
    public void setListaAlquileres(ArrayList<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    /**
     * @return the generos
     */
    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    /**
     * @param generos the generos to set
     */
    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    /**
     * @return the recargoSancion
     */
    public Double getRecargoSancion() {
        return recargoSancion;
    }

    /**
     * @param recargoSancion the recargoSancion to set
     */
    public void setRecargoSancion(Double recargoSancion) {
        this.recargoSancion = recargoSancion;
    }

    /**
     * @return the ingresos
     */
    public HashMap<Date, Double> getIngresos() {
        return ingresos;
    }

    /**
     * @param ingresos the ingresos to set
     */
    public void setIngresos(HashMap<Date, Double> bonosComprados) {
        this.ingresos = bonosComprados;
    }

}
