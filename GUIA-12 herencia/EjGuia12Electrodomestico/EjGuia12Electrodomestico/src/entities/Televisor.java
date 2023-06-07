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
/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
*/
public class Televisor extends Electrodomestico {
    //Atributos
    protected Integer pulgadas;
    protected boolean TDT;
    //Constructores

    public Televisor() {
    }


    public Televisor(Integer pulgadas, boolean TDT, Float precio, Float peso, String consumo, String color) {
        super(precio, peso, consumo, color);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }
    
    //getters & setters

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    //tostring

    @Override
    public String toString() {
        return "Televisor{" + super.toString()+ "pulgadas=" + pulgadas + ", TDT=" + TDT + '}';
    }
    
    
    
}
