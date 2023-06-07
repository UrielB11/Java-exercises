package Entities;

import java.util.Comparator;

/**
//Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
//características de las distintas categorías son las siguientes:
 */
public abstract class Hotel extends Alojamiento implements Comparable<Hotel>{
    protected Integer habitaciones;
    protected int camas;
    protected Float precioHabitacion;

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, float precioHabitacion, String nombre, String localidad, String gerente) {
        super(nombre, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.precioHabitacion = precioHabitacion;
    }


    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public Float getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return super.toString() + "habitaciones=" + habitaciones + ", camas=" + camas + ", precioHabitacion=" + precioHabitacion + '}';
    }

 
    public static Comparator<Hotel> compararPrecioMaxMin= new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.getPrecioHabitacion().compareTo(t.getPrecioHabitacion());
        }
    };
    
    
}
