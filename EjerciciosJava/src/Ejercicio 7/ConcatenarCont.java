import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcatenarCont {

    public static void juntar(String[] args) {

        try (
                BufferedReader br1 = new BufferedReader(new FileReader("archivo1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("archivo2.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("archivo3.txt"))
        ) {

            String linea;
            while ((linea = br1.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            while ((linea = br2.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Archivos concatenados correctamente.");

        } catch (Exception e) {
            System.err.println("Falló amigo");
            throw new RuntimeException(e);
        }

        }
    }
