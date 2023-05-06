
package guia8poo;

import Entidades.Persona;
import Servicios.PersonaService;

public class ejercicioGuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps= new PersonaService();
        
        Persona p1= ps.crearPersona("Joaquin", 23, 44338594);
        ps.mostrarPersona(p1);
    }
    
}
