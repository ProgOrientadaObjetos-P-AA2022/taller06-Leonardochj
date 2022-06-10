/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class EntidadHospitalaria {

    private String nombreHospital;
    private CiudadHospital ciudadHospital;
    private CiudadHospital provinciaHospital;
    private String direccion;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double sueldoTotal;

    public EntidadHospitalaria(String a, int b, CiudadHospital c, String d, 
            Medico[] g, Enfermero[] h) {
        nombreHospital = a;
        numeroEspecialidades = b;
        ciudadHospital = c;
        provinciaHospital = c;
        direccion = d;
        medicos = g;
        enfermeros = h;
    }

    public void establecerHospital(String e) {
        nombreHospital = e;
    }

    public void establecerCiudadHospital(CiudadHospital e) {
        ciudadHospital = e;
    }

    public void establecerProvinciaHospital(CiudadHospital e) {
        provinciaHospital = e;
    }

    public void establcerEspecialidades(int e) {
        numeroEspecialidades = e;
    }

    public void establecerDireccion(String e) {
        direccion = e;
    }

    public void establecerMedicos(Medico[] e) {
        medicos = e;
    }

    public void establecerEnfermeros(Enfermero[] e) {
        enfermeros = e;
    }

    public void calcularSueldoTotal() {
        double suma = 0;
        double suma2 = 0;
        for (int j = 0; j < obtenerMedicos().length; j++) {
            suma = suma + obtenerMedicos()[j].obtenerSueldoMensual();
        }
        for (int k = 0; k < obtenerEnfermeros().length; k++) {
            suma2 = suma2 + obtenerEnfermeros()[k].obtenerSueldoMensual();
        }
        sueldoTotal = suma + suma2;
    }

    public String obtenerHospital() {
        return nombreHospital;
    }

    public CiudadHospital obtenerCiudadHospital() {
        return ciudadHospital;
    }

    public CiudadHospital obtenerProvinciaHospital() {
        return provinciaHospital;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public int obtenerEspecialidades() {
        return numeroEspecialidades;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nDireccion: %s\nCiudad: %s\n"
                + "Provincia: %s\nNumero de especialidades: %d\n\nLista de medicos\n",
                obtenerHospital(),
                obtenerDireccion(),
                obtenerCiudadHospital().obtenerCiudad(),
                obtenerCiudadHospital().obtenerProvincia(),
                obtenerEspecialidades());

        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s%s - %.2f - %s\n", cadena,
                    obtenerMedicos()[i].obtenerNombreDoctor(),
                    obtenerMedicos()[i].obtenerSueldoMensual(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\nLista de enfermeros(as)\n", cadena);
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s%s - %.2f - %s\n", cadena,
                    obtenerEnfermeros()[i].obtenerNombreEnfermero(),
                    obtenerEnfermeros()[i].obtenerSueldoMensual(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }
        cadena = String.format("%s\nTotal de sueldos a pagar es: %.2f\n", cadena,
                obtenerSueldoTotal());
        return cadena;
    }

}
