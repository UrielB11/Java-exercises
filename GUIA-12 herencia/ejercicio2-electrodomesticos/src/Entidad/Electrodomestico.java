/*

 */
package Entidad;

import Servicio.ElectrodomesticoServicio;

/**
 *
 * @author uriel
 */
public class Electrodomestico {
//    Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
//Los constructores que se deben implementar son los siguientes:
//• Un constructor vacío.
//• Un constructor con todos los atributos pasados por parámetro.

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
 
    public Electrodomestico() {
    }
    ElectrodomesticoServicio es= new ElectrodomesticoServicio();

    public Electrodomestico( String color, char consumo, double peso) {
        this.precio = 1000;
        comprobarColor(color);
        this.consumo = comprobarConsumo(consumo);
        this.peso= peso;
        es.precioFinal(this);
    }
// Métodos getters y setters de todos los atributos.
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

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
        
//Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    public char comprobarConsumo(char letra) {
String str = Character.toString(letra);

str = str.toUpperCase();

letra = str.charAt(0);
        
        
        if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F') {
            this.consumo = 'F';
        } else {
            this.consumo = letra;
        }
        return consumo;
    }
//    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    
    public void comprobarColor(String color){
        if (!(color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris"))){
            this.color="Blanco";
        }
        else{
            this.color=color;
        }

    }

}
