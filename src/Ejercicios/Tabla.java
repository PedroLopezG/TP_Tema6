package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabla {
    int t = 10;
    int[] tabla = new int[t];
    int min;
    int max;

    public void queFuncion(Scanner teclado) throws InputMismatchException {
        int seleccion = 0;
        boolean ejecutado = false;

        while (seleccion != 3) {
            menu();
            seleccion = teclado.nextInt();
            switch (seleccion) {
                case 1:

                    teclado.nextLine();
                    System.out.println("limite minimo: ");
                    min = teclado.nextInt();
                    System.out.println("limite maximo: ");
                    max = teclado.nextInt();
                    funcion1(t, min, max);
                    for (int i = 0; i < tabla.length; i++) {
                        System.out.print("-" + tabla[i]);
                    }
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Tamaño de la tabla: ");
                    t = teclado.nextInt();
                    System.out.println("limite minimo: ");
                    min = teclado.nextInt();
                    System.out.println("limite maximo: ");
                    max = teclado.nextInt();
                    funcion1(t, min, max);
                    System.out.println("");
                    for (int i = 0; i < tabla.length; i++) {
                        System.out.print("-" + tabla[i]);
                    }
                    funcion2(t);
                    break;

                case 3:
                    System.out.println("Volviendo . . .");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }
    public void funcion1(int t, int min, int max) {
        if (t == 0) {
            System.out.println("Tabla creada");
        } else {
            tabla[t - 1] = (int) (Math.random() * (max + 1 - min)) + min;
            funcion1(t - 1, min, max);
        }


    }
    public void funcion2(int t) {
        int mayor = t;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

    private static void menu () {
        System.out.println("\nSeleccione un ejercico:");
        System.out.println("1 - Funcion 1 ");
        System.out.println("2 - Funcion 2 ");
        System.out.println("3 - Volver atras ");
    }
}
