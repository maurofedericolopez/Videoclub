package Controladores;

import Modelo.Bono;
import Modelo.Cliente;
import Modelo.Sancion;
import Modelo.Videoclub;
import java.util.*;
import videoclub.Controladores;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ClienteController extends Observable {

    private Videoclub modelo;

    public ClienteController(Videoclub modelo) {
        this.modelo = modelo;
    }

    public Boolean dniClienteValido(Long dni) throws Exception {
        Iterator<Cliente> i = modelo.getClientes().iterator();
        while(i.hasNext()) {
            Cliente c = i.next();
            if (c.getDni().equals(dni))
                throw new Exception("El DNI del cliente ya está registrado");
        }
        return true;
    }

    public void registrarNuevoCliente(Cliente cliente) {
        modelo.getClientes().add(cliente);
        notificarCambios();
    }

    public void eliminarCliente(int[] indices) throws Exception {
        if(indices.length > 0) {
            ArrayList<Cliente> clientes = new ArrayList();
            for(int i = 0; i < indices.length; i++) {
                clientes.add(obtenerCliente(indices[i]));
            }
            Iterator<Cliente> i = clientes.iterator();
            while(i.hasNext())
                modelo.getClientes().remove(i.next());
            notificarCambios();
        }
        else
            throw new Exception("No ha seleccionado ningún cliente para eliminar");
    }

    public int getClienteCount() {
        return modelo.getClientes().size();
    }

    public Cliente obtenerCliente(int index) {
        return modelo.getClientes().get(index);
    }

    public Cliente buscarClientePorDni(Long dni) throws Exception {
        Iterator<Cliente> i = modelo.getClientes().iterator();
        while(i.hasNext()) {
            Cliente c = i.next();
            if (c.getDni().equals(dni))
                return c;
        }
        throw new Exception("No existe ningun cliente con el numero de DNI ingresado.");
    }

    public void comprarBono(Cliente cliente, Bono bono) throws Exception {
        if(cliente != null)
            if(bono != null) {
                // Se agrega el bono al cliente.
                Integer credito = bono.getCredito();
                if(cliente.getBonos().containsKey(bono.getPeriodo()))
                    credito += cliente.getBonos().get(bono.getPeriodo());
                cliente.getBonos().put(bono.getPeriodo(), credito);

                // Se registra la compra de un bono en la fecha.
                Controladores.facturacionController.registrarVentaBono(bono.getPrecio());
            } else
                throw new Exception("No ha seleccionado ningún bono");
        else
            throw new Exception("No ha seleccionado ningún cliente");
    }

    public void notificarCambios() {
        setChanged();
        notifyObservers();
    }

    public ArrayList<Integer> obtenerBonosDelCliente(Cliente cliente) {
        ArrayList<Integer> bonosDelCliente = new ArrayList();
        Set<Integer> keySet = cliente.getBonos().keySet();
        for (Integer key : keySet)
            bonosDelCliente.add(key);
        return bonosDelCliente;
    }

    public void calcularSancion(Cliente cliente, Date fechaDevolucion) {
        Calendar devolucion = Calendar.getInstance();
        devolucion.setTime(fechaDevolucion);
        Calendar hoy = Calendar.getInstance();
        Long dias = (hoy.getTimeInMillis() -  devolucion.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        Double importe = dias * modelo.getRecargoSancion();
        importe += obtenerImporteSancion(cliente);
        cliente.getSanciones().put(obtenerFechaSancion(cliente), new Sancion(importe));
    }

    public void cancelarSancion(Sancion sancion) {
        sancion.cambiarEstado();
    }

    public ArrayList<Sancion> obtenerSanciones(Cliente cliente) {
        ArrayList<Sancion> sanciones = new ArrayList();
        Iterator<Sancion> i = cliente.getSanciones().values().iterator();
        while(i.hasNext())
            sanciones.add(i.next());
        return sanciones;
    }

    private Double obtenerImporteSancion(Cliente cliente) {
        Date hoy = new Date();
        Iterator<Date> i = cliente.getSanciones().keySet().iterator();
        while(i.hasNext()) {
            Date fecha = i.next();
            if(fecha.getYear() == hoy.getYear() && fecha.getMonth() == hoy.getMonth() && fecha.getDay() == hoy.getDay())
                return cliente.getSanciones().get(fecha).getImporte();
        }
        return 0.0;
    }

    private Date obtenerFechaSancion(Cliente cliente) {
        Iterator<Date> i = cliente.getSanciones().keySet().iterator();
        Date hoy = new Date();
        while(i.hasNext()) {
            Date fecha = i.next();
            if(fecha.getYear() == hoy.getYear() && fecha.getMonth() == hoy.getMonth() && fecha.getDay() == hoy.getDay())
                return fecha;
        }
        return hoy;
    }

}
