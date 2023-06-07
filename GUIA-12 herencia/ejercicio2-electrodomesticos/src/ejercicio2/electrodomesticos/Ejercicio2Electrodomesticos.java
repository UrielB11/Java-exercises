/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package ejercicio2.electrodomesticos;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ElectrodomesticoServicio;
import Servicio.LavadoraServicio;
import Servicio.TelevisorServicio;
import java.util.ArrayList;

// @author uriel
public class Ejercicio2Electrodomesticos {

    public static void main(String[] args) {
                ArrayList<Electrodomestico>electrodomStock= new ArrayList();
                 Electrodomestico e1= new Electrodomestico("GRIS", 'A',50);
                 Lavadora l2= new Lavadora(65,"negro",'f',45);
                 Televisor tv= new Televisor(64,true, "marron",'e',24);
                 Televisor tv1= new Televisor(84,true, "rojo",'e',24);

                
                electrodomStock.add(e1);
                electrodomStock.add(l2);
                electrodomStock.add(tv);
                electrodomStock.add(tv1);
                double precioTotal=0;
                        
                for (Electrodomestico electrodomestico : electrodomStock) {

                    if(electrodomestico instanceof Lavadora){
                        Lavadora Lv=(Lavadora)electrodomestico;
                        precioTotal+= Lv.getPrecio();
                        System.out.println(Lv);

                    }
                    else if(electrodomestico instanceof Televisor){
                        Televisor Tv= (Televisor)electrodomestico;
                        precioTotal+=Tv.getPrecio();
                            System.out.println(tv);
                    }
                    else{
                        precioTotal+=electrodomestico.getPrecio();
                        System.out.println(electrodomestico);
                    }
                     }
                
                
                System.out.println("El precio total de todos los electrodomesticos existentes es de: "+ precioTotal);

}
}



