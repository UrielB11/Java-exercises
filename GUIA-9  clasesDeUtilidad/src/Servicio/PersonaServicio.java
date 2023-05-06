/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:


 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona(){
        Scanner sc = new Scanner(System.in);
        Persona n1= new Persona();
        System.out.println("Ingrese su nombre:");
        String nombre= sc.next();
        n1.setNombre(nombre);
        System.out.println("Ingrese dia de su nacimiento");
        int dia= sc.nextInt();
        System.out.println("Ingrese mes de su nacimiento");
        int mes= sc.nextInt();
        System.out.println("Ingrese añode su nacimiento");
        int año= sc.nextInt();
        n1.setFechaNac(año,mes,dia);
        return n1;
    }
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.

    public int calcularEdad(Persona p){
    Date fechaActual= new Date();
    return fechaActual.getYear()-p.getFechaNac().getYear();
    }
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
public boolean menorQue(Persona p, int edad){
    return calcularEdad(p)<edad;        
    }

//Método mostrarPersona que muestra la información de la persona deseada.
public void mostrarPersona(Persona p){
    System.out.println("Nombre: " +p.getNombre());
    System.out.println("Edad: " + calcularEdad(p));
    System.out.println("Fecha de nacimiento: " + p.getFechaNac());
}
}

