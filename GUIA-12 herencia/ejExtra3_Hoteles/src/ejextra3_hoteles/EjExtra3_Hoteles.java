//
//Una compañía de promociones turísticas desea mantener información sobre la infraestructura
//de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
//acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
//una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
//alojamientos: Hoteles y Alojamientos Extrahoteleros.
//Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
//características de las distintas categorías son las siguientes:
//• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
//• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
//Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
//acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
//cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
//será.
//El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//agregado por gimnasio) + (valor agregado por limosinas).
//Donde:
//Valor agregado por el restaurante:
//• $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas.
//• $50 si es mayor de 50.
//Valor agregado por el gimnasio:
//• $50 si el tipo del gimnasio es A.
//• $30 si el tipo del gimnasio es B.
//Valor agregado por las limosinas:
//• $15 por la cantidad de limosinas del hotel.
//En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
//hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
//Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
//cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
//Recidencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
//disponibles y si posee o no un restaurante dentro de las instalaciones. Para las recidencias se
//indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
//campo deportivo. Realizar un programa en el que se representen todas las relaciones
//descriptas.
//Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todos las recidencias que tienen descuento.
package ejextra3_hoteles;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.GymClass;
import Entities.Hotel;
import Entities.Hotel4est;
import Entities.Hotel5est;
import Entities.Recidencia;
import Services.CampinServicio;
import Services.Hotel4estServicio;
import Services.Hotel5estServicio;
import Services.RecidenciaServicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// @author uriel
public class EjExtra3_Hoteles {

    public static void main(String[] args) {

        HashMap<String, Alojamiento> listaAlojamientos = new HashMap();

        Hotel5est hotel51 = new Hotel5est(2, 10, 3, 5, GymClass.A, "Palacio del Sol", 50, 100, 150, 200.0f, "Sunshine Resort", "Playa Paradiso", "Javier López");
        Hotel5est hotel52 = new Hotel5est(1, 5, 2, 7, GymClass.B, "La Cúpula", 30, 80, 120, 180.0f, "Crystal Tower", "Montaña Azul", "Isabel Ramírez");
        Hotel5est hotel53 = new Hotel5est(3, 15, 5, 10, GymClass.A, "El Jardín Secreto", 60, 120, 200, 250.0f, "Royal Oasis", "Ciudad Elegante", "Carlos Medina");
        Hotel5est hotel54 = new Hotel5est(4, 20, 4, 12, GymClass.B, "Estrella del Mar", 40, 150, 250, 300.0f, "Paradise Island Resort", "Isla del Paraíso", "Sofía Torres");
        Hotel5est hotel55 = new Hotel5est(2, 8, 1, 8, GymClass.A, "El Refugio", 45, 90, 140, 220.0f, "Nature Haven", "Bosque Encantado", "Ricardo Silva");

        Hotel4est hotel41 = new Hotel4est(5, GymClass.A, "RestauranteEstrella", 50, 100, 150, 200.0f, "HotelLunaAzul", "CiudadEterna", "GerenteSueños");
        Hotel4est hotel42 = new Hotel4est(7, GymClass.B, "RestauranteCieloAbierto", 30, 80, 120, 180.0f, "HotelSolDorado", "CiudadRadiante", "GerenteBrillante");
        Hotel4est hotel43 = new Hotel4est(10, GymClass.A, "RestauranteOlasDelicia", 60, 120, 200, 250.0f, "HotelMarEsmeralda", "CiudadMarina", "GerenteAqua");
        Hotel4est hotel44 = new Hotel4est(12, GymClass.B, "RestauranteNaturalezaViva", 40, 150, 250, 300.0f, "HotelMontañaMágica", "CiudadVerde", "GerenteAventura");
        Hotel4est hotel45 = new Hotel4est(8, GymClass.A, "RestauranteFlorEncantada", 45, 90, 140, 220.0f, "HotelJardínSecreto", "CiudadMística", "GerenteEnigma");

        Camping camping1 = new Camping(50, 20, true, true, 1000.0f, "Camping1", "San Martín", "Juan Pérez");
        Camping camping2 = new Camping(30, 10, false, true, 800.0f, "Camping2", "Santa Rosa", "María González");
        Camping camping3 = new Camping(100, 30, true, false, 1500.0f, "Camping3", "Villa Belgrano", "Pedro Rodríguez");
        Camping camping4 = new Camping(80, 25, true, true, 1200.0f, "Camping4", "San Isidro", "Laura Martínez");
        Camping camping5 = new Camping(60, 15, false, false, 900.0f, "Camping5", "Mar del Plata", "Carlos López");

        Recidencia recidencia1 = new Recidencia(50, true, true, true, 1000.0f, "Sunset Manor", "Bayside", "John Smith");
        Recidencia recidencia2 = new Recidencia(30, false, true, false, 800.0f, "Harmony Gardens", "Greenfield", "Emily Johnson");
        Recidencia recidencia3 = new Recidencia(100, true, false, true, 1500.0f, "Evergreen Heights", "Oakville", "Daniel Williams");
        Recidencia recidencia4 = new Recidencia(80, true, true, true, 1200.0f, "Golden Oaks", "Maplewood", "Sophia Brown");
        Recidencia recidencia5 = new Recidencia(60, false, false, false, 900.0f, "Whispering Pines", "Meadowbrook", "Oliver Davis");

        listaAlojamientos.put(hotel51.getNombre(), hotel51);
        listaAlojamientos.put(hotel52.getNombre(), hotel52);
        listaAlojamientos.put(hotel53.getNombre(), hotel53);
        listaAlojamientos.put(hotel54.getNombre(), hotel54);
        listaAlojamientos.put(hotel55.getNombre(), hotel55);
        listaAlojamientos.put(hotel41.getNombre(), hotel41);
        listaAlojamientos.put(hotel42.getNombre(), hotel42);
        listaAlojamientos.put(hotel43.getNombre(), hotel43);
        listaAlojamientos.put(hotel44.getNombre(), hotel44);
        listaAlojamientos.put(hotel45.getNombre(), hotel45);
        listaAlojamientos.put(camping1.getNombre(), camping1);
        listaAlojamientos.put(camping2.getNombre(), camping2);
        listaAlojamientos.put(camping3.getNombre(), camping3);
        listaAlojamientos.put(camping4.getNombre(), camping4);
        listaAlojamientos.put(camping5.getNombre(), camping5);
        listaAlojamientos.put(recidencia1.getNombre(), recidencia1);
        listaAlojamientos.put(recidencia2.getNombre(), recidencia2);
        listaAlojamientos.put(recidencia3.getNombre(), recidencia3);
        listaAlojamientos.put(recidencia4.getNombre(), recidencia4);
        listaAlojamientos.put(recidencia5.getNombre(), recidencia5);
        Hotel4estServicio h4s= new Hotel4estServicio();
        Hotel5estServicio h5s= new Hotel5estServicio();
        CampinServicio cs= new CampinServicio();
        RecidenciaServicio rs= new RecidenciaServicio();
                
        
        
        for (Map.Entry<String,Alojamiento> entry: listaAlojamientos.entrySet()) {
            if (entry.getValue() instanceof Hotel4est){
                h4s.defPrecioHabitacion((Hotel4est)entry.getValue());
            } 
            else if (entry.getValue() instanceof Hotel4est){
                h5s.defPrecioHabitacion((Hotel5est)entry.getValue());
            } 
            else if (entry.getValue() instanceof Camping){
                cs.defprecio((Camping)entry.getValue());
            } 
            else if (entry.getValue() instanceof Recidencia){
                rs.defprecio((Recidencia)entry.getValue());
            } 
        }

        //Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todos las recidencias que tienen descuento.
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
        do {
            System.out.println("---------------Menu---------------");
            System.out.println("1-Todos los alojamientos.");
            System.out.println("2-Hoteles por precio.");
            System.out.println("3-Campings con restaurante.");
            System.out.println("4-Residencias con descuento.");
            System.out.println("5-Salir.");
            System.out.println("-------------------------------------");
            System.out.print("ingrese una opcion:  ");
            op = sc.nextInt();
            while (!(op > 0 && op < 6)) {
                System.out.println("la opcion que ingresaste es incorrecta ingresa nuevamente:");
                op = sc.nextInt();
            }
            switch (op) {
                case 1:
                    for (Map.Entry<String, Alojamiento> entry : listaAlojamientos.entrySet()) {
                        System.out.println(entry.getValue());
                        System.out.println("------------------------------------------------------------");
                    }
                    break;
                case 2:
                    ArrayList<Hotel> alojaux= new ArrayList();
                    for (Map.Entry<String, Alojamiento> entry : listaAlojamientos.entrySet()) {
                        if (entry.getValue() instanceof Hotel4est || entry.getValue() instanceof Hotel5est) {
                            alojaux.add((Hotel)entry.getValue());
                        }
                        }
                                
                        Collections.sort(alojaux, Hotel.compararPrecioMaxMin);
                        for (Hotel hotel : alojaux) {
                            System.out.println(hotel);
                            System.out.println("Precio de Habitacion:"+ hotel.getPrecioHabitacion());
                                                    System.out.println("------------------------------------------------------------");

                    }
                    break;
                case 3:
                    for (Map.Entry<String, Alojamiento> entry : listaAlojamientos.entrySet()) {
                        if (entry.getValue() instanceof Camping) {
                            if (((Camping) entry.getValue()).isRestaurante()) {
                                System.out.println(entry.getValue());
                                                        System.out.println("------------------------------------------------------------");

                            }
                        }
                    }
                    break;
                case 4:
                    for (Map.Entry<String, Alojamiento> entry : listaAlojamientos.entrySet()) {
                        if (entry.getValue() instanceof Recidencia) {
                            if (((Recidencia) entry.getValue()).isDescuento()) {
                                System.out.println(entry.getValue());
                                                        System.out.println("------------------------------------------------------------");

                            }
                        }
                    }
                        break;
                    }
        } while (op != 5);
    }

}
