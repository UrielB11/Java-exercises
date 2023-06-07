package Services;

import Entities.Alquiler;
import Entities.Barco;
import Entities.Cliente;
import Entities.Velero;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AlquilerServicio {

    protected ClienteSevicio cs = new ClienteSevicio();

    public Alquiler cargarAlquiler() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" ---------------Carga de Alquiler----------------");
        System.out.println("Cliente:");
        Cliente c1 = cs.cargarCliente();
        System.out.println("Ingrese la fecha de alquiler:(yyyy-mm-dd)");
        LocalDate fecha = LocalDate.parse(sc.nextLine());
        System.out.println("Ingrese los dias de alquiler:");
        int dias = sc.nextInt();
        LocalDate fechaDev = fecha.plusDays(dias);
        double precio = 0;

        double modulo = dias * 10 * c1.getEmbarcacion().getEslora();
        if (c1.getEmbarcacion() instanceof Barco) {
            precio = modulo;
        } else if (c1.getEmbarcacion() instanceof Velero) {
            precio = modulo + ((Velero) c1.getEmbarcacion()).getMastil();
        }

        return new Alquiler(c1, fecha, fechaDev, precio);

    }

}
