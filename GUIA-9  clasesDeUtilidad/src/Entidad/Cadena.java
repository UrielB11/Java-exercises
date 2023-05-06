/*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud. 
Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo 
debe setear la longitud de la frase de manera automática. 
 */
package Entidad;


public class Cadena {
    
    public String cadena;
    public int longitud;

    public Cadena() {
    }

    public Cadena(String cadena) {
        this.cadena = cadena;
        setLongitud(cadena.length());
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
}
