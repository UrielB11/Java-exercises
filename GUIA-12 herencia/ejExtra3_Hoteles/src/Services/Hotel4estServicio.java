/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.GymClass;
import Entities.Hotel;
import Entities.Hotel4est;

/**
 * //El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: //PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor //agregado por gimnasio) + (valor agregado por limosinas). //Donde: //Valor agregado por el restaurante: //• $10 si la capacidad del restaurante es de menos de 30 personas. //• $30 si está entre 30 y 50 personas. //• $50 si es mayor de 50. //Valor agregado por el gimnasio: //• $50 si el tipo del gimnasio es A. //• $30 si el tipo del gimnasio es B. //Valor agregado por las limosinas: //• $15 por la cantidad de limosinas del hotel.
 */
public class Hotel4estServicio extends HotelServicio {

    @Override
    public float defPrecioHabitacion(Hotel hotel) {
        Hotel4est h4 = (Hotel4est) hotel;
        float precio = hotel.getHabitaciones() + 50;
        
            if (h4.getCapacidadRestaurante() < 30) {
                precio += 10;
            } else if (h4.getCapacidadRestaurante() >= 30 && h4.getCapacidadRestaurante() <= 50) {
                precio += 30;
            } else if (h4.getCapacidadRestaurante() > 50) {
                precio += 50;
            }
            if (h4.getGym() == GymClass.A) {
                precio += 50;
            } else if (h4.getGym() == GymClass.B) {
                precio += 30;
            }
            h4.setPrecioHabitacion(precio);
      
        return h4.getPrecioHabitacion();
    }

}
