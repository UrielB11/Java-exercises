/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. 
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:

 */
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class Puntos {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    Scanner sc= new Scanner(System.in);
    public void crearPuntos(){
        System.out.println("Ingrese el punto x1:");
        x1= sc.nextInt();
        System.out.println("Ingrese el punto y1:");
        y1= sc.nextInt();
        System.out.println("Ingrese el punto x2:");
        x2= sc.nextInt();
        System.out.println("Ingrese el punto y2:");
        y2= sc.nextInt();
    }
    public String calcularDistancia(){
        return "la distancia de las dos coordenadas ingresadas es= "+ Math.round((Math.sqrt(Math.pow(x1-y1, 2) + Math.pow(x2-y2, 2))*1000.0))/1000.0;
    }
        
}
