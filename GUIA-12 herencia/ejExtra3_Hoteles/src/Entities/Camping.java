
package Entities;
//Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
//disponibles y si posee o no un restaurante dentro de las instalaciones.
public final class Camping extends AlojamientoExtraHotelero {
    protected int cantidadCarpas;
    protected int cantidaBaños;
    protected boolean restaurante;

    public Camping(int cantidadCarpas, int cantidaBaños, boolean restaurante, boolean privado, float metros2, String nombre, String localidad, String gerente) {
        super(privado, metros2, nombre, localidad, gerente);
        this.cantidadCarpas = cantidadCarpas;
        this.cantidaBaños = cantidaBaños;
        this.restaurante = restaurante;
    }

    public int getCantidadCarpas() {
        return cantidadCarpas;
    }

    public void setCantidadCarpas(int cantidadCarpas) {
        this.cantidadCarpas = cantidadCarpas;
    }

    public int getCantidaBaños() {
        return cantidaBaños;
    }

    public void setCantidaBaños(int cantidaBaños) {
        this.cantidaBaños = cantidaBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +super.toString()+ "cantidadCarpas=" + cantidadCarpas + ", cantidaBa\u00f1os=" + cantidaBaños + ", restaurante=" + restaurante+"}";
    }


    
    
}
