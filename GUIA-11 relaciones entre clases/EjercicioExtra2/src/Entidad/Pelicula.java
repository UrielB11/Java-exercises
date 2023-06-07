/*
Luego, de las películas nos interesa saber
el título, duración, edad mínima y director.
 */
package Entidad;

class Pelicula {
    private String titulo;
    private Integer duracionMinutos;
    private Integer EdadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracionMinutos, int EdadMinima, String director) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.EdadMinima = EdadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getEdadMinima() {
        return EdadMinima;
    }

    public void setEdadMinima(int EdadMinima) {
        this.EdadMinima = EdadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracionMinutos=" + duracionMinutos + ", EdadMinima=" + EdadMinima + ", director=" + director + '}';
    }
    
    
}
