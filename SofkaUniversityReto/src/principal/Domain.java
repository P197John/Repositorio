package principal;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import preguntas.Preguntas;
import respuestas.Respuestas;

/**
 *
 * @author jhon anderso Puerta Alquerque
 */
public class Domain {

    public static void main(String[] args) {
        Menu m = new Menu();
        m.menuOpciones();

    }

    /*creamos un metodo para escoger una pregunta aleatoria de acuerdo al tamaño
    del arreglo de preguntas que crearemos posteriomente.
     */
    public static int preguntaAleatoria(int vMin, int vMax) {
        //nextInt() regresa rango con limite superior excluisivo, por tal motivo sumanos 1
        return ThreadLocalRandom.current().nextInt(vMin, vMax + 1);
    }

    //ahora crearemos el primer nivel depreguntas
    public static void preguntasPrimerLvl() {
        //creamos un vector para almacenar las preguntas con sus respectivas respuetas
        Preguntas[] preguntas = {
            //primera
            new Preguntas("Creador java", new Respuestas[]{
                new Respuestas("Elon Musk", 'A', false),
                new Respuestas("Steve Jobs", 'B', false),
                new Respuestas("James Gosling", 'C', true),
                new Respuestas("Rasmus Lerdorf", 'D', false)
            }, 10),
            //segunda
            new Preguntas("primer país en aprobar el sufragio femenino", new Respuestas[]{
                new Respuestas("Colombia", 'A', false),
                new Respuestas("Guinea", 'B', false),
                new Respuestas("Hungría", 'C', false),
                new Respuestas("Nueva Zelanda", 'D', true)
            }, 10),
            //tercera
            new Preguntas("¿En qué año llegó el hombre a la Luna?", new Respuestas[]{
                new Respuestas("1990", 'A', false),
                new Respuestas("1969", 'B', true),
                new Respuestas("1994", 'C', false),
                new Respuestas("1980", 'D', false)
            }, 10),
            //cuarta
            new Preguntas(" ¿Qué importante batalla tuvo lugar en 1815?", new Respuestas[]{
                new Respuestas("La batalla de Berlín", 'A', false),
                new Respuestas("La batalla de Moscú", 'B', false),
                new Respuestas("batalla de Waterloo", 'C', true),
                new Respuestas("La batalla de Stalingrado", 'D', false)
            }, 10),
            //quinta
            new Preguntas("¿Cuál era la ciudad hogar de Marco Polo?", new Respuestas[]{
                new Respuestas("Venecia", 'A', true),
                new Respuestas("México",  'B', false),
                new Respuestas("Granada", 'C', false),
                new Respuestas("Córdoba", 'D', false)
            }, 10)
        };
        for (Preguntas p : preguntas) {
//            int indiceAleatorio = preguntaAleatoria(0, preguntas.length - 1);
//            Preguntas preguntaAleatorio = preguntas[indiceAleatorio];
            p.preguntar();
        }

    }

    //ahora crearemos el segundo nivel depreguntas
    public static void preguntasSegundoLvl() {
        //creamos un vector para almacenar las preguntas con sus respectivas respuetas
        Preguntas[] preguntas = {
            //primera
            new Preguntas("¿En qué año tuvo lugar el genocidio de Ruanda?", new Respuestas[]{
                new Respuestas("1996", 'A', false),
                new Respuestas("1998", 'B', false),
                new Respuestas("1990", 'C', false),
                new Respuestas("1994", 'D', true)
            }, 10),
            //segunda
            new Preguntas("¿En qué año se disolvió la Unión Soviética?", new Respuestas[]{
                new Respuestas("1991", 'A', true),
                new Respuestas("1992", 'B', false),
                new Respuestas("1993", 'C', false),
                new Respuestas("1994", 'D', false)
            }, 10),
            //tercera
            new Preguntas("¿En qué ciudad se entrevistaron Hitler y Franco?", new Respuestas[]{
                new Respuestas("Baviera", 'A', false),
                new Respuestas("Hendaya", 'B', true),
                new Respuestas("Coburgo", 'C', false),
                new Respuestas("Hamburgo", 'D', false)
            }, 10),
            //cuarta
            new Preguntas("¿De qué país se independizó Eslovenia?", new Respuestas[]{
                new Respuestas("Alemania", 'A', false),
                new Respuestas("Inglaterra", 'B', false),
                new Respuestas("Yugoslavia", 'C', true),
                new Respuestas("Rusia", 'D', false)
            }, 10),
            //quinta
            new Preguntas("¿Qué presidente de la Unión Soviética instauró la Perestroika?", new Respuestas[]{
                new Respuestas("Mijaíl Gorbachov", 'A', true),
                new Respuestas("Yuri Andrópov", 'B', false),
                new Respuestas("Konstantín Chernenko", 'C', false),
                new Respuestas("Vladímir Lenin", 'D', false)
            }, 10)
        };

//        for (Preguntas p : preguntas) {
//            int indiceAleatorio = preguntaAleatoria(0, preguntas.length - 1);
//            Preguntas preguntaAleatorio = preguntas[indiceAleatorio];
//            p.preguntar();
//        }
    }

    //ahora crearemos el tercer nivel depreguntas
    public static void preguntasTercerLvl() {
        //creamos un vector para almacenar las preguntas con sus respectivas respuetas
        Preguntas[] preguntas = {
            //primera
            new Preguntas("¿Qué país africano fue fundado por esclavos americanos liberados en 1847?", new Respuestas[]{
                new Respuestas("Ghana", 'A', false),
                new Respuestas("Kenya", 'B', false),
                new Respuestas("Liberia", 'C', true),
                new Respuestas("Senegal", 'D', false)
            }, 10),
            //segunda
            new Preguntas("¿Qué batalla marítima tuvo lugar en el año 1805?", new Respuestas[]{
                new Respuestas("Batalla de Salamin", 'A', false),
                new Respuestas("Batalla de Accio", 'B', false),
                new Respuestas("Batalla de Yamen", 'C', false),
                new Respuestas("Batalla de Trafalgar", 'D', true)
            }, 10),
            //tercera
            new Preguntas("¿Cuál es la capital de Filipinas?", new Respuestas[]{
                new Respuestas("Makati", 'A', false),
                new Respuestas("Manila", 'B', true),
                new Respuestas("Cebu", 'C', false),
                new Respuestas("Dabao", 'D', false)
            }, 10),
            //cuarta
            new Preguntas("¿Cuál es el río más caudaloso del mundo?", new Respuestas[]{
                new Respuestas("Congo", 'A', false),
                new Respuestas("Nilo", 'B', false),
                new Respuestas("Amazonas", 'C', true),
                new Respuestas("Ganges", 'D', false)
            }, 10),
            //quinta
            new Preguntas("¿En qué país se encuentra el río Po?", new Respuestas[]{
                new Respuestas("Italia", 'A', true),
                new Respuestas("México", 'B', false),
                new Respuestas("Brazil", 'C', false),
                new Respuestas("Colombia", 'D', false)
            }, 10)
        };

//        for (Preguntas p : preguntas) {
//            int indiceAleatorio = preguntaAleatoria(0, preguntas.length - 1);
//            Preguntas preguntaAleatorio = preguntas[indiceAleatorio];
//            p.preguntar();
//        }
    }

    //ahora crearemos el cuarto nivel depreguntas
    public static void preguntasCuartoLvl() {
        //creamos un vector para almacenar las preguntas con sus respectivas respuetas
        Preguntas[] preguntas = {
            //primera
            new Preguntas("¿Dónde se encuentra la Casa Rosada?", new Respuestas[]{
                new Respuestas("Chile", 'A', false),
                new Respuestas("España", 'B', false),
                new Respuestas("Argentina", 'C', true),
                new Respuestas("Uuruguay", 'D', false)
            }, 10),
            //segunda
            new Preguntas("¿Qué océano baña las aguas de Sri Lanka?", new Respuestas[]{
                new Respuestas("Artico", 'A', false),
                new Respuestas("Altantico", 'B', false),
                new Respuestas("Pacifico", 'C', false),
                new Respuestas("Índico", 'D', true)
            }, 10),
            //tercera
            new Preguntas("¿En qué país de Europa se habla el magyar?", new Respuestas[]{
                new Respuestas("España", 'A', false),
                new Respuestas("Hungría", 'B', true),
                new Respuestas("Portugal", 'C', false),
                new Respuestas("Inglaterra", 'D', false)
            }, 10),
            //cuarta
            new Preguntas("¿En qué mes el Sol está más cerca de la Tierra?", new Respuestas[]{
                new Respuestas("Enero", 'A', false),
                new Respuestas("Febebrero", 'B', false),
                new Respuestas("Diciembre", 'C', true),
                new Respuestas("Noviembre", 'D', false)
            }, 10),
            //quinta
            new Preguntas("¿Qué número viene después del 14 en los decimales del Pi?", new Respuestas[]{
                new Respuestas("1", 'A', true),
                new Respuestas("3", 'B', false),
                new Respuestas("5", 'C', false),
                new Respuestas("6", 'D', false)
            }, 10)
        };

//        for (Preguntas p : preguntas) {
//            int indiceAleatorio = preguntaAleatoria(0, preguntas.length - 1);
//            Preguntas preguntaAleatorio = preguntas[indiceAleatorio];
//            p.preguntar();
//        }
    }

    //ahora crearemos el quinto nivel depreguntas
    public static void preguntasQuintoLvl() {
        //creamos un vector para almacenar las preguntas con sus respectivas respuetas
        Preguntas[] preguntas = {
            //primera
            new Preguntas("¿Cuántos elementos tiene la tabla periódica?", new Respuestas[]{
                new Respuestas("120", 'A', false),
                new Respuestas("119", 'B', false),
                new Respuestas("118", 'C', true),
                new Respuestas("111", 'D', false)
            }, 10),
            //segunda
            new Preguntas("¿Qué gas de la atmósfera nos protege de la radiación ultravioleta?", new Respuestas[]{
                new Respuestas("Argón", 'A', false),
                new Respuestas("Oxígeno", 'B', false),
                new Respuestas("Nitrógeno ", 'C', false),
                new Respuestas("Ozono", 'D', true)
            }, 10),
            //tercera
            new Preguntas("De los cinco sentidos, ¿cuál es el que se desarrolla primero?", new Respuestas[]{
                new Respuestas("Vista", 'A', false),
                new Respuestas("Olfato", 'B', true),
                new Respuestas("Tacto", 'C', false),
                new Respuestas("Gusto", 'D', false)
            }, 10),
            //cuarta
            new Preguntas("¿Qué elemento está presente en absolutamente todas las moléculas orgánicas?", new Respuestas[]{
                new Respuestas("Hidrogeno", 'A', false),
                new Respuestas("Oxigeno", 'B', false),
                new Respuestas("Carbono", 'C', true),
                new Respuestas("Azufre", 'D', false)
            }, 10),
            //quinta
            new Preguntas(" ¿Cuál es el único mes que puede tener menos de 4 fases lunares?", new Respuestas[]{
                new Respuestas("Febrero", 'A', true),
                new Respuestas("Marzo", 'B', false),
                new Respuestas("Diciembre", 'C', false),
                new Respuestas("Julio", 'D', false)
            }, 10)
        };

//        for (Preguntas p : preguntas) {
//            int indiceAleatorio = preguntaAleatoria(0, preguntas.length - 1);
//            Preguntas preguntaAleatorio = preguntas[indiceAleatorio];
//            p.preguntar();
//        }
    }
;
}
