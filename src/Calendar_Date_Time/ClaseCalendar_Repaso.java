/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calendar_Date_Time;

import java.util.Calendar;

/**
 *
 * @author user
 */
public class ClaseCalendar_Repaso {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        
        String fechaActual = "";
        
        System.out.println("Hoy es:     "+calendario.get(Calendar.DAY_OF_MONTH)+" / "+
                calendario.get(Calendar.JULY)+" / "+
                calendario.get(Calendar.YEAR));
        
        
        //calendario.get(Calendar.DAY_OF_MONTH);
        //System.out.println(calendario);
    }

    public void setCalendario(int year, int month, int day){
        year = Calendar.YEAR;
        month = Calendar.MONTH;
        day = Calendar.DAY_OF_MONTH;
    }
}
