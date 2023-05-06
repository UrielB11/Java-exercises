/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9clasesdeutilidad;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosService;


// @author uriel

public class Ejercicio2 {

    public static void main(String[] args) {
        
        ParDeNumeros par1= new ParDeNumeros();
        ParDeNumerosService pdns= new ParDeNumerosService();
        System.out.println("Mostrar valores:");
        pdns.mostrarValores(par1);
        System.out.println("Devolver mayor:");
        System.out.println(pdns.devolverMayor(par1));
        System.out.println("Potencia del mayor elevado al menor: "+pdns.devolverMayor(par1)+" elevado "+ Math.min(par1.getN1(),par1.getN2()));
        pdns.calcularPotencia(par1);
        System.out.println("Raiz cuadrada del menor ("+Math.min(par1.getN1(),par1.getN2())+")");
        pdns.calculaRaiz(par1);
    }

}
