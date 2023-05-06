/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia10.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;


// @author uriel

public class Guia10Colecciones {

    public static void main(String[] args) {
        
        //Las COLECCIONES representa un grupo de objetos(elementos), no podemos crear una coleccion 
        //solo de tipo primitivo para eso usaremo lo tipos de objetos equivalentes a los primitivos.
        /*
                int -> Integer
                double -> Double
                long -> Long
                char -> Character
                boolean -> Boolean
                    String (ya es un objeto)
        
        Las colecciones crecen de manera dinamica a medida que se van agregando objetos
        */
        
        //ArrayList es un arreglo de tamaño variable
        ArrayList<String> lista1= new ArrayList();
        
        lista1.add("dato1");
        lista1.add("dato2");
        lista1.add("dato3");
        lista1.add("dato4");
        lista1.add("dato5");
        
        for (String datos : lista1) {
            System.out.println(datos);
           
            
        //LinkedList se implementa como una lista de DOBLE ENLACE, su rendimiento es mejor para add y remove, pero peor para set y get
        
        LinkedList<Integer> lista = new LinkedList();
            
            lista.add(1);
            lista.add(2);
            lista.add(3);
            lista.add(4);
            lista.add(5);
            
            lista.remove(4);
            
            
            
        }
        
    } 

}
