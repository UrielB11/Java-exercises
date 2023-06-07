package Entidades;

import java.util.Scanner;

public final class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean TDT;
    private Scanner leer = new Scanner(System.in);

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingresa la resolucion");
        this.resolucion = leer.nextInt();
        
        System.out.println("Tiene TDT? S/N");
        String aux = leer.next();
        this.TDT = aux.equalsIgnoreCase("s");
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        
        if(this.resolucion > 40){
            this.precio += this.precio * 0.3;
        }
        
        if(this.TDT){
            this.precio += 500d;
        }
    }

    @Override
    public String toString() {
        return "Televisor \n" + "resolucion: " + resolucion + "\nTDT: " + TDT + "\nPrecio: " + this.precio + "\nColor: " + this.color + "\nConsumo:  " + this.consumo + "\nPeso: " + this.peso ;
    }
    
    
    
    
    

}
