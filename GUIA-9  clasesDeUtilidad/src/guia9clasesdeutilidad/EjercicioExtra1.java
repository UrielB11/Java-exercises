/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas.
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. 
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, 
pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package guia9clasesdeutilidad;

import Entidad.Java;
import java.util.Scanner;

// @author uriel
public class EjercicioExtra1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Java meses = new Java();

        System.out.println("Adivine el mes secreto (introduzca el nombre del mes en minusculas):");
        String mesAdivinar = sc.next().toLowerCase();
              while (!mesAdivinar.equals(meses.getMesSecreto())) { 
                System.out.println("No ha acertado. intente adivinarlo introduciendo otro mes:");
                mesAdivinar= sc.next().toLowerCase();
            };
            System.out.println("Adivinaste!!");
           }

}
