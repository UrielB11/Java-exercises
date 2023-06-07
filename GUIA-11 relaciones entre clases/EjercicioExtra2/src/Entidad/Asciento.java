/*

 */
package Entidad;


public class Asciento {
    private int fila;
    private char columna;
    private boolean ocupado;

    public Asciento() {
    }

    public Asciento(int fila, char columna, boolean ocupado) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Asciento{" + "fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + '}';
    }
    
    
}
