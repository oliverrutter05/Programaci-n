import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BuscarPalabra {
    public static void buscar (String path) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("¿Qué palabra te interesa contar?");
        String palabra = sc.nextLine();

        try (
                BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"))
                                                                                                ){
            String linea;

            while ((linea = br.readLine()) != null){
                if (palabra.equals(linea)){
                    palabra = br.readLine();
                    contador++;
                }
            }

            System.out.println("Hay un total de "+ contador +" "+ palabra +".");
            br.close();
        }
        catch (Exception e) {
            System.err.println("Error"+ e.getMessage());
            throw new RuntimeException(e);
        }
        sc.close();
    }
}
