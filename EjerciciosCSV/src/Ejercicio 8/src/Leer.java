import java.io.*;
public class Leer {
    public static void FiltrarAdultos(String rutaOrigen, String rutaDestino) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(rutaOrigen));
            String linea;
            linea = br.readLine();
            Escribir.SobreEscribir(rutaDestino, linea);

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                int edad = Integer.parseInt(datos[2]);

                if (edad >= 18) {
                    Escribir.Añadir(rutaDestino, linea);
                }
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