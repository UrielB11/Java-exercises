/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.colecciones;

import Servicio.AlumnoServicio;
import Entidades.Alumno;
import java.util.ArrayList;

// @author uriel
public class Ejercicio3 {

    public static void main(String[] args) {

        AlumnoServicio as = new AlumnoServicio();
        ArrayList<Double> notas = new ArrayList();
        notas.add(6.6);
        notas.add(6.6);
        notas.add(6.6);
        Alumno alu1 = new Alumno("Tomas", notas);

        System.out.println(alu1.getNotas());
//        as.cargarAlumnos();
//
//           System.out.println(as.toString());
//           
//           System.out.println(as.notaFinal());

    }
}
