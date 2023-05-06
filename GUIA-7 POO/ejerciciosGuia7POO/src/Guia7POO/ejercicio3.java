/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.

Método sumar(): calcular la suma de los números y devolver el resultado al main.

Método restar(): calcular la resta de los números y devolver el resultado al main

Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main

Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero,
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no,
se hace la división y se devuelve el resultado al main

 */
package Guia7POO;

import ENTIDAD.Operacion;
import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Operacion oP1= new Operacion();
        oP1.crearOperacion();
        System.out.println("Que operacion desea realizar:");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        int option=sc.nextInt();
        switch(option){
            case 1:{
                oP1.sumar();
                break;
            }
            case 2:{
                oP1.restar();
                break;
            }
            case 3:{
                oP1.multiplicar();
                break;
            }
            case 4:{
                oP1.dividir();
                break;
            }
            default:{
                System.out.println("operaion no valida");
            }
        }
        double resultado= oP1.sumar();
        System.out.println(oP1.sumar());
    }
    
}
