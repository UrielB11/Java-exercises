/*
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:

 */

package guia10.colecciones;

import Servicio.PeliculaServicio;

public class ejercicio4 {

    public static void main(String[] args) {
        
        PeliculaServicio ps= new PeliculaServicio();
        
        ps.cargarPeliculas();
        System.out.println("-------------Mostrar todas las peliculas------------------");
        ps.mostrarPeliculas();
        System.out.println("-------------Mostrar peliculas mayor a una hora------------------");
        ps.mostrarPelisMayorHora();
        System.out.println("-------------Mostrar peliculas mayor a menor------------------");
        ps.ordenarPeliculasDeMayorAMenor();
        System.out.println("-------------Mostrar peliculas menor a mayor------------------");
        ps.ordenarPeliculasDeMenorAMayor();
        System.out.println("-------------Mostrar peliculas por director------------------");
        ps.ordenarPorDirector();
        System.out.println("-------------Mostrar peliculas por titulo------------------");
        ps.ordenarPorTitulo();
    }

}
