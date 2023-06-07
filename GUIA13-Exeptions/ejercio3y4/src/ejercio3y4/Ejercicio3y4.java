
package ejercio3y4;
// @author User
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio3y4{
//Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//utilizando bloques try/catch para las distintas excepciones
    public static void main(String[] args) {
        divisionNumero();
    }

    public static void divisionNumero() {
        Scanner leer = new Scanner(System.in);
        
        String num1, num2;
        System.out.println("Ingrese un numero");
        num1 = leer.next();
        System.out.println("Ingrese otro numero");
        num2 = leer.next();


        try {
            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            int divisionRdo = int1 / int2;
            System.out.println(divisionRdo);
        } catch (ArithmeticException e) {
            System.out.println("Division por 0");
        } 
        catch( NumberFormatException e){
            System.out.println("La cadena no pudo convertirse a entero");
        }
        try{
            int num= leer.nextInt();
        }catch(InputMismatchException a){
            System.out.println("error al ingresar los datos");
        }
        
    }

}