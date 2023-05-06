
package ejercicio1;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaService;


public class Ejercicio1 {


    public static void main(String[] args) {
        
        CuentaBancariaService cbs= new CuentaBancariaService();
        CuentaBancaria cuenta1= cbs.crearCuenta();
        cbs.retirar(cuenta1);
        cbs.ingresar(cuenta1);
        cbs.extraccionRapida(cuenta1);
        cbs.consultarDatos(cuenta1);
        cbs.consultarSaldo(cuenta1);
        
       }
    
}
