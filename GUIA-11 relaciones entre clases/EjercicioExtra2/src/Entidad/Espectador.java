/*
Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
package Entidad;

public class Espectador {
    
    private String nombre;
    private Integer edad;
    private Integer dinero;
    private Asciento asiento;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Integer dinero, Asciento asiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.asiento = asiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    public Asciento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asciento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + "\n, edad=" + edad + "\n dinero=" + dinero + "\n asiento=" + asiento + '}';
    }
    
}


   