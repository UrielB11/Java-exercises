/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia10.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// @author uriel
public class ejercicio1y2 {

    public static void main(String[] args) {

        ArrayList<String> razas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String rta = "";
        do {
            System.out.println("Ingrese una raza de perro:");
            razas.add(sc.nextLine());
            System.out.println("Desea agregar otra raza?(SI/NO)");
            rta = sc.nextLine();
            if (!(rta.equalsIgnoreCase("si") )&& !(rta.equalsIgnoreCase("no"))) {
                System.out.println("Opcion ingresada es incorrecta. Inetente nuevamente (SI/NO)");
                rta = sc.nextLine();
            }
        } while (rta.equalsIgnoreCase("si"));
        System.out.println(razas.toString());
        /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
         */
      String raza = "";
        String rta1 = "";
        boolean encontrado = false;
        Iterator<String> it;

        do {
            System.out.println("Que raza desea eliminar?");
            raza = sc.nextLine();

            it = razas.iterator();

            while (it.hasNext()) {
                String razaActual = it.next();

                if (razaActual.equals(raza)) {
                    it.remove();
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("Raza eliminada exitosamente.");
            } else {
                System.out.println("La raza ingresada no está disponible en la lista.");
            }

            System.out.println(razas.toString());

            if (razas.size() > 0) {
                System.out.println("Desea eliminar otra raza? (SI/NO)");
                rta1 = sc.nextLine();
                
                while (!(rta1.equalsIgnoreCase("si")) && !(rta1.equalsIgnoreCase("no"))) {
                    System.out.println("Opcion ingresada es incorrecta. Intente nuevamente (SI/NO)");
                    rta1 = sc.nextLine();
                }
            } else {
                System.out.println("Ya no quedan más razas en la lista.");
                break;
            }

            encontrado = false;

        } while (rta1.equalsIgnoreCase("si"));

    }
}