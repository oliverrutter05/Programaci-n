public class Main {
    public static void main(String[] args) {

        // Datos de prueba
        Empleados pedro = new Empleados("Pedro", "Pérez", 1300, 'B', 2);
        Empleados ana   = new Empleados("Ana", "Díez", 1500, 'A', 5); // Por defecto, pero con apellidos
        Empleados carmen = new Empleados("Carmen", "Lorenzo", 1250, 'D', 6);

        // Mostrar datos iniciales
        System.out.println("--- Empleados (inicial) ---");
        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(carmen);
        System.out.println("Número de empleados: " + Empleados.getNumEmpleados());

        // Aplicar prima global del 10%
        Empleados.setPrimaGlobal(10);

        // Ascenso de Pedro a categoría C
        pedro.setCategoria('C');

        // Mostrar datos finales
        System.out.println("\n--- Empleados (tras prima y ascenso) ---");
        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(carmen);
        System.out.println("Número de empleados: " + Empleados.getNumEmpleados());
    }
}
