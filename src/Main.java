import Interfaz.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
    Menu menu = new Menu();
    menu.selectorEjercicios(teclado);
    }
}
