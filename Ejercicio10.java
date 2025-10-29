//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introducción
    Scanner sc = new Scanner(System.in);
    double[] calificaciones = new double[6];
    double[] pesos = new double[6];
    double sumaPesos = 0;
    double promedio = 0;

    //Desarrollo
    for (int i = 0; i < 6; i++) {
        System.out.print("Ingrese la calificación de la materia " + (i+1) + ": ");
        calificaciones[i] = sc.nextDouble();
        System.out.print("Ingrese el peso de la materia " + (i+1) + " (%): ");
        pesos[i] = sc.nextDouble();
        sumaPesos += pesos[i];
    }

    //Desenlace
    if (sumaPesos != 100) {
        System.out.println("Error: la suma de los pesos debe ser 100%");
    } else {
        for (int i = 0; i < 6; i++) {
            promedio += calificaciones[i] * (pesos[i] / 100);
        }
        System.out.println("Promedio ponderado: " + promedio);
        if (promedio < 60) {
            System.out.println("El usuario ha reprobado.");
        } else {
            System.out.println("El usuario ha aprobado.");
        }
    }
}

