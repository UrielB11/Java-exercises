/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor
con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
*/
package ENTIDAD;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
       
    }
    
    public static Libro leerDatos(){
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese ISBN");
        int ISBN=leer.nextInt();
        System.out.println("ingrese titulo");
        String titulo=leer.next();
        System.out.println("ingrese autor");
        String autor=leer.next();
        System.out.println("ingrese numero de paginas");
        int numPag=leer.nextInt();
        return new Libro(ISBN, titulo, autor, numPag);
    }
    
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + "\n, titulo=" + titulo + "\n, autor=" + autor + "\n, numPag=" + numPag + '}';
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    
}