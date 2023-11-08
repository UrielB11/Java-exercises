package SprintPrueba.prueba1.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import SprintPrueba.prueba1.ENTITIES.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM usuario u WHERE u.mail= :mail")
    public Usuario buscarUsuarioPorMail(@Param("mail")String mail);
    
}