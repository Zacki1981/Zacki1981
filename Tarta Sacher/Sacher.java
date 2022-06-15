import java.util.Scanner;

public class Sacher {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Cuantos casos vamos a evaluar?");
            int casos = sc.nextInt();
            int alto = 0, ancho = 0, area = 0, cuadritos = 0;

            for (int i = 0; i < casos; i++) {

                System.out.println("Escriba el alto de la tableta: ");
                alto = sc.nextInt();
                System.out.println("Escriba el ancho de la tableta: ");
                ancho = sc.nextInt();
                System.out.println("Escriba cuantos cuadritos se necesitan segun receta: ");
                cuadritos = sc.nextInt();

            	area = alto * ancho;

                // System.out.println("El area de la tableta es: " + area);
                // System.out.println(cuadritos%area);

                if(cuadritos % area == 0) {
                    System.out.println("Se necesitan : " + (cuadritos/area) + " tabletas");
                } else {
                    System.out.println("Se necesitan : " + ((cuadritos/area)+1)  + " tabletas");
                }
            }
        }
	}
}