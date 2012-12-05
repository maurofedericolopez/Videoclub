package Modelo.comparator;

import Modelo.Alquiler;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Mauro Federico Lopez
 */
public class FechaAlquilerComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Date d1 = ((Alquiler) o1).getFechaAlquiler();
        Date d2 = ((Alquiler) o2).getFechaAlquiler();
        return d1.compareTo(d2);
    }

}
