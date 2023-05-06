package guia8poo;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;

public class ejercicio2 {

    public static void main(String[] args) {
        CafeteraServicio cs= new CafeteraServicio();
        Cafetera c1= new Cafetera();
        
        cs.llenarCafetera(c1);
        cs.mostrar(c1);
        cs.servirTaza(c1);
        cs.mostrar(c1);
        cs.vaciarCafetera(c1);
        cs.mostrar(c1);
        cs.agregarCafe(c1);
        cs.mostrar(c1);
//        System.out.println("Cantidad de cafe disponible: "+c1.getCapActual());
    }
    
}
