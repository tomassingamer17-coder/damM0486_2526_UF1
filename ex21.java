import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demanar el nom del fitxer
        System.out.print("Introdueix el nom del fitxer: ");
        String nomFitxer = sc.nextLine();

        File f = new File(nomFitxer);

        // Comprovar que existeix
        if (!f.exists() || !f.isFile()) {
            System.out.println("Error: el fitxer no existeix o no és vàlid.");
            return;
        }

        int comptador = 0;

        try (FileReader fr = new FileReader(f)) {
            int car;
            while ((car = fr.read()) != -1) {
                if ((char) car == 'a') {
                    comptador++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer: " + e.getMessage());
        }

        // Mostrar resultat
        System.out.println("El fitxer \"" + nomFitxer + "\" conté " + comptador + " lletres 'a'.");
    }
}
