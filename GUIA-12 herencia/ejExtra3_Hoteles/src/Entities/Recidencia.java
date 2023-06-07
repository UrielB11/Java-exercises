package Entities;

/**
 Para las residencias se
//indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
//campo deportivo.
 */
public final class Recidencia  extends AlojamientoExtraHotelero{
    
    protected int cantidadHabitaciones;
    protected boolean descuento;
    protected boolean campoDeportivo;

    public Recidencia(int cantidadHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, float metros2, String nombre, String localidad, String gerente) {
        super(privado, metros2, nombre, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Recidencia{" +super.toString()+ "cantidadHabitaciones=" + cantidadHabitaciones + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
}
