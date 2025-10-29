//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introducción
    Scanner sc = new Scanner(System.in);
    int dia;
    int mes;
    int ano;

    //Desarrollo
    System.out.println("Introduce un dia del 1 al 31: ");
    dia = sc.nextInt();
    System.out.println("Introduce un mes del 1 al 12: ");
    mes = sc.nextInt();
    System.out.println("Introduce un año: ");
    ano = sc.nextInt();

    //Desenlace
    switch (mes){
        case 1:
            if (dia <= 31) {
                System.out.println("Es enero");
            }
            else{
                System.out.println("No exixte esta fecha.");
            }
            break;

        case 2:
            if (dia <= 29) {
                System.out.println("Es febrero");
                if (dia == 29) {
                    System.out.println("El año " + ano + " es año bisiesto.");
                }
            }
            else {
                System.out.println("No exixte esta fecha.");
            }
            break;

        case 3:
            if (dia <= 31) {
                System.out.println("Es marzo esta fecha.");
            }
            else {
                System.out.println("No exixte esta fecha.");
            }
            break;

        case 4:
            if (dia <= 30) {
                System.out.println("Es abril");
            }
            else {
                System.out.println("No exixte esta fecha.");
            }
            break;

        case 5:
            if (dia <= 31) {
                System.out.println("Es mayo");
            }
            else {
                System.out.println("No existe esta fecha.");
            }
            break;

        case 6:
            if (dia <= 30) {
                System.out.println("Es junio");
            }
            else {
                System.out.println("No existe esta fecha.");
            }
            break;

        case 7:
            if (dia <= 31) {
                System.out.println("Es julio");
            }
            else {
                System.out.println("No existe esta fecha.");
            }
            break;

        case 8:
            if (dia <= 31) {
                System.out.println("Es agosto");
            }
            else {
                System.out.println("No existe esta fecha.");
            }
            break;

        case 9:
            if (dia <= 30) {
                System.out.println("Es septiembre");
            }
            else {
                System.out.println("No existe esta fecha.");
            }
            break;

        case 10:
            if (dia <= 31) {
                System.out.println("Es octubre");
            }
            else {
                System.out.println("No existe esta fecha.");
            }
            break;

        case 11:
            if (dia <= 30) {
                System.out.println("Es noviembre");
            }
            else {
                System.out.println("No existe esta fecha.");
            }
            break;

        case 12:
            if (dia <= 31) {
                System.out.println("Es diciembre");
            }
            else {
                System.out.println("No existe esta fecha.");
            }
            break;

        default:
            System.out.println();
            break;
    }

    if (dia >32){
        System.out.println("ERROR");
    }
    else {
        System.out.println("Fecha introducida: " + dia + "/" + mes + "/" + ano);
    }




}
