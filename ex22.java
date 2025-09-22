import java.io.*;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("usertext.txt");

            while (true) {
                System.out.print("Introdueix una cadena (quit per sortir): ");
                String entrada = sc.nextLine();

                if (entrada.equals("quit")) {
                    break; 
                }

                fw.write(entrada + "\n");
            }

            fw.close(); 

            FileReader fr = new FileReader("usertext.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("\nContingut de usertext.txt:");
            String linia;
            while ((linia = br.readLine()) != null) {
                System.out.println(linia);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
