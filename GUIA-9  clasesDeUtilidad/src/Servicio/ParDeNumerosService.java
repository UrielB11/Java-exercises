/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
 */
package Servicio;

import Entidad.ParDeNumeros;


public class ParDeNumerosService {
//Método mostrarValores que muestra cuáles son los dos números guardados.
   
    public void mostrarValores(ParDeNumeros p){
            System.out.println(p.getN1());
            System.out.println(p.getN2());
    }
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(ParDeNumeros p){
        return Math.max(p.getN1(),p.getN2());
    }

//Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
public void calcularPotencia(ParDeNumeros p){
        double n1= Math.round(p.getN1());
        double n2= Math.round(p.getN2());
        System.out.println(Math.pow(Math.max(n2,n1), Math.min(n2,n1)));
        
}
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public void calculaRaiz(ParDeNumeros p){
        double n1=Math.abs(p.getN1());
        double n2=Math.abs(p.getN2());
        System.out.println(Math.sqrt(Math.min(n2, n1)));
    }
}
