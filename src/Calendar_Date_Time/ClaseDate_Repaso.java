/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calendar_Date_Time;
import java.util.Date;

/**
 *
 * @author user
 */
public class ClaseDate_Repaso {
    
    long cero = 0;
    public static void main (String []args)     {
        Date fechaActual = new Date();
        System.out.println("Fecha: "+fechaActual);
        
        Date fecha1, fecha2;
        long diferencia = 0;
        fecha1 = new Date();
        fecha2 = new Date(1438609440765L);
        diferencia = fecha2.getTime()- fecha1.getTime();
        System.out.println("Diferencias en dias: "+diferencia/(3600000*24));
        
        System.out.println("Fecha 2:    "+fecha2);
        
        System.out.println("Probar Fecha Internacional: "+fechaActual.toLocaleString());//deprecado
        System.out.println("Probar Fecha Internacional: "+fechaActual.toGMTString());//deprecado
        
        boolean flag = false;
        if(fecha2.after(fechaActual)){
            flag = true;
            System.out.println(flag);
        }
        else{
            flag = false;
            System.out.println(flag);
        }    
    }
}
