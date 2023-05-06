/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9clasesdeutilidad;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;




public class Ejericio1 {

    public static void main(String[] args) {
      
        CadenaServicio cs= new CadenaServicio();
        Cadena cadena1= new Cadena("Hola mundo");
        Scanner sc = new Scanner(System.in);
        
        cs.invertirFrase(cadena1);
        cs.vecesRepetido(cadena1, "o");
        cs.unirFrases(cadena1, ". Como estan?");
        cs.reemplazar(cadena1, "#");
        System.out.println(cs.contiene(cadena1, "Hola"));
    }

}
