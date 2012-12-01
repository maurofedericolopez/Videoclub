package Controladores;

import Modelo.Ejemplar;
import Modelo.Enumerados.EstadoEjemplar;
import Modelo.Genero;
import Modelo.Pelicula;
import Modelo.Videoclub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

/**
 *
 * @author Mauro Federico Lopez
 */
public class PeliculaController extends Observable {

    private Videoclub modelo;

    public PeliculaController(Videoclub modelo) {
        this.modelo = modelo;
    }

    public Boolean disponible(Pelicula pelicula) {
        ArrayList<Ejemplar> ejemplares = pelicula.getEjemplares();
        Iterator<Ejemplar> i = ejemplares.iterator();
        while(i.hasNext()) {
            Ejemplar e = i.next();
            if(e.getEstado() == EstadoEjemplar.DISPONIBLE)
                return true;
        }
        return false;
    }

    public void registrarNuevaPelicula(Pelicula pelicula) {
        modelo.getPeliculas().add(pelicula);
        notificarCambios();
    }

    public void eliminarPelicula(int[] index) {
        ArrayList<Pelicula> peliculas = new ArrayList();
        for(int i = 0; i < index.length; i++) {
            peliculas.add(modelo.getPeliculas().get(index[i]));
        }
        Iterator<Pelicula> i = peliculas.iterator();
        while(i.hasNext())
            modelo.getPeliculas().remove(i.next());
        notificarCambios();
    }

    public int getPeliculaCount() {
        return modelo.getPeliculas().size();
    }

    public Pelicula obtenerPelicula(int index) {
        return this.modelo.getPeliculas().get(index);
    }

    public Ejemplar obtenerEjemplar(Pelicula pelicula) {
        ArrayList<Ejemplar> ejemplares = pelicula.getEjemplares();
        Iterator<Ejemplar> i = ejemplares.iterator();
        while(i.hasNext()) {
            Ejemplar e = i.next();
            if(e.getEstado() == EstadoEjemplar.DISPONIBLE)
                return e;
        }
        return null;
    }

    /**
     * @return the modelo
     */
    public Videoclub getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Videoclub modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Genero> obtenerGeneros() {
        return modelo.getGeneros();
    }

    public Boolean codigoPeliculaValido(String codigo) {
        Iterator<Pelicula> i = modelo.getPeliculas().iterator();
        while(i.hasNext())
            if(i.next().getCodigo().equals(codigo))
                return false;
        return true;
    }

    public Genero obtenerGenero(int rowIndex) {
        return modelo.getGeneros().get(rowIndex);
    }

    public void notificarCambios() {
        setChanged();
        notifyObservers();
    }

    public void registrarNuevaGenero(Genero genero) {
        modelo.getGeneros().add(genero);
        notificarCambios();
    }

    public boolean nombreGeneroValido(String nombre) {
        Iterator<Genero> i = modelo.getGeneros().iterator();
        while(i.hasNext())
            if(i.next().getNombre().equals(nombre))
                return false;
        return true;
    }

    public void eliminarGenero(int[] index) {
        ArrayList<Genero> generos = new ArrayList();
        for(int i = 0; i < index.length; i++) {
            generos.add(modelo.getGeneros().get(index[i]));
        }
        Iterator<Genero> i = generos.iterator();
        while(i.hasNext())
            modelo.getGeneros().remove(i.next());
        notificarCambios();
    }

    public void registrarNuevoEjemplar(Pelicula pelicula, Double precioAlquiler) {
        String codigoEjemplar = pelicula.getCodigo() + pelicula.getEjemplares().size();
        pelicula.getEjemplares().add(new Ejemplar(codigoEjemplar, precioAlquiler, pelicula));
        notificarCambios();
    }

    public void eliminarEjemplar(Pelicula pelicula, int[] indices) {
        ArrayList<Ejemplar> ejemplares = new ArrayList();
        for(int i = 0; i < indices.length; i++) {
            ejemplares.add(pelicula.getEjemplares().get(indices[i]));
        }
        Iterator<Ejemplar> i = ejemplares.iterator();
        while(i.hasNext())
            pelicula.getEjemplares().remove(i.next());
        notificarCambios();
    }

}
