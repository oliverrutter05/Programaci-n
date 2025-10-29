//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introducción
    int precio;
    String cliente;
    Scanner a = new Scanner(System.in);
    int descuentoapli;
    int precondesc;

    //Desarrollo
    System.out.println("¿Qué tipo de cliente eres? ");
    cliente = a.nextLine();
    System.out.println("Indica el precio del producto: ");
    precio = a.nextInt();

    //Desenlace
    if (cliente.equals("regular")) {
        System.out.println("Obtiene un 5% de descuento.");
        descuentoapli = (int) (precio * 0.05);
        precondesc = (int) (precio - descuentoapli);
        System.out.println(precondesc);
    }
    else if (cliente.equals("premium")) {
        System.out.println("Obtiene un 10% de descuento.");
        descuentoapli = (int) (precio * 0.1);
        precondesc = (int) (precio - descuentoapli);
        System.out.println(precondesc);
    }
    else if (cliente.equals("VIP")) {
        if (precio <500) {
            System.out.println("Obtiene un 20% de descuento.");
            descuentoapli = (int) (precio * 0.2);
            precondesc = (int) (precio - descuentoapli);
            System.out.println(precondesc);
        }
        else {
            System.out.println("Obtiene un 25% más de descuento.");
            descuentoapli = (int) (precio * 0.25);
            precondesc = (int) (precio - descuentoapli);
            System.out.println(precondesc);
        }
    }
    else {
        System.out.println("No tiene porciento de descuento.");
    }

}