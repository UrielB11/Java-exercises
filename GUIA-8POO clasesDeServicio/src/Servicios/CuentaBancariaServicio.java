/*
//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//Método para crear cuenta pidiéndole los datos al usuario.
//Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class CuentaBancariaServicio {

    private Scanner sc = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Bienvenidos a nuestro Banco \n Registre sus datos para crear una cuenta:");
        System.out.println("Ingrese su DNI");
        long dni = sc.nextLong();
        int numCta = (int) (Math.random() * 1000000);
        double monto = 0;
        String op;
        do {
            System.out.println("¿Desea Ingresar un monto a su Cta? (si/no)");
            op = sc.next().toLowerCase();
            switch (op) {
                case "si": {
                    System.out.println("Ingrese el monto de desea depositar:");
                    monto += sc.nextDouble();
                    break;
                }
                case "no": {
                    break;
                }
                default: {
                    System.out.println("Opcion no valida. intente nuevamente");
                    break;
                }
            }
        } while (!op.equals("si") && !op.equals("no"));
 
        return new CuentaBancaria(numCta, dni, monto);
    }

    public void ingresar(CuentaBancaria cuenta) {
        System.out.println("ingrese el monto a ingresar:");
        double monto = sc.nextDouble();
        double saldo = cuenta.getSaldoActual();
        saldo += monto;
        cuenta.setSaldoActual(saldo);

    }

    public void retirar(CuentaBancaria cuenta) {
        System.out.println("Ingrese el monto a retirar");
        double monto = sc.nextDouble();
        double saldo = cuenta.getSaldoActual();
        if (monto > saldo) {
            monto = saldo;
            System.out.println("No posee saldo  suficiente para retirar ese monto \n Se retirara todo el saldo disponible ["+monto+"]");
        }
        saldo -= monto;
        cuenta.setSaldoActual(saldo);

    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        double monto= cuenta.getSaldoActual()*.2;
        double saldo= cuenta.getSaldoActual();
        saldo-=monto;
        cuenta.setSaldoActual(saldo);
        System.out.println("Acabas de retirar el 20% de tu Saldo ["+monto+"]");
        System.out.println("SALDO DISPONIBLE ["+cuenta.getSaldoActual()+"]");
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Tu SALDO ACCTUAL DISPONIBLE es de: ["+cuenta.getSaldoActual()+"]");
    }
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("N° de cuenta: "+ cuenta.getNumeroCuenta());
        System.out.println("DNI: "+cuenta.getDniCliente());
    }
}
