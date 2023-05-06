/*
.Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package guia10.colecciones;

import Entidades.Libro;
import Servicio.LibreriaServicio;
import java.util.HashSet;
import java.util.Scanner;

public class ejercicioExtra3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> biblioteca = new HashSet();
        LibreriaServicio ls = new LibreriaServicio();

        int choice;
        do {
            System.out.println("===============");
            System.out.println("     MENU      ");
            System.out.println("===============");
            System.out.println("");
            System.out.println("1-Agregar libro");
            System.out.println("2-Mostrar lista de libros");
            System.out.println("3-Préstamo");
            System.out.println("4-Devolución");
            System.out.println("5-Salir");
            System.out.println("Ingrese un valor y luego presione la tecla enter.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String rta;
                    do {
                        biblioteca.add(ls.cargarLibro());
                        do {
                            System.out.println("Desea cargar otro libro? (si/no)");
                            rta = sc.next();
                        } while (!rta.equalsIgnoreCase("si") && !rta.equalsIgnoreCase("no"));

                    } while (rta.equalsIgnoreCase("si"));
                        break;
                case 2:
                    for ( Libro libro: biblioteca){
                        System.out.println(libro);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el titulo de libro que desea prestar:");
                     String titulo = sc.next();
                     if(ls.prestamo(biblioteca, titulo)){
                         System.out.println("Libro prestado exitosamente");
                     }
                     else{
                         System.out.println("No hay ejemplares disponibles.");
                     }
                    break;
                case 4:
                    System.out.println("Ingrese el titulo libro a devolver: ");
                    String titul = sc.next();
                    if(ls.devolucion(biblioteca, titul)){
                        System.out.println("Devuelto exitosamente");
                    }
                    else{
                        System.out.println("No se presto nungun ejemplar");
                    }
                        break;
                default:
                    System.out.println("Digito Invalido");

            }
        } while (choice != 5);
    }
}


