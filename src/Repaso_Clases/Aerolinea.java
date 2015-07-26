/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Repaso_Clases;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Aerolinea {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int filas, columnas;
        System.out.println("Filas: ");
        filas = lea.nextInt();
        System.out.println("Columnas: ");
        columnas = lea.nextInt();
        
        String palas[][] = new String[filas][columnas];
        
        for(int f=0; f < filas-1; f++){
            for(int c=0; c < columnas; c++){
                System.out.printf("Palabra en [%d][%d]: ",f,c);
                palas[f][c] = lea.next();
            }
        }
        int suma=0;
        for(int c=0; c < columnas; c++){
            
            for(int f=0; f < filas-1; f++){
                suma += palas[f][c].length();
            }
            palas[filas-1][c] = ""+suma;
            System.out.println("Columna["+c+"]: " + suma);
        }
    } 
}
