/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Enfermero {

    private String nombreEnfermero;
    private String tipo;
    private double sueldoMensual;

    public Enfermero(String a, String b, double c) {
        nombreEnfermero = a;
        tipo = b;
        sueldoMensual = c;
    }

    public void establecerNombreEnfermero(String d) {
        nombreEnfermero = d;
    }

    public void establecerTipo(String d) {
        tipo = d;
    }

    public void establecerSueldoMensual(double d) {
        sueldoMensual = d;
    }

    public String obtenerNombreEnfermero() {
        return nombreEnfermero;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
