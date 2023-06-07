/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.


 */
package Entidades;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)

    public void llenarRevolver(Revolver r) {
        r.setPosicionActual((int) ((Math.random() * 6) + 1));//5
        r.setPosicionAgua((int) ((Math.random() * 6) + 1)); //3
        if (r.posicionActual == 0 && r.posicionAgua == 0) {
            r.setPosicionActual((int) ((Math.random() * 6) + 1));//5
            r.setPosicionAgua((int) ((Math.random() * 6) + 1)); //3
        }
    }

    public boolean mojar(Revolver r) {
        return r.getPosicionActual() == r.getPosicionAgua();

    }

    public void siguienteChorro(Revolver r) {
        if (r.getPosicionActual() < 6) {
            r.setPosicionActual(r.getPosicionActual() + 1);
        } else {
            r.setPosicionActual(1);
        }
    }
}
