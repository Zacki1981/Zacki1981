import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Potitos {

    public static void main(String [] args)  {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese el numero de potitos: ");
            int cantidad = Integer.parseInt(entrada.nextLine());

            while (cantidad > 0)
            {
                ArrayList<String> gusta = new ArrayList<String>();
                ArrayList<String> nogusta = new ArrayList<String>();
                System.out.println("Ingrese los ingredientes con el siguiente formato 'SI/NO: ingrediente1 ingrediente2 ... FIN': ");
                for (int i = 0; i < cantidad; i++)
                {
                    String texto = entrada.nextLine();
                    // dividimos el texto en partes separadas por el espacio
                    String[] espacio = texto.split(" ");

                    // si la primera parte es SI, agregamos los ingredientes a la lista de gusta
                    if (espacio[0].equals("SI:"))
                        for (int j = 1; j < espacio.length - 1; j++)
                            gusta.add(espacio[j]);                    

                    
                    if (espacio[0].equals("NO:"))
                        for (int j = 1; j < espacio.length - 1; j++)
                            nogusta.add(espacio[j]);
                }

                // eliminamos los ingredientes que gustan de la lista de no gustan
                for (String ingrediente : gusta)
                    if (nogusta.contains(ingrediente))
                        nogusta.remove(ingrediente);

                // ordenamos la lista de nogusta
                Collections.sort(nogusta);

                // mostramos la lista de nogusta
                if (nogusta.size() > 0)
                    System.out.print(nogusta.get(0));

                for (int j = 1; j < nogusta.size(); j++)
                    if (nogusta.get(j) != nogusta.get(j - 1))
                        System.out.print(" " + nogusta.get(j));

                System.out.println();

                // volvemos a pedir numero de potitos
                System.out.println("Ingrese el numero de potitos: ");
                cantidad = Integer.parseInt(entrada.nextLine());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}