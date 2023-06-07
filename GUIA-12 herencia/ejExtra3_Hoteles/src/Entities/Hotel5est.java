
package Entities;

/**
//• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
public final class Hotel5est extends Hotel4est{
    protected int salonesConferencia;
    protected int suites;
    protected int limosinas;

    public Hotel5est(int salonesConferencia, int suites, int limosinas, int cantidadPisos, GymClass gym, String nombreRestaurante, int capacidadRestaurante, int habitaciones, int camas, float precioHabitacion, String nombre, String localidad, String gerente) {
        super(cantidadPisos, gym, nombreRestaurante, capacidadRestaurante, habitaciones, camas, precioHabitacion, nombre, localidad, gerente);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }
    
           
    
    


    public int getSalonesConferencia() {
        return salonesConferencia;
    }

    public void setSalonesConferencia(int salonesConferencia) {
        this.salonesConferencia = salonesConferencia;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
    }

    @Override
    public String toString() {
        return "Hotel5est{" +super.toString()+ "salonesConferencia=" + salonesConferencia + ", suites=" + suites + ", limosinas=" + limosinas + '}';
    }
    
}
