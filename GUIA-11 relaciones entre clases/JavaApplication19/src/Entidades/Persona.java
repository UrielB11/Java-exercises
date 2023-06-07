
package Entidades;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String Apellido;
    private int edad;
    private int documento;
    private ArrayList<Perro> perros= new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String Apellido, int edad, int documento) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", documento=" + documento + ", perros=" + perros + '}';
    }
    
    
    
}
