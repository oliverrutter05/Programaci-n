import java.util.*;

public class TallerMecanico {

    private Map<String, Vehiculo> vehiculos = new HashMap<>();

    public TallerMecanico(Map<String,Vehiculo> vehiculos) {
    }

    public void registrarNuevoVehiculo(String matricula, String horaEntrada, int plaza) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la matrícula de su coche: (esta todos los datos en los parámetros)");

        if (vehiculos.containsKey(matricula)) {
            System.out.println("La matrícula introducida se encuentra repetido.");
            return;
        }

        else {
            System.out.println("Perfecto, ahora introduzca su nombre (nombre de propietario): ");
            String propietario = sc.nextLine();

            System.out.println("Listo, ya estas apuntado en la lista");
            boolean pagado = false;

            vehiculos.put(matricula, new Vehiculo (matricula, propietario, horaEntrada, plaza, pagado));
            System.out.println(vehiculos);
        }
    }

    public void salidaVehiculo(String propietario, String horaEntrada, int plaza) {

        Scanner sc = new Scanner(System.in);
        boolean pagado;

        pagado = false;

        System.out.println("Introduzca la matrícula del coche para cambiar su estado: ");
        String matricula = sc.nextLine();

        ArrayList<Vehiculo> pagados = new ArrayList<>();

        for (Vehiculo vh : pagados) {
            if (vehiculos.containsKey(matricula)) {
                vh.setPagado(true);
                System.out.println("Coche encontrado, a partir de ahora no se encuentra con deudas");
            }
        }
        vehiculos.put(matricula, new Vehiculo (matricula, propietario, horaEntrada, plaza, true));
        System.out.println(vehiculos);
    }

    public void vehiculosPendientesPago() {
        ArrayList<Vehiculo> Pagado = new ArrayList<>();

        for (Vehiculo vh : Pagado) {
            if (vh.isPagado()) {
                vehiculos.put();
            }
        }


        for (Vehiculo alum : ) {
            System.out.println(Pagado);
        }
    }
}


