package Controladores;

import Modelo.Enumerados.EstadoEjemplar;
import Modelo.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.UUID;

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
        return modelo.getPeliculas().get(index);
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

    public void registrarNuevoGenero(Genero genero) {
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

    public void registrarNuevoEjemplar(Pelicula pelicula, Integer creditoAlquiler) {
        String aleatorio = UUID.randomUUID().toString().toUpperCase();
        String codigoEjemplar = pelicula.getCodigo() + "-" + aleatorio.substring(aleatorio.length() - 4);
        while(!codigoEjemplarValido(pelicula, codigoEjemplar)) {
            aleatorio = UUID.randomUUID().toString().toUpperCase();
            codigoEjemplar = pelicula.getCodigo() + "-" + aleatorio.substring(aleatorio.length() - 4);
        }
        pelicula.getEjemplares().add(new Ejemplar(codigoEjemplar, creditoAlquiler, pelicula));
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

    public int getGeneroCount() {
        return modelo.getGeneros().size();
    }

    public Boolean codigoEjemplarValido(Pelicula pelicula, String codigo) {
        Iterator<Ejemplar> i = pelicula.getEjemplares().iterator();
        while(i.hasNext())
            if(i.next().getCodigo().equals(codigo))
                return false;
        return true;
    }

    public Ejemplar buscarEjemplarPorCodigo(String codigo) throws Exception {
        Iterator<Pelicula> pelicula = modelo.getPeliculas().iterator();
        while(pelicula.hasNext()) {
            Iterator<Ejemplar> ejemplar = pelicula.next().getEjemplares().iterator();
            while(ejemplar.hasNext()) {
                Ejemplar e = ejemplar.next();
                if(e.getCodigo().equals(codigo.toUpperCase()))
                    return e;
            }
        }
        throw new Exception("No existe ningún ejemplar con el código especificado.");
    }

    public ArrayList<Ejemplar> obtenerTodosLosEjemplares() {
        ArrayList<Ejemplar> ejemplares = new ArrayList();
        Iterator<Pelicula> p = modelo.getPeliculas().iterator();
        while(p.hasNext()) {
            Iterator<Ejemplar> e = p.next().getEjemplares().iterator();
            while(e.hasNext())
                ejemplares.add(e.next());
        }
        return ejemplares;
    }

    public Double porcentajeDemanda(Ejemplar ejemplar) {
        Iterator<Alquiler> i = modelo.getListaAlquileres().iterator();
        Integer cantidad = 0;
        while(i.hasNext())
            if(i.next().getEjemplar().getCodigo().equals(ejemplar.getCodigo()))
                cantidad += 1;
        if(cantidad != 0)
            return (cantidad.doubleValue() / modelo.getListaAlquileres().size()) * 100;
        else
            return cantidad.doubleValue();
    }

}
