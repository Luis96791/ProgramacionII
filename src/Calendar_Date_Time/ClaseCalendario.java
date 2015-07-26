/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calendar_Date_Time;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Date;

/**
 *
 * @author user
 */
public class ClaseCalendario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Date fecha = new Date();
        Calendar Act = Calendar.getInstance();
        Calendar Rest = Calendar.getInstance();
        TimeZone Pais = TimeZone.getDefault();
        
        sc.useDelimiter("\n");
        System.out.println("    **SISTEMA DE CONTROL DE FECHAS**\n\n    ");
        
        String resp1; int elegir, elegir1, cambiar1, cambiar2, sumaDays, sumaMonth, sumaYears,
                restaDays, restaMonth, restaYears, pais;
        
        do {
            System.out.println("\t1.  Ver Fecha Actual");
            System.out.println("\t2.  Ver Fecha por Pais");
            System.out.println("\t3.  Calcular Dias entre dos Fechas");
            System.out.println("\t4.  Suma y Resta de Fechas\n");
            
            System.out.print("Seleccionar:  ");
            elegir = sc.nextInt();
            
           
            
            switch(elegir){
                case 1:
                    System.out.println("Fecha Actual:   "+Act.getTime());
                    break;
                case 2:
                    System.out.println("    **FECHA POR PAIS**\n");
                    System.out.println("1.  EUA\n2.   España\n3.  Japon\n4.   Brazil\n5.  South Africa\n");
                    //System.out.print("Elegir Pais:  ");
                    //pais = sc.nextInt();
                    System.out.println(Pais.getDisplayName(Locale.CANADA));
                    
                    break;
                case 4:
                    System.out.println("Hoy es:     "+Act.getTime()+"\n");
                    System.out.println("    **SUMA Y RESTA DE FECHAS**\n");
                    System.out.println("1. SUMAR FECHAS\n2. RESTAR FECHAS\n");
                    System.out.print("¿Que desea Hacer?---> ");
                    elegir1 = sc.nextInt();
                    
                    if(elegir1 == 1){
                        System.out.println("1. Sumar dias \n2. Sumar Meses \n3. Sumar anios\n");
                        System.out.print("¿Que desea Sumar?---> ");
                        cambiar1 = sc.nextInt();
                        
                        switch(cambiar1){
                            case 1:
                                System.out.print("Dias a Sumar: ");
                                sumaDays = sc.nextInt();
                                Act.add(Calendar.DAY_OF_MONTH, sumaDays);
                                System.out.println(Act.getTime());
                                break;
                            case 2:
                                System.out.print("Meses a Sumar: ");
                                sumaMonth = sc.nextInt();
                                Act.add(Calendar.MONTH, sumaMonth);
                                System.out.println(Act.getTime());
                                break;
                            case 3:
                                System.out.print("Anios a Sumar: ");
                                sumaYears = sc.nextInt();
                                Act.add(Calendar.YEAR, sumaYears);
                                System.out.println(Act.getTime());
                                break;
                        }
                    }else if(elegir1 ==2){
                        System.out.println("1. Restar dias \n2. Restar Meses \n3. Restar anios\n");
                        System.out.print("¿Que desea Restar?---> ");
                        cambiar2 = sc.nextInt();
                        
                       switch(cambiar2){
                            case 1:
                                System.out.print("Dias a Restar: ");
                                restaDays = sc.nextInt();
                                Rest.add(Calendar.DAY_OF_MONTH, - restaDays);
                                System.out.println(Rest.getTime());
                                break;
                            case 2:
                                System.out.print("Meses a Restar: ");
                                restaMonth = sc.nextInt();
                                Rest.add(Calendar.MONTH, - restaMonth);
                                System.out.println(Rest.getTime());
                                break;
                            case 3:
                                System.out.print("Anios a Restar: ");
                                restaYears = sc.nextInt();
                                Rest.add(Calendar.YEAR, - restaYears);
                                System.out.println(Rest.getTime());
                                break;
                        } 
                    }
                    break;
            }
             System.out.print("Desea Salir:[SI/NO]     ");
             resp1 = sc.next();
        } while (resp1.equalsIgnoreCase("no"));
    }
}
