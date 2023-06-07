/*
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
A $1000
B $800
C $600
D $500
E $300
F $100
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
 */
package Servicio;
import Entidad.Electrodomestico;
import java.util.Scanner;


public class ElectrodomesticoServicio {

    
    public Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Electrodomestico crearElectrodomestico(){
        System.out.println("Ingrese el color del elecrodomestico:");
        String color= sc.nextLine();
        System.out.println("Ingrese consumo del electrodomestico: ");
        char consumo= sc.nextLine().charAt(0);
        System.out.println("Ingrese el peso del electrodomestico:");
        double peso= sc.nextDouble();
        return new Electrodomestico(color, consumo, peso);

    }
    
    public void precioFinal(Electrodomestico e1){
        double precio=0;
        switch (e1.getConsumo()) {
            case 'A':
                precio=1000;
                break;
            case 'B':
                precio=800;
                break;
            case 'C':
                precio=600;
                break;
            case 'D':
                precio=500;
                break;
            case 'E':
                precio=300;
                break;
            case 'F':
                precio=100;
                break;
        }
        if(e1.getPeso()>0&&e1.getPeso()<20){
            precio+=100;
        }
        else if(e1.getPeso()>19&&e1.getPeso()<50){
            precio+=500;
        }
        else if(e1.getPeso()>49&&e1.getPeso()<80){
            precio+=800;
        }
        else if(e1.getPeso()>79){
            precio+=1000;
        }
 
        e1.setPrecio(precio);
        
    }
    
}
