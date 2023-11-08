package SprintPrueba.prueba1.SERVICES;

import SprintPrueba.prueba1.ENTITIES.Autor;
import SprintPrueba.prueba1.ENTITIES.Editorial;
import SprintPrueba.prueba1.ENTITIES.Libro;
import SprintPrueba.prueba1.EXCEPTIONS.MyException;
import SprintPrueba.prueba1.REPOSITORY.AutorRepository;
import SprintPrueba.prueba1.REPOSITORY.EditorialRepository;
import SprintPrueba.prueba1.REPOSITORY.LibroRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {

    @Autowired
    private LibroRepository lr;
    @Autowired
    private AutorRepository ar;
    @Autowired
    private EditorialRepository er;

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MyException {

        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        Libro l = new Libro();
        Autor aut = ar.findById(idAutor).get();
        Editorial edi = er.findById(idEditorial).get();

        l.setIsbn(isbn);
        l.setTitulo(titulo);
        l.setEjemplares(ejemplares);
        l.setAlta(new Date());

        l.setAutor(aut);
        l.setEditorial(edi);

        lr.save(l);
    }

    public List<Libro> listarLibros() {
        List<Libro> libros = new ArrayList<>();
        libros = lr.findAll();

        return libros;
    }

    public void modificarLibro(Long isbn, String idEditorial, String idAutor, String titulo, Integer ejemplares) throws MyException {

        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        Optional<Libro> rtaL = lr.findById(isbn);
        Optional<Autor> rtaA = ar.findById(idAutor);
        Optional<Editorial> rtaE = er.findById(idEditorial);

        Autor a = new Autor();
        Editorial e = new Editorial();

        if (rtaA.isPresent()) {
            a = rtaA.get();
        }
        if (rtaE.isPresent()) {
            e = rtaE.get();
        }

        if (rtaL.isPresent()) {
            Libro l = rtaL.get();
            l.setTitulo(titulo);
            l.setAutor(a);
            l.setEditorial(e);
            l.setEjemplares(ejemplares);
        }
    }

    private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor,  String idEditorial) throws MyException {

        if (isbn == null) {
            throw new MyException("El isbn no puede ser nulo");
        }
        if (titulo.isEmpty() || titulo == null) {
            throw new MyException("El titulo no puede ser nulo");
        }
        if (idAutor.isEmpty() || idAutor == null) {
            throw new MyException("El autor no puede ser nulo");
        }
        if (ejemplares == null) {
            throw new MyException("Ejemplares no puede ser nulo");
        }
        if (idEditorial.isEmpty() || idEditorial == null) {
            throw new MyException("El editorial no puede ser nulo");
        }

    }
}
