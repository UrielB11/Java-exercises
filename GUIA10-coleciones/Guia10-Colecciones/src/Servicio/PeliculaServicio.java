/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
 */
package Servicio;

import Entidades.Pelicula;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaServicio {
    
    private ArrayList<Pelicula> peliculas= new ArrayList();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarPeliculas(){
        String rta="";
        do {
        System.out.println("Ingrese los datos de la pelicula: ");
        System.out.print("Titulo: ");
        String titulo= sc.next();
        System.out.print("Director: ");
        String director= sc.next();
        System.out.print("Horas: ");
        int horas= Integer.parseInt(sc.next());
        System.out.print("Minutos: ");
        int minutos=Integer.parseInt(sc.next());
        System.out.print("Segundos: ");
        int segundos= Integer.parseInt(sc.next());
        peliculas.add(new Pelicula(titulo, director, LocalTime.of(horas, minutos, segundos)));       
System.out.println("Desea Seguir Ingresando Datos S/N");
            rta = sc.next();
            while (!rta.equalsIgnoreCase("S") && !rta.equalsIgnoreCase("N")) {
                System.out.println("Seleccione la Opcion Correctamente S/N");
                rta = sc.next();
            }    
        } while (rta.equals("s"));
    }
//• Mostrar en pantalla todas las películas.
    public void mostrarPeliculas(){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora
   public void mostrarPelisMayorHora(){
       for (Pelicula pelicula : peliculas) {
           if (pelicula.getDuracion().getHour()>=1) {
               System.out.println(pelicula);
           }
       }
   }
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla
public void ordenarPeliculasDeMayorAMenor() {
        peliculas.sort(Pelicula.compararDuracionMayor);
        for (Pelicula pelicula : this.peliculas) {
            System.out.println(pelicula);
        }
    }     
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
public void ordenarPeliculasDeMenorAMayor() {
        peliculas.sort(Pelicula.compararDuracionMenor);
        for (Pelicula pelicula : this.peliculas) {
            System.out.println(pelicula);
        }
    }
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
   public void ordenarPorTitulo(){
       Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        peliculas.forEach(System.out::println);
   }    
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
   public void ordenarPorDirector(){
       Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });
        peliculas.forEach(System.out::println);
}
}