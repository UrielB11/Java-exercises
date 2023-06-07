
import java.util.HashMap;
import java.util.Scanner;

/*
4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del H
 */


// @author uriel

public class ejercicioExtra4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> codPostCiudades= new HashMap();
        //Codigos postales de Australia
        
        //Australian Capital Territory
        codPostCiudades.put("Canberra",2600);// capital 
        codPostCiudades.put("Acton",2601);
        codPostCiudades.put("Ainslie",2602);
        codPostCiudades.put("Amaroo",2914);
        codPostCiudades.put("Aranda",2614);
        codPostCiudades.put("Queanbeyan",2620);
        codPostCiudades.put("Yass",2582);
        //New South Wales
        codPostCiudades.put("Sydney", 2000);
        codPostCiudades.put("Sydney", 2300);
        codPostCiudades.put("Sydney", 2500);
        
        
        //Pedirle al usuario que agregue 10 ciudades con sus respectivos CPs
        System.out.println("Ingreso 10 ciudades con sus CPs");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+"° ciudad:");
            System.out.print("Ciudad: ");
            String ciudad= sc.nextLine();
            System.out.print("Codigo postal: ");
            int cod= sc.nextInt();
            codPostCiudades.put(ciudad, cod);
        }
        codPostCiudades.forEach(cities->{System.out.println(cities)});
    }

}
