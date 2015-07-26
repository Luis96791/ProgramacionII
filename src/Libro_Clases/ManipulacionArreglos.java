/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Libro_Clases;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class ManipulacionArreglos {
    public static void main(String[] args) {
        double[] arregloDouble = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(arregloDouble);
        System.out.println("Arreglo Double");
        
        for(double valor : arregloDouble)
            System.out.println(valor);
        
        int[] arregloIntLleno = new int[10];
        Arrays.fill(arregloIntLleno, 5);
        mostrarArreglo(arregloIntLleno, "arregloIntLleno");
        
        int[] arregloInt = {1, 2, 3, 4, 5, 6};
        int[] copiaArregloInt = new int[arregloInt.length];
        System.arraycopy(arregloInt, 0, copiaArregloInt, 0, arregloInt.length);
        mostrarArreglo(arregloInt, "arregloInt");
        mostrarArreglo(copiaArregloInt, "copiaArregloInt");
        
        boolean b = Arrays.equals(arregloInt, copiaArregloInt);
        System.out.printf("\n\narregloInt %s copiaArregloInt\n", (b ? "==" : "!="));
        
        b = Arrays.equals(arregloInt, arregloIntLleno);
        System.out.printf("arregloInt %s arregloIntLleno\n", (b ? "==" : "!="));
        
        int ubicacion = Arrays.binarySearch(arregloInt, 5);
        
        if(ubicacion >= 0)
            System.out.printf("Se encontro 5 en el elemento %d de arregloInt\n", ubicacion);
        else
            System.out.printf("No se encontro el 5 en arregloInt");
        
        ubicacion = Arrays.binarySearch(arregloInt, 4);
        
        if(ubicacion >= 0)
            System.out.printf("Se encontro el 8763 en el elemento %d de arregloInt\n", ubicacion);
        else
            System.out.printf("No se encontro el 8763 en arregloInt");
    }
    
    public static void mostrarArreglo(int[] arreglo, String descripcion){
        
        System.out.printf("\n%s: ", descripcion);
        
        for(int valor: arreglo)
            System.out.printf("%d ", valor);
    }
}
