/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:

Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */

package guia9clasesdeutilidad;

import Entidad.Persona;
import Servicio.PersonaServicio;


// @author uriel

public class Ejercicio5 {

    public static void main(String[] args) {
        PersonaServicio ps= new PersonaServicio();
        System.out.println("persona 1");
        Persona pers1= ps.crearPersona();
        System.out.println("persona 2");
        Persona pers2= ps.crearPersona();
        System.out.println("Edad persona 1");
        System.out.println(ps.calcularEdad(pers1));
        System.out.println("Edad persona 2");
        System.out.println(ps.calcularEdad(pers2));
        System.out.println("Persona 1 es menor que 18?:");
        System.out.println(ps.menorQue(pers1, 18));
        System.out.println("Persona 2 es menor que 25?:");
        System.out.println(ps.menorQue(pers2, 25));
        
        System.out.println("Mostrar Persona1:");
        
        ps.mostrarPersona(pers1);
        System.out.println("Mostrar Persona2:");

        ps.mostrarPersona(pers2);
        
    }

}
