package Modelo;

import java.io.Serializable;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Proveedor implements Serializable {

    private String nombre;
    private Long telefono;
    private String email;
    // fin de variables

    public Proveedor(String nombre, Long telefono, String email) {
        this.nombre = nombre.toUpperCase();
        this.telefono = telefono;
        this.email = email;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
