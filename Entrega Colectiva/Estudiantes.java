import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Estudiantes {

    public static void main() {

        List<Estudiante> listaEstudiantes = new ArrayList<>();

        String archivo = "C:\\Users\\olive\\IdeaProjects\\EntregaConjunta\\src\\estudiantes.csv";
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                if (datos.length == 4) {

                    String nombre = datos[0];
                    int edad = Integer.parseInt(datos[1]);
                    String ciudad = datos[2];
                    double calificacion = Double.parseDouble(datos[3]);

                    Estudiante estudiante = new Estudiante(nombre, edad, ciudad, calificacion);

                    listaEstudiantes.add(estudiante);

                } else {
                    System.out.println("Línea mal formateada: " + linea);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir datos numéricos: " + e.getMessage());
        }

        System.out.println("Lista de Estudiantes:");
        for (Estudiante e : listaEstudiantes) {
            System.out.println(e);
        }

        System.out.println("\n----------------------------------");

        Set<String> ciudades = new HashSet<>();

        for (Estudiante e : listaEstudiantes) {
            ciudades.add(e.getCiudad());
        }

        System.out.println("Ciudades Únicas:");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }

        System.out.println("\n----------------------------------");

        Map<String, List<Estudiante>> estudiantesPorCiudad = new HashMap<>();

        for (Estudiante e : listaEstudiantes) {

            estudiantesPorCiudad.putIfAbsent(e.getCiudad(), new ArrayList<>());

            estudiantesPorCiudad.get(e.getCiudad()).add(e);
        }

        System.out.println("Estudiantes agrupados por Ciudades:");

        for (String ciudad : estudiantesPorCiudad.keySet()) {

            System.out.println("\nCiudad: " + ciudad);

            for (Estudiante e : estudiantesPorCiudad.get(ciudad)) {
                System.out.println(e);
            }
        }

        System.out.println("\n----------------------------------");

        Queue<Estudiante> cola = new LinkedList<>();

        cola.addAll(listaEstudiantes);

        System.out.println("Simulación de atención al estudiante:");

        while (!cola.isEmpty()) {

            Estudiante atendido = cola.poll();

            System.out.println("Atendiendo a: " + atendido);
        }

        System.out.println("\nTodos los estudiantes han sido atendidos.");
    }
}