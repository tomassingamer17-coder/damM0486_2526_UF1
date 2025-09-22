import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ex23_final {
    public static void main(String[] args) {
        String fitxer = "secret.bin";
        Random rand = new Random();

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fitxer));

            // Primer codi entre 1 i 3
            int codi = rand.nextInt(3) + 1;

            for (int i = 0; i < 10; i++) {
                String secret = "";
                for (int j = 0; j < 3; j++) {
                    char lletra = (char) ('a' + rand.nextInt(26));
                    secret += lletra;
                }

                dos.writeInt(codi);
                dos.writeChars(secret);

                System.out.println(codi + ":" + secret.toUpperCase());

                codi += rand.nextInt(3) + 1;
            }

            dos.close(); 

        } catch (IOException e) {
            System.out.println("Error al fitxer: " + e.getMessage());
        }
    }
}
