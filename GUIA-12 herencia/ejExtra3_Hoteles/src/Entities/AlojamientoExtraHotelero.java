
package Entities;

/**
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
//hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
//Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
//cuadrados que ocupa
 */
public abstract class AlojamientoExtraHotelero extends Alojamiento{
    protected boolean privado;
    protected float metros2;


    public AlojamientoExtraHotelero(boolean privado, float metros2, String nombre, String localidad, String gerente) {
        super(nombre, localidad, gerente);
        this.privado = privado;
        this.metros2 = metros2;
    }

    @Override
    public String toString() {
        return   super.toString()+"privado=" + privado + ", metros2=" + metros2+ "}";
    }
    
    
}
