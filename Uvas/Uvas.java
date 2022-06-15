import java.util.Scanner;

public class Uvas {

	public static void main(String[] args) {
    
		try (Scanner sc = new Scanner(System.in)) {
            int uvas;
            int racimo;

            System.out.println("Introduce el numero de uvas que tendrá el racimo: ");
            uvas = sc.nextInt();

            while(uvas != 0) {
                racimo = 0;
                // con un for construimos el racimo de uvas
                for(int i = 1; i <= uvas; i++) {
                    racimo += i;
                    // si el numero de uvas que ya estan en el racimo es igual o mayor a las uvas que tenemos, en ese ciclo de i paramos el bucle
                    // ese ciclo de i es el nivel maximo del racimo perfecto
                    // nivel 1 = 1 uva y racimo = 1, nivel 2 = 2 uvas y racimo = 3, nivel 3 = 3 uvas y racimo = 6 ...
                    if(racimo >= uvas) {
                        System.out.println("El racimo perfecto tiene: " + i + " niveles");
                        break;
                    }
                }
            uvas = sc.nextInt();
            }
        }
	}
}