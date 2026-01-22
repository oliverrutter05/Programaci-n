import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public static void LeerTexto(String path) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: el archivo 'archivo1.txt' no existe o no se pudo leer.");
        }
    }
}