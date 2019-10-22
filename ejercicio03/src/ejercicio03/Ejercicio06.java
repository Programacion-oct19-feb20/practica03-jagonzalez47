/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);  // creando un objeto tipo Scanner 
    String nombre;
    String Universidad;
    
    System.out.println("Ingrese su nombre por favor:");
    nombre = entrada.nextLine();
    
    System.out.println("Ingrese su universidad");
    Universidad = entrada.nextLine();
    
            
            System.out.println("Mi nombre es "+nombre);
            System.out.println("Mi Universidad es "+Universidad);
            
            System.out.print("Mi nombre es "+ nombre+ "\n");
            System.out.print("Mi Universidad es "+ Universidad);
            
            System.out.print("Mi nombre es \n\t "+ nombre + "\n");
            System.out.print("Mi Universidad es\n\t"+ Universidad);
            
            System.out.print("Mi nombre es\n\t"+ nombre + "\n" + 
                    "Mi universidad es \n\t" + Universidad + "\n");
            
            
            
    }
    
    
}
