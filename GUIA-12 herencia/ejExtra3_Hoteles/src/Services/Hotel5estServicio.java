package Services;

import Entities.Hotel;
import Entities.Hotel4est;
import Entities.Hotel5est;
//Valor agregado por las limosinas:
//• $15 por la cantidad de limosinas del hotel.
public class Hotel5estServicio extends Hotel4estServicio {
    
    @Override
    public float defPrecioHabitacion(Hotel hotel) {
        float precio = super.defPrecioHabitacion(hotel);        
        if (hotel instanceof Hotel5est){
            precio+= 15*((Hotel5est) hotel).getLimosinas();
            hotel.setPrecioHabitacion(precio);
        }
        return precio;
    }
}

