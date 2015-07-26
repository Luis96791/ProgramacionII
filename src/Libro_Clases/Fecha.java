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
public class Fecha {
    private int mes, dia, anio;
    
    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Fecha(int elMes, int elDia, int elAnio){
        mes = comprobarMes(elMes);
        dia = comprobarDia(elDia);
        anio =elAnio;
    }
    
    private int comprobarMes(int mesPrueba){
        if(mesPrueba > 0 && mesPrueba <= 12)
            return mesPrueba;
        else
            throw new IllegalArgumentException("El mes debe ser del 1 al 12");
    }
    
    private int comprobarDia( int diaPrueba){
        if(diaPrueba > 0 && diaPrueba <= diasPorMes[mes])
            return diaPrueba;
        
        if(mes == 2 && diaPrueba == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            return diaPrueba;
        
        throw new IllegalArgumentException("Dia fuera de rango para el mes y el anio especificados");
    }
    
    public String toString(){
        return String.format("%d/%d/%d", dia, mes, anio);
    }
}
