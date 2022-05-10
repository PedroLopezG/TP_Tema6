package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mayor {
    public void queFuncion(Scanner teclado)throws InputMismatchException {
        int seleccion = 0;
        boolean ejecutado = false;
        while (seleccion != 6) {

            menu();
            seleccion = teclado.nextInt();
            switch (seleccion) {
                case 1:
                    ejecutado = false;
                    while (!ejecutado) {
                    try {
                        teclado.nextLine();
                    funcion1(teclado);
                    ejecutado = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Introduzca un numero real");
                    }
                    }
                    break;
                case 2:
                    teclado.nextLine();
                    ejecutado = false;
                    while (!ejecutado) {
                        try {
                            funcion2(teclado);
                            ejecutado = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Introduzca un numero real");
                        }
                    }
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



    private void funcion1(Scanner teclado) {
        System.out.println("Introduzca el primer numero real: ");
        double n1 = teclado.nextInt();
        System.out.println("Introduzca el segundo numero real: ");
        double n2 = teclado.nextInt();
        if (n1 > n2) {
            System.out.println("El numero mayor es: " + n1);
        } else {
            System.out.println("El numero mayor es: " + n2);
        }
    }

    private void funcion2(Scanner teclado) {
        System.out.println("Introduzca el primer numero real: ");
        double n1 = teclado.nextInt();
        System.out.println("Introduzca el segundo numero real: ");
        double n2 = teclado.nextInt();
        System.out.println("Los resultados significaran: \n0: son iguales\n1: el primero es mayor\n-1: el segundo es mayor\nTu resultado es:");
        if (n1 == n2) {
            System.out.println("0");
        }else if (n1 > n2) {
            System.out.println("1");
        }else {
            System.out.println("-1");
        }
    }



    private static void menu () {
        System.out.println("\nSeleccione un ejercico:");
        System.out.println("1 - Funcion 1 ");
        System.out.println("2 - Funcion 2 ");
        System.out.println("3 - Volver atras ");
    }
}
