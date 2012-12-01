package Datos;

import Modelo.Videoclub;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Serializacion {

    private static File archivoModelo = new File("src\\Datos\\archivo_modelo.dat");

    public Videoclub deserializarModelo() throws IOException, ClassNotFoundException {
        if (archivoModelo.exists()) {
            Videoclub modelo;
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivoModelo))) {
                modelo = (Videoclub) in.readObject();
                in.close();
            }
            if(modelo == null)
                return new Videoclub();
            else
                return modelo;
        }
        else
            return new Videoclub();
    }

    public void serializarModelo(Videoclub modeloAGuardar) throws IOException {
        if (modeloAGuardar != null) {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivoModelo));
            out.writeObject(modeloAGuardar);
            out.close();
        }
    }

    public static void main(String[] args) {
        try {
            new Serializacion().serializarModelo(new Videoclub());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
