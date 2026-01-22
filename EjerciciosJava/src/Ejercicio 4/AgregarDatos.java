import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AgregarDatos {
    public static void agregar (String [] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una línea de texto:");
        String frase = sc.nextLine();
        BufferedWriter bw = null;

        try {
            FileWriter fw = new FileWriter("archivo1.txt", true);
            bw = new BufferedWriter(fw);
            fw.write(frase);
            bw.newLine();
            bw.close();

            System.out.println("Muy bien, has agregado más información.");
        } catch (IOException e) {
            System.err.println("Error, no se pudo realizar el trámite." +e.getMessage());
            throw new RuntimeException(e);
        }

        sc.close();
    }

}