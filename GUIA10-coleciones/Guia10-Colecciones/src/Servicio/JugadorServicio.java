/*
Funciones:
e Introducir datos (usaremos una estructura tipo List).
e Consulta de los datos de todos los jugadores a partir del nombre
e Consulta de jugador por provincia
e Modificación de las canastas introducidas por un jugador.
 */
package Servicio;

import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class JugadorServicio {
    private ArrayList<Jugador> jugadores= new ArrayList();
    private Scanner sc = new Scanner(System.in);
    public void intoducirDatos(){
        System.out.println("---------------Introduzca información---------------");
        System.out.print("Nombre: ");
        String nombre= sc.nextLine();
        System.out.print("Edad; ");
        int edad= Integer.parseInt(sc.nextLine());
        System.out.print("Nombre del equipo: ");
        String nombreEquipo= sc.nextLine();
        System.out.print("Numero de canastas introducidas: ");
        int numCanastasIntroducidas= Integer.parseInt(sc.nextLine());
        System.out.print("Provincia: ");
        String provicia= sc.nextLine();
        
        jugadores.add(new Jugador(nombre, edad, nombreEquipo, numCanastasIntroducidas, provicia));
    }
    
    public void showJugadores(){
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }
    public void consultByNombre(){
        System.out.println("---------------Consulta por nombre--------------- ");
        System.out.print("Nombre: ");
        String nombre= sc.nextLine();
        Iterator<Jugador> it= jugadores.iterator();
        while (it.hasNext()) {
            Jugador jugador = it.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(jugador);
            }
        }
    }
    public void consultByProvincia(){
        System.out.print("---------------Consulta por provincia--------------- ");
        System.out.print("Provincia: ");
        String provincia= sc.nextLine();
        Iterator<Jugador> it= jugadores.iterator();
        while (it.hasNext()) {
            Jugador jugador = it.next();
            if (jugador.getProvincia().equalsIgnoreCase(provincia)) {
                System.out.println(jugador);
            }
        }
    }
    
    public void showOrderedByProvincia(){
        TreeSet<String> provincias= new TreeSet();
        jugadores.forEach(j-> provincias.add(j.getProvincia()));
        System.out.println("---------------Jugadores ordenados por provincia---------------");
        for (String provincia : provincias) {
            System.out.println("---------------"+provincia+"---------------");
            for (Jugador jugador : jugadores) {
                if (jugador.getProvincia().equals(provincia)){
                    System.out.println(jugador);
                }
            }
        }
        
    }
    
   public void modifyCanastaByNombre(){
       System.out.println("---------------Modificar numero de canastas introducidas---------------");
       System.out.print("Nombre:");
       String nombre= sc.nextLine();
       for (Jugador jugador : jugadores) {
           if (jugador.getNombre().equalsIgnoreCase(nombre)) {
               System.out.print("Nueva cantidad de canastas:");
               jugador.setNumCanastasIntroducidas(Integer.parseInt(sc.nextLine()));
           }
       }
   }
}
