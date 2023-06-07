
package Services;

import Entities.AlojamientoExtraHotelero;
import Entities.Recidencia;

public class RecidenciaServicio extends AlojamientoExtraHoteleroServicio {

    @Override
    public float defprecio(AlojamientoExtraHotelero alojamiento) {
        Recidencia r= (Recidencia)alojamiento;
        float precio= r.getCantidadHabitaciones()*2f;
        if(r.isDescuento()){
            float descuento=precio*.05f;
            precio-=descuento;
        }
        else if(r.isCampoDeportivo()){
            precio+=30;
        }
        return precio;
    }
    
}
