public class Ejecutar {
    public static void main(String[] args) {

        String origen = "C:\\Users\\1DAW\\Desktop\\ArchivoCSV\\datos 2.csv";
        String destino = "C:\\Users\\1DAW\\Desktop\\ArchivoCSV\\adultos.csv";
        Leer.FiltrarAdultos(origen, destino);
        System.out.println("Archivo adultos.csv generado correctamente");

    }
}