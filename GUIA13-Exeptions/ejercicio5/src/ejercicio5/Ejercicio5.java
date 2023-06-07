
package ejercicio5;

import java.util.Scanner;


//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.

public class Ejercicio5 {

    public static void main(String[] args) {
        
        int numAdivinar= (int)(Math.random()*10);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("intenta adivinar en numero:");
        int rta=0;
        int cont= 0;
        do {
        try{
            rta= sc.nextInt();
            cont++;
            if(rta<numAdivinar){
                System.out.println("ES MAYOR. Intenta de nuevo");
            }
            else if( rta>numAdivinar){
                System.out.println("ES MENOR. Intenta de nuevo");
            }
            else {
                System.out.println("Felicidades adivinaste el numero en el intento: "+ cont);
            }
        }catch (Exception e){
            System.out.println("error al ingresar el dato");
//            System.out.println(e.getMessage());
            cont++;
            sc.next();
            
        }
        } while (rta!=numAdivinar);
            
        }
    }


