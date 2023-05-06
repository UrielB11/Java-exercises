/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).


 */
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class Circunferencia {

    Scanner sc = new Scanner(System.in);
    private double radio;
    private double area;
    private double perimetro;
    private double circunf;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
      
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese radio");
        Double rad;
        rad = sc.nextDouble();
        this.radio = rad;
        double cir=radio*Math.PI ;
        this.circunf =cir ;

    }

    public void area() {
        //(Area=〖π*radio〗^2)
        double aR=Math.pow(Math.PI*radio,2);
        this.area=aR;
    }
    
    public void perimetro(){
        //(Perimetro=2*π*radio)
        double per= 2*Math.PI*radio;
        this.perimetro =per;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + ", circunf=" + circunf + '}';
    }
    
}
