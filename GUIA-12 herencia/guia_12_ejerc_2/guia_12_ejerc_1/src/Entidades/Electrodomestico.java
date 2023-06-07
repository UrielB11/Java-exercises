package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
    private Scanner leer = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra){
        
        char[] letras = {'A','B','C','D','E','F'};
        
        for (char m : letras) {
            if(letra == m){
                return letra;
            }
        }
        
        return 'F';
    };
    
    private String comprobarColor(String color){
        
        ArrayList<String> colores = new ArrayList<>();
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");
        
        for (String colore : colores) {
            
            if(color.equalsIgnoreCase(colore)){
                 return color;
            }
        }
        
        return "Blanco";
    };
    
    public void crearElectrodomestico(){
        
        this.precio = 1000d;
        System.out.println("Ingresa el color del electrodomestico");
        String color =  comprobarColor(leer.next());
        this.color = color;
        
        System.out.println("Ingresa la letra de consumo");
        char letra = comprobarConsumoEnergetico(leer.next().charAt(0));
        this.consumo = letra;
        
        System.out.println("Ingrea el peso");
        this.peso = leer.nextDouble();
        
        
    }
    
    public void precioFinal(){
        
        switch (this.consumo) {
            case 'A':
                this.precio += 1000d;
                break;
             case 'B':
                this.precio += 800d;
                break;
             case 'C':
                this.precio += 600d;
                break;
            case 'D':
                this.precio += 500d;
                break;
            case 'E':
                this.precio += 300d;
                break;
            case 'F':
                this.precio += 100d;
                break;
            default:
                System.out.println("Error");
        }
        
        if(this.peso >= 1 && this.peso <=19){ 
            this.precio += 100d; 
        }
        else if(this.peso >= 20 && this.peso <=49){
            this.precio += 500d;    
        }
        else if(this.peso >= 50  && this.peso <=79){
            this.precio += 800d;    
        }
        else if(this.peso >= 80){
            this.precio += 1000d;    
        }
        
    }
    
    
}
