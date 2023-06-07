
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import java.util.Scanner;

public final class LavadoraServicio extends ElectrodomesticoServicio{
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

 
    public Lavadora crearLavadora() {
            Electrodomestico e= super.crearElectrodomestico();
        System.out.println("Ingrese la carga permitida de la lavadora:");
        double carga = sc.nextDouble();
        Lavadora l1=new Lavadora(carga, e.getColor(), e.getConsumo(), e.getPeso());
        precioFinal(l1);
        return l1;
    }

    
       
       
       
       
       
//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
    


  @Override
public void precioFinal(Electrodomestico e1) {
    super.precioFinal(e1);
    double precio = 0;
    if(e1 instanceof Lavadora){
        if (((Lavadora)e1).getCarga() > 30) {
            precio += 500;
            ((Lavadora)e1).setPrecio(e1.getPrecio()+precio);
        }
    }
}
}

