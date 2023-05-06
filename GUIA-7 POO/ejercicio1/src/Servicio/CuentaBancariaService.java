
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaService {
   
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        int nCta= (int)(Math.random()*1000000);
        System.out.println("Ingrese DNI:");
        long dni=sc.nextLong();
        System.out.println("Ingrese un monto:");
        double monto= sc.nextDouble();
        return new CuentaBancaria(nCta, dni, monto);
    }
    
    public void ingresar(CuentaBancaria cuenta){
        System.out.println("Cuanto dinero desea ingresar a la cuenta?");
        double monto=sc.nextDouble();
        double saldo=cuenta.getSaldoActual();
        cuenta.setSaldoActual(saldo+monto);
        
    }
    
    public void retirar(CuentaBancaria cuenta){
        System.out.println("Cuanto dinero desea retirar?");
        double monto= sc.nextDouble();
        double saldo= cuenta.getSaldoActual();
        if (monto>saldo) {
            monto= saldo;
            System.out.println("el monto que desea retirar supera el saldo actual. Se retirara todo el saldo disponible.");
    }
        cuenta.setSaldoActual(saldo-monto);
}
    
    public void extraccionRapida(CuentaBancaria cuenta){
           double saldo= cuenta.getSaldoActual();
           double porcentaje= saldo*.2;
           saldo-=porcentaje;
           cuenta.setSaldoActual(saldo);
           System.out.println("Se retiró el 20% de tu saldo actual ["+porcentaje+"]");
           
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Tu SALDO DISPONIBLE es de: ["+cuenta.getSaldoActual()+"]");
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("NUMERO DE CUENTA: "+ cuenta.getNumCta() );
        System.out.println("DNI: "+ cuenta.getDni() );
    }
}