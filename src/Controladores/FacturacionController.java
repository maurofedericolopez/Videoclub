package Controladores;

import Modelo.Videoclub;
import java.util.*;

/**
 *
 * @author Mauro Federico Lopez
 */
public class FacturacionController extends Observable {

    private Videoclub modelo;

    public FacturacionController(Videoclub modelo) {
        this.modelo = modelo;
    }

    public Double ingresosMensual() {
        Date hoy = new Date();
        hoy.setHours(0);
        hoy.setMinutes(0);
        hoy.setSeconds(0);

        Calendar desde = Calendar.getInstance();
        desde.setTime(hoy);
        desde.add(Calendar.DATE, -30);
        Calendar hasta = Calendar.getInstance();
        hasta.setTime(hoy);
        hasta.add(Calendar.DATE, 1);

        ArrayList<Double> ingresos = obtenerIngresosEntre(desde.getTime(), hasta.getTime());
        Double ingresosMensual = 0.0;
        for(Double i : ingresos)
            ingresosMensual += i;
        return ingresosMensual;
    }

    public ArrayList<Double> obtenerIngresosEntre(Date desde, Date hasta) {
        Calendar c = Calendar.getInstance();
        ArrayList<Double> ingresos = new ArrayList();
        while(desde.before(hasta)) {
            ingresos.add(obtenerIngreso(desde));

            c.setTime(desde);
            c.add(Calendar.DATE, 1);
            desde = c.getTime();
        }
        return ingresos;
    }

    public void registrarVentaBono(Double monto) {
        monto += obtenerIngreso(new Date());
        modelo.getIngresos().put(obtenerFechaIngreso(), monto);
    }

    private Double obtenerIngreso(Date hoy) {
        Iterator<Date> i = modelo.getIngresos().keySet().iterator();
        while(i.hasNext()) {
            Date fecha = i.next();
            if(fecha.getYear() == hoy.getYear() && fecha.getMonth() == hoy.getMonth() && fecha.getDay() == hoy.getDay())
                return modelo.getIngresos().get(fecha);
        }
        return 0.0;
    }

    private Date obtenerFechaIngreso() {
        Iterator<Date> i = modelo.getIngresos().keySet().iterator();
        Date hoy = new Date();
        while(i.hasNext()) {
            Date fecha = i.next();
            if(fecha.getYear() == hoy.getYear() && fecha.getMonth() == hoy.getMonth() && fecha.getDay() == hoy.getDay())
                return fecha;
        }
        return hoy;
    }

    public Double obtenerRecargo() {
        return modelo.getRecargoSancion();
    }

    public void modificarRecargo(Double recargo) throws Exception {
        if(recargo > 0) {
            modelo.setRecargoSancion(recargo);
            setChanged();
            notifyObservers();
        } else
            throw new Exception("El recargo debe ser mayor a $0");
    }

}
