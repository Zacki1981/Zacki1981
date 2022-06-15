import java.util.Scanner;
import java.util.ArrayList;

public class manias {

    public static char mostrarDia (int dia) {
        switch (dia) {
            case 1:
                Return("L");
                break;
            case 2:
                Return("M");
                break;
            case 3:
                Return("X");
                break;
            case 4:
                Return("J");
                break;
            case 5:
                Return("V");
                break;
            case 6:
                Return("S");
                break;
            case 7:
                Return("D");
                break;
        }
    }

    public static void main(String[] args) {
        int numerodedia = 0;
        ArrayList<Integer> dias = new ArrayList<Integer>();

        // pedimos el numero de casos
        System.out.println ("Ingrese el numero de casos a evaluar: ");
        int numCasos = Integer.parseInt(System.console().readLine());

        // iteramos sobre los casos
        for (int i = 1; i <= numCasos; i++) {

            // pedimos el numero de semanas
            System.out.println ("Ingrese el numero de semanas: ");
            int semanas = Integer.parseInt(System.console().readLine());

            for (int j = 1; j <= semanas; j++) {
                String blister = System.console().readLine();

                // recorremos blister caracter por caracter y si es un * sumamos 1 al Arraylist dias
                for (int k = 0; k < blister.length(); k++) {
                    if (blister.charAt(k) == '*') {
                        dias.add(k + 1);
                    }
                }
            }

            int min = dias.get(0) + 1;

            for (int c =1; c < dias.size(); c++) {
                if (dias.get(c) + 1 < min) {
                    min = dias.get(c) + 1;
                    numerodedia = c;
                }
            }
        
        System.out.println (mostrarDia(numerodedia) + " " + min);
        }
    }
}