package principal;

import java.util.InputMismatchException;
import java.util.*;

/**
 *
 * @author jhon anderso Puerta Alquerque
 */
/*
En esta clase trabajaremos los menus del juego y la
interaccion con el Usuario
 */
public class Menu {

    public static Domain d = new Domain();
    public static Scanner sc = new Scanner(System.in);

    public static void menuOpciones() {

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        do {
            System.out.println("1. Iniciar juego");
            System.out.println("2. Historial");
            System.out.println("3. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        lvlOne();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción 2");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        } while (!salir);
    }

    public static void subMenulvl2() {
        boolean salir = false;

        int opcion; //Guardaremos la opcion del usuario
        do {
            System.out.println("Desea Contininuar?");
            System.out.println("1. Si");
            System.out.println("2. No");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        lvlTwo();
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        } while (!salir);
    }

    public static void lvlOne() {
        System.out.println("Bienbenido al primer nivel");
        d.preguntasPrimerLvl();
    }

    public static void lvlTwo() {
        System.out.println("Bienbenido al Segundo nivel");
        d.preguntasSegundoLvl();
    }
    public static void lvlThree(){
        System.out.println("Bienbenido al tercer nivel");
        d.preguntasTercerLvl();
    }
    public static void lvlFour(){
        System.out.println("Bienbenido al tercer nivel");
        d.preguntasCuartoLvl();
    }
    public static void lvlFive(){
        System.out.println("Bienbenido al tercer nivel");
        d.preguntasQuintoLvl();
    }

}
