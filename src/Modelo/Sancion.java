package Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Sancion implements Serializable {

    // Variables
    private Long id;
    private double importe;
    private Date fechaDevolucion;
    private Cliente miCliente;

    public Sancion(Long id, Date fechaAlquiler) {
        this.id = id;
        this.fechaDevolucion = new Date();

        /**
         * Para calcular el importe, es la diferencia entre
         * la fecha de devolucion del ejemplar y la fecha de alquiler
         * del mismo multiplicado por 
         */
    }
}
