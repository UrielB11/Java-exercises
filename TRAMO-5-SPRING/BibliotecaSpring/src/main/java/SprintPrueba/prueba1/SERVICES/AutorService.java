
package SprintPrueba.prueba1.SERVICES;

import SprintPrueba.prueba1.ENTITIES.Autor;
import SprintPrueba.prueba1.EXCEPTIONS.MyException;
import SprintPrueba.prueba1.REPOSITORY.AutorRepository;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
       @Autowired
       private AutorRepository ar;
       
       @Transactional
       public void crearAutor(String nombre) throws MyException{
            
           validarAutor(nombre);
           
           Autor a= new Autor();
              a.setNombre(nombre);
              
              ar.save(a);
              
       }
       
       public void modificarAutor(String idAutor, String nombre) throws MyException{
           
           validarAutor(nombre);
              
              Optional<Autor> rta= ar.findById(idAutor);
              
              if(rta.isPresent()){
                     
                     Autor a= rta.get();
                     a.setNombre(nombre);
                     
              }
       }
       
       public Map<String,String> listarAutores(){
           Map<String,String> autores= new HashMap<>();
           List<Autor> autoresList= ar.findAll();
           
           autoresList.forEach(a->autores.put(a.getId(),a.getNombre()));
           
           return autores;
       }
       private void validarAutor(String nombre) throws MyException{
           
           if(nombre.isEmpty()|| nombre== null){
               throw new MyException("El nombre no puede ser nulo");
           }
       }
       
     
       
}
