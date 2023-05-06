
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */


// @author uriel

public class ejercicio1y2dn {

    public static void main(String[] args) {
        
        ArrayList<String> razas= new ArrayList();
        Scanner sc = new Scanner(System.in);
        String rta;
        do {
            System.out.println("Ingrese la raza de perro:");
            razas.add(sc.nextLine());
            System.out.println("Desea agregar otra raza?(SI/NO)");
            rta= sc.nextLine();
            if (!(rta.equalsIgnoreCase("si"))&&!(rta.equalsIgnoreCase("no"))) {
                System.out.println("La opcion ingresada es incorrecta. ingrese nuevamente (SI/NO)");
                rta=sc.nextLine();
            }
            
        } while (rta.equalsIgnoreCase("si"));
        
        System.out.println(razas.toString());
        
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        
        String raza;
        System.out.println("Ingrese la raza que desea eliminar:");
        raza=sc.nextLine();
        boolean encontrada=false;
        Iterator<String> it= razas.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(raza)) {
                it.remove();
                encontrada=true;
            }
            }
            if (encontrada) {
                System.out.println(razas.toString());
            }
            else{
                System.out.println("La raza ingresada no forma parte de la lista");
        }
    }

}
