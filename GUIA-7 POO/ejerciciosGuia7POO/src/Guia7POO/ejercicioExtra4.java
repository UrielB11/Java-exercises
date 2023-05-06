package Guia7POO;

import entidad.Cocina;
import entidad.Receta;
import java.util.*;
public class ejercicioExtra4 {

	public static void main(String[] args) {
		
		Receta receta1 = new Receta("Ensalada con bife",120);
		Receta receta2 = new Receta("Risotto",30);
		Cocina cocina1 = new Cocina();
		receta1.agregarIngredientes("tomate");
		receta1.agregarIngredientes("lechuga");
		receta1.agregarIngredientes("bife");
		receta2.agregarIngredientes("arroz");
		receta2.agregarIngredientes("cebolla");
		receta2.agregarIngredientes("jamon");
		receta2.agregarIngredientes("curcuma");
		receta2.agregarIngredientes("pimiento");
		cocina1.agregarReceta(receta1);
		cocina1.agregarReceta(receta2);
		for(int i = 0;i < cocina1.getRecetas().size();i++) {
			System.out.println(cocina1.getRecetas().get(i).getNombre());
		}
		cocina1.cargarIngredientes();
		ArrayList<String> lista = new ArrayList<String>(); 
		lista = cocina1.crearReceta();
		for(int i = 0 ; i < lista.size() ;i ++) {
			System.out.println(lista.get(i));
		}
		
		
	}

}
