//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introducción
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int ingresoAnual;
    double impuesto;
    int dependientes;
    double porcentajeDependiente = 0.05;

    //Desarrollo
    System.out.println("¿Que ingreso anual ha generado este año?");
    ingresoAnual = sc.nextInt();
    System.out.println("¿Cúantos dependientes?");
    dependientes = rd.nextInt(10) + 1;
    System.out.println(dependientes);

    //Desenlace
    if (ingresoAnual < 20000) {
        impuesto = ingresoAnual * 0.05;
        if (dependientes > 3) {
            impuesto -= (impuesto*porcentajeDependiente);
            System.out.println("Al haber mas de 3 dependientes se le reduce un 5%.");
        }

        System.out.println("El impuesto generado es de "+impuesto+"€");
    }
    else if (ingresoAnual >= 20000 && ingresoAnual < 40000) {
        impuesto = ingresoAnual * 0.1;
        if (dependientes > 3) {
            impuesto -= (impuesto*porcentajeDependiente);
            System.out.println("Al haber mas de 3 dependientes se le aplica un 5% más");
        }
        System.out.println("El impuesto generado es de "+impuesto+"€");
    }
    else if (ingresoAnual >= 40000 && ingresoAnual < 80000) {
        impuesto = ingresoAnual * 0.2;
        if (dependientes > 3) {
            impuesto -= (impuesto*porcentajeDependiente);
            System.out.println("Al haber mas de 3 dependientes se le aplica un 5% más");
        }
        System.out.println("El impuesto generado es de "+impuesto+"€");
    }
    else if (ingresoAnual >= 80000) {
        impuesto = ingresoAnual * 0.3;
        if (dependientes > 3) {
            impuesto -= (impuesto*porcentajeDependiente);
            System.out.println("Al haber mas de 3 dependientes se le aplica un 5% más");
        }
        System.out.println("El impuesto generado es de "+impuesto+"€");
    }

}
