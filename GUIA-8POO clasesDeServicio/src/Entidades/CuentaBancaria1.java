package Entidades;

public class CuentaBancaria1 {

    //variables--------------------------------------------------------------
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    //constructores---------------------------------------------------
    public CuentaBancaria1() {
    }

    public CuentaBancaria1(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = 0;
    }

    //getters--------------------------------------------------------------
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    //setters-------------------------------------------------------------------
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    //------------------------------------------------------------------------

}
