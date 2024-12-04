/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryempresa;

/**
 *
 * @author jhair
 */

// cLase para empleados
public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private double salario;

    // Constructor para empleados
    public Empleado(String nombre, String apellido, String cedula, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.salario = salario;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", salario=" + salario +
                '}';
    }
}