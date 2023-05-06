/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author xxx
 */
public class ImprimirNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       String nombre;
       
       System.out.println("Escriba su nombre:");
       
       nombre = leer.next();
       
       System.out.println("Hola "+ nombre+ ", Bienvenido al curso de JAVA");

       
        
    }
    
}
