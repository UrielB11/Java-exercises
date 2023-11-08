package SprintPrueba.prueba1.SERVICES;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.UserCredentialsDataSourceAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import SprintPrueba.prueba1.ENTITIES.Usuario;
import SprintPrueba.prueba1.ENUMS.Rol;
import SprintPrueba.prueba1.EXCEPTIONS.MyException;
import SprintPrueba.prueba1.REPOSITORY.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{
    @Autowired
    private UsuarioRepository userRepo;

    @Transactional
    public void registrarUsuario(String nombre, String email, String pasword, String pasword2) throws MyException{
        validarUsuario(nombre, email, pasword, pasword2);
        Usuario user= new Usuario();
        user.setNombreUsuario(nombre);
        user.setEmail(email);
        user.setContrasenia(pasword);
        user.setRol(Rol.USER);

        userRepo.save(user);


    }
    private void validarUsuario(String nombre, String email, String pasword, String pasword2) throws MyException {
        if(nombre.isEmpty()||nombre==null){
            throw new MyException("El nombre de usuario no puede ser vacio");
        }
        if(email.isEmpty()||email==null){
            
            throw new MyException("El email del usuario no puede ser vacio");
        }
        if(pasword.isEmpty()||pasword==null || pasword.length()<5){
            
            throw new MyException("La contraseña debe tener la menos 6 caracteres");
        }
        if (!pasword2.equals(pasword)){
            throw new MyException("Las contraseñas debe ser iguales");
            
        }
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario user= userRepo.buscarUsuarioPorMail(email);
        if(user!= null){
            List<GrantedAuthority> permisos= new ArrayList<>();
            GrantedAuthority p= new SimpleGrantedAuthority(("ROLE_"+user.getRol().toString()));
            permisos.add(p);
            return new User(user.getEmail(), user.getContrasenia(),permisos);
        }else{

            return null;
        }

    }

}

