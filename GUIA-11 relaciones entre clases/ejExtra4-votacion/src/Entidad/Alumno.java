/*
 Alumno con los siguientes atributos:

nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
 */
package Entidad;

public class Alumno {
    private String nombreCompleto;
    private long dni;
    private Integer votos;

    public Alumno() {
    }

    public Alumno(String nombre,long dni, Integer votos) {
        this.nombreCompleto = nombre;
        this.dni = dni;
        this.votos = votos;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombre) {
        this.nombreCompleto = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombreCompleto + ", dni=" + dni + ", votos=" + votos + '}';
    }
    
    
}
