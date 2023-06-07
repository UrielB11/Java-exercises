/*

 */
package Services;

import Entities.Barco;
import java.time.LocalDate;
import java.util.Scanner;

/**
author uriel
 */
public class BarcoServicio {
    
    public Barco cargarBarco(){
             Scanner sc = new Scanner(System.in).useDelimiter("\n");
             System.out.println("-----------------Cargar datos de embarcacion------------------");
             System.out.print("Matricula:");
             String matricula= sc.next();
             System.out.println("Eslora (mts):");
             float eslora= sc.nextFloat();
             System.out.println("Fecha de fabricacion (yyyy-mm-dd):");
             String fecha= sc.next();
             return new Barco(matricula, eslora, LocalDate.parse(fecha));
    }

}
