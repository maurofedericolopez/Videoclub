package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Cliente implements Serializable {

    private Long dni;
    private String apellido;
    private String nombre;
    private String email;
    private Long telefono;
    private HashMap<Integer, Integer> bonos;
    private HashMap<Date, Sancion> sanciones;
    private ArrayList<Alquiler> alquileres;

    public Cliente(Long dni, String apellido, String nombre, String email, Long telefono) {
        this.dni = dni;
        this.apellido = apellido.toUpperCase();
        this.nombre = nombre.toUpperCase();
        this.email = email;
        this.telefono = telefono;
        bonos = new HashMap();
        sanciones = new HashMap();
        alquileres = new ArrayList();
    }

    /**
     * @return the dni
     */
    public Long getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(Long dni) {
        this.dni = dni;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido.toUpperCase();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email.toUpperCase();
    }

    /**
     * @return the telefono
     */
    public Long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sanciones
     */
    public HashMap<Date, Sancion> getSanciones() {
        return sanciones;
    }

    /**
     * @param sanciones the sanciones to set
     */
    public void setSanciones(HashMap<Date, Sancion> sanciones) {
        this.sanciones = sanciones;
    }

    /**
     * @return the bonos
     */
    public HashMap<Integer, Integer> getBonos() {
        return bonos;
    }

    /**
     * @param bonos the bonos to set
     */
    public void setBonos(HashMap<Integer, Integer> bonos) {
        this.bonos = bonos;
    }

    /**
     * @return the alquileres
     */
    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    /**
     * @param alquileres the alquileres to set
     */
    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    @Override
    public String toString() {
        return apellido + " " + nombre;
    }

}
