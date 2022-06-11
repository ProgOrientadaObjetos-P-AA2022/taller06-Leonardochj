/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.CiudadHospital;
import paquete02.Enfermero;
import paquete02.EntidadHospitalaria;
import paquete02.Medico;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el nombre del hospital");
        String nombreHospital = entrada.nextLine();
        System.out.println("Ingrese el número de especialidades");
        int nEspecialidades = entrada.nextInt();
        System.out.println("Ingrese la ciudad");
        entrada.nextLine();
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia");
        String provincia = entrada.nextLine();
        System.out.println("Ingrese la direccion");
        String direccion = entrada.nextLine();

        CiudadHospital ubicacion = new CiudadHospital(ciudad, provincia);

        System.out.println("Ingresa el numero de elementos para el arreglo de medicos");
        int nMedicos = entrada.nextInt();
        System.out.println("Ingresa el numero de elementos para el arreglo de enfermeros");
        int nEnfermeros = entrada.nextInt();

        Medico[] medicos = new Medico[nMedicos];
        Enfermero[] enfermeros = new Enfermero[nEnfermeros];
        if ((nMedicos < nEspecialidades) && (nEnfermeros < nEspecialidades)) {
            for (int i = 0; i < medicos.length; i++) {
                System.out.println("Ingrese el nombre del medico");
                entrada.nextLine();
                String nombreMedico = entrada.nextLine();
                System.out.println("Ingrese la especialidad");
                String nombreEspecialidad = entrada.nextLine();
                System.out.println("Ingrese el sueldo del medico");
                double sueldo = entrada.nextDouble();
                Medico medico = new Medico(nombreMedico, nombreEspecialidad,
                        sueldo);
                medico.establecerNombreDoctor(nombreMedico);
                medico.establecerEspecialidad(nombreEspecialidad);
                medico.establecerSueldoMensual(sueldo);
                medicos[i] = medico;
            }
            for (int k = 0; k < enfermeros.length; k++) {
                System.out.println("Ingrese el nombre del enfermero");
                entrada.nextLine();
                String nombreEnfermero = entrada.nextLine();
                System.out.println("Ingrese el tipo");
                String nombreTipo = entrada.nextLine();
                System.out.println("Ingrese el sueldo del enfermero");
                double sueldo2 = entrada.nextDouble();
                Enfermero enfermero = new Enfermero(nombreEnfermero,
                        nombreTipo, sueldo2);
                enfermero.establecerNombreEnfermero(nombreEnfermero);
                enfermero.establecerTipo(nombreTipo);
                enfermero.establecerSueldoMensual(sueldo2);
                enfermeros[k] = enfermero;
            }

            EntidadHospitalaria hospital = new EntidadHospitalaria(nombreHospital,
                    nEspecialidades, ubicacion, direccion, medicos, enfermeros);
            hospital.establecerMedicos(medicos);
            hospital.establecerEnfermeros(enfermeros);
            hospital.calcularSueldoTotal();
            System.out.printf("%s\n", hospital);
        }
        System.out.println("");
    }

}
