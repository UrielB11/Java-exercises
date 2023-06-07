/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Electrodomestico;
import entities.Televisor;

/**
 *
 * @author lomba
 */

/*
Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
*/
public class TeleService extends ElecService{
    
    public Televisor crearTelevisor(){
       Electrodomestico e=super.crearElectrodomestico();
       
       int pulgadas=50;
       boolean tdt=false;
       e.setPrecio(precioFinal(e.getConsumo(),e.getPeso(),pulgadas,tdt));
       
       return new Televisor(pulgadas,tdt,e.getPrecio(),e.getPeso(),e.getConsumo(),e.getColor());
    }
    
    
    public Float precioFinal(String consumo, Float peso,int pulgadas, boolean tdt){
        Float precio=super.precioFinal(consumo, peso);
        
        if (tdt){
            precio+=500f;
        }
        
        if (pulgadas>39){
            precio+=precio*0.3f;
        }
        
        return precio;
        
        
    }
}
