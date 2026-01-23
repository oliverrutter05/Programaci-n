import java.io.*;

public class CopiaArchivoCSV {
    public static void copia (String ruta_original, String ruta_destino) {
        BufferedReader br1 = null;
        BufferedWriter bw2 = null;

        try {
            br1 = new BufferedReader(new FileReader(ruta_original));
            bw2 = new BufferedWriter(new FileWriter(ruta_destino));

            String linea;
            while ((linea = br1.readLine()) != null) {
                bw2.write(linea);
                bw2.newLine();
            }
            System.out.println("Se ha realizado la copia correctamente.");
        }
        catch (Exception e) {
            System.err.println("No se pudo realizar la copia.");
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (br1 != null) br1.close();
                if (bw2 != null) bw2.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
