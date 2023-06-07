/*

 */
package Entities;

public class Cliente {
    private String nombre;
    private int dni;
    private Barco embarcacion;

    public Cliente() {
    }

    public Cliente(String nombre, int dni, Barco embarcacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.embarcacion = embarcacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Barco getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Barco embarcacion) {
        this.embarcacion = embarcacion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", embarcacion=" + embarcacion + '}';
    }

     
}
