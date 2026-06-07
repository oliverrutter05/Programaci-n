package org.example;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        CocheDAO dao = new CocheDAO();

        int opcion;

        do {
            System.out.println("\n===== GESTIÓN DE COCHES =====");
            System.out.println("1. Insertar coche");
            System.out.println("2. Actualizar coche");
            System.out.println("3. Eliminar coche");
            System.out.println("4. Mostrar coches");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    dao.insertar(
                            new Coche(marca, modelo, precio)
                    );
                    break;

                case 2:
                    System.out.print("ID: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nueva marca: ");
                    marca = sc.nextLine();

                    System.out.print("Nuevo modelo: ");
                    modelo = sc.nextLine();

                    System.out.print("Nuevo precio: ");
                    precio = sc.nextDouble();

                    dao.actualizar(
                            new Coche(
                                    idActualizar,
                                    marca,
                                    modelo,
                                    precio
                            )
                    );
                    break;

                case 3:
                    System.out.print("ID a eliminar: ");
                    int idEliminar = sc.nextInt();

                    dao.eliminar(idEliminar);
                    break;

                case 4:
                    List<Coche> coches = dao.obtenerTodos();

                    for (Coche c : coches) {
                        System.out.println(
                                c.getId() + " - " +
                                        c.getMarca() + " " +
                                        c.getModelo() +
                                        " (" + c.getPrecio() + " €)"
                        );
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
