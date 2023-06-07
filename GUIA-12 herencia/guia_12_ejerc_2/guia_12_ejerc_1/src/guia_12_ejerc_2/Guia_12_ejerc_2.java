package guia_12_ejerc_2;

import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.Scanner;


public class Guia_12_ejerc_2 {

    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        
        
        System.out.println("1- Ingresar lavadora \n"
                                  + "2- Ingresar televisor");
        
        int aux = lee.nextInt();
        
        switch (aux) {
            case 1:
                Lavadora lava = new Lavadora();
        
                System.out.println("Crea la lavadora gaston");
                lava.crearLavadora();
                lava.precioFinal();
                System.out.println(lava.toString());
                break;
            case 2: 
                Televisor tele = new Televisor();
                tele.crearTelevisor();
                tele.precioFinal();
                System.out.println(tele.toString());
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
        
        
    }

}
