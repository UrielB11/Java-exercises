package SprintPrueba.prueba1.CONTROLLERS;

import SprintPrueba.prueba1.EXCEPTIONS.MyException;
import SprintPrueba.prueba1.SERVICES.AutorService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor") //localhost:8080/autor
public class AutorController {
    
    @Autowired
    AutorService as;

    @GetMapping("/registrar") //localhost:8080/autor/registrar

    public String registrar() {

        return "autorForm.html";

    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombreAutor, ModelMap model) {
        
        try{
            
            as.crearAutor(nombreAutor);
            model.put("exito","El autor se cargo exitosamente");
        
        }catch(MyException e){
            
            model.put("error", e.getMessage());
            System.out.println(e.getMessage());
            return "autorForm.html";
            
        }
        
        return "autorForm.html";
        
    }

    @GetMapping("/listaAutores")
    public String listarAutores(ModelMap model){

        Map<String,String>autoresList = new HashMap<>();
        autoresList= as.listarAutores();
        model.addAttribute("lista",autoresList);
        
        return "listaAutores.html"; 
    }
}



