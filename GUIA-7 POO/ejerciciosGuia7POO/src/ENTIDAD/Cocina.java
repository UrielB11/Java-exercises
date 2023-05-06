package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Cocina {
	private ArrayList<Receta> recetas;
	private ArrayList<String> ingredientes;
	
	public Cocina() {
		recetas = new ArrayList<Receta>();
		ingredientes = new ArrayList<String>();
	}

	public ArrayList<Receta> getRecetas() {
		return recetas;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}
	
	public void agregarReceta(Receta receta) {
		recetas.add(receta);
	}
	
	public void cargarIngredientes() {
		Scanner scan = new Scanner(System.in);
		String ingrediente;
		
		do {
			System.out.println("Agregar ingrediente: (Ingrese 'x' para salir)");
			ingrediente = scan.next();
                                                    if( !ingrediente.equals("x"))
			this.ingredientes.add(ingrediente);
			
		} while (!ingrediente.equals("x"));
	}
	

	public ArrayList<String> crearReceta() {
		ArrayList<String> nombreRecetas = new ArrayList<String>();
		for (int i = 0; i < ingredientes.size() ; i++) {
			for (int j = 0 ; j < recetas.size(); j++) {
				
				for (int k = 0 ; k < recetas.get(j).getIngredientes().size(); k++) {
					if(ingredientes.get(i).contains(recetas.get(j).getIngredientes().get(k))) {
						
							nombreRecetas.add(recetas.get(j).getNombre());							
						}
					}
				}
			}
		return nombreRecetas;
		}
	
	
	
	
}
