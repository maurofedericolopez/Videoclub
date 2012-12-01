package videoclub;

import Vistas.Principal;
import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauro Federico Lopez
 */
public class VideoclubApp extends Observable {

    public static Principal principal;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Controladores controladores = new Controladores();
            principal = new Principal();
            principal.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(VideoclubApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
