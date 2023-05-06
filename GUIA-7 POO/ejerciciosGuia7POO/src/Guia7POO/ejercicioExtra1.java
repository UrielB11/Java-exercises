/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO;

import ENTIDAD.Cancion;

/**
 *
 * @author uriel
 */
public class ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c1= new Cancion();
        c1.setAutor("Mac Miller");
        c1.setTitulo("Self Care");
        System.out.println(c1.getAutor()+"-"+c1.getTitulo() );
    }
    
}
