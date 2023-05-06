/*
Definir los siguientes métodos en AhorcadoService:
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, 
//como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector.
//Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

    public Ahorcado crearJuego() {

        System.out.println("JUGADOR1: Ingrese la palabra:");
        String palabra = sc.next();
        System.out.println("JUGADOR1: Ingrese la cantidad de intentos:");
        int intentos = sc.nextInt();
        String[] vector = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        return new Ahorcado(vector, 0, intentos);

    }
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.

    public void longitud(Ahorcado a) {
        System.out.println("Longitud de la palabra:" + a.getPalabraABuscar().length);
    }
//Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no.
//    También informará si la letra estaba o no.

    public int buscar(Ahorcado a, String letra) {

        int cont = 0;
        for (int i = 0; i < a.getPalabraABuscar().length; i++) {
            if (a.getPalabraABuscar()[i].equalsIgnoreCase(letra)) {
                cont++;
            }
      
        }

        if (cont > 0) {
            System.out.println("Mensaje: La letra PERTENECE a la palabra.");
        } else {
            System.out.println("Mensaje: La letra NO PERTENECE a la palabra.");
        }
//        a.setCantidadLetrasEncontradas(a.getCantidadLetrasEncontradas()+cont); 
        return cont;
    }

//Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. 
//Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
public boolean encontradas(Ahorcado a, String letra) {

    int cont = 0;
 
    for (int i = 0; i < a.getPalabraABuscar().length; i++) {
        if (a.getPantalla()[i].equalsIgnoreCase(letra)) {
            cont = 0;
            break;
        }
        if (a.getPalabraABuscar()[i].equalsIgnoreCase(letra)) {
            cont++;
            a.setPantallaValue(i, letra);
        }
    }

    a.setCantidadLetrasEncontradas(a.getCantidadLetrasEncontradas() + cont);
    int faltantes = a.getPalabraABuscar().length - a.getCantidadLetrasEncontradas();
    System.out.println("Numero de letras (Encontradas/Faltantes): (" + a.getCantidadLetrasEncontradas() + "/" + faltantes + ")");
    return cont > 0;
    }

//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void intentos(Ahorcado a, String letra) {
        int cont = 0;
        for (int i = 0; i < a.getPalabraABuscar().length; i++) {
            if (a.getPalabraABuscar()[i].equalsIgnoreCase(letra)) {
                cont++;

            }
        }
        int intentos = a.getJugadasMaximas();
        if (a.getLetrasIngresadas().contains(letra)) {
            intentos= intentos;
            System.out.println("Ya usaste esa letra bobo");
            
        }
        if (cont == 0&&!(a.getLetrasIngresadas().contains(letra))) {
            intentos--;
        }
            a.setJugadasMaximas(intentos);
        System.out.println("Número de oportunidades restantes: " + a.getJugadasMaximas());
    }
//Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra
//    toda la palabra o se quede sin intentos.

    public void juego() {
        Ahorcado a1 = crearJuego();
        do {
            System.out.println("JUGADOR 2: Ingrese la letra a buscar:");
            String letra = sc.next();
            longitud(a1);
            buscar(a1, letra);
            encontradas(a1, letra);
            intentos(a1, letra);
            a1.addLetrasIngresadas(letra);
            System.out.println(Arrays.toString(a1.getPantalla()));
            if (a1.getJugadasMaximas() == 0) {
                System.out.println("Lo siento JUGADOR 2, se te acabaron los intentos");
            } else if (a1.getCantidadLetrasEncontradas() == a1.getPalabraABuscar().length) {
                System.out.println("Felicidades JUGADOR 2, adivinaste la palabra!!");
            }
        } while (!(a1.getJugadasMaximas() == 0) && (a1.getCantidadLetrasEncontradas() < a1.getPalabraABuscar().length));

    }
}


