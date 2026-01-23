import java.util.Scanner;
public class Ejecutar {
    static void main() {
        String origen = "C:\\Users\\1DAW\\Desktop\\ArchivoCSV\\datos 2.csv";
        String destino = "C:\\Users\\1DAW\\Desktop\\ArchivoCSV\\ordenado.csv";
        Leer.OrdenarPorPrimerCampo(origen, destino);
        System.out.println("Archivo ordenado.csv creado correctamente");
    }
}