import java.io.File;

public class LlistarDirectori {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Ús: java LlistarDirectori <nom_directori>");
            return;
        }

        File dir = new File(args[0]);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Error: " + args[0] + " no és un directori vàlid.");
            return;
        }

        // Llistar contingut
        File[] fitxers = dir.listFiles();
        if (fitxers != null) {
            for (File f : fitxers) {
                StringBuilder permisos = new StringBuilder();

                permisos.append(f.isDirectory() ? "d" : "-");

                // Lectura
                permisos.append(f.canRead() ? "r" : "-");
                // Escriptura
                permisos.append(f.canWrite() ? "w" : "-");
                // Execució
                permisos.append(f.canExecute() ? "x" : "-");

                // Mostrar resultat
                System.out.println(permisos + " " + f.getName());
            }
        }
    }
}
