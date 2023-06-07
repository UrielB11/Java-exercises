/*
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
package Entidad;

import java.util.ArrayList;

public class Cine {
 private Pelicula pelicula;
 private Asciento sala[][]= new Asciento[8][6];
 private Double precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Asciento[][] getSala() {
        return sala;
    }

    public void setSala(Asciento[][] sala) {
        this.sala = sala;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precioEntrada=" + precioEntrada + '}';
    }

    
 
}
