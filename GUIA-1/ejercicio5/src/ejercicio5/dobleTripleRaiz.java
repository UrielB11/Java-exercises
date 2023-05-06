/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author xxx
 */
public class dobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       int num; 
       int doble;
       int triple;
       int raiz;
       System.out.println("Ingrese un numero:");
       num= leer.nextInt();
       raiz=(int) Math.sqrt(num);
       doble=(int) Math.pow(num, 2);
       triple=(int) Math.pow(num, 3);
       System.out.println("El numero ingresado elevado al cuadrado es igual a: " + doble);
       System.out.println("El numero ingresado elevado al cubo es igual a: " + triple);
       System.out.println("La raiz del numero ingresado elevado es igual a: " + raiz);
       
       
       
       
       
       
               
               
    }
    
}
