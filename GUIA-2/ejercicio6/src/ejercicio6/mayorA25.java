/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author xxx
 */
public class mayorA25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 =leer.nextInt();
        int num2 =leer.nextInt();
        
        if(num1>25 || num2>25){
            System.out.println("algunos de los dos numeros ingresados es mayor a 25");
        }
        else {
                System.out.println("Ninguno de los numeros ingresados es mayor a 25");    
                    }
        }
        
        
    }
    