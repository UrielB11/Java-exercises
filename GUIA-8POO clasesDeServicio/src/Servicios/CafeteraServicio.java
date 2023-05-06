
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    private Scanner sc = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera c){
        System.out.println("Ingrese la cantidad de cafe");
        c.setCapActual(sc.nextDouble());
        c.setMaxCap(c.getCapActual());   
    }
    
    public void servirTaza(Cafetera c){
        System.out.println("Ingrese el tamaño de la taza");
        double tamaño = sc.nextDouble();
        if (c.getCapActual()<tamaño) {
           double tamaño1=c.getCapActual();
           double res= (tamaño1*100)/tamaño;
            System.out.println("la taza se lleno un "+res+"%");
        c.setCapActual(c.getCapActual()-tamaño1);
        }else{
           c.setCapActual(c.getCapActual()-tamaño);
            System.out.println("Se lleno la taza");
        }
    }
    
    public void vaciarCafetera(Cafetera c){
        c.setCapActual(0);
    }
    
    public void agregarCafe(Cafetera c){
        System.out.println("Ingrese la cantidad de cafe que desea agregar:");
        double cantidad= sc.nextDouble();
        double max= c.getMaxCap();
        if(c.getCapActual()+cantidad>max){
            System.out.println("Con esa cantidad se supera la capacidad maxima de almacenamiento");
            System.out.println("Se ingresaran "+(max-c.getCapActual()));
        }
        c.setCapActual(Math.min( max, (c.getCapActual()+cantidad)));
    }
    public void mostrar(Cafetera c){
        System.out.println("Cafe disponible: "+c.getCapActual());
        System.out.println("Maxima Capacidad: "+c.getMaxCap());
    }
}
