
package Entities;

import java.time.LocalDate;

/**
• Potencia en CV para barcos a motor.

 */
public class BarcoMotor extends Barco{
    protected float potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(float potencia, String matricula, float eslora, LocalDate fabricacion) {
        super(matricula, eslora, fabricacion);
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }    
    
        @Override
    public String toString() {
        return "Barco Motor{" + "matricula=" + matricula + ", eslora=" + eslora + ", fabricacion=" + fabricacion + " potencia=" +potencia + '}';
    }
}
