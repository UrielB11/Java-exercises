package entidad;

import java.util.ArrayList;



public class Receta {
	private String nombre;
	private ArrayList<String> ingredientes;
	private int tiempoProceso;
	
	public Receta() {
		ingredientes = new ArrayList<String>();
		this.nombre = "";
		this.tiempoProceso = 0;
	}
	
	public Receta(String nombre,ArrayList<String> ingr,int tiempo) {
                                   ingredientes = new ArrayList<String>();
		this.ingredientes = ingr;
		this.nombre = nombre;
		this.tiempoProceso = tiempo;
	}
	
	public Receta(String nombre,int tiempo) {
		this.nombre = nombre;
		this.tiempoProceso = tiempo;
		ingredientes = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getTiempoProceso() {
		return tiempoProceso;
	}

	public void setTiempoProceso(int tiempoProceso) {
		this.tiempoProceso = tiempoProceso;
	}
	
	public void agregarIngredientes(String ingredientes) {
		this.ingredientes.add(ingredientes);
	}
	
//	public void agregarInformacion() {
//		
//	}
	
	
}
