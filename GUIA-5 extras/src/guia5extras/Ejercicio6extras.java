/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.util.Scanner;

/**
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
* construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
* en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no
* utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().

 */
public class Ejercicio6extras {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String[][] matriz=new String[20][20];
        String[] palabras=new String[5];
        
        
        for(int i=0 ; i<5; i++){
            System.out.println("Ingrese la palabra "+ (i+1));
                palabras[i]= sc.nextLine();
            while (palabras[i].length()>5 || palabras[i].length()<3){
            
                
                if(palabras[i].length()>5){
                    System.out.println("La palabra ingresada supera los 5 caracteres");

                }
                else if(palabras[i].length()<3){
                    System.out.println("La ingresada palabra tiene menos de 3 caracteres");

                }
                palabras[i]= sc.nextLine();
                
             } 
        }
        int r=0;
        int a=0;
        int C=0;
        
        for (int i = 0; i < 5; i++) {
                r= (int)(Math.random()*20);
                C= (int)(Math.random()*15);
            for (int j = 0; j < palabras[i].length(); j++) {
                if(matriz[i][j]==null){
                matriz[r][C+j]= palabras[i].substring(j, j+1);
            }

            }
        } 
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j <20; j++) {
                a= (int)(Math.random()*9);
                 if(matriz[i][j]==null){
         
                    matriz[i][j]= String.valueOf(a);
                 }
              
                System.out.print("["+matriz[i][j]+"] ");
            }
        System.out.println("");
        }
    }
    
}
