package ejerciciosguia4;

import java.lang.String;
import java.util.Scanner;

public class EjerciciosGuia4 {

    public static void main(String[] args) {

        /*
        Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter
que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a  @
e  #
i  $
o  %
u  *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

         */
        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese una frase");
//        String frase = leer.nextLine();
//
//        String retorno = frasetrans(frase);
//
//        System.out.println("La frase transformada es: " + retorno);
//
//    }
//
//    public static String frasetrans(String frase) {
//        String letra;
//        String nuevafrase = "";
//        String a= "@";
//        String b= "#";
//        String c= "$";
//        String d= "%";
//        String e= "*";
//
//        for (int i = 0; i < frase.length(); i++) {
//            letra = frase.substring(i,i+1);
//           
//            switch (letra) {
//                case "a":
//                case "A":
//                    nuevafrase+= "@";
//                  
//                    break;
//                case "e":
//                case "E":
//                    nuevafrase += "#";
//
//                    break;
//                case "i":
//                case "I":
//                    nuevafrase += "$";
//
//                    break;
//                case "o":
//                case "O":
//                    nuevafrase += "%";
//
//                    break;
//                case "u":
//                case "U":
//                    nuevafrase += "*";
//
//                    break;
//                default:
//                    nuevafrase += letra;
//            }
//        }
//
//        return nuevafrase;
//    }
//      
//}

//System.out.println("Ingrese dos valores enteros");
//        int num1 = leer.nextInt();
//        int num2 = leer.nextInt();
//        
//        esMultiplo(num1,num2);
//        
//        
//
//    }
//    
//    public static void esMultiplo(int num1,int num2){
//        
//        if (num1 % num2 == 0) {
//            System.out.println( num1 + " Es multiplo de " + num2);
//        }else  {
//            System.out.println( num1 + " No es múltiplo de " + num2);
//        }
        /* 
        Crea una aplicación que le pida dos números al usuario y este pueda 
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        tener una función para cada operación matemática y deben devolver sus 
        resultados para imprimirlos en el main. 
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese dos números enteros: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        
//        System.out.println("¿Qué operación quiere realizar?");
//        System.out.println("1. Sumar");
//        System.out.println("2. Restar");
//        System.out.println("3. Multiplicar");
//        System.out.println("4. Dividir");
//        int opcion = scanner.nextInt();
//        
//        System.out.println("El resultado de la operación aritmética es: ");
//        
//        switch (opcion) {
//            case 1:
//                System.out.println(sumar(num1, num2));
//                break;
//            case 2:
//                System.out.println(restar(num1, num2));
//                break;
//            case 3:
//                System.out.println(multiplicar(num1, num2));
//                break;
//            case 4:
//                if (num2 != 0) {
//                    System.out.println(dividir(num1, num2));
//                } else {
//                    System.out.println("No se puede dividir por cero.");
//                }
//                break;
//            default:
//                System.out.println("Te dije que escribieras entre 1 y 4.");;
//        }
//        
//        scanner.close();
//    }
//    
//    public static int sumar(int num1, int num2) {
//        int resultado = num1 + num2;
//        return resultado;
//    }
//    public static int restar(int num1, int num2) {
//        int resultado = num1 - num2;
//        return resultado;
//    }
//    public static int multiplicar(int num1, int num2) {
//        int resultado = num1 * num2;
//        return resultado;
//    }
//    public static double dividir(double num1, double num2) {
//        double resultado;
//        resultado = num1 / num2;
//        return resultado;
//    }

        /*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle
al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
         */
//        String nombre;
//        int edad;
//        String respuesta;
//        do {
//            System.out.println("Ingrese nombre y edad");
//            nombre = leer.next();
//            edad = leer.nextInt();
//            if (esMayorDeEdad(edad)) {
//                System.out.println(nombre + " tiene " + edad + " entonces es mayor de edad");
//
//            } else {
//                System.out.println(nombre + " tiene " + edad + " entonces es menor de edad");
//            }
//            System.out.println("Desea seguir mostrando personas?");
//            respuesta = leer.next();
//        } while (!respuesta.equals("n"));
//    }
//
//    public static boolean esMayorDeEdad(int edad) {
//
//        return edad > 18;}

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir
que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

*/
//        System.out.println("Ingrese la cantidad de dinero que desee convertir:");
//        int euros = leer.nextInt();
//        System.out.println("ingrese la moneda:");
//        System.out.println("1-libras");
//        System.out.println("2-yenes");
//        System.out.println("3-dolares");
//        int moneda= leer.nextInt();
//        
//        conversor(euros,moneda);
//        
//    
//    }
//    
//    public static void conversor(int euro, int moneda){
//        double multiplicador=1;
//        switch (moneda) {
//            case 1:
//                multiplicador = 0.86;
//                break;
//            case 2:
//                multiplicador = 129.852;
//                break;
//            case 3:
//                multiplicador = 1.28611;
//                break;
//            default:
//                System.out.println("opciion incrrecta");
//                break;
//        }
//        System.out.println("Elvalor del euro convertido es igual : " + (multiplicador*euro));



/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
*/
//        System.out.println("Ingrese un numero:");
//    int num = leer.nextInt();
//        System.out.println(esPrimo(num));
//    }
//
//    public static boolean esPrimo(int num){
//    int cont=0;
//    for(int i=1; i<=num; i++){
//        if(num%i==0){
//        cont++;
//        }
//         
//    }
//    return cont==2;
//    }

}
}