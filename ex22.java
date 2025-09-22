import java.io.*;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File fitxer = new File("usertext.txt");

        // Escriure cadenes a usertext.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fitxer))) {
            while (true) {
                System.out.print("Introdueix una cadena (quit per sortir): ");
                String entrada = sc.nextLine();

                if (entrada.equals("quit")) {
                    break;
                }

                bw.write(entrada);
                bw.newLine(); 
            }
        } catch (IOException e) {
            System.out.println("Error en escriure al fitxer: " + e.getMessage());
        }

        // Llegir i mostrar el contingut del fitxer
        System.out.println("\nContingut de usertext.txt:");
        try (BufferedReader br = new BufferedReader(new FileReader(fitxer))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer: " + e.getMessage());
        }
    }
}
