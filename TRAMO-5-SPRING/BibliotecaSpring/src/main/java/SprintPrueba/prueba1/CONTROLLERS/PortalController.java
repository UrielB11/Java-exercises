package SprintPrueba.prueba1.CONTROLLERS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import SprintPrueba.prueba1.SERVICES.UsuarioService;

@Controller
@RequestMapping("/")
public class PortalController {
       
       @Autowired
       UsuarioService usServ;
       @GetMapping("/")
       public String index(){
              return "index.html";
       }

       @GetMapping("/registro")
       public String registro(){
              return "registro";
       }
       
       @GetMapping("/login")
       public String login(){
              return "login";              
       }
       @PostMapping("/registro")
       public String guardarUsuarioRegistrado(@RequestParam String nombre, @RequestParam String email, @RequestParam String contrasenia, @RequestParam String repContrasenia){
        try {
           usServ.registrarUsuario(nombre,email,contrasenia,repContrasenia);

        } catch (Exception e) {
            e.getMessage();
        }
        return "index.html";
    }
    
}
