/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.

 */
package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;


public class CursoService {
//Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle,
//solicitando en cada repetición que se ingrese el nombre de cada alumno.
    
    public String[] cargarAlumnos(Curso c){
        String[] array= new String[5];
        System.out.println("Ingrese los nombres de los alumnos:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextLine();
           }
        return array;
    }
//Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos
//al método cargarAlumnos() para asignarle valor al atributo alumnos
    
   
    
    public void crearCurso(Curso c){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nombre del curso:");
        c.setNombreCurso(sc.nextLine());
        System.out.println("Ingrese cantidad de horas por dia:");
        c.setCantidadHorasPorDia(sc.nextInt());
        System.out.println("ingrese cantidad de dias por semana:");
        c.setCantidadDiasPorSemana(sc.nextInt());
        System.out.println("Ingrese el turno:");
        c.setTurno(sc.next().toLowerCase());
        while (!c.getTurno().equals("tarde")&&!c.getTurno().equals("mañana")){
            System.out.println("El dato ingressado no e correcto. ingrese nuevamente");
            c.setTurno( sc.next().toLowerCase());   
        }
        System.out.println("Ingrese el precio por hora:");
        c.setPrecioPorHora(sc.nextDouble());
        System.out.println("Ingrese los alumnos");
        c.setAlumnos(cargarAlumnos(c));

    }
//Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
//Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
    public double calcularGananciaSemanal(Curso c){
        return c.getCantidadHorasPorDia()*c.getPrecioPorHora()*c.getAlumnos().length*c.getCantidadDiasPorSemana();
    }
    
}
