/*
 Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
package Entidad;

import Enums.MetodoPago;
import java.util.Date;

public class Cuota {
    private int numCuota;
    private double montoTotal;
    private boolean pagada;
    private Date vencimiento;
    private MetodoPago metodoPago;
    
}
