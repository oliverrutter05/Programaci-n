public class Television extends Electrodomesticos {

    private int resolucion;
    private boolean netflix;

    private final static int RES_DEF = 20;
    private final static boolean NETFLIX_DEF = false;

    // Constructor
    public Television(double precioBase, Color color, String consumoEnergetico,
                      double peso, int resolucion, boolean netflix) {

        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }

    public int getResolucion() { return resolucion; }
    public boolean isNetflix() { return netflix; }

    @Override
    public double precioFinal() {
        double total = super.precioFinal();

        if (resolucion > 20)
            total += precioBase * 0.30;

        if (netflix)
            total += 60;

        return total;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Resolución: " + resolucion + " pulgadas" +
                ", Netflix: " + netflix;
    }
}
