/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryempresa;
import java.util.ArrayList;

/**
 *
 * @author jhair
 */

//clase empresa
public class Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private String email;
    private ArrayList<Empleado> empleados;

    // constructor
    public Empresa(String nombre, String ruc, String direccion, String email) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado exitosamente: " + empleado.getNombre());
    }

    public void eliminarEmpleadoPorCedula(String cedula) {
        empleados.removeIf(e -> e.getCedula().equals(cedula));
        System.out.println("Empleado con cedula " + cedula + " eliminado.");
    }

    public void eliminarEmpleadoPorNombreApellido(String nombre, String apellido) {
        boolean eliminado = empleados.removeIf(e -> 
            e.getNombre().equalsIgnoreCase(nombre) && 
            e.getApellido().equalsIgnoreCase(apellido)
        );
        if (eliminado) {
            System.out.println("Empleado con nombre " + nombre + " " + apellido + " eliminado.");
        } else {
            System.out.println("No se encontró un empleado con el nombre y apellido proporcionados.");
        }
    }

    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en la empresa.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}