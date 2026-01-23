import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AgregarLineas {
    public static void agregar (String path) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre, edad, ciudad: ");
        String texto = sc.nextLine();
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("datos.csv", true));
            while (true) {
                System.out.println("¿Quiere añadir más información?");
                String respuesta = sc.nextLine().toLowerCase();
                bw.write(texto);
                bw.newLine();
                if (respuesta.equals("si")) {
                    System.out.println("Ingrese nombre, edad, ciudad:");
                    texto = sc.nextLine();
                    bw.write(texto);
                    bw.newLine();
                    System.out.println("Muy bien, ha añadido información al fichero.");
                }
                else if (respuesta.equals("no")) {
                    bw.close();
                    System.out.println("El programa se ha cerrado.");
                    break;
                }
                else {
                    bw.close();
                    System.out.println("Error. El programa se ha cerrado por seguridad.");
                    break;
                }
            }
        }
        catch (IOException e) {
            System.err.println("Que mal, hubo un error..." + e.getMessage());
            throw new RuntimeException(e);
        }
        finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Eror al cerrar fichero escritura");
                }
            }

        }
    }

}
