public class Electrodomesticos {

    // ------- ENUM DE COLORES -------
    public enum Color {
        BLANCO, NEGRO, PLATEADO, ROJO, AZUL, GRIS
    }

    // ------- ATRIBUTOS -------
    protected double precioBase;
    protected Color color;
    protected String consumoEnergetico; // A+, A, B, C, D, E, F
    protected double peso;

    // Valores por defecto
    private final static double PRECIO_DEF = 100;
    private final static Color COLOR_DEF = Color.BLANCO;
    private final static String CONSUMO_DEF = "A";
    private final static double PESO_DEF = 10;


    // ------- CONSTRUCTORES -------
    public Electrodomesticos() {
        this(PRECIO_DEF, COLOR_DEF, CONSUMO_DEF, PESO_DEF);
    }

    public Electrodomesticos(double precioBase, Color color, String consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }


    // ------- GETTERS Y SETTERS -------
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }

    public String getConsumoEnergetico() { return consumoEnergetico; }
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }


    // ------- MÉTODO PRIVADO -------
    private String comprobarConsumoEnergetico(String letra) {
        String[] validos = {"A+", "A", "B", "C", "D", "E", "F"};

        for (String v : validos) {
            if (v.equalsIgnoreCase(letra))
                return v;
        }
        return CONSUMO_DEF;
    }


    // ------- PRECIO FINAL -------
    public double precioFinal() {
        double total = precioBase;

        // Según consumo energético
        switch (consumoEnergetico) {
            case "A+": total += 120; break;
            case "A": total += 100; break;
            case "B": total += 80; break;
            case "C": total += 60; break;
            case "D": total += 50; break;
            case "E": total += 30; break;
            case "F": total += 10; break;
        }

        // Según peso
        if (peso <= 19) total += 10;
        else if (peso <= 49) total += 30;
        else if (peso <= 79) total += 50;
        else total += 100;

        return total;
    }


    @Override
    public String toString() {
        return "Precio base: " + precioBase +
                " €, Consumo: " + consumoEnergetico +
                ", Peso: " + peso + " kg";
    }
}

