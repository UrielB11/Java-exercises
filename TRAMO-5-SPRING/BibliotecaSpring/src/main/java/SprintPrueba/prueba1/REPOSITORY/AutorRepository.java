
package SprintPrueba.prueba1.REPOSITORY;

import SprintPrueba.prueba1.ENTITIES.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, String>{
       
}
