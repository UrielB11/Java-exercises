package SprintPrueba.prueba1.SERVICES;

import SprintPrueba.prueba1.ENTITIES.Autor;
import SprintPrueba.prueba1.ENTITIES.Editorial;
import SprintPrueba.prueba1.EXCEPTIONS.MyException;
import SprintPrueba.prueba1.REPOSITORY.EditorialRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {

    @Autowired
    EditorialRepository er;

    @Transactional
    public void crearEditorial(String nombre) throws MyException {

        validarEditorial(nombre);
        Editorial edi = new Editorial();

        edi.setNombre(nombre);

        er.save(edi);

    }

    public void modificarEditorial(String idEditorial, String nombre) {

        Optional<Editorial> rta = er.findById(idEditorial);

        if (rta.isPresent()) {

            Editorial e = rta.get();
            e.setNombre(nombre);

        }
              
    }         

    public Map<String, String> listarEditorial() {
        
        Map<String, String> editoriales = new HashMap<>();
        List<Editorial> editorialList = er.findAll();

        editorialList.forEach(a -> editoriales.put(a.getId(), a.getNombre()));

        return editoriales;
    }

private void validarEditorial(String nombre) throws MyException{
           
           if(nombre.isEmpty()|| nombre== null){
               throw new MyException("El nombre no puede ser nulo");
           }
       }
       
}
