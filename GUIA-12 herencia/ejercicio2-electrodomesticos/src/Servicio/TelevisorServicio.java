/*
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Televisor;

public final class TelevisorServicio extends ElectrodomesticoServicio {

    public Televisor crearTelevisor(){
        
        Electrodomestico e= super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion: (en pulgadas)");
        int pulgadas=sc.nextInt();
        String rta;
        System.out.println("Tiene sintonizador? (s/n)");
        rta= sc.next();
        boolean sintonizador;
        while(!(rta.equalsIgnoreCase("s")||rta.equalsIgnoreCase("n"))){
            System.out.println("opcion no valida. ingrese nuevamente(s/n):");
        rta= sc.next();
        }
        if(rta.equalsIgnoreCase("s")){
         sintonizador= true; 
        }
        else {
                sintonizador= false;
                }
        Televisor t1= new Televisor(pulgadas, sintonizador,e.getColor(), e.getConsumo(), e.getPeso() );
        precioFinal(t1);
       return t1;
    }
    
    
//    • Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
    
    @Override
    public void precioFinal(Electrodomestico e1){
        super.precioFinal(e1);
        double precio=0;
if( e1 instanceof Televisor){
        if(((Televisor)e1).getPulgadas()>40){
            precio+= e1.getPrecio()*0.3;
        }
         if (((Televisor)e1).isTDT()){
            precio +=500;
        }
        ((Televisor)e1).setPrecio(e1.getPrecio()+precio);
        }
    }
}
