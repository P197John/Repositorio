package preguntas;

/**
 *
 * @author jhon anderso Puerta Alquerque
 */
import java.util.*;
import respuestas.Respuestas;

public class Preguntas {

    private String pregunta;
    private Respuestas[] respuesta;
    private int puntos;

    //constructor clase
    public Preguntas(String pregunta,Respuestas[] respuesta, int puntos) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.puntos = puntos;
    }
    //getters

    public String getPregunta() {
        return pregunta;
    }

    public Respuestas[] getRespuesta() {
        return respuesta;
    }



    public int getPuntos() {
        return puntos;
    }
    //crearmos un metodo para preguntar

    public void preguntar() {
        System.out.println(this.pregunta);
        //inicializamos por conveniencia 
        char opcionCorrecta = 'A';
        //recorremos la lista de respuestas
        for (Respuestas opcion : this.respuesta) {
            if (opcion.isCorrecta()) {
                opcionCorrecta = opcion.getOpcion();
            }
            System.out.println(String.valueOf(opcion.getOpcion()) + "  - " + opcion.getRespuesta() + " ");
        }
        System.out.println("\nElige: ");
        //llamamos la clase escaner para recibir entradas por tecaldo
        Scanner sc = new Scanner(System.in);
        char opcionElegidaPorElJugador =  sc.next().toUpperCase().charAt(0);
        //validamos la opcion ingresada por el jugador 
        if (opcionElegidaPorElJugador == opcionCorrecta ) {
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto, la respuesta correcta era " + String.valueOf(opcionCorrecta));
        }
    }
}
