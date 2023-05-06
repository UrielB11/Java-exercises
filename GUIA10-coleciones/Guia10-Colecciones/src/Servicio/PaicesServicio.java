/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class PaicesServicio {
    private  HashSet<String> paices= new HashSet();
    Scanner sc = new Scanner(System.in); 
    
    public void cargarPaices(){
         String rta="";
        do {
        System.out.println("Ingrese el pais:");
        String pais= sc.nextLine();
        paices.add(pais);
        do {
        System.out.println("Desea cargar otro pais? (si/no)");
         rta= sc.nextLine();
            
        } while (!(rta.equalsIgnoreCase("no"))&&!(rta.equalsIgnoreCase("si")));
            
        } while (rta.equals("si"));
        
        
    }
    public void ordenarAlfabeticamente(){
        ArrayList<String> aux=new ArrayList(paices);
        Collections.sort(aux);
        paices= new HashSet<String>(aux);
        
    }
    
    public void mostrarPaices(){
        paices.forEach(p-> {System.out.println(p);});
    }
    
    public void eliminarPais(){
        System.out.println("Ingrese el pais a eliminar: ");
        String paisEliminar= sc.nextLine();
        for (String pais : paices) {
            if (pais.equalsIgnoreCase(paisEliminar)){
               paices.remove(pais);
            }
        }
    }
}
