/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:


 */
package ejercicio1.animal;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

// @author uriel
public class Ejercicio1Animal {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Crocquetas", 10, "Chihuahua");
        Animal gato1 = new Gato("Peluza", "Galletas", 15, "Siames");
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");

        perro1.Alimentarse();
        perro2.Alimentarse();
        gato1.Alimentarse();
        caballo1.Alimentarse();

    }
}
