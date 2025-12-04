public class Main {
    public static void main(String[] args) {

        // -------- LAVADORA AEG --------
        Lavadora lavadoraAEG = new Lavadora(
                400,
                Electrodomesticos.Color.PLATEADO,
                "PK",
                30,
                7
        );

        System.out.println("Lavadora AEG:");
        System.out.println(lavadoraAEG);
        System.out.println("Precio final: " + lavadoraAEG.precioFinal() + " €\n");


        // -------- TV SAMSUNG por defecto --------
        Television tvSamsung = new Television(100,
                Electrodomesticos.Color.BLANCO,
                "A",
                10,
                20,
                false
        );

        System.out.println("TV Samsung (por defecto):");
        System.out.println(tvSamsung);
        System.out.println("Precio final: " + tvSamsung.precioFinal() + " €\n");


        // -------- TV SAMSUNG actualizada --------
        Television tvSamsung2 = new Television(
                190,
                Electrodomesticos.Color.NEGRO,
                "A+",
                10,
                24,
                true
        );

        System.out.println("TV Samsung (actualizada):");
        System.out.println(tvSamsung2);
        System.out.println("Precio final: " + tvSamsung2.precioFinal() + " €\n");

    }
}
