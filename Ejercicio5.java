//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introducción
    Scanner sc = new Scanner(System.in);
    int lado1;
    int lado2;
    int lado3;
    int lado4;
    String responder;

    //Desarrollo
    System.out.println("Longitud de un lado del triangulo: ");
    lado1 = sc.nextInt();
    System.out.println("Longitud del segundo lado: ");
    lado2 = sc.nextInt();
    System.out.println("La longitud del tercer lado: ");
    lado3 = sc.nextInt();
    System.out.println("¿Debería llevar otra longitud más?");
    sc.nextLine();
    responder = sc.nextLine();

    //(Uso el boolean solo para el caso de la pregunta de si debería llevar otra longitud para el triángulo o no)
    boolean tienecuartolado = false;

    if (responder.equals("Si") || responder.equals("SI") || responder.equals("si")){
        System.out.println("Entonces añada otra longitud: ");
        lado4 = sc.nextInt();
        tienecuartolado = true;
    }
    else if (responder.equals("No") || responder.equals("NO") || responder.equals("no")){
        System.out.println("Entonces pasemos al resultado.");
    }

    //Desenlace
    if (tienecuartolado) {
        System.out.println("\nInválido: no forma un triángulo.");
    }
    else if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
        System.out.println("\nEs un triángulo equilátero.");
    }
    else if (lado1 == lado2 &&  lado1 != lado3 && lado2 != lado3) {
        System.out.println("\nEs un triángulo isósceles.");
    }
    else {
        System.out.println("\nEs un triángulo escaleno.");;
    }
}