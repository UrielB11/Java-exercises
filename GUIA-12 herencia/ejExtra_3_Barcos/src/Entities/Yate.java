
package Entities;

import java.time.LocalDate;

/**
• Potencia en CV y número de camarotes para yates de lujo.

 */
public class Yate extends BarcoMotor{
    protected int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, float potencia, String matricula, float eslora, LocalDate fabricacion) {
        super(potencia, matricula, eslora, fabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
     @Override
    public String toString() {
        return "Yate{" + "camarotes="+ camarotes+ "matricula=" + matricula + ", eslora=" + eslora + ", fabricacion=" + fabricacion + " potencia=" +potencia + '}';
    }
}
