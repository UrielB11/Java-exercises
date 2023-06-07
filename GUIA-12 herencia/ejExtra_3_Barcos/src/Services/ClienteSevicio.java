/*

 */
package Services;

import Entities.Barco;
import Entities.Cliente;
import Entities.Velero;
import java.util.Scanner;

public class ClienteSevicio {
     protected BarcoServicio  bs= new BarcoServicio();
     protected VeleroServicio  vs= new VeleroServicio();
  public Cliente cargarCliente(){
      Scanner sc = new Scanner(System.in).useDelimiter("\n");
      System.out.println("------------Ingrese los datos del cliente-------------");
      System.out.print("Nombre:");
      String nombre= sc.next();
      System.out.print("Dni:");
      int dni= sc.nextInt();
      Cliente c= new Cliente(nombre, dni, null);
      System.out.println("-----------Tipo de embarcacion:-----------");
      System.out.println("1- Barco");
      System.out.println("2- Velero");
      System.out.println("Ingrese  una opción:");
      int op=sc.nextInt();
      switch (op) {
          case 1: Barco b= bs.cargarBarco();
                c.setEmbarcacion(b);
              break;
          case 2:  Velero v = vs.cargarVelero();
                c.setEmbarcacion(v);
              break;
              
      }
      
    return c;
      }   
}
