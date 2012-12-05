package Modelo;

import Modelo.Enumerados.EstadoSancion;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Sancion implements Serializable {

    private Double importe;
    private Date fecha;
    private EstadoSancion estado;

    public Sancion(Double importe) {
        this.importe = importe;
        this.fecha = new Date();
        this.estado = EstadoSancion.ADEUDA;
    }

    /**
     * @return the importe
     */
    public Double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(Double importe) {
        this.importe = importe;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the estado
     */
    public EstadoSancion getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoSancion estado) {
        this.estado = estado;
    }

    public void cambiarEstado() {
        if(estado == EstadoSancion.ADEUDA)
            estado = EstadoSancion.PAGADA;
        else
            estado = EstadoSancion.ADEUDA;
    }

}
