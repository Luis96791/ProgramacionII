/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Libro_Clases;
import java.util.Scanner;
/**
 *
 * @Luis Enrrique Fajardo
 */
public class PuebaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int diaNac, mesNac, anioNac;
        
        System.out.print("Dia Nacimiento:   ");
        diaNac = sc.nextInt();
        System.out.print("Mes Nacimiento:   ");
        mesNac = sc.nextInt();
        System.out.print("Anio Nacimiento:   ");
        anioNac = sc.nextInt();
        
     Fecha nacimiento = new Fecha(mesNac, diaNac, anioNac);
     
     int diaCont, mesCont, anioCont;
        
        System.out.print("Dia Contratacion:   ");
        diaCont = sc.nextInt();
        System.out.print("Mes Contratacion:   ");
        mesCont = sc.nextInt();
        System.out.print("Anio Contratacion:   ");
        anioCont = sc.nextInt();
     Fecha contratacion = new Fecha(mesCont, diaCont, anioCont);
     
     String nombre, apellido;
     
        System.out.print("Ingrese Nombre:   ");
        nombre = sc.next();
        System.out.print("Ingrese Apellido:   ");
        apellido = sc.next();
        
     
     Empleado empleado = new Empleado(nombre, apellido, nacimiento, contratacion);
        System.out.println(empleado);
    }
}
