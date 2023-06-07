/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejguia12electrodomestico;

import entities.Electrodomestico;
import entities.Lavadora;
import entities.Televisor;
import java.util.ArrayList;
import services.ElecService;
import services.LavaService;
import services.TeleService;


/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/

public class EjGuia12Electrodomestico {

    
    public static void main(String[] args) {
        ElecService es = new ElecService();
        LavaService ls = new LavaService();
        TeleService ts = new TeleService();
        ArrayList<Electrodomestico> electrodomesticos=new ArrayList();
        ArrayList<Lavadora> lavadoras=new ArrayList();
        ArrayList<Televisor> televisores=new ArrayList();
        
        
       electrodomesticos.add(ls.crearLavadora());
       electrodomesticos.add(ts.crearTelevisor());
       electrodomesticos.add(ls.crearLavadora());
       
       electrodomesticos.add(ts.crearTelevisor());
       electrodomesticos.add(ts.crearTelevisor());
       
        
       Float sumaTotal=0f;
       Float sumaLavadoras=0f;
       Float sumaTelevisores=0f;
       int iT=1,iL=1;
       
       for (Electrodomestico electrodomestico : electrodomesticos) {
            
            sumaTotal+=electrodomestico.getPrecio();
            
            if (electrodomestico instanceof Lavadora) {
                Lavadora object = (Lavadora) electrodomestico;
                lavadoras.add(object);
            }
             if (electrodomestico instanceof Televisor) {
                Televisor object = (Televisor) electrodomestico;
                televisores.add(object);
            }
        }
        
        System.out.println("Lista de televisores: ");
        for (Televisor televisor : televisores) {
            sumaTelevisores+=televisor.getPrecio();
                 System.out.println(iT+"- $"+televisor.getPrecio());
                 iT++;
        }
        
        System.out.println("\n\nLista de Lavadoras");
        for (Lavadora lavadora: lavadoras) {
            sumaLavadoras+=lavadora.getPrecio();
                System.out.println(iL+"- $"+lavadora.getPrecio());
                iL++;

        }
        
        System.out.println("\nSumaTotal= "+sumaTotal);
        System.out.println("SumaLavadoras= "+sumaLavadoras);
        System.out.println("SumaTelevisores= "+sumaTelevisores);
    }
}


 