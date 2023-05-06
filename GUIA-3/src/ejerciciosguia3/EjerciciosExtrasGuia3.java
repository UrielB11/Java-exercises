
package ejerciciosguia3;

import java.util.Scanner;

public class EjerciciosExtrasGuia3 {

    public static void main(String[] args) {
        
        /*
        Simular la división usando solamente restas.
        Dados dos números enteros mayores que uno, realizar un algoritmo
        que calcule el cociente y el residuo usando sólo restas.
        Método: Restar el dividendo del divisor hasta obtener
        un resultado menor que el divisor,
        este resultado es el residuo, y el número 
        de restas realizadas es el cociente.
        

*/
Scanner scan = new Scanner(System.in);
//int contador=0;
//int dividendo, divisor;
//int resta;
//System.out.println("Ingresar el dividendo: ");
//dividendo = scan.nextInt();
//System.out.println("Ingressar el divisor: ");
//divisor = scan.nextInt();
//do {
//    dividendo -= divisor;
//    contador++;
//    System.out.println((dividendo + divisor) + " - " + divisor +  " = " + dividendo);
//} while (dividendo >= divisor);
//System.out.println("El cociente es: " + contador);
//System.out.println("El resto es: " + dividendo);
//    }

//   Realice un programa para que el usuario adivine el resultado de una 
//   multiplicación entre dos números generados aleatoriamente entre
//   0 y 10. El programa debe indicar al usuario si su respuesta es o no
//   correcta. En caso que la respuesta sea incorrecta se debe permitir
//   al usuario ingresar su respuesta nuevamente. Para realizar este 
//   ejercicio investigue como utilizar la función Math.random() de Java.

//int numRamdom1= (int) (Math.random()*10);
//int numRamdom2= (int) (Math.random()*10);
//int resultado;
//    System.out.println("Adivine el resultado de la multiplicación");
//do{
//    resultado = scan.nextInt();
//    System.out.println("Numero incorrecto, intente nuevamente:");
//} while (resultado != (numRamdom1 * numRamdom2) );
//
//        System.out.println("Felicidades, acertaste al resultado");
//        System.out.println("("+ numRamdom1 +" * "+ numRamdom2+" = "+ resultado + ")");
        

//Dado un tiempo en minutos, calcular su equivalente en días y horas. 
//        Por ejemplo, si el usuario ingresa 1600 minutos, el sistema 
//                debe calcular su equivalente: 1 día, 2 horas.

//int dias, minHoras, horas;
//System.out.println("Ingrese los minutos:");
//int min = scan.nextInt();
//minHoras = min /60;
//dias = minHoras/24;
//horas = minHoras - (dias * 24);
//        System.out.println(dias+ " dias, "+ horas + " horas");
/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
Utilizar sólo una variable auxiliar.
*/
//int a, b, c, d, aux, a1, b1, c1, d1;
//        System.out.println("ingrese un valor para cada variable:");
//        a = scan.nextInt();
//        b = scan.nextInt();
//        c = scan.nextInt();
//        d = scan.nextInt();
//        
//        
//        aux = b;
//        b1 = c;
//        c1 = a;
//        a1 = d;
//        d1 = aux;
//        
//        System.out.println("a = " +a+ " -------> "+ a1);
//        System.out.println("b = " +b+ " -------> "+ b1);
//        System.out.println("c = " +c+ " -------> "+ c1);
//        System.out.println("d = " +d+ " -------> "+ d1);
//                

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/
//        System.out.println("Ingrese un caracter:");
//        String letra = scan.next();
//        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
//            System.out.println("El caracter ingreesado es una vocal");
//        }
//         else{
//            System.out.println("El caracter ingrasado es una consonante"); 
//        }


/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
*/
//        int num;
//        int cont=1;
//        
//
//        do {
//        System.out.println("Ingrese un numero del 1 al 10");
//        num = scan.nextInt();
//        switch (num){
//       
//            case 1: 
//                System.out.println("Su valor en numero romano es: I");
//                break;
//            case 2: 
//                System.out.println("Su valor en numero romano es: II");
//                break;
//            case 3: 
//                System.out.println("Su valor en numero romano es: III");
//                break;
//            case 4: 
//                System.out.println("Su valor en numero romano es: IV");
//                break;
//            case 5: 
//                System.out.println("Su valor en numero romano es: V");
//                break;
//            case 6: 
//                System.out.println("Su valor en numero romano es: VI");
//                break;
//            case 7: 
//                System.out.println("Su valor en numero romano es: VII");
//                break;
//            case 8: 
//                System.out.println("Su valor en numero romano es: VIII");
//                break;
//            case 9: 
//                System.out.println("Su valor en numero romano es: IX");
//                break;
//            case 10: 
//                System.out.println("Su valor en numero romano es: X");
//                break;
//                
//        }
//        if (!(num>=1 && num<=10 )){
//            System.out.println("El numero ingresado no es valido. Intente nuevamente:");
//        }
//        } while(cont==1);

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura 
y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
        
//        int cont=0;
//        int pares=0;
//        int impares=0;
//        int n;
//        
//        do{
//            System.out.println("Ingrese un numero:");
//            n= scan.nextInt();
//            if(n%2==0 && n>=0){
//                cont ++;
//                pares++;
//            }
//            else if(n>=0){
//                cont++;
//                impares++;
//            }
//        }while(n%5!=0);
//        System.out.println("cantidad de numeros ingresados: "+ cont);
//        System.out.println("cantidad de numeros pares: "+ pares);
//        System.out.println("cantidad de numero impares: "+ impares);


/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan los números o resultados.
*/
//        int cont=0;
//        int num;
//        System.out.println("ingrese un numero: ");
//        num= scan.nextInt();
//        while(num!=0){
//           cont++;
//            num/=10;
//        }
//        System.out.println(cont);

//      OR

//         int numero= scan.nextInt();
//        int cantidadDigitos = (int) (Math.log10(numero) + 1);
//
//        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");


/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String
*/


//        for (int i = 0; i < 1000; i++) {
//            String num = String.format("%03d", i); // convierte el número en una cadena con 3 dígitos
//            if (num.charAt(0) == '3') {
//                num = "E" + num.substring(1); // sustituye el primer dígito por "E"
//            }
//            if (num.charAt(1) == '3') {
//                num = num.substring(0, 1) + "E" + num.substring(2); // sustituye el segundo dígito por "E"
//            }
//            if (num.charAt(2) == '3') {
//                num = num.substring(0, 2) + "E"; // sustituye el tercer dígito por "E"
//            }
//            System.out.println(num);

/*

*/



    }
}

