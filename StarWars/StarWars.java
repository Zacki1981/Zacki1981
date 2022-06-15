import java.util.Scanner;

public class StarWars {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Cuantos casos a evaluar: ");
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println("Ingrese el nombre del personajes: ");
            String personaje = sc.next();
            System.out.println("Ingrese el parentesco: ");
            String parentesco = sc.next();

            // si personaje es Luke y parentesco es padre escribir "TOP SECRET"
            if (personaje.equals("Luke") && parentesco.equals("padre")) {
                System.out.println("TOP SECRET");
            // sino escribir personaje + ", yo soy tu " + parentesco
            } else {
                System.out.println(personaje + ", yo soy tu " + parentesco);
            }
        }
    }
}
