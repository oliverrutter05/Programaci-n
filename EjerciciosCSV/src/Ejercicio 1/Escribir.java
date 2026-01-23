import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escribir {

    public static void escribirPorPantalla(String path) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre,edad,ciudad: ");
        String texto = sc.nextLine();
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();

            System.out.println("¡Perfecto! Ha introducido el texto '" + texto + "'.");

        } catch (IOException e) {
            System.err.println("Ha ocurrido un error" + e.getMessage());
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Eror al cerrar fichero escritura");
                }
            }
        }
        sc.close();
    }
}