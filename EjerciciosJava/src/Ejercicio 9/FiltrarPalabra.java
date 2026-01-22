import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FiltrarPalabra {
    public static void guardar(String ruta) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué desea guardar en este archivo? filtrado.txt");
        String palabra = sc.nextLine();

        try(
                BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("filtrado.txt", true));
        ){

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.equals(palabra)) {
                    bw.write(linea);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();
            System.out.println("Perfecto, se ha guardado lo que ha deseado.");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}