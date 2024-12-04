/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pryempresa;
import java.util.Scanner;

/**
 *
 * @author jhair
 */

public class PryEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // crear la empresa
        System.out.println("Ingrese el nombre de la empresa:");
        String nombreEmpresa = scanner.nextLine();
        System.out.println("Ingrese el RUC de la empresa:");
        String ruc = scanner.nextLine();
        System.out.println("Ingrese la direccion de la empresa:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el email de la empresa:");
        String email = scanner.nextLine();

        Empresa empresa = new Empresa(nombreEmpresa, ruc, direccion, email);

        // menu de opciones
        int opcion;
        do {
            System.out.println("\n--- Menú de " + empresa.getNombre() + " ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Eliminar empleado por cedula");
            System.out.println("3. Eliminar empleado por nombre");
            System.out.println("4. Listar empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido del empleado:");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese la cedula del empleado:");
                    String cedula = scanner.nextLine();
                    System.out.println("Ingrese el salario del empleado:");
                    double salario = scanner.nextDouble();

                    Empleado nuevoEmpleado = new Empleado(nombre, apellido, cedula, salario);
                    empresa.agregarEmpleado(nuevoEmpleado);
                    break;

                case 2:
                    System.out.println("Ingrese la cedula del empleado a eliminar:");
                    String cedulaEliminar = scanner.nextLine();
                    empresa.eliminarEmpleadoPorCedula(cedulaEliminar);
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del empleado a eliminar:");
                    String nombreEliminar = scanner.nextLine();
                    System.out.println("Ingrese el apellido del empleado a eliminar:");
                    String apellidoEliminar = scanner.nextLine();
                    empresa.eliminarEmpleadoPorNombreApellido(nombreEliminar, apellidoEliminar);
                    break;

                case 4:
                    empresa.listarEmpleados();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}