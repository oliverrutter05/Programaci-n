//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Introduccion
    Random rn = new Random();
    String lengua = "Lengua"; //Nota1
    String mates = "Mates"; //Nota2
    String ingles = "Ingles"; //Nota3
    String tic = "TIC"; //Nota4
    String frances = "Frances";//Nota5
    int nota1, nota2, nota3, nota4, nota5;

    //RANDOM
    nota1 = rn.nextInt(100)+1;
    nota2 = rn.nextInt(100)+1;
    nota3 = rn.nextInt(100)+1;
    nota4 = rn.nextInt(100)+1;
    nota5 = rn.nextInt(110)+1;

    //Desarrollo
    System.out.println("Nota de "+lengua+": " );
    System.out.println(nota1);

    System.out.println("Nota de "+mates+": ");
    System.out.println(nota2);

    System.out.println("Nota de "+mates+": ");
    System.out.println(nota3);

    System.out.println("Nota de "+ingles+": ");
    System.out.println(nota4);

    System.out.println("Nota de "+tic+": ");
    System.out.println(nota5);

    //Desenlace
    System.out.println("\n---- TABLÓN DE NOTAS ----");

        //Primer IF
        if (nota1 >=90 && nota1 <=100){
            System.out.println(lengua+" = "+nota1+" --> A");
        }
        else if (nota1 >=80 && nota1 <=89){
            System.out.println(lengua+" = "+nota1+" --> B");
        }
        else if (nota1 >=70 && nota1 <=79) {
            System.out.println(lengua+" = "+nota1+" --> C");
        }
        else if (nota1 >=60 && nota1 <=69){
            System.out.println(lengua+" = "+nota1+" --> D");
        }
        else if (nota1 < 60) {
            System.out.println(lengua+" = "+nota1+" --> F");
        }
        else {
            System.out.println(lengua+" = ERROR");
        }

        //Segundo IF
        if (nota2 >=90 && nota2 <=100){
            System.out.println(mates+" = "+nota2+" --> A");
        }
        else if (nota2 >=80 && nota2 <=89){
            System.out.println(mates+" = "+nota2+" --> B");
        }
        else if (nota2 >=70 && nota2 <=79) {
            System.out.println(mates+" = "+nota2 + " --> C");
        }
        else if (nota2 >=60 && nota2 <=69){
            System.out.println(mates+" = "+nota2+" --> D");
        }
        else if (nota2 < 60) {
            System.out.println(mates+" = "+nota2 + " --> F");
        }
        else {
            System.out.println(mates+" = ERROR");
        }

        //Tercer IF
        if (nota3 >=90 && nota3 <=100){
            System.out.println(ingles+" = "+nota3+" --> A");
        }
        else if (nota3 >=80 && nota3 <=89){
            System.out.println(ingles+" = "+nota3+" --> B");
        }
        else if (nota3 >=70 && nota3 <=79) {
            System.out.println(ingles+" = "+nota3 + " --> C");
        }
        else if (nota3 >=60 && nota3 <=69){
            System.out.println(ingles+" = "+nota3+" --> D");
        }
        else if (nota3 < 60) {
            System.out.println(ingles+" = "+nota3 + " --> F");
        }
        else {
            System.out.println(ingles+" = ERROR");
        }

        //Cuarto IF
        if (nota4 >=90 && nota4 <=100){
            System.out.println(tic+" = "+nota4+" --> A");
        }
        else if (nota4 >=80 && nota4 <=89){
            System.out.println(tic+" = "+nota4+" --> B");
        }
        else if (nota4 >=70 && nota4 <=79) {
            System.out.println(tic+" = "+nota4 + " --> C");
        }
        else if (nota4 >=60 && nota4 <=69){
            System.out.println(tic+" = "+nota4+" --> D");
        }
        else if (nota4 < 60) {
            System.out.println(tic+" = "+nota4 + " --> F");
        }
        else {
            System.out.println(tic+" = ERROR");
        }

        //Quinto IF
        if (nota5 >=90 && nota5 <=100){
            System.out.println(frances+" = "+nota5+" --> A");
        }
        else if (nota5 >=80 && nota5 <=89){
            System.out.println(frances+" = "+nota5+" --> B");
        }
        else if (nota5 >=70 && nota5 <=79) {
            System.out.println(frances+" = "+nota5 + " --> C");
        }
        else if (nota5 >=60 && nota5 <=69){
            System.out.println(frances+" = "+nota5+" --> D");
        }
        else if (nota5 < 60) {
            System.out.println(frances+" = "+nota5 + " --> F");
        }
        else {
            System.out.println(frances+" = ERROR");
        }

}
