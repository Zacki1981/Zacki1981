import java.io.IOException;
import java.util.Scanner;

public class SendaPirenaica {

    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            
            // entrada por teclado entero en variable n entre 1 y 100
            System.out.println("Introduce el número de etapas de la senda");
            int n = sc.nextInt();
            while (n != 0) {

                int[] distancia = new int[n];
                int suma = 0;

                // entrada por teclado distancia de cada etapa
                for (int i = 0; i < n; i++) {
                    System.out.println("Introduce la distancia de la etapa " + (i + 1));
                    distancia[i] = sc.nextInt();
                    suma += distancia[i];
                }

                // distancias que quedan por recorrer en cada etapa
                for (int i = 0; i < n; ++i) {
                    System.out.print(suma);
                    if (i < n - 1) {
                        System.out.print(" ");
                    }
                    suma -= distancia[i];
                }

                System.out.println();
                n = sc.nextInt();
            }
        }
    }
}