//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    ArrayList<Alumno> alumnos = new ArrayList<>();

    Academia acd = new Academia(alumnos);

    alumnos.add(new Alumno("Oliver", "111111111M", "1º DAW", "15-9-2025", true));
    alumnos.add(new Alumno("Rafa", "222222222R", "1º DAW", "15-9-2025", true));
    alumnos.add(new Alumno("Sergio", "33333333S", "1º DAW", "15-9-2025", true));
    alumnos.add(new Alumno("Adrian", "44444444A", "1º DAW", "15-9-2025", true));
    alumnos.add(new Alumno("Nonote", "55555555N", "1º DAW", "15-9-2025", true));

    System.out.println("---- MENU ----");
    System.out.println("-- 1. Alta de alumno --");
    System.out.println("-- 2. Baja de alumno --");
    System.out.println("-- 3. Listado de alumnos activos --");
    System.out.println("-- 4. Listado de alumnos inactivos --");
    System.out.println("-- 5. Borrar ALUMNO --");
    System.out.println("-- 6. Salir --");
    System.out.println("\n Escoja una opción -> ");
    int respuesta = sc.nextInt();

    while ((respuesta < 0) && (respuesta > 6)) {
        System.out.println("\nVuelva a intentarlo.");
        System.out.println("Escoja una opción --> ");
    }

    switch (respuesta) {
        case 1:
            acd.altaAlumno("1º DAW", "15-9-2025");
            break;

        case 2:
            acd.buscarAlumnoParaDesactivar(true);
            break;

        case 3:

            break;

        case 4:

            break;

        case 5:

            break;

        case 6:

            break;
    }

    //acd.altaAlumno("55555555N", "1º DAW", "15-9-2025");
    acd.mostrarAlumnosActivos();
}
