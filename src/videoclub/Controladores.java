package videoclub;

import Controladores.*;
import Datos.Serializacion;
import Modelo.Videoclub;
import java.io.IOException;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Controladores {

    public static Videoclub videoclub;
    public static ProveedorController proveedorController;
    public static PeliculaController peliculaController;
    public static ClienteController clienteController;
    public static BonoController bonoController;
    public static AlquilerController alquilerController;
    public static FacturacionController facturacionController;

    public Controladores() throws IOException, ClassNotFoundException {
        videoclub = (Videoclub) new Serializacion().deserializarModelo();
        peliculaController = new PeliculaController(videoclub);
        clienteController = new ClienteController(videoclub);
        alquilerController = new AlquilerController(videoclub);
        bonoController = new BonoController(videoclub);
        proveedorController = new ProveedorController(videoclub);
        facturacionController = new FacturacionController(videoclub);
    }

}
