import java.io.*;

public class LeerMostrarCSV {
    public static void leer(String ruta){
        BufferedReader br = null;
        try{
            FileReader fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null ){
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if( br != null) {
                try{
                    br.close();
                } catch (IOException e){
                    System.out.println("Eror al cerrar fichero lectura");
                }
            }
        }
    }
}