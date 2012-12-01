package Modelo;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Genero {

    private String nombre;
    private String descripcion;

    public Genero(String nombre, String descripcion) {
        this.nombre = nombre.toUpperCase();
        this.descripcion = descripcion.toLowerCase();
    }

    @Override
    public String toString() {
        return nombre;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion.toLowerCase();
    }

}
