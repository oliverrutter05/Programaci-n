import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SobreescribirLineas {
    public static void sobreescribe ( String path) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué desea introducir?");
        String texto = sc.nextLine();
        BufferedWriter bw= null;

        try {
            bw = new BufferedWriter(new FileWriter("datos.csv", false));
            bw.write(texto);
            bw.newLine();
            bw.close();

            System.out.println("Se ha añadido la información correctamente.");
        }
        catch (IOException e) {
            System.out.println("Ups, hubo un fallo, compruebe su código." + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
