import java.io.File;
import java.util.Scanner;

public class EliminarArchivo {
    public static void elminar(String path) {
        // Crear el objeto File
        File archivo = new File("archivo2.txt");

        // Verificar si el archivo existe
        if (archivo.exists()) {
            Scanner scanner = new Scanner(System.in);

            // Pedir confirmación al usuario
            System.out.print("¿Desea eliminar el archivo archivo2.txt? (s/n): ");
            String respuesta = scanner.nextLine();

            // Verificar la respuesta
            if (respuesta.equalsIgnoreCase("s")) {
                // Intentar eliminar el archivo
                if (archivo.delete()) {
                    System.out.println("El archivo ha sido eliminado correctamente.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                }
            } else {
                System.out.println("El archivo no fue eliminado.");
            }

            scanner.close();
        } else {
            System.out.println("El archivo archivo2.txt no existe.");
        }
    }
}

