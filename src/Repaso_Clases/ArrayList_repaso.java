/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Repaso_Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrayList_repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        ArrayList<String> agregar = new ArrayList<String>();
        
        String ingrese, salir, buscar, eliminar; int elegir, pos;
     
        do{
            System.out.println("\nBienvenido al programa de familiarizacion con los ArrayList\n\n"
                    + "\t1. Agregar Strings\n\t2. Ver Lista\n\t3. Eliminar Elemento\n"
                    + "\t4. Ver tamanio del ArrayList\n\t5. Buscar Elemento\n\t6. Limpiar ArrayList\n");
            
            System.out.print("Elija una Opcion: ");
            elegir = sc.nextInt();
            switch(elegir){
                case 1: 
                    System.out.println("Ingreso de Strings al ArrayList\n");
                    System.out.print("Ingrese Nombre: ");
                    ingrese = sc.next().toLowerCase();
                    

                    agregar.add(ingrese);
                    break;
                case 2:
                    System.out.println("Ver Elementos de la Lista\n");
                    for (int i = 0; i < agregar.size(); i++) {
                        System.out.println("- "+ agregar.get(i));
                    }
                    break;
                case 3:
                    System.out.println("\nEliminar elementos de el ArrayList");
                    System.out.print("Ingrese posicion a eliminar:    ");
                    pos = sc.nextInt();
                    agregar.remove(pos-1);
                    break;
                case 4:
                    System.out.println("\nVer tamanio del ArrayList");
                    System.out.print("Tamanio:  "+agregar.size()+"\n");
                    break;
                case 5:
                    System.out.println("\n Buscar elemento en el ArrayList");
                    System.out.print("Ingrese String a Buscar:  ");
                    buscar = sc.next();
                    
                    if(agregar.contains(buscar))
                        System.out.println("SI existe");
                    else
                        System.out.println("NO existe");
                    break;
                case 6:
                    System.out.println("\nLimpiador de ArrayList");
                    for(String elements : agregar)
                        System.out.println("- "+elements);
                    System.out.println("\nINFO: Todos estos elementos se eliminaran");
                    System.out.println("Desea eliminarlos:  ");
                    eliminar = sc.next();
                    
                    if(eliminar.equalsIgnoreCase("si"))
                        agregar.clear();
                    else
                        System.out.println("No se elimino ningun elemento");
                    break;
            }
            System.out.print("Desea Salir?    ");
            salir = sc.next();
        }while(salir.equalsIgnoreCase("no"));
    }
    
    //public static void mostrar
}
