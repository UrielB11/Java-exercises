
package Servicio;

import Entidad.Cadena;

//Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
public class CadenaServicio {

//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(Cadena c) {
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getCadena().charAt(i) == 'a' || c.getCadena().charAt(i) == 'e' || c.getCadena().charAt(i) == 'i' || c.getCadena().charAt(i) == 'o' || c.getCadena().charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena c) {
        String nvaCadena = "";
        for (int i = 0; i < c.getLongitud(); i++) {
            char letra = c.getCadena().charAt(c.getCadena().length() - 1 - i);
            nvaCadena += letra;
        }
        System.out.println(nvaCadena);
    }

//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(Cadena c, String letra) {
        int contador = 0;
        for (int i = 0; i < c.getCadena().length(); i++) {
            if (String.valueOf(c.cadena.charAt(i)).equals(letra)) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + ", se repitio " + contador + " veces.");
    }

//Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena c, String frase) {
        if (c.getCadena().length() > frase.length()) {
            System.out.println("La longitud de la frase ingresada por el usuario es MENOR que la frase del objeto");
        } else if (c.getCadena().length() < frase.length()) {
            System.out.println("La longitud de la frase ingresada por el usuario es MAYOR que la frase del objeto");
        } else {
            System.out.println("Las longitudes son IGUALES");
        }
    }

//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena c, String frase) {
        c.setCadena(c.getCadena().concat(frase));
        System.out.println(c.getCadena());
    }
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

    public void reemplazar(Cadena c, String letra) {
        c.setCadena(c.getCadena().replace("a", letra));
        System.out.println(c.getCadena());
    }
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

    public boolean contiene(Cadena c, String Letra) {
        return c.getCadena().contains(Letra);
    }
}
