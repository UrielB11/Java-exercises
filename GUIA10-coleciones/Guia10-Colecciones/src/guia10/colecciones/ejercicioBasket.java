/*
5.- Realizar un programa que permita gestionar jugadores de baloncesto con la siguiente
informacion:
e Nombre
e Edad
e NombreEquipo
e NumCanastasintroducidas
e Provincia
Funciones:
e Introducir datos (usaremos una estructura tipo List).
e Consulta de los datos de todos los jugadores a partir del nombre
e Consulta de jugador por provincia
e Modificacién de las canastas introducidas por un jugador.
 */
package guia10.colecciones;

import Servicio.JugadorServicio;
import java.util.Scanner;

// @author uriel
public class ejercicioBasket {

    public static void main(String[] args) {

        JugadorServicio js = new JugadorServicio();
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        do {
            menu();
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1": js.intoducirDatos(); break;
                case "2": js.consultByNombre();  break;
                case "3": js.consultByProvincia(); break;
                case "4": js.showJugadores(); break;
                case "5": js.showOrderedByProvincia(); break;
                case "6": break;
                default: System.out.println("ingrese una opción válida: "); break;
            }
        } while (!(opcion.equalsIgnoreCase("6")));

    }

    public static void menu() {
        System.out.println("---------------MENU---------------");
        System.out.println("1- Cargar datos");
        System.out.println("2- Consulta de datos por nombre de jugador");
        System.out.println("3- Consulta de datos por provincia");
        System.out.println("4- Mostrar todos los jugadores");
        System.out.println("5- Mostrar jugadores ordenados por provincia");
        System.out.println("6- Salir");
    }
}
