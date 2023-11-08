
package SprintPrueba.prueba1.CONTROLLERS;

import SprintPrueba.prueba1.EXCEPTIONS.MyException;
import SprintPrueba.prueba1.SERVICES.EditorialService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/editorial")
public class EditorialController {
    
    @Autowired
    private EditorialService es;
    
    @GetMapping("/registrar")
    public String registrar(){
        
        return "editorialForm.html";
    }
    
        
    @PostMapping("/registro")
    public String registro(@RequestParam String nombreEditorial, ModelMap model) {
        
        try {
            es.crearEditorial(nombreEditorial);
            model.put("exito","El editorial se cargo exitosamente");
        } catch (MyException ex) {
            model.put("error",ex.getMessage());
            Logger.getLogger(EditorialController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "editorialForm.html";
        
    }
}
