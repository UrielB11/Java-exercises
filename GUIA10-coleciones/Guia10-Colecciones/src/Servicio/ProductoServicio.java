/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class ProductoServicio {
    
    private HashMap<String, Float> listaProductos= new HashMap<String, Float>();
    Scanner sc = new Scanner(System.in);
    
    public void ingresarProductos(){
        System.out.println("-----------------Ingreso de productos---------------");
        System.out.print("Nombre de producto: ");
        String nombre= sc.nextLine();
        System.out.print("Precio: ");
        float precio= Float.parseFloat(sc.nextLine());
        Producto p= new Producto(nombre, precio);
        listaProductos.put(p.getNombre(), p.getPrecio());
        
    }
        public void modificarPrecio(){
            System.out.println("---------------Modificar precio----------------");
            System.out.println("Ingrese el nomre del producto a modificar");
            String nombre= sc.nextLine();
            System.out.print("Nuevo precio: ");
            float precio=sc.nextFloat();
            int cont=0;
            for (Map.Entry<String, Float> producto : listaProductos.entrySet()) {
                if (producto.getKey().equalsIgnoreCase(nombre)) {
                    producto.setValue(precio);
                    cont++;
                }
            }
            if (cont==0) {
                System.out.println("No se enontro el producto ingresado.");
            }
        }
        
        public void eliminarProducto(){
            System.out.println("-------------Eliminar producto---------------");
            System.out.println("Ingrese el nombre del producto que desea eliminar:");
            String nombre= sc.nextLine();
            int cont=0;
            for (Map.Entry<String, Float> producto : listaProductos.entrySet()) {
                if (producto.getKey().equalsIgnoreCase(nombre)) {
                    listaProductos.remove(nombre);
                    cont++;
                }
            }
                if(cont==0) {
                    System.out.println("No se encontro el producto ingresado.");
                }
        }
        public void mostrarProductos(){
            for (Map.Entry<String, Float> entry : listaProductos.entrySet()) {
                String key = entry.getKey();
                Float value = entry.getValue();
                System.out.println("Producto: "+key+" - Precio: "+ value);
                
            }
        }
}
