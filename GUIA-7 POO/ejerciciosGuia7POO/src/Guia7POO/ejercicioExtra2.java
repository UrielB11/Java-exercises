/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO;

import ENTIDAD.Puntos;

/**
 *
 * @author uriel
 */
public class ejercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos coordenadas= new Puntos();
        coordenadas.crearPuntos();
        System.out.println(coordenadas.calcularDistancia());
    }
    
}
