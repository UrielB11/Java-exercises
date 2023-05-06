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
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class Operacion {

    private double n1;
    private double n2;

        Scanner sc= new Scanner(System.in);
    public  void crearOperacion() {
        System.out.println("Intese  el primer numero");
        double num1=sc.nextDouble();
        System.out.println("Intese  el segundo numero");
        double num2= sc.nextDouble();
        this.n1 = num1;
        this.n2 = num2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

   public double sumar() {
       
        return n1 + n2;
    }

    public double restar() {
        return n1 - n2;
    }

    public double multiplicar() {
        return n1 * n2;
    }

    public double dividir() {
        if (n2 == 0) {
            return 0;
        } else {
            return n1 / n2;
        }

    }

}
