
package Entities;

/**
//• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
public class Hotel4est extends Hotel  {
    protected int cantidadPisos;
    protected GymClass gym;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4est(int cantidadPisos, GymClass gym, String nombreRestaurante,
            int capacidadRestaurante, int habitaciones, int camas, float precioHabitacion,
            String nombre, String localidad, String gerente) {
        super(habitaciones, camas, precioHabitacion, nombre, localidad, gerente);
        this.cantidadPisos = cantidadPisos;
        this.gym = gym;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public GymClass getGym() {
        return gym;
    }

    public void setGym(GymClass gym) {
        this.gym = gym;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel4estrellas{" +super.toString()+ "cantidadPisos=" + cantidadPisos + ", gym=" + gym + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

    @Override
    public int compareTo(Hotel t) {
        return this.precioHabitacion.compareTo(t.getPrecioHabitacion());
    }


    
    
    
}
