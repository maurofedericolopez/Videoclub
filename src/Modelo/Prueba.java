package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Prueba {
    public static void main(String[] args) {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MM yyyy");
        String cadenaFecha = formato.format(fecha);
        System.out.println("Esta es la fecha actual");
        System.out.println(cadenaFecha);
    }
}
