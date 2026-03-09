import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Academia {

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Academia(ArrayList<Alumno> alumnos) {
    }

    public void altaAlumno(String curso, String fechaMatricula) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el DNI del nuevo alumno: (esta todos los datos en los parámetros)");
        String dni = sc.nextLine();

        if (alumnos.contains(dni)) {
            System.out.println("El DNI introducido se encuentra repetido.");
        }

        else {
            System.out.println("Perfecto, ahora introduzca un nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Listo, ya te encuentras activo en la academia.");
            boolean activo = true;

            alumnos.add(new Alumno(nombre, dni, curso, fechaMatricula, activo));
            System.out.println(alumnos);
        }

    }

    public void buscarAlumnoParaDesactivar(boolean activo) {

        Scanner sc = new Scanner(System.in);

        activo = true;

        System.out.println("Introduzca el DNI del alumno para cambiar su estado: ");
        String dni = sc.nextLine();
        for (Alumno alum : alumnos) {
            if (alumnos.contains(dni) && alum.isActivo()) {
                activo = false;
                System.out.println("Alumno encontrado, a partir de ahora no se encuentra activo en el centro.");
            }
        }

        System.out.println(alumnos);
    }

    public void mostrarAlumnosActivos() { // Mirar despues

        ArrayList<Alumno> disponibles = new ArrayList<>();

        for (Alumno alum : disponibles) {
            if (alum.isActivo()) {
                alumnos.add(alum);
            }
        }

        Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return 0;
            }
        });
        for (Alumno alum : alumnos) {
            System.out.println(disponibles);
        }
    }

    public void mostrarAlumnosInactivos() {
        ArrayList<Alumno> noDisponibles = new ArrayList<>();

        for (Alumno alum : noDisponibles) {
            if (alum.isActivo()) {
                alumnos.add(alum);
            }
        }

        Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return 0;
            }
        });
        for (Alumno alum : alumnos) {
            System.out.println(noDisponibles);
        }
    }



}



