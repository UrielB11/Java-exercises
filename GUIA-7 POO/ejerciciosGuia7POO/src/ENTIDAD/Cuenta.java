/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class Cuenta {
    
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo ) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void retirar_dinero(){
    Scanner leer= new Scanner(System.in);
        String resp;
        double monto;
            do{
            System.out.println("Ingrese el monto que desea retirar");
            monto = Double.parseDouble(leer.nextLine());
            if(saldo > monto){
                this.saldo -= monto;
            }
            System.out.println("¿Desea realizar otra operación? si/no");
            resp = leer.next().toLowerCase();
        }while(saldo > 0 && resp.equals("si"));
            System.out.println("Saldo actual disponible:"+saldo);
    }
    
}
