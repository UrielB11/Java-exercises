/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Electrodomestico;
import entities.Lavadora;
import java.util.ArrayList;

/**
 *
 * @author lomba
 */

/*
Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
*/
public class ElecService {

    
    public ElecService() {
       
    }
    
    public Electrodomestico crearElectrodomestico(){
       Electrodomestico e =new Electrodomestico();
       
       //Agregar cosas de interaccion
       Float peso=50f;
       e.setPeso(peso);
       e.setColor(comprobarColor("violeta"));
       String consumo = comprobarConsumoEnergetico("t");
       e.setConsumo(consumo);
       
       e.setPrecio(precioFinal(consumo,peso));
       
       
        return e;
    }
    
    public String comprobarColor(String color){
       
        if (!color.equalsIgnoreCase("blanco")   && 
            !color.equalsIgnoreCase("rojo"  )   && 
            !color.equalsIgnoreCase("gris"  )   && 
            !color.equalsIgnoreCase("azul"  )   &&
            !color.equalsIgnoreCase("gris"  )   && 
            !color.equalsIgnoreCase("negro" )     ){
            color="blanco";
        }
        
        return color;
    }
    
    public String comprobarConsumoEnergetico(String c){
         if (!c.equalsIgnoreCase("a")   && 
            !c.equalsIgnoreCase("b"  )   && 
            !c.equalsIgnoreCase("c"  )   && 
            !c.equalsIgnoreCase("d"  )   &&
            !c.equalsIgnoreCase("e"  )   && 
            !c.equalsIgnoreCase("f" )     ){
            c="f";
        }
        
        return c;
    }
    
    public Float precioFinal( String consumo, Float peso){
        Float precio=1000f;
        
        switch (consumo){
            case "a":
                precio+=1000f;
                break;
            case "b":
                precio+=800f;
                break;
            case "c":
                precio+=600f;
                break;
            case "d":
                precio+=500f;
                break;
            case "e":
                precio+=300f;
                break;
            case "f":
                precio+=100f;
                break;
            default:
                System.out.println("Algo salio mal con el consumo");
        }
        
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        }else if (peso >= 20 && peso <= 49) {
            precio += 500;
            } else if (peso >= 50 && peso <= 79) {
                     precio += 800;
                } else if (peso > 80) {
                    precio += 1000;
        }
        
        return precio;
    }
    

    
}
