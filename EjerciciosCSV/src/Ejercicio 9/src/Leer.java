import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Leer {

    public static void OrdenarPorPrimerCampo(String rutaOrigen, String rutaDestino) {

        BufferedReader br = null;
        ArrayList<String> lineas = new ArrayList<>();
        String cabecera = "";

        try {
            br = new BufferedReader(new FileReader(rutaOrigen));
            String linea;
            cabecera = br.readLine();
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

            Collections.sort(lineas, (a, b) -> {
                String campoA = a.split(",")[0];
                String campoB = b.split(",")[0];
                return campoA.compareToIgnoreCase(campoB);
            });

            Escribir.SobreEscribir(rutaDestino, cabecera);
            for (String l : lineas) {
                Escribir.Añadir(rutaDestino, l);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}