//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introducción
    Scanner sc = new Scanner(System.in);
    System.out.println("Seleccione operación: +, -, *, /, pow, raiz, fact");
    String op = sc.next();



    switch (op) {
        case "+": {
            System.out.println("Introduce un número: ");
            double a = sc.nextDouble();
            System.out.println("Introduce otro número: ");
            double b = sc.nextDouble();
            System.out.println(a + b);
            break;
        }
        case "-": {
            System.out.println("Introduce un número: ");
            double a = sc.nextDouble();
            System.out.println("Introduce otro número: ");
            double b = sc.nextDouble();
            System.out.println(a - b);
            break;
        }
        case "*": {
            System.out.println("Introduce un número: ");
            double a = sc.nextDouble();
            System.out.println("Introduce otro número: ");
            double b = sc.nextDouble();
            System.out.println(a * b);
            break;
        }
        case "/": {
            System.out.println("Introduce un número: ");
            double a = sc.nextDouble();
            System.out.println("Introduce otro número: ");
            double b = sc.nextDouble();
            if (b == 0) throw new ArithmeticException("División entre cero");
            System.out.println(a / b);
            break;
        }
        case "pow": {
            System.out.println("Introduce un número: ");
            int base = sc.nextInt();
            System.out.println("Introduce otro número: ");
            int exp = sc.nextInt();
            int res=1; for(int i=1;i<=exp;i++) res*=base; System.out.println(res);
            break;
        }
        case "raiz": {
            System.out.println("Introduce un número: ");
            double n = sc.nextDouble();
            if(n<0) throw new IllegalArgumentException("Raíz de número negativo"); System.out.println(Math.sqrt(n));
            break;
        }
        case "fact": {
            System.out.println("Introduce un número: ");
            int n = sc.nextInt();
            int r=1; for(int i=1;i<=n;i++) r*=i; System.out.println(r);
            break;
        }
        default:
            System.out.println("Operación no válida");
    }
}

