package Datos;

import Modelo.*;
import java.io.*;
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
            Videoclub videoclub = new Videoclub();

            // Bonos
            videoclub.getBonosConfeccionados().add(new Bono(500, 1, 100.0));
            videoclub.getBonosConfeccionados().add(new Bono(700, 2, 200.0));
            videoclub.getBonosConfeccionados().add(new Bono(1000, 7, 400.0));

            // Generos + Peliculas
            Genero genero;

            // Genero Drama
            videoclub.getGeneros().add(genero = new Genero("drama", "películas que se centran principalmente en el desarrollo de un conflicto entre los protagonistas, o del protagonista con su entorno o consigo mismo."));
            videoclub.getPeliculas().add(new Pelicula("transito", "Tránsito", Long.parseLong("2012"), Long.parseLong("89"), genero, "Una banda de ladrones que huye tras atracar un banco se topa con una familia que se encuentra de acampada. Aprovechando la ocasión, los criminales esconderán el dinero robado en su coche mientras éstos descansan."));

            // Genero Comedia
            videoclub.getGeneros().add(genero = new Genero("comedia", "películas realizadas con la intención de provocar humor, entretenimiento o/y risa en el espectador."));
            videoclub.getPeliculas().add(new Pelicula("ted", "ted", Long.parseLong("2012"), Long.parseLong("106"), genero, "Cuando John Bennett (Mark Wahlberg) era pequeño, deseaba que su osito de peluche Ted fuera un oso de verdad y, por desgracia, su sueño se hizo realidad. Más de veinte años después, Ted sigue con John y saca de quicio a su novia Lori, que empieza a perder la paciencia. Para colmo, a John no parece preocuparle su futuro profesional y se pasa la vida fumando porros con Ted. A pesar de ello, John intenta alcanzar la madurez, pero parece que para conseguirlo le resulta indispensable la ayuda de Ted."));
            videoclub.getPeliculas().add(new Pelicula("mentiroso", "mentiroso, mentiroso", Long.parseLong("1997"), Long.parseLong("84"), genero, "Un abogado embaucador y mentiroso es preso del deseo de su hijo en el día de su cumpleaños: lo que le gustaría es que su padre, por un día, no dijera mentiras."));

            // Genero Aventura
            videoclub.getGeneros().add(genero = new Genero("aventura", "contienen situaciones de peligro y riesgo."));

            // Genero Terror
            videoclub.getGeneros().add(genero = new Genero("terror", "realizadas con la intención de provocar tensión, miedo y/o el sobresalto en la audiencia."));
            videoclub.getPeliculas().add(new Pelicula("hacha", "El Asesino del Hacha 2", Long.parseLong("2010"), Long.parseLong("89"), genero, "Después de conseguir escapar de Victor Crowley, Marybeth ya sabe la verdad sobre la maldición de Crowley y se dirige hacia el pantano de Nueva Orleans embrujado para buscar venganza para su familia y matar a Victor Crowley de una vez por todas."));
            videoclub.getPeliculas().add(new Pelicula("demonio", "La Noche Del Demonio", Long.parseLong("2010"), Long.parseLong("102"), genero, "Josh (Patrick Wilson), su esposa Renai (Rose Byrne) y sus tres hijos acaban de mudarse a una vieja casa. Pero tras un desgraciado accidente en el que el hijo pequeño entra en coma, empezarán a producirse extraños fenómenos, y la familia se verá acosada por algo que no parece de este mundo."));

            // Genero Ciencia Ficcion
            videoclub.getGeneros().add(genero = new Genero("ciencia ficción", "presentan la progresión de lo desconocido a lo conocido por el descubrimiento de una serie de enigmas."));

            // Genero Melodrama
            videoclub.getGeneros().add(genero = new Genero("melodrama", "tiene una carga emocional o moral muy fuerte o emotiva, atendiendo al gusto de cada persona."));

            // Genero Fantasia
            videoclub.getGeneros().add(genero = new Genero("fantasía", "contienen hechos, mundos, criaturas o cosas fantasiosas."));

            // Genero Belico
            videoclub.getGeneros().add(genero = new Genero("Bélico", "campos de batalla y posiciones que pertenecen a un tiempo de guerra."));

            // Genero Animacion
            videoclub.getGeneros().add(genero = new Genero("animación", "películas compuestas de fotogramas dibujados a mano que, pasados rápidamente, producen ilusión de movimiento. También se incluyen aquí las películas generadas íntegramente mediante la informática."));

            // Genero Musical
            videoclub.getGeneros().add(genero = new Genero("musical", "contienen interrupciones en su desarrollo, para dar un breve receso por medio de un fragmento musical cantado o acompañados de una coreografía."));

            // Genero Acción
            videoclub.getGeneros().add(genero = new Genero("acción", "cuyo argumento implica una interacción moral entre el «bien» y el «mal» llevada a su fin por la violencia o la fuerza física."));
            videoclub.getPeliculas().add(new Pelicula("araña", "El Sorprendente Hombre Araña ", Long.parseLong("2012"), Long.parseLong("136"), genero, "Peter Parker, un marginado estudiante cuyos padres lo abandonaron cuando era niño, fue criado por sus tíos Ben y May. Mientras trata de descifrar quién es, se topa con Gwen Stacy y descubre el amor. Cuando Peter descubre un misterioso portafolio que perteneció a su padre, comienza su misión para entender por qué desapareció, lo cual lo lleva directamente a OsCorp y al laboratorio del Dr. Curt Connors, antiguo socio de su padre. Conforme el Hombre Araña se enfrenta al alter ego de Connors, Lagarto, Peter tomará decisiones sobre sus poderes que cambiarán su destino."));

            // Clientes
            videoclub.getClientes().add(new Cliente(Long.parseLong("35283456"), "lopez", "mauro federico", "maurofedericolopez@yahoo.com.ar", Long.parseLong("2901456789")));
            videoclub.getClientes().add(new Cliente(Long.parseLong("22654789"), "gutierrez", "jorge", "g.jorge@gmail.com", Long.parseLong("2964321456")));
            videoclub.getClientes().add(new Cliente(Long.parseLong("28451378"), "perez", "gustavo", "gustavo@gmail.com", Long.parseLong("2901526481")));

            // Proveedores
            videoclub.getProveedores().add(new Proveedor("estrenos s.a.", Long.parseLong("446152"), "estrenos.peliculas@videos.com"));
            videoclub.getProveedores().add(new Proveedor("la premium", Long.parseLong("456197"), "premium@videos.com"));

            new Serializacion().serializarModelo(videoclub);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
