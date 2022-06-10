/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Medico {

    private String nombreDoctor;
    private String especialidades;
    private double sueldoMensual;

    public Medico(String a, String b, double c) {
        nombreDoctor = a;
        especialidades = b;
        sueldoMensual = c;
    }

    public void establecerNombreDoctor(String d) {
        nombreDoctor = d;
    }

    public void establecerEspecialidad(String d) {
        especialidades = d;
    }

    public void establecerSueldoMensual(double d) {
        sueldoMensual = d;
    }

    public String obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidades;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
