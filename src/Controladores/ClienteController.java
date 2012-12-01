package Controladores;

import Modelo.Bono;
import Modelo.Cliente;
import Modelo.Videoclub;
import java.lang.Object;
import java.util.Map.Entry;
import java.util.*;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ClienteController extends Observable {

    private Videoclub modelo;

    public ClienteController(Videoclub modelo) {
        this.modelo = modelo;
    }

    public Boolean dniClienteValido(Long dni) {
        if(buscarClientePorDni(dni) == null)
            return true;
        else
            return false;
    }

    public void registrarNuevoCliente(Cliente cliente) {
        modelo.getClientes().add(cliente);
        modelo.notificarCambios();
    }

    public void eliminarCliente(int[] index) {
        ArrayList<Cliente> clientes = new ArrayList();
        for(int i = 0; i < index.length; i++) {
            clientes.add(obtenerCliente(index[i]));
        }
        Iterator<Cliente> i = clientes.iterator();
        while(i.hasNext())
            modelo.getClientes().remove(i.next());
        notificarCambios();
    }

    public int getClienteCount() {
        return modelo.getClientes().size();
    }

    public Cliente obtenerCliente(int index) {
        return modelo.getClientes().get(index);
    }

    public Cliente buscarClientePorDni(Long dni) {
        Iterator<Cliente> i = modelo.getClientes().iterator();
        while(i.hasNext()) {
            Cliente c = i.next();
            if (c.getDni().equals(dni))
                return c;
        }
        return null;
    }

    public void comprarBono(Cliente cliente, Bono bono) {
        Integer credito = bono.getCredito();
        if(cliente.getBonos().containsKey(bono.getPeriodo()))
            credito += cliente.getBonos().get(bono.getPeriodo());
        cliente.getBonos().put(bono.getPeriodo(), credito);
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

}
