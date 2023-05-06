/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static java.util.Spliterators.iterator;


public class AlumnoServicio {
    private ArrayList<Alumno> alumnos= new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
    
    public void cargarAlumnos(){
        boolean salir= false;
        String nombre;
        do {
            
            ArrayList<Double> notasAux= new ArrayList();
            System.out.println("---------Ingrese los datos del alumno:----------");
            System.out.println("Ingrese el nombre:");
            nombre= sc.next();
            for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese las nota "+(i+1));
                notasAux.add(sc.nextDouble());
            }
            alumnos.add(new Alumno(nombre, notasAux));

            System.out.println("Desea cargar otro alumno (SI/NO)");
            String rta= sc.next().toLowerCase();
            if (rta.equalsIgnoreCase("no")) {
                salir=true;
            }
        } while (!salir);
        
    }/*
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main..
    */
   public double notaFinal(){
       System.out.println("Ingrese el nombre del alumno para analizar su nota final:");
       String nombre= sc.next();
       Iterator<Alumno> it=alumnos.iterator();
       double suma=0;
       int cont=0;
       while(it.hasNext()){
           Alumno alumno=it.next();
           if (alumno.getNombre().equalsIgnoreCase(nombre)) {
               for (double nota : alumno.getNotas()) {
                   suma+=nota;
               }
           }
            cont= alumno.getNotas().size();
       }
       return suma/cont;
   }


    public String toString() {
        return  alumnos.toString();
    }
    
}
