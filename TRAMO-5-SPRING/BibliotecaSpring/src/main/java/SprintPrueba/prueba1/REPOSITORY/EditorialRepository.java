package SprintPrueba.prueba1.REPOSITORY;

import SprintPrueba.prueba1.ENTITIES.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, String> {
   
}
