/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Libro_Clases;

/**
 *
 * @author user
 */
public class Empleado {
    private String primerNombre, apellidoPaterno;
    private Fecha fechaNacimiento, FechaContratacion;

    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento, Fecha FechaDeContratacion) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        fechaNacimiento = fechaDeNacimiento;
        FechaContratacion = FechaDeContratacion;
    }
    
    public String toString(){
        return String.format("%s, %s Contratado: %s Cumpleanios: %s", 
                apellidoPaterno, primerNombre, FechaContratacion, fechaNacimiento);
    }
}
