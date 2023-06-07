/*
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package Entidad;

import Enums.MetodoPago;
import Enums.TipoCobertura;
import java.util.List;

public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numPoliza;
    private int cantCuotas;
    private List<Cuota> cuotas;
    private MetodoPago formaPago;
    private double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaxGranizo;
    private TipoCobertura tipoCobertura;
    
    
}
