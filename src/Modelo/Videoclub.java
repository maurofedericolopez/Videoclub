package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Videoclub extends Observable implements Serializable {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Bono> bonosConfeccionados;
    private ArrayList<Alquiler> listaAlquileres;
    private ArrayList<Genero> generos;

    public Videoclub() {
        super();
        peliculas = new ArrayList();
        clientes = new ArrayList();
        generos = new ArrayList();
        proveedores = new ArrayList();
        listaAlquileres = new ArrayList();
        bonosConfeccionados = new ArrayList();
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
    public void setPeliculas(ArrayList<Pelicula> misPeliculas) {
        this.peliculas = misPeliculas;
        setChanged();
        notifyObservers();
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
    public void setClientes(ArrayList<Cliente> misClientes) {
        this.clientes = misClientes;
        setChanged();
        notifyObservers();
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
    public void setProveedores(ArrayList<Proveedor> misProveedores) {
        this.proveedores = misProveedores;
        setChanged();
        notifyObservers();
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
        setChanged();
        notifyObservers();
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
        setChanged();
        notifyObservers();
    }

    public void notificarCambios() {
        setChanged();
        notifyObservers();
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

}
