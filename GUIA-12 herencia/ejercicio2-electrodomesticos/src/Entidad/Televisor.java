/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000

14


 */
package Entidad;

import Servicio.TelevisorServicio;

public class Televisor extends Electrodomestico{
    protected int pulgadas;
    protected boolean TDT;

    public Televisor() {
    }
    TelevisorServicio ts= new TelevisorServicio();
    public Televisor(int pulgadas, boolean TDT, String color, char consumo, double peso) {
        super(color, consumo, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
        ts.precioFinal(this);        
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    @Override
    public String toString() {
        return "Televisor:"  + "\nPrecio: " + this.precio + "\nColor: " + this.color + "\nConsumo:  " + this.consumo + "\nPeso: " + this.peso + "\n Resolucion: "+this.pulgadas+"'"+ "\nSintonizador: "+this.TDT;
    }
    
    
}
