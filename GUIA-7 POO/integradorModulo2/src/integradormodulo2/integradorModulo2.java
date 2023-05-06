/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y saber qué alumnos han recibido una nota por encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.

Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, 
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.

Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 */
package integradormodulo2;
import ENTIDAD.Estudiante;
        

// @author uriel

public class integradorModulo2 {

    public static void main(String[] args) {
        
        Estudiante vector[]= new Estudiante[8];
        
        Estudiante est1= new Estudiante("Juan",8.9);
        Estudiante est2= new Estudiante("Pedro",5.6);
        Estudiante est3= new Estudiante("Daniel",7.5);
        Estudiante est4= new Estudiante("Maria",6.3);
        Estudiante est5= new Estudiante("Josefa",8.4);
        Estudiante est6= new Estudiante("Carlos",9.3);
        Estudiante est7= new Estudiante("Candela",5.4);
        Estudiante est8= new Estudiante("Tomas",4.8);
        
        vector[0]=est1;
        vector[1]=est2;
        vector[2]=est3;
        vector[3]=est4;
        vector[4]=est5;
        vector[5]=est6;
        vector[6]=est7;
        vector[7]=est8;
        
        double suma=0;
        
        for (int i = 0; i < vector.length; i++) {
            suma+= vector[i].getNota();
        }
        double promedio= suma/vector.length;
        int cont=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getNota()>promedio) {
                cont++;
            }
        }
        int index=0;
        String EstudiantesArribaPromedio[]= new String[cont];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getNota()>promedio) {
                EstudiantesArribaPromedio[index]=vector[i].getNombre(); 
                index++;
        }
        }
        System.out.println("Alumnos arriba del promedio:");
        for (int i = 0; i < EstudiantesArribaPromedio.length; i++) {
            System.out.print(EstudiantesArribaPromedio[i]+" ");
        }
    }

}
