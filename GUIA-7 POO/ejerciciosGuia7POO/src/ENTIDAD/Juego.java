/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos 
y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número
o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class Juego {

    private int numSecreto;
    private int numAdivinar;
    public int intentos;

    public Juego() {
    }

    public Juego(int numSecreto, int numAdivinar, int intentos) {
        this.numSecreto = numSecreto;
        this.numAdivinar = numAdivinar;
        this.intentos = intentos;

    }

    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Jugador 1 elija un numero secreto:");
//        numSecreto = sc.nextInt();
        System.out.println("JUGADOR1 Defina el numero de intentos para el segundo jugador:");
        intentos = sc.nextInt();
        System.out.println("JUGADOR 2: adivine el numero. [intentos = " + intentos + "]");
        int inte=intentos;
        for (int i = 0; i < intentos; i++) {
            numAdivinar = sc.nextInt();
            inte--;
            if (numAdivinar < numSecreto && inte!=0) {
                System.out.println("Mas alto!  [intentos = " + inte + "]");
            } else if (numAdivinar > numSecreto && inte!=0) {
                System.out.println("Mas bajo!  [intentos = " + inte + "]");
            }
            else if(numAdivinar == numSecreto) {
                System.out.println("Felicidades JUGADOR 2! Acertaste al numero!!!");
                break;
            }
            else if (inte== 0) {
                System.out.println("Lo siento JUGADOR 2 se acabo el numero de intentos");
                break;
            }
        }

    }

}
