
package Entidad;


public class CuentaBancaria {
    private int numCta;
    private long  dni;
    private double  saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCta, long dni, double saldoActual) {
        this.numCta = numCta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumCta() {
        return numCta;
    }

    public void setNumCta(int numCta) {
        this.numCta = numCta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
