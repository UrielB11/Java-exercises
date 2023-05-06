/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta".
Luego, crea métodos para agregar nuevas recetas a la lista,
para buscar una receta por nombre y para obtener la lista de recetas
que se pueden preparar con los ingredientes disponibles en la cocina.

 */
package ENTIDAD;

import java.util.ArrayList;
import java.util.Scanner;
import ENTIDAD.Receta2;

public class Cocina2 {

    public ArrayList<String> ingredientes;
    public ArrayList<Receta2> recetas;

    public Cocina2() {
        this.ingredientes = new ArrayList<String>();
        this.recetas = new ArrayList<Receta2>();
    }

    public Cocina2(ArrayList<String> ingredientes, ArrayList<Receta2> recetas) {
        this.ingredientes = ingredientes;
        this.recetas = recetas;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<Receta2> getRecetas() {
        return recetas;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setRecetas(ArrayList<Receta2> recetas) {
        this.recetas = recetas;
    }

    Scanner sc = new Scanner(System.in);

    public void agregarIngredientes() {
        String ingrediente;
        do {

            System.out.println("ingrese los ingredientes que dispone en la cocina: (ingrese 'x' para salir)");
            ingrediente = sc.next();
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

    public void agregarRecetas(Receta2 receta) {
        this.recetas.add(receta);
    }

    public void buscarReceta() {
        System.out.println("Buscar una receta - Ingrese el nombre: ");
        String nombreReceta = sc.nextLine();
        for (Receta2 element : recetas) {
            if (element.getNombre().equals(nombreReceta)) {
                element.mostrarReceta();
            }

        }

    }
    
    public void queRecetas(){
        ArrayList<String> recetasSi= new ArrayList<String>();
        for (Receta2 receta:recetas) {
//            for (int i = 0; i < ingredientes.size(); i++) {
            if(ingredientes.containsAll(receta.ingredientes) ){
                recetasSi.add(receta.nombre);
                
            }
//            }
        }
        for (int i = 0; i < recetasSi.size(); i++) {
            
                System.out.println(recetasSi.get(i));
        }
    }
}
