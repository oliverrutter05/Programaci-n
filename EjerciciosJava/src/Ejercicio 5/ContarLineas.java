import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static void contar (String path) {
        int contador = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"));
            String linea = "";

            while (linea != null) {
                contador++;
                linea = br.readLine();
            }
            System.out.println("Hay un total de "+ contador +" lineas.");
        }

        catch (IOException e) {
            System.err.println("Error 404 (Chiste)" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
