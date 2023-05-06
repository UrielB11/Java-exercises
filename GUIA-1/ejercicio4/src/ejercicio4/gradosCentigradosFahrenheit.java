/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author xxx
 */
public class gradosCentigradosFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int c;
        System.out.println("Estriba la temperatura en grados centigrados:");
        c= leer.nextInt();
        int f= 32+ (9*c/5);
                System.out.println("Su equvalente en Fahrenheit es de " + f + "°F");
    }
    
}
