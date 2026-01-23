import java.util.Scanner;
public class Ejecutar {
    static void main() {
        String ruta1 = "C:\\Users\\1DAW\\Desktop\\ArchivoCSV\\datos.csv";
        String ruta2 = "C:\\Users\\1DAW\\Desktop\\ArchivoCSV\\datos 2.csv";
        String destino = "C:\\Users\\1DAW\\Desktop\\ArchivoCSV\\combinado.csv";

        Leer.CombinarCSV(ruta1, ruta2, destino);

        System.out.println("Archivo combinado.csv creado correctamente");

    }
}