/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author lomba
 */
//SuperClase
public class Electrodomestico {
    //Atributos------------------------------
    protected Float precio,peso;
    protected String consumo,color;
    //Constructores-------------------------

    public Electrodomestico() {
    }
    
    public Electrodomestico(Float precio, Float peso, String consumo, String color) {
        this.precio = precio;
        this.peso = peso;
        this.consumo = consumo;
        this.color = color;
    }
    //Getters y Setters---------------------

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Metodos

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", consumo=" + consumo + ", color=" + color + '}';
    }
    
    
    
    
}
