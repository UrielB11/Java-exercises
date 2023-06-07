
package Entities;

/**
Los alojamientos se identifican por un nombre, una dirección,
//una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
//alojamientos: Hoteles y Alojamientos Extrahoteleros.l
 */
public abstract class Alojamiento {
    protected String nombre;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }
    

    public Alojamiento(String nombre, String localidad, String gerente) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.gerente = gerente;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    
}
