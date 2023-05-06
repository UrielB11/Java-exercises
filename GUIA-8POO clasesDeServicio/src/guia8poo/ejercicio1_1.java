package guia8poo;
/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la
cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */


import Entidades.CuentaBancaria1;
import java.util.Scanner;
import Servicios.CuentaBancariaService;
public class ejercicio1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



        CuentaBancariaService cbs = new CuentaBancariaService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int choice;
        CuentaBancaria1 c1 = cbs.crearCuenta();
        
        do{
        showMenu();
        choice=leer.nextInt();
        while (choice <1|| choice>6){
            System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
            choice=leer.nextInt();
        }
        
        switch (choice){
            case 1: cbs.ingresar(c1);break;
            case 2: cbs.retirar(c1);break;
            case 3: cbs.extraccionRapida(c1);break;
            case 4: cbs.consultarSaldo(c1);break;
            case 5: cbs.consultarDatos(c1);break;
            case 6: System.out.println("Saliendo del sistema.");
            default : break;
        }
        
        } while (choice!=6);
        
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

