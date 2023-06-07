/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */

package ejextra_3_barcos;

import Entities.Alquiler;
import Entities.Cliente;
import Entities.Velero;
import Services.AlquilerServicio;
import Services.ClienteSevicio;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


// @author uriel

public class EjExtra_3_Barcos {

    public static void main(String[] args) {

        ArrayList<Alquiler> listaAlquiler= new ArrayList();
        
        AlquilerServicio as= new AlquilerServicio();
        Alquiler a1= as.cargarAlquiler();
        
        listaAlquiler.add(a1);
        
        
        for (Alquiler alquiler : listaAlquiler) {
            System.out.println(alquiler.getClass().getCanonicalName()+" " +listaAlquiler.indexOf(alquiler)+"\n" +alquiler);

        }

    }

}
