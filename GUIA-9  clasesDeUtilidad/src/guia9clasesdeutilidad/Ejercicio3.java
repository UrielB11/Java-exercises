/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */

package guia9clasesdeutilidad;

// @author uriel

import Servicio.ArregloService;


public class Ejercicio3 {

    public static void main(String[] args) {
        
        double[] arr1= new double[50];
        double[] arr2= new double[20];
        
        ArregloService arrS= new ArregloService();
        
        arrS.InicializarA(arr1);
        arrS.ordenar(arr1);
        arrS.inicializarB(arr1, arr2);
        System.out.println(arrS.mostrar(arr1));
        System.out.println(arrS.mostrar(arr2));
        
        int n= (int) (Math.random() * 2);
        if (n==0) {
            System.out.println("AUN NO");
        }
        else { System.out.println("ES HORA");
    }
    }
}
