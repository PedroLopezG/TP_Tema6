package Ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Taller {
    char[][] lienzo = new char[10][40];
    public void dibujos(Scanner teclado) throws InputMismatchException {
        int seleccion = 0;
        crearLienzo();
        try {


        while (seleccion != 4) {
            pintarLienzo();
            menu();
            seleccion = teclado.nextInt();
            switch (seleccion) {
                case 1:
                    dibujarCaracter(teclado);
                    break;
                case 2:
                    dibujarRectangulo(teclado);
                    break;
                case 3:
                    cambiarCaracter(teclado);
                    break;
                case 4:
                    System.out.println("Volviendo . . .");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }
        }
        }catch(InputMismatchException e){
            System.out.println("Introduce lo pedido");
        }

    }

    private void cambiarCaracter(Scanner teclado) {
        System.out.println("Que caracter quiere cambiar?");
        char caracter = teclado.next().charAt(0);
        System.out.println("Por que caracter quiere cambiarlo?");
        char caracter2 = teclado.next().charAt(0);
        for (int i = 0; i < lienzo.length; i++) {
            for (int j = 0; j < lienzo[i].length; j++) {
                if (lienzo[i][j] == caracter) {
                    lienzo[i][j] = caracter2;
                }
            }
        }
    }

    private void dibujarRectangulo(Scanner teclado) {
        int f1,c1,f2,c2;
        int caracter;
        System.out.println("¿Donde quiere dibujar el rectángulo?");
        System.out.println("Fila de la primera esquina: ");
        f1 = teclado.nextInt();
        System.out.println("Columna de la primera esquina: ");
        c1 = teclado.nextInt();
        System.out.println("Fila de la segunda esquina: ");
        f2 = teclado.nextInt();
        System.out.println("Columna de la segunda esquina: ");
        c2 = teclado.nextInt();
        System.out.println("¿Con que caracter lo quiere dibujar? ");
        caracter = teclado.next().charAt(0);
        if (f1 < lienzo.length && c1 < lienzo[f1].length && f2 < lienzo.length && c2 < lienzo[f2].length) {
            for (int i = f1; i <= f2; i++) {
                for (int j = c1; j <= c2; j++) {
                    lienzo[i][j] = (char) caracter;
                }
            }
        } else {
            System.out.println("No se puede dibujar en esa posición");
        }

    }

    private void dibujarCaracter(Scanner teclado){
        System.out.println("fila: ");
        int fila = teclado.nextInt();
        System.out.println("columna: ");
        int columna = teclado.nextInt();
        System.out.println("caracter: ");
        char caracter = teclado.next().charAt(0);
        if (fila < lienzo.length && columna < lienzo[fila].length) {
            lienzo[fila][columna] = caracter;
        } else {
            System.out.println("No se puede dibujar en esa posición");
        }

    }

    private void crearLienzo(){
        for (int i = 0; i < lienzo.length; i++) {
            Arrays.fill(lienzo[i], '_');
        }
    }

    private void pintarLienzo(){
        for (int i = 0; i < lienzo.length; i++) {
            for (int j = 0; j < lienzo[i].length; j++) {
                System.out.print(lienzo[i][j]);
            }
            System.out.println();
        }
    }



    private static void menu () {
        System.out.println("\n¿Que quiere hacer?");
        System.out.println("1 - Dibujar un carácter ");
        System.out.println("2 - Dibujar un rectángulo con un conjunto de caracteres ");
        System.out.println("3 - Cambiar el caracter ");
        System.out.println("4 - Volver atras ");
    }
}
