/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class CiudadHospital {
    private String nombreCiudad;
    private String nombreProvincia;
    
    public CiudadHospital(String a, String b){
        nombreCiudad = a;
        nombreProvincia = b;
    }
    public void establecerCiudad(String c){
        nombreCiudad = c;
    }
    public void establecerProvincia(String c){
        nombreProvincia = c;
    }
    public String obtenerCiudad(){
        return nombreCiudad;
    }
    public String obtenerProvincia(){
        return nombreProvincia;
    }
}
