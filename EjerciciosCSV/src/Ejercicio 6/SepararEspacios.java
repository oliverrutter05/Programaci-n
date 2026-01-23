import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SepararEspacios {
    public static void separar (String path) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("datos.csv") );

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] dato = linea.split(",");
                System.out.println("---------------");
                System.out.println("Nombre: " + dato[0]);
                System.out.println("Edad: " + dato[1]);
                System.out.println("Ciudad: " + dato[2]);
                System.out.println("---------------");
            }

        } catch (FileNotFoundException e) {
            System.err.println("ERROR");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("ERROR");
            throw new RuntimeException(e);
        }finally {
            try {
                if(br != null) br.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
