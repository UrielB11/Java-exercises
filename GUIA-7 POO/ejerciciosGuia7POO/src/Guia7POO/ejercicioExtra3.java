/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO;

import ENTIDAD.Juego;

/**
 *
 * @author uriel
 */
public class ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=(int)(Math.random()*100);
       Juego juego1 = new Juego(num,0,0);
       juego1.iniciarJuego();
    }
}
