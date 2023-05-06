/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author xxx
 */
public class notaDe0a10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese la nota"); 
        int nota = sc.nextInt();
        while (nota <0 || nota >10){
        System.out.println("ingrese nuevamente");               }
        nota = sc.nextInt();
    }
    
}
