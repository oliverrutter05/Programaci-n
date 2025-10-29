//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introducción
    Scanner a = new Scanner(System.in);
    String cuenta;
    String pass;

    //Desarrollo
    System.out.println("Inserte cuenta: ");
    cuenta = a.nextLine();
    System.out.println("Inserte contraseña: ");
    pass = a.nextLine();

    //Desenlace
    if (cuenta.equals("administrador") && pass.equals("1234")){
        System.out.println("Es admin");
    }
    else if (cuenta.equals("usuario") && pass.equals("abcd")) {
        System.out.println("Es usuario");
    }
    else if (cuenta.equals("invitado") && pass.equals("xyz")) {
        System.out.println("Es invitado");
    }
    else {
        System.out.println("Acceso Denegado");
    }

}
