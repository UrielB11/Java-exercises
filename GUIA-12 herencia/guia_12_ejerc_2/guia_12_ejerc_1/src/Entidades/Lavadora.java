package Entidades;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {
    
    private int carga;
    private Scanner leer = new Scanner(System.in);

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Ingresa la carga");
        this.carga = leer.nextInt();
    }
    
    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(this.carga > 30d){
            this.precio += 500d;
        }
        
    }

    @Override
    public String toString() {
        return "Lavadora: \n"  + " Carga: " + carga + "\nPrecio: " + this.precio + "\nColor: " + this.color + "\nConsumo:  " + this.consumo + "\nPeso: " + this.peso;
    }
    
    
    

}
