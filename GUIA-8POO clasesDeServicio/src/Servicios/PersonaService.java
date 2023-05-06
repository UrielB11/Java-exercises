
package Servicios;

import Entidades.Persona;


public class PersonaService {
    
    public Persona crearPersona(String nom, int edad, int dni){
        
        return new Persona(nom, edad, dni);
    }
    
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: "+ p.getNombre());
        System.out.println("Edad: "+ p.getEdad());
        System.out.println("DNI:"+ p.getDni());
    }
}
