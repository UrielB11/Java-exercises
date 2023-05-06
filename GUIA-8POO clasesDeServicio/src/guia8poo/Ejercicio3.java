
package guia8poo;

import Entidades.Person;
import Servicios.PersonServicio;

/*A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para 
cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal
y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
Para esto, podemos crear unos métodos adicionales.*/
public class Ejercicio3 {

    public static void main(String[] args) {
       PersonServicio ps= new PersonServicio();
        System.out.println("Persona1");
       Person p1= ps.crearPersona();
        System.out.println("Persona2");
       Person p2= ps.crearPersona();
        System.out.println("Persona3");
       Person p3= ps.crearPersona();
        System.out.println("Persona4");
       Person p4= ps.crearPersona();
       
       boolean mayor[]=new boolean[4];
       mayor[0]=ps.esMayorDeEdad(p1);
       mayor[1]=ps.esMayorDeEdad(p2);
       mayor[2]=ps.esMayorDeEdad(p3);
       mayor[3]=ps.esMayorDeEdad(p3);
       
       int IMCs[]= new int[4];
       IMCs[0]=ps.calcularIMC(p1);
       IMCs[1]=ps.calcularIMC(p2);
       IMCs[2]=ps.calcularIMC(p3);
       IMCs[3]=ps.calcularIMC(p4);
       
           int debajo = 0;
           int ideal = 0;
           int encima = 0;
           double  porcentajeD;
           double  porcentajeI;
           double  porcentajeE;
        for (int i = 0; i < IMCs.length; i++) {
            if (IMCs[i]==-1) {
                debajo++;
            }
            else   if (IMCs[i]==0) {
                ideal++;
            }
            else if(IMCs[i]==1){
            encima ++;
            }
            }
        porcentajeD=((double) debajo/4.0)*100;
        porcentajeI=((double)ideal/4.0)*100;
        porcentajeE=( (double)encima/4.0)*100;
        
        System.out.println("Porcentaje de personas con peso ideal: "+porcentajeI+"%- Total: "+ideal);
        System.out.println("Porcentaje de personas debajo del peso ideal: "+porcentajeD+"%- Total: "+ debajo);
        System.out.println("Porcentaje de personas por encima del peso ideal: "+porcentajeE+"%- Total: "+encima);
        
        int may=0;
        int men=0;
        for (int i = 0; i < mayor.length; i++) {
            if(mayor[i]){
                may++;
        }
            else{  
                men++;
            }
        }
        
        double porcentajeMay=((double)may/4.0)*100;
        double porcentajeMen=((double)men/4.0)*100;
        
        System.out.println("Porcentaje de personas mayores de edad: "+porcentajeMay+"%- Total: "+may);
        System.out.println("Porcentaje de personas menores de edad: "+porcentajeMen+"%- Total: "+men);
        }
    }
    

