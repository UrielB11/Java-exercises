/*
Las operaciones que podrá realizar la baraja son:



• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
 */
package Entidades;

import RelacionesEnum.Palo;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> baraja= new ArrayList();
    private ArrayList<Carta> monton= new ArrayList();

    public Baraja() {
        for (Palo aux : Palo.values()) {
            for (int i = 1; i < 13; i++) {
               if(i!=8&&i!=9){
                   Carta c1= new Carta(i, aux);
                   baraja.add(c1);
               }
            }
        }
    }
    
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }
//    • barajar(): cambia de posición todas las cartas aleatoriamente.
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
//    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//      se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta(){
        Carta c= baraja.get(0);
        baraja.remove(c);
        monton.add(c);
        return c;
    }
//    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    
    
    
}
