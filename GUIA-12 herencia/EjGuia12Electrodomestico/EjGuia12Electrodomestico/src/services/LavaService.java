/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Electrodomestico;
import entities.Lavadora;

/**
 *
 * @author lomba
 */
/*
Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
*/
public class LavaService extends ElecService {
   
    public Lavadora crearLavadora(){
        Electrodomestico e=super.crearElectrodomestico();
        
        Float carga=40f;
        
        e.setPrecio(precioFinal(e.getConsumo(),e.getPeso(),carga));
        
        return new Lavadora(e.getPrecio(),e.getPeso(),e.getConsumo(),e.getColor(),carga);
        
    }
    
    
    public Float precioFinal(String consumo, Float peso, Float carga){
        
        Float precio=super.precioFinal(consumo, peso);
        
        if (carga>30f){
            precio+=500f;
        }
        
        return precio;
    }
}
