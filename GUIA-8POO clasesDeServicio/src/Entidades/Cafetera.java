
package Entidades;

public class Cafetera {
    
   private double maxCap; 
   private double capActual; 

    public Cafetera() {
    }

    public Cafetera(double maxCap, double capActual) {
        this.maxCap = maxCap;
        this.capActual = capActual;
    }

    public double getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(double maxCap) {
        this.maxCap = maxCap;
    }

    public double getCapActual() {
        return capActual;
    }

    public void setCapActual(double capActual) {
        this.capActual = capActual;
    }
    
}
