
package ejercicio2.ruletadeagua;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

// @author uriel
public class Ejercicio2RuletaDeAgua {

    public static void main(String[] args) {
        Jugador j1 = new Jugador(1, "Juan");
        Jugador j2 = new Jugador(2, "Uriel");
        Jugador j3 = new Jugador(3, "Lucas");
        Jugador j4 = new Jugador(4, "Jorge");
        Jugador j5 = new Jugador(5, "Bot");
        Jugador j6 = new Jugador(6, "Bot");

        Revolver revol = new Revolver();

        revol.llenarRevolver(revol);

        Juego juego1 = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        jugadores.add(j4);
        jugadores.add(j5);
        jugadores.add(j6);
        
        System.out.println("Posicion Actual "+revol.getPosicionActual());
        System.out.println("Posicion Agua "+revol.getPosicionAgua());


        juego1.llenarJuego(jugadores, revol);

        
        juego1.ronda(jugadores, revol);

    }

}
