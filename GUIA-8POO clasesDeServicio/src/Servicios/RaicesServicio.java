/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado.
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para construir 
el objeto a través de un método constructor. Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
//Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
//Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra 
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

 */
package Servicios;

import Entidades.Raices;


public class RaicesServicio {
    public double getDiscriminante(Raices r){
        return(double)Math.round((Math.pow(r.getB(), 2)-4*r.getA()*r.getC())*100d/100d);
    }
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r)>0;
    }
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r)==0;
    }
    public void obtenerRaices(Raices r){
        if(tieneRaices(r)){
            System.out.println((double)Math.round((-r.getB()+Math.sqrt(getDiscriminante(r))/2*r.getA()))*100d/100d);
            System.out.println((double)Math.round((-r.getB()-Math.sqrt(getDiscriminante(r))/2*r.getA())*100d/100d));
        }
        else{
            System.out.println("La ecuacion no tiene dos soluciones (invocar otro metodo)");
        }
    }
    public void obtenerRaiz(Raices r){
        if(tieneRaiz(r)){
            System.out.println(-r.getB()/2*r.getA());
        }
        else{
        System.out.println("El sistema tiene mas de una solucion (invocar otro metodo");
         }
    }
    public void calcular(Raices r){
        if(tieneRaices(r)){
            obtenerRaices(r);
        }
        else if(tieneRaiz(r)){
            obtenerRaiz(r);
        }
        else{
            System.out.println(" La ecuacion no tiene solucion");
        }
    }
}
