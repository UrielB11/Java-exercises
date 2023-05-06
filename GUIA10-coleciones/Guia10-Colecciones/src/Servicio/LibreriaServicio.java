/*
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método toString para mostrar los datos de los libros.
 */
package Servicio;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class LibreriaServicio {

    Scanner sc = new Scanner(System.in);

    public Libro cargarLibro() {
        System.out.println("Titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Num. de ejemplares:");
        int numEjemplares = sc.nextInt();
        sc.nextLine();
        System.out.println("Num de ejemplares prestados:");
        int numEjemPrestados = sc.nextInt();
        sc.nextLine();
        return new Libro(titulo, autor, numEjemplares, numEjemPrestados);
    }
//• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
//busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
//método. El método se incrementa de a uno, como un carrito de compras, el
//atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
//cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
//que no queden ejemplares disponibles para prestar. Devuelve true si se ha
//podido realizar la operación y false en caso contrario.

    public boolean prestamo(HashSet<Libro> biblioteca, String titulo) {
        boolean prestado = false;
        int cont=0;
        for (Libro libro : biblioteca) {
            cont++;
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.getNumEjemplares() > 0) {
                libro.setNumEjemPrestados(libro.getNumEjemPrestados() + 1);
                libro.setNumEjemplares(libro.getNumEjemplares() - 1);
                prestado = true;
                break;
            }
             if(cont== biblioteca.size()){
                System.out.println("El titulo del libro ingresado no esta disponible");
            }
        }
        return prestado;
    }
//• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
//lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
//El método decrementa de a uno, como un carrito de compras, el atributo
//ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
//vez que se produzca la devolución de un libro. No se podrán devolver libros
//donde que no tengan ejemplares prestados. Devuelve true si se ha podido
//realizar la operación y false en caso contrario.

    public boolean devolucion(HashSet<Libro> biblioteca, String titulo) {
        boolean devuelto = false;
        int cont=0;
        for (Libro libro : biblioteca) {
                cont++;
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.getNumEjemPrestados() > 0) {
                libro.setNumEjemPrestados(libro.getNumEjemPrestados() - 1);
                libro.setNumEjemplares(libro.getNumEjemplares() + 1);
                devuelto = true;
                break;
            }
            if(cont== biblioteca.size()){
                System.out.println("El titulo del libro ingresado no esta disponible");
            }
        }
        return devuelto;
    }
}
