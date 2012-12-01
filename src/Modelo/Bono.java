package Modelo;

import java.io.Serializable;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Bono implements Serializable {

    private Double precio;
    private Integer credito;
    private Integer periodo;

    public Bono(Integer credito, Integer periodo, Double precio) {
        this.credito = credito;
        this.periodo = periodo;
        this.precio = precio;
    }

    public void incrementarCredito(Integer credito) {
        this.setCredito((Integer) (this.getCredito() + credito));
    }

    /**
     * Decrementa el credito del bono.
     * @param alquiler
     * @return 
     */
    public boolean decrementarCredito(Integer costoAlquiler) {
        if ( this.getCredito() - costoAlquiler >= 0) {
            this.setCredito((Integer) (this.getCredito() - costoAlquiler));
            return true;
        }
        else
            return false;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the credito
     */
    public Integer getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    /**
     * @return the periodo
     */
    public Integer getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Crédito = " + credito + " Periodo = " + periodo;
    }
}
