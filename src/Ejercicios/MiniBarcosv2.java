package Ejercicios;

import java.util.Scanner;

public class MiniBarcosv2 {
    final int T = 4;
    boolean jugando = true;
    String[][] interfaz = new String[T][T];
    int[][] tablero =  new int[T][T];
    int rc = 5;
    int rf = 5;
    public void undirLaMiniFlota(Scanner teclado) throws IndexOutOfBoundsException{


        initializarTablero(interfaz, tablero, T);

        while (jugando){
            introducirEnteroEntreLimites(interfaz, teclado);
            if(rc>=0 && rc<=3 && rf>=0 && rf<=3){
                disparar(interfaz, tablero, rc, rf);
            }else{
                System.out.println("Fuera de rango");
            }

        }
        System.out.println("Tocado y hundido");
        System.out.println("Has ganado!");
    }

    private void disparar(String[][] interfaz, int[][] tablero, int rc, int rf) {

        if (tablero[rf][rc]==1){
            this.jugando = false;
        }else {
            System.out.println("Agua");
            interfaz[rf][rc]="~";
        }
    }

    private void introducirEnteroEntreLimites(String[][] interfaz, Scanner teclado) {
            mostrarTablero(interfaz);
            teclado.nextLine();
            System.out.println("Que columna? ");
            this.rc = teclado.nextInt();
            System.out.println("¿Que fila?");
            this.rf = teclado.nextInt();



    }

    private void initializarTablero(String[][] interfaz,int[][] tablero,int T) {
        for (int j=0;j<T;j++){
            for (int i=0;i<T;i++){
                tablero[j][i]=0;
            }
        }
        for (int j=0;j<T;j++){
            for (int i=0;i<T;i++){
                interfaz[j][i]="?";
            }
        }
        int f = (int) ((Math.random() * (3 - 0)) + 0);
        int c = (int) ((Math.random() * (3 - 0)) + 0);
        tablero[f][c]= 1;
    }


    public void mostrarTablero(String[][] tab2d){
        for (int j=0;j<tab2d.length;j++){
            for (int i=0;i< tab2d.length;i++){
                System.out.print(" "+tab2d[j][i]);
            }
            System.out.println("");
        }


    }

}
