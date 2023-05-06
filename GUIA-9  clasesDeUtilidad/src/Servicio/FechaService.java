/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:



 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
//Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    public Date fechaNacimiento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dia de su nacimiento");
        int dia= sc.nextInt();
        System.out.println("Ingrese mes de su nacimiento");
        int mes= sc.nextInt();
        System.out.println("Ingrese añode su nacimiento");
        int año= sc.nextInt();
        
        return new Date(año-1900,mes-1,dia);
    }
    
//Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
//El método debe retornar el objeto Date.
    
    public Date fechaActual(){
        return new Date();
    }
//Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    
    public int diferencia(Date d1, Date d2){
    return d1.getYear()-d2.getYear();
    }
}
