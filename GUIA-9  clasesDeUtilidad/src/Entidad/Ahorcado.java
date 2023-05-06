/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar,
la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Ahorcado {
    private String[] palabraABuscar;
    private int cantidadLetrasEncontradas;
    private int jugadasMaximas;
    private String[] pantalla;
    private ArrayList<String> letrasIngresadas= new ArrayList<String>();

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int cantidadLetrasEncontradas, int jugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.pantalla=new String[palabraABuscar.length];
        Arrays.fill(pantalla,"_");
    }

    public ArrayList<String> getLetrasIngresadas() {
        return letrasIngresadas;
    }

    public void addLetrasIngresadas(String letrasIngresadas) {
        this.letrasIngresadas.add(letrasIngresadas);
    }

    public String[] getPantalla() {
        return pantalla;
    }

    public void setPantalla(String[] pantalla) {
        this.pantalla = pantalla;
    }
    public void setPantallaValue(int index, String letra){
        this.pantalla[index]=letra;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
    
}
