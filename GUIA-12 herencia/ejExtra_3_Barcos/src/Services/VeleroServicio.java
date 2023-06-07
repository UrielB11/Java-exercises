

package Services;

import Entities.Barco;
import Entities.Velero;
import java.time.LocalDate;
import java.util.Scanner;


    
public class VeleroServicio extends BarcoServicio {

   
    public Velero cargarVelero() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-----------------Cargar datos de velero------------------");
        Barco b= super.cargarBarco();
        System.out.println("Cantidad de mástiles:");
        int mastiles = sc.nextInt();

        return new Velero(mastiles, b.getMatricula(), b.getEslora(), b.getFabricacion());
    }
}

