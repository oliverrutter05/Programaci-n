//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();


    //CON IDEA DE ORGANIZAR Y SEPARAR EL CODIGO
    //DEFINIR LAS VARIABLES (FINAL SI PROCEDE) NECESARIAS AQUI ARRIBA
    int cantpapel, cantboli, cantlapiz, cantgoma, cantmochila;
    double preciopapel, precioboli, preciolapiz, preciogoma, preciomochila;
    String nombrecliente;


    //%DEL IVA ... ETC
    double iva;
    double porcentajeiva = 0.21;
    //PRECIOS DE LOS PRODUCTOS NOMBRES DE LOS PRODUCTOS,ETC...
    //VARIABLES PARA EL DESCUENTO ALEATORIO
    double suma, descuento, aplicardescuento;
    //=====================================================================


    //ASIGNAR EL NOMBRE DE LOS PRODUCTOS
    String papel, boli, lapiz,goma, mochila;


    papel = "Papel";
    boli = "Boli";
    lapiz = "Lápiz";
    goma = "Goma";
    mochila = "Mochila";


    //ASIGNAR EL PRECIO DE LOS PRODUCTOS
    double papel€ = 2.5;
    double boli€ = 1;
    double lapiz€ = 0.5;
    double goma€ = 0.25;
    double mochila€ = 10;


    //=====================================================================
    //IMPRIMIR EL MENSAJE DE BIENVENIDA
    System.out.println("¡Bienvenid@ a PaperOli! Aquí la imaginación cobra vida: colores, ideas y materiales para que no pongas límites a tu creatividad.");


    //IMPRIMIR EL LOGOTIPO
    System.out.println("╔══════════════════╗");
    System.out.println("║   PAPEROLI       ║");
    System.out.println("║  Creatividad →   ║");
    System.out.println("╚══════════════════╝");


    //IMPRIMIR TABLA DE PRODUCTOS CON SUS PRECIOS
    System.out.println("╔═══════════════════════════╗");
    System.out.println("║ Tabla de precios          ║");
    System.out.println("║ "+papel+"\t   ...... \t"+papel€+  "  €  ║");
    System.out.println("║ "+boli+"\t   ......\t"+boli€+"  €  ║");
    System.out.println("║ "+lapiz+"\t   ......\t"+lapiz€+"  €  ║");
    System.out.println("║ "+goma+"\t   ......\t"+goma€+" €  ║");
    System.out.println("║ "+mochila+"  ......\t"+mochila€+" €  ║");
    System.out.println("╚═══════════════════════════╝");


    //PEDIR LA CANTIDAD QUE EL CLIENTE QUIERE COMPRAR DE CADA PRODUCTO
    System.out.println("\nCantidad deseada de Papel: ");
    cantpapel = sc.nextInt();
    System.out.println("Cantidad deseada de Boli: ");
    cantboli = sc.nextInt();
    System.out.println("Cantidad deseada de Lápiz: ");
    cantlapiz = sc.nextInt();
    System.out.println("Cantidad deseada de Goma: ");
    cantgoma = sc.nextInt();
    System.out.println("Cantidad deseada de Mochila: ");
    cantmochila = sc.nextInt();


    //SUPONEMOS QUE EL CLIENTE NO ESCRIBE NUMEROS NEGATIVOS


    //PREGUNTAR EL NOMBRE AL CLIENTE PARA LA FACTURA
    System.out.println("¿Cuál es su nombre?");
    sc.nextLine();
    nombrecliente = sc.nextLine();




    //====================================================================
    //CALCULAR TODO LO NECESARIO DE LA FORMA QUE ESTIMEIS OPORTUNA
    preciopapel = cantpapel*papel€;
    precioboli = cantboli*boli€;
    preciolapiz = cantlapiz*lapiz€;
    preciogoma = cantgoma*goma€;
    preciomochila = cantmochila*mochila€;
    suma = precioboli + preciogoma + preciolapiz + preciopapel + preciomochila;
    int numero = rd.nextInt(6) + 5;
    iva = ((suma * porcentajeiva)+suma);
    descuento = (double) iva *((double)numero/100);
    aplicardescuento = (double) iva - descuento;


    //====================================================================
    //SR/SRA AQUI TIENE SU FACTURA
    //MOSTRAR EL RESUMEN DE LA FACTURA
    System.out.println("\n"+papel+"\t ....... \t"+cantpapel+" = \t"+papel€+"€\t\t"+preciopapel+"€");
    System.out.println(""+boli+"     ....... \t"+cantboli+" = \t"+boli€+"€\t\t"+precioboli+"€");
    System.out.println(""+lapiz+"    ....... \t"+cantlapiz+" = \t"+lapiz€+"€\t\t"+preciolapiz+"€");
    System.out.println(""+goma+"     ....... \t"+cantgoma+" = \t"+goma€+"€\t\t"+preciogoma+"€");
    System.out.println(""+mochila+"  ....... \t"+cantmochila+" = \t"+mochila€+"€\t\t"+preciomochila+"€");

    //NOMBRE DEL CLIENTE
    System.out.println("\nCliente: " + nombrecliente);

    //CUANTO COMPRÓ DE CADA PRODUCTO
    //TOTAL SIN IVA
    System.out.printf("Suma total = %.2f€%n", suma);

    ///%IVA APLICADO
    //EL IVA QUE SE APLICA AL TOTAL EN BASE AL PORCENTAJE ANTERIOR
    System.out.printf("Con IVA = %.2f€%n", iva);

    //TOTAL CON IVA
    //DESCUENTO ALEATORIO
    System.out.println("Al ser nuevo cliente se le aplica un " + numero + "% de descuento.");

    //DESCUENTO APLICADO
    System.out.printf("Descuento aplicado: %.2f€%n", aplicardescuento);

    //PRECIO FINAL
    System.out.printf("Precio final--> %.2f€%n", aplicardescuento, "€.");

    //IMPRIMIR MENSAJE DE DESPEDIDA
    System.out.println("Un placer "+nombrecliente+", que vuelva pronto por aqui.");
}

