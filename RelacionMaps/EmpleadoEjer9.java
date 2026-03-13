public class EmpleadoEjer9 {
    String nombre;
    double salario;

    public EmpleadoEjer9(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return nombre + " -> " + salario;
    }
}