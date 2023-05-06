
package guia8poo;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;


public class ejercicio1 {

 
    public static void main(String[] args) {
        CuentaBancariaServicio scb=new CuentaBancariaServicio();
        
            CuentaBancaria cuenta1=scb.crearCuenta();
            scb.ingresar(cuenta1);
            scb.retirar(cuenta1);
           scb.extraccionRapida(cuenta1);
           scb.consultarDatos(cuenta1);
           scb.consultarSaldo(cuenta1);
                    
                Scanner sc = new Scanner(System.in);
                int op;
                do {
                    showMenu();
                    op=sc.nextInt();
                    switch (op) {
                        case 1:{
                            scb.ingresar(cuenta1);
                            break;
                        }
                        case 2:{
                            scb.ingresar(cuenta1);
                            break;
                        }
                        case 3:{
                            scb.extraccionRapida(cuenta1);
                            break;
                        }
                        case 4:{
                            scb.consultarDatos(cuenta1);
                            break;
                        }
                        case 5:{
                            scb.consultarSaldo(cuenta1);
                            break;
                        }
                        case 6:{
                            System.out.println("Saliendo del sistema");
                            break;
                        }
                        default:
                            System.out.println("Opcion ingressada no valida");
                            break;
                    }
            
        } while (op!=6);
        
    }
        public static void showMenu() {
        System.out.println("===============");
        System.out.println("     MENU      ");
        System.out.println("===============");
        System.out.println("");
        System.out.println("1-Depositar dinero");
        System.out.println("2-Retirar dinero");
        System.out.println("3-Extracción rápida");
        System.out.println("4-Consultar saldo");
        System.out.println("5-Consultar datos");
        System.out.println("6-Salir");
        System.out.println("");
        System.out.println("Ingrese un valor y luego presione la tecla enter.");
        
    }
}
