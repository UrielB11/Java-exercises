/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia10.colecciones;

import Entidades.Producto;
import Servicio.ProductoServicio;
import java.util.LinkedList;
import java.util.Scanner;

// @author uriel
public class ejercicio6 {
    
    public static void main(String[] args) {
        
        ProductoServicio ps = new ProductoServicio();
        LinkedList<Producto> listaTodosProductos = new LinkedList();
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-----------------Menu-----------------");
            System.out.println("1- INGRESAR UN PRODUCTO.");
            System.out.println("2-MODIFICAR PRECIO.");
            System.out.println("3- ELIMINAR PRODUCTO.");
            System.out.println("4- MOSTRAR PRODUCTOS.");
            System.out.println("5- SALIR");
            System.out.println("-----------------------------------------");
            do {
                System.out.print("Ingrese una opción:");
                opcion = sc.nextInt();
                
            } while (opcion > 5 || opcion < 1);
            switch (opcion) {
                case 1: String rta = "";
                            do {
                               ps.ingresarProductos();
                                do {
                                    System.out.println("Desea ingresar otro producto?(si/no)");
                                    rta = sc.nextLine();                            
                                } while (!rta.equalsIgnoreCase("si") && !rta.equalsIgnoreCase("no"));                        
                            } while (rta.equalsIgnoreCase("si")); break;
                case 2: ps.modificarPrecio(); break;
                case 3: ps.eliminarProducto(); break;
                case 4: ps.mostrarProductos(); break;
                case 5: break;
                default: System.out.println("Opcion no válida."); break;
            }
            
        } while (opcion > 0 && opcion <5 );
        
    }
}
