/*
Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.

• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
 */
package Entidad;

import Enums.Apellidos;
import Enums.Nombres;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class Simulador {
   private int alumnosACrear = alumnosACrear();
  
    private Scanner sc = new Scanner(System.in);

    public Simulador() {
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
   
    
 public int alumnosACrear(){
    
        System.out.println("Cuantos alumnos desea crear");
        int alumnosACrear = sc.nextInt();
        return alumnosACrear;
    }
    
    
 public void generarDNI(ArrayList<Long> dniAlumnos){
      for (int i = 0; i < alumnosACrear; i++) {
        long dni;
        boolean dniRepetido;

        do {
            dni = (long) (Math.random() * 100000000);
            dniRepetido = false;

            for (long dniExistente : dniAlumnos) {
                if (dni == dniExistente) {
                    dniRepetido = true;
                    break;
                }
            }
        } while (dniRepetido);

        dniAlumnos.add(dni);
    }
    }
    
    public String generarNombreApellido(){
         ArrayList<Nombres> nombres= new ArrayList();
        nombres.addAll(Arrays.asList(Nombres.values()));
        Collections.shuffle(nombres);
        ArrayList<Apellidos> apellidos= new ArrayList();
        apellidos.addAll(Arrays.asList(Apellidos.values()));
        Collections.shuffle(apellidos);
        String nombreCompleto=nombres.get(0).toString()+" "+apellidos.get(0).toString();
        return nombreCompleto;
    }
    
    public ArrayList<Alumno> generarAlumnos(){
         System.out.println("Cuantos alunmos desea crear?");
        int cant= sc.nextInt();
         ArrayList<Alumno> listaAlumnos= new ArrayList();
        for (int i = 0; i < cant; i++) {
            listaAlumnos.add(new Alumno(generarNombreApellido(), generarDNI(), null));
        }
     
        return listaAlumnos;
        
        
        
       
        
    }
    
}
