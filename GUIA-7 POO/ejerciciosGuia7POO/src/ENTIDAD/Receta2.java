/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta".
Luego, crea métodos para agregar nuevas recetas a la lista,
para buscar una receta por nombre y para obtener la lista de recetas
que se pueden preparar con los ingredientes disponibles en la cocina.

 */
package ENTIDAD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class Receta2 {

    public String nombre;
    public ArrayList<String> ingredientes;
    public int tiempo;
    public String pasos;
    Scanner sc = new Scanner(System.in);

    public Receta2() {
        ingredientes = new ArrayList<String>();
    }

    public Receta2(String nombre, ArrayList<String> ingredientes, int tiempo, String pasos) {
        ingredientes = new ArrayList<String>();
        this.ingredientes = ingredientes;
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.pasos = pasos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String getPasos() {
        return pasos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setPasos(String pasos) {
        this.pasos = pasos;
    }

    public void agregarIngredientes() {
        String ingrediente;
        do {
            System.out.println("ingrese los ingredientes para la receta: (ingrese 'x' para salir)");
            ingrediente = sc.nextLine();
            if (!ingrediente.equals("x")) {
                ingredientes.add(ingrediente.toLowerCase());
            }
        } while (!ingrediente.equals("x"));

    }

    public void mostrarIngredientes() {
        for (String element : ingredientes) {
            System.out.println(element);

        }
    }

    public void mostrarReceta() {
        System.out.println("Receta2{" + "NOMBRE= " + nombre + "\nINGREDIENTES= " + ingredientes + "\n TIEMPO= " + tiempo + " Minutos \n PASOS= " + pasos + '}');
    }

}
