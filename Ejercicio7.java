//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introducción
    Scanner sc = new Scanner(System.in);
    int usuario1, usuario2;
    int resultado = 0;
    int tijera = 1;
    int papel = 2;
    int piedra = 3;
    int lagarto = 4;
    int spock = 5;

    //Desarrollo
    System.out.println("----- Juego de Piedra, Papel, Tijera, Lagarto, Spock -----");
    System.out.println("Tijera --> 1");
    System.out.println("Papel --> 2");
    System.out.println("Piedra --> 3");
    System.out.println("Lagarto --> 4");
    System.out.println("Spock --> 5");

    //Usuario numero 1
    System.out.println("\n¿Qué saca el primer usuario?");
    usuario1 = sc.nextInt();
    while (usuario1 < 1 || usuario1 > 5) {
        System.out.println("Jugada inválida, repita.");
        System.out.print("\nIngresa otro número: ");
        usuario1 = sc.nextInt();
    }
    System.out.println("¡Perfecto! Jugada válida: " + usuario1);

    //Usuario numero 2
    System.out.println("\n¿Qué saca el segundo usuario?");
    usuario2 = sc.nextInt();
    while (usuario2 < 1 || usuario2 > 5) {
        System.out.println("Jugada inválida, repita.");
        System.out.print("\nIngresa otro número: ");
        usuario2 = sc.nextInt();
    }
    System.out.println("¡Perfecto! Jugada válida: " + usuario2);

    //Desenlace
    switch (usuario1) {
        case 1:
            switch (usuario2){
                case 1:
                    System.out.println("Empate");
                    break;
                case 2:
                    System.out.println("Tijeras corta papel, ganaste");
                    break;
                case 3:
                    System.out.println("Piedra rompe las tijeras, perdiste");
                    break;
                case 4:
                    System.out.println("Tijeras decapitan al lagarto, ganaste");
                    break;
                case 5:
                    System.out.println("Spock rompe las tijeras, perdiste");
                    break;
            }
            break;
        case 2:
            switch (usuario2){
                case 1:
                    System.out.println("Tijeras corta papel, perdiste");
                    break;
                case 2:
                    System.out.println("Empate");
                    break;
                case 3:
                    System.out.println("Papel cubre a la piedra, ganaste");
                    break;
                case 4:
                    System.out.println("Lagarto come el papel, perdiste");
                    break;
                case 5:
                    System.out.println("Papel desautoriza a Spock, ganaste");
                    break;
            }
            break;
        case 3:
            switch (usuario2) {
                case 1:
                    System.out.println("Piedra rompe las tijeras, ganaste");
                    break;
                case 2:
                    System.out.println("Papel cubre a la piedra, perdiste");
                    break;
                case 3:
                    System.out.println("Empate");
                    break;
                case 4:
                    System.out.println("Piedra aplasta al lagarto, ganaste");
                    break;
                case 5:
                    System.out.println("Spock vaporiza la piedra, perdiste");
                    break;
            }
            break;
        case 4:
            switch (usuario2) {
                case 1:
                    System.out.println("Tijeras decapitan al lagarto, perdiste");
                    break;
                case 2:
                    System.out.println("Lagarto come el papel, ganaste");
                    break;
                case 3:
                    System.out.println("Piedra aplasta al lagarto, perdiste");
                    break;
                case 4:
                    System.out.println("Empate");
                    break;
                case 5:
                    System.out.println("Lagarto envenena a Spock, ganaste");
                    break;
            }
            break;
        case 5:
            switch (usuario2) {
                case 1:
                    System.out.println("Spock rompe las tijeras, ganaste");
                    break;
                case 2:
                    System.out.println("Papel desautoriza a Spock, perdiste");
                    break;
                case 3:
                    System.out.println("Spock vaporiza la piedra, ganaste");
                    break;
                case 4:
                    System.out.println("Lagarto envenena a Spock, perdiste");
                    break;
                case 5:
                    System.out.println("Empate");
                    break;
            }
            break;
        default:
            System.out.println("Opción no valida");
    }




}










