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
public class Lavadora extends Electrodomestico {
    
    //ATRIBUTOS-----------------------------------------
    protected Float carga;
    
    //Constructores------------------------------------
    public Lavadora() {
    }

    public Lavadora(Float precio, Float peso, String consumo, String color,Float carga) {
        super(precio, peso, consumo, color);
        this.carga=carga;
    }
    //getters & setters-----------------------------------

    public Float getCarga() {
        return carga;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }

    //ToString----------------------------------------
    @Override
    public String toString() {
        return "Lavadora{"+ super.toString()+ ", "+carga;
    }
    
    
    
}
