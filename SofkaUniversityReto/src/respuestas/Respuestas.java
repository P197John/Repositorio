package respuestas;
/**
 *
 * @author  jhon anderso Puerta Alquerque
 */
public class Respuestas {
    //variables de clase
    private String respuesta;
    private char opcion;
    private boolean correcta;
    
    //costructor de clase
    public Respuestas(String respuesta, char opcion, boolean correcta) {
        this.respuesta = respuesta;
        this.opcion = opcion;
        this.correcta = correcta;
    }
    
    //getters

    public String getRespuesta() {
        return respuesta;
    }

    public char getOpcion() {
        return opcion;
    }

    public boolean isCorrecta() {
        return correcta;
    }
    //setters

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
    
}
