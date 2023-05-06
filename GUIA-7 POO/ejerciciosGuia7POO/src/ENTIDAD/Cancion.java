/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá́ definir además dos constructores: uno vacío que inicializa el título y el autor
a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.

 */
package ENTIDAD;

/**
 *
 * @author uriel
 */
public class Cancion {
    
    private String titulo;
    private String autor;
    
    public Cancion(){
    this.titulo="";
    this.autor="";
    
    }
    public Cancion(String title, String aut){
    this.titulo = title;
    this.autor = aut;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setTitulo(String title){
        this.titulo=title;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
}
