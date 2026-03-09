//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    Map<String, Vehiculo> vehiculos = new HashMap<>();

    TallerMecanico tm = new TallerMecanico(vehiculos);

    vehiculos.put("2565 MHF", new Vehiculo("2565 MHF", "Oliver", "16:30", 12, false));
    vehiculos.put("1600 DSA", new Vehiculo("1600 DSA", "Christian", "17:00", 14, false));
    vehiculos.put("8753 FGT", new Vehiculo("8753 FGT", "Rafa", "18:00", 18, false));
    vehiculos.put("2005 ORF", new Vehiculo("2005 ORF", "MiguelilloPatrol", "19:00", 21, false));
    vehiculos.put("1970 RFM", new Vehiculo("1970 RFM", "Rosa", "20:30", 25, false));


    System.out.println("---- MENU ----");
    System.out.println("-- 1. Registrar tu coche--");
    System.out.println("-- 2. Salida de vehículo por pago --");
    System.out.println("-- 3. Listado de vehículos pendientes de pago --");
    System.out.println("-- 4. Listado de vehículos pagados --");
    System.out.println("-- 5. Borrar vehículo de la lista --");
    System.out.println("-- 6. Salir --");
    System.out.println("\n Escoja una opción -> ");
    int respuesta = sc.nextInt();


    while ((respuesta < 0) && (respuesta > 6)) {
        System.out.println("\nVuelva a intentarlo.");
        System.out.println("Escoja una opción --> ");
    }

    switch (respuesta) {
        case 1:
            tm.registrarNuevoVehiculo("0567 NBV", "21:00", 28);
            break;

        case 2:
            tm.salidaVehiculo();
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





}
