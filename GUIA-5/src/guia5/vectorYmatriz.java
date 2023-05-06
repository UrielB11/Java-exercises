
package guia5;

import java.util.Scanner;
public class vectorYmatriz {

    public static void main(String[] args) {
            
      /*
      Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
  
      */  
//      int[] vector= new int[100];
//      
//      for(int i =0; i< vector.length; i++){
//          vector[i]=i+1;
//    }
//    for(int i =vector.length-1; i>=0; i--){
//        System.out.println(vector[i]);
//    }
    
/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

*/

    Scanner sc= new Scanner(System.in);
//    int n;
//        System.out.println("Ingrese la dimencion del vector:");
//        n = sc.nextInt();
//        int[] vector= new int[n];
//    
//    
//    for (int i = 0; i<vector.length; i++){
//        vector[i]= (int) (Math.random()*10);
//      //  System.out.print(vector[i]+" ");;
//    }
//    
//        System.out.println("Ingrese el numero que desea encontrar:");
//        int num= sc.nextInt();
//        int cont=0;
//        int[] position = new int[n];
//    for (int i = 0; i<vector.length; i++){
//        position[i]=-1;
//    }
//     for (int i = 0; i<vector.length; i++){
//      System.out.print(vector[i]+" ");
//        if (vector[i]==num){
//            position[i]  = i;
//            cont++;
//            
//         }
//    }
//             System.out.println("");  
//             
//             String aux="";
//             for(int elemento:position){
//                if(elemento!=-1){
//                    aux+= elemento+", ";
//                }
//            }
//             System.out.println("el numero se encontro "+cont+ " veces,en la/s posicion/es: "+aux);
//             
//       for (int i = 0; i<vector.length; i++){
//    }        
    

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/

// System.out.println("Ingrese la dimencion del vector:");
//    int n = sc.nextInt();
//    int[] vector= new int[n];
//    int[] vectorD= new int[n];
//    int digit=1;
//    int aux=0;
//    for (int i = 0; i<n; i++){
//        vector[i]=  (int) (Math.random() * 99999);
//        System.out.print(vector[i]+", ");
//    }
//        System.out.println("");
//    for (int j = 0; j<n; j++){
//
//        aux=vector[j];
//        digit=1;
//        while(aux/10!=0){
//            
//            aux/=10;
//            digit++;
//        }
//        vectorD[j]=digit;
//        
//        System.out.println("vector["+j+"] = "+vector[j]+"--->["+vectorD[j]+" digitos]");
//    }
//    



/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
*/
    
//    int [][] matriz= new int[4][4];
//    int [][] matrizT= new int[4][4];
//    
//    
//    for(int i =0 ; i<4;i++){
//        for(int j=0; j<4;j++){
//            matriz[i][j]= (int)(Math.random()*10);
//            System.out.print("["+matriz[i][j]+"]"+" ");
//        }
//        System.out.println("");
//    }
//    
//        System.out.println("---------------");
//    for(int i =0 ; i<4;i++){
//        for(int j=0; j<4;j++){
//            matrizT[i][j]= matriz[j][i];
//            System.out.print("["+matrizT[i][j]+"]"+" ");
//        }
//        System.out.println("");
//    }
/*
Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A 
se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

*/
    
//int[][] a= new int[3][3];
//int[][] at= new int[3][3];
//    
//        System.out.println("rellene la matriz A");
//        rellenar(a);
//        System.out.println("rellene la matriz AT");
//        rellenar(at);
//        imprimir(a);
//        System.out.println("");
//        imprimir(at);
//            if(antisimetrica(a, at)){
//            System.out.println("La matriz es antisimetrica");
//            }
//            else{
//                System.out.println("La matriz NO es antisimetrica");
//        }
//
//
//
//    }
//    
//    public static void rellenar(int a[][]){
//    Scanner sc= new Scanner(System.in);
//     for(int i=0; i<3; i++){
//        for(int j=0; j<3; j++){
//            a[i][j]= sc.nextInt();
//        }
//     }
//    }
//    public static void imprimir(int a[][]){
//        for(int i=0; i<3; i++){
//        for(int j=0; j<3; j++){
//            System.out.print(a[i][j]+" ");
//        }
//            System.out.println("");
//     }
//    }
//    public static boolean antisimetrica(int a[][], int at[][]){
//        int cont=0;
//        for(int i=0; i<3; i++){
//        for(int j=0; j<3; j++){
//            if(a[i][j]== -(at[j][i])){
//                cont++;
//            }
//        }
//    }
//                return cont==9;
//}

    
/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos
son correctos, es decir, están entre el 1 y el 9.
*/
//    int n;
//    int [][] matriz= new int[3][3];
//    int sumaF;
//    int vFila[]= new int[3];
//    int sumaC;
//    int vColumn[]= new int[3];
//    int sumaD=0;
//    int sumaD2=0;
//    
//        System.out.println("rellene la matriz con numeros del 1 al 9:");
//        
//        for(int i =0 ; i<3; i++){
//            for(int j=0; j<3; j++){
//              do{ 
//                 n= sc.nextInt();
//                 matriz[i][j]=n;
//                 if(n>9||n<1){
//                     System.out.println("El numero ingresado esta fuera del intervalo permitido. Intente nuevamente:");
//                 }
//             }while(n<0||n>9);
//            }
//        }    
//        for(int i=0; i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(matriz[i][j]+ " ");
//            }
//            System.out.println("");
//        }
//        
//        
//         for(int i =0 ; i<3; i++){
//            sumaF=0;
//            sumaC=0;
//            for(int j=0; j<3; j++){
//            sumaF+= matriz[i][j];
//            sumaC+= matriz[j][i];
//                
//            
// 
//
//                
//                if(i==j){
//                sumaD+= matriz[i][j];
//                }
//            }
//         vFila[i]=sumaF;
//         vColumn[i]=sumaC;
//         sumaD2 += matriz[2-i][i];
//         }
//          
//        
//    int cont=0;
//        for(int i=0; i<3;i++){
//        if(vFila[i]==sumaD && vColumn[i]==sumaD2 && sumaD==sumaD2){
//            cont++;
//       }
//        }
//        
//        if (cont==3){
//        System.out.println("LA MATRIZ ES MAGICA");
//    }
//        else{
//            System.out.println("LA MATRIZ NO ES MAGICA");    
//                }
    


/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos
para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

*/
int mNotas[][]= new int[10][4];
String mTabla[][]= new  String[11][6];
double prom[]= new double[10];
int aprobados=0;
int desaprobados=0;

inicializarM(mTabla);
mTabla[0][0]="Alumno";
mTabla[0][1]="1er TP";
mTabla[0][2]="2do TP";
mTabla[0][3]="1er TI";
mTabla[0][4]="2do TI";
mTabla[0][5]="Promedio";
cargarDatos(mNotas,mTabla);
llenarPromedios(mNotas,mTabla,prom);

for(int i=0;i<11;i++){
    for(int j=0; j<6;j++){
        if(j>=0&&i>0){    
        System.out.print(mTabla[i][j]+"       ");
        }
        else {
        System.out.print(mTabla[i][j]+"  ");
    }
    }
    System.out.println("");
}
    System.out.println("");
for(double elem:prom){
    if(elem>=7){
        aprobados++;
        }
        else{
            desaprobados++;    
        }  
    }
        System.out.println("APROBADOS: "+ aprobados);
        System.out.println("DESAPROBADOS: "+ desaprobados);

    }
    public static void inicializarM(String m[][]){
        for(int i=0;i<10;i++){
            for(int j=0; j<5;j++){
                m[i][j]="";
            }
        }
    }
    public static void cargarDatos(int m[][], String t[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Ingrese nombre del alumno:"+ (i+1));
            sc.nextLine();
            t[(i+1)][0]= sc.nextLine();
            for(int j=0; j<4;j++){
                switch (j){
                    case 0: {
                        System.out.println("Nota Primer trabajo práctico evaluativo");
                        m[i][j]= sc.nextInt();
                        t[i+1][j+1]= String.valueOf(m[i][j]);
                        
                        break;
                    }
                    case 1: {
                        System.out.println("Nota Segundo trabajo práctico evaluativo");
                        sc.nextLine();
                        m[i][j]= sc.nextInt();
                        t[i+1][j+1]= String.valueOf(m[i][j]);
                        break;
                    }
                    case 2: {
                        System.out.println("Nota Primer Integrador");
                        m[i][j]= sc.nextInt();
                        t[i+1][j+1]= String.valueOf(m[i][j]);
                        break;
                    }
                    case 3: {
                        System.out.println("Nota Segundo integrador");
                        m[i][j]= sc.nextInt();
                        t[i+1][j+1]= String.valueOf(m[i][j]);
                        break;
                    }
                }
            }
        }
    }
    public static void llenarPromedios(int m[][], String t[][],double v[]){
        double prom;
        for (int i=0;i<10;i++){
            prom=0;
            for( int j=0 ; j<4; j++){
                switch(j){
                    case 0:{
                        prom+= m[i][j]*.10;
                        break;
                    }
                    case 1:{
                        prom+= m[i][j]*.15;
                        break;
                    }
                    case 2:{
                        prom+= m[i][j]*.25;
                        break;
                    }
                    case 3:{
                        prom+= m[i][j]*.50;
                        break;
                    }
                }
            }
            t[i+1][5]= String.valueOf(prom);
            v[i]= prom;
                
    }
    }

    
    /*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
    construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
    en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no
    utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
    */
    

    
    }

