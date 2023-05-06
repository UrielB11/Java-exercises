/*
5.- Realizar un programa que permita gestionar jugadores de baloncesto con la siguiente
informacion:
e Nombre
e Edad
e NombreEquipo
e NumCanastasintroducidas
e Provincia
 */
package Entidades;
public class Jugador {
    private String nombre;
    private int edad;
    private String nombreEquipo;
    private int numCanastasIntroducidas;
    private String provincia;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String nombreEquipo, int numCanastasIntroducidas, String provincia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreEquipo = nombreEquipo;
        this.numCanastasIntroducidas = numCanastasIntroducidas;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getNumCanastasIntroducidas() {
        return numCanastasIntroducidas;
    }

    public void setNumCanastasIntroducidas(int numCanastasIntroducidas) {
        this.numCanastasIntroducidas = numCanastasIntroducidas;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincias) {
        this.provincia = provincias;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", nombreEquipo=" + nombreEquipo + ", numCanastasIntroducidas=" + numCanastasIntroducidas + ", provincia=" + provincia + '}';
    }
    
    
}
