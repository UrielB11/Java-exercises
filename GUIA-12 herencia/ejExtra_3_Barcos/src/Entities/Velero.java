package Entities;

import java.time.LocalDate;

/**
• Número de mástiles para veleros.
 */
public class Velero extends Barco {
    protected int mastil;

    public Velero() {
    }

    public Velero(int mastil, String matricula, float eslora, LocalDate fabricacion) {
        super(matricula, eslora, fabricacion);
        this.mastil = mastil;
    }

    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastil=" + mastil +super.toString()+'}';
    }

  
    
    
}
