/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver

 */
package Entidades;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores= new ArrayList();
    private Revolver revolver;

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + '}';
    }
    
    
    
//    Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        setJugadores(jugadores);
        setRevolver(revolver);
    }
    public void ronda(ArrayList<Jugador> jugadores, Revolver r){
        for (Jugador jugador : jugadores) {
            System.out.print(r.getPosicionActual() +" ");
            System.out.println(jugador.getNombre());
           jugador.disparo(r,jugador);
           if(jugador.isMojado()){
            System.out.println("El jugador "+jugador.getNombre()+ " recibió el disparo");
           break;}
    }
    }
}
