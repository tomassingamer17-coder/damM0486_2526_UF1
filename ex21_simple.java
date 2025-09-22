import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex21_simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el nom del fitxer: ");
        String nomFitxer = sc.nextLine();

        int comptador = 0;

        try {
            FileReader fr = new FileReader(nomFitxer);
            int car;

            while ((car = fr.read()) != -1) {
                if ((char) car == 'a') {
                    comptador++;
                }
            }

            fr.close(); // cerramos el fichero

            System.out.println("El fitxer \"" + nomFitxer + "\" conté " + comptador + " lletres 'a'.");

        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer: " + e.getMessage());
        }
    }
}
