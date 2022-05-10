package Interfaz;

import Ejercicios.Mayor;
import Ejercicios.MiniBarcosv2;
import Ejercicios.Tabla;

import java.util.Scanner;

public class Menu {
    public void selectorEjercicios(Scanner teclado) throws Exception {
        int seleccion = 0;
        while (seleccion != 6) {

            menu();
            seleccion = teclado.nextInt();
            switch (seleccion) {
                case 1:
                    Mayor mayor = new Mayor();
                    mayor.queFuncion(teclado);
                    break;
                case 2:
                    MiniBarcosv2 miniBarcosv2 = new MiniBarcosv2();
                    miniBarcosv2.undirLaMiniFlota(teclado);
                    break;
                case 3:
                    Tabla tabla = new Tabla();
                    tabla.queFuncion(teclado);
                    break;

                case 6:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }


        }
    }
    private static void menu() {
        System.out.println("\nSeleccione un ejercico:");
        System.out.println("1 - Es el mayor ");
        System.out.println("2 - Micro guerra de barcos (versión 2) ");
        System.out.println("3 - Una tabla y funciones ");
        System.out.println("4 - El juego del rebaño de ovejas");
        System.out.println("5 - Taller de arte ASCII");
        System.out.println("6 - Salir");
    }
}
