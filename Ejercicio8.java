//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    int numero, suma = 0;

    System.out.print("Ingresa un número: ");
    numero = sc.nextInt();

    // Sumamos los divisores propios (sin incluir el número)
    for (int i = 1; i < numero; i++) {
        if (numero % i == 0) {
            suma += i;
        }
    }

    // Verificamos si es perfecto
    if (suma == numero) {
        System.out.println(numero + " es un número perfecto.");
    } else {
        System.out.println(numero + " NO es un número perfecto.");
    }
}