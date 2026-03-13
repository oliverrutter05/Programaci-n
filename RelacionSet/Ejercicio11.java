import java.util.Set;

public class Ejercicio11 {

    public static void verificarSubConjunto(Set<String> conjunto, Set<String> subconjunto){

        if (conjunto.containsAll(subconjunto)){
            System.out.println("El segundo SI es subconjunto del segundo Set");
        }
        else {
            System.out.println("El segundo NO es subconjunto del segundo Set");
        }
    }
}