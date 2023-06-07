
package Services;

import Entities.AlojamientoExtraHotelero;
import Entities.Camping;


public class CampinServicio extends AlojamientoExtraHoteleroServicio {

    @Override
    public float defprecio(AlojamientoExtraHotelero alojamiento) {
        Camping c= (Camping)alojamiento;
        float precio= c.getCantidadCarpas()+c.getCantidaBaños();
        return precio;
    }
    
}
