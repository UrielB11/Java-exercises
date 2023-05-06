/*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
 */
package Servicio;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author uriel
 */
public class ArregloService {
//Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void InicializarA(double[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=Math.round((Math.random()*100)*100d)/100d;
        }
    }
//Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public String mostrar(double[] array){
       return Arrays.toString(array);
    }
//Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(double[] array){
        Arrays.sort( array);
        double[] nArray= new double[array.length];
        for (int i = 0; i < array.length; i++) {
            nArray[i]=array[array.length-1-i];
            array[i]=nArray[i];
        }
    }
//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    
    public void inicializarB(double[] arrayA, double[] arrayB){
        System.arraycopy(arrayA, 0, arrayB, 0, 10);
        Arrays.fill(arrayB, 10, 20, 0.5);
    }
}
