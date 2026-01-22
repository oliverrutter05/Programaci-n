import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SobreescribirArchivo {
        public static void escribir(String path) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un texto: ");
            String texto = sc.nextLine();
            BufferedWriter bw = null;

            try {
                FileWriter fw = new FileWriter("archivo1.txt", false);
                bw = new BufferedWriter(fw);
                fw.write(texto);
                bw.newLine();
                bw.close();

                System.out.println("La información fue añadida en el archivo.");
            } catch (IOException e) {
                System.out.println("Ocurrió un error al crear el archivo." + e.getMessage());
            }

            sc.close();
        }
    }

