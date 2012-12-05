package Modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Prueba {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("Fecha actual: " + fecha.toLocaleString());
        fecha.setDate(fecha.getDay() - 5);
        System.out.println("Cinco dias antes: " + fecha.toLocaleString());
        fecha.setDate(fecha.getDay() + 5);
        System.out.println("Cinco dias después: " + fecha.toLocaleString());
        
        
        
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, -30);
        Date treintaDiasAntes = c.getTime();
        System.out.println(treintaDiasAntes.toLocaleString());
    }
}
