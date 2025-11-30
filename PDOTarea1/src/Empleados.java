public class Empleados {

    private String nombre;
    private String apellidos;
    private double sueldoBase;
    private double retenciones;
    private char categoria;

    private static int numEmpleados = 0;
    private static double primaGlobal = 0;

    //Getters and Setters
    public static int getNumEmpleados() {
        return numEmpleados;
    }

    public static void setPrimaGlobal(double nuevaPrima) {
        primaGlobal = nuevaPrima;
    }

    //Constructores
    public Empleados(String nombre, String apellidos, double sueldoBase,
                    char categoria, double retenciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = sueldoBase;
        this.categoria = categoria;
        this.retenciones = retenciones;

        numEmpleados++;
    }


    public Empleados(String nombre) {
        this(nombre, "", 1500, 'A', 5);
    }

    //Métodos

    public double calcularSueldo() {
        double sueldo = sueldoBase;

        switch (categoria) {
            case 'A': sueldo += 100; break;
            case 'B': sueldo += 200; break;
            case 'C': sueldo += 300; break;
            case 'D': sueldo += 500; break;
        }

        sueldo += sueldoBase * (primaGlobal / 100.0);

        // Aplicar retenciones
        sueldo -= sueldo * (retenciones / 100.0);

        return sueldo;
    }

    public void setCategoria(char nuevaCat) {
        this.categoria = nuevaCat;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos +
                " | Sueldo: " + calcularSueldo() + " € | Categoría: " + categoria;
    }
}
