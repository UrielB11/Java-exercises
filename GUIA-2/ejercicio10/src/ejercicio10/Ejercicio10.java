/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***

 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author xxx
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Ingrese 4 valores:");
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3= sc.nextInt();
        num4= sc.nextInt();
        }while(num1>20 || num2>20|| num3>20 || num4>20);
        
            System.out.print(num1);
        for (int i = 0; i <num1; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
            System.out.print(num2);
        for (int j = 0; j <num2; j++) {
            System.out.print("*");
            
        }
                System.out.println("");
            System.out.print(num3);
        for (int k = 0; k <num3; k++) {
            System.out.print("*");
            
        }
                System.out.println("");
            System.out.print(num4);
        for (int a = 0; a <num4; a++) {
            System.out.print("*");
            
        }
    }
    
}
