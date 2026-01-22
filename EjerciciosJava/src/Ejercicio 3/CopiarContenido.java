import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopiarContenido {
    public static void copiar ( String ruta_origen, String ruta_copia) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            FileReader fr = new FileReader(ruta_origen);
            FileWriter fw = new FileWriter(ruta_copia);
            br = new BufferedReader(fr);
            bw =new BufferedWriter(fw);

            String linea;
            while ((linea = br.readLine()) != null){
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Copia realizada");
        }

        catch (Exception e) {
            System.out.println("Hubo un error en el intento...");
            throw new RuntimeException(e);
        }

        finally {
            try {
                br.close();
                bw.close();
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        }
}
