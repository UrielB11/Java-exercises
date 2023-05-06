/*Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). 
Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. 
En NIFService se dispondrá de los siguientes métodos:
//Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: 
Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22).
El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:

LETRA
T
R
W
A
G
M
Y
F
P
D
X
B
N
J
Z
S
Q
V
H
L
C
K
E


*/
package Servicios;
import Entidades.Nif;

public class NifService {
    public String[] letras= new String[23];

    public void llenarLetras(){    
    letras[0]="T";
    letras[1]="R";
    letras[2]="W";
    letras[3]="A";
    letras[4]="G";
    letras[5]="M";
    letras[6]="Y";
    letras[7]="F";
    letras[8]="P";
    letras[9]="D";
    letras[10]="X";
    letras[11]="B";
    letras[12]="N";
    letras[13]="J";
    letras[14]="Z";
    letras[15]="S";
    letras[16]="Q";
    letras[17]="V";
    letras[18]="H";
    letras[19]="L";
    letras[20]="C";
    letras[21]="K";
    letras[22]="E";
    }
    public long getDni(Nif x){
    return x.Dni;
    }
    public String getLetra(Nif x){
    return x.Letra;
    }
    public void setDni(Nif x, long nuevoDni){
        x.Dni= nuevoDni;
    }
    public void setLetra(Nif x, String nuevoLetra){
        x.Letra= nuevoLetra;
    }
    
    public void crearNif(Nif x){
        llenarLetras();
        int resto= (int)getDni(x)%23;
        setLetra(x, letras[resto]);
    
    }
    
    public void mostrar(Nif x){
        System.out.println(getDni(x) +"-"+getLetra(x));
    }
    
}
