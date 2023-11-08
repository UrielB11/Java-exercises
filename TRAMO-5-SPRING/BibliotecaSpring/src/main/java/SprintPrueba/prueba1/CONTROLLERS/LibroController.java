
package SprintPrueba.prueba1.CONTROLLERS;

import SprintPrueba.prueba1.ENTITIES.Autor;
import SprintPrueba.prueba1.ENTITIES.Editorial;
import SprintPrueba.prueba1.ENTITIES.Libro;
import SprintPrueba.prueba1.EXCEPTIONS.MyException;
import SprintPrueba.prueba1.SERVICES.AutorService;
import SprintPrueba.prueba1.SERVICES.EditorialService;
import SprintPrueba.prueba1.SERVICES.LibroService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@RequestMapping("/libro")
public class LibroController {
    
    @Autowired
    private AutorService as;
    @Autowired
    private EditorialService es;
    @Autowired
    private LibroService ls;
    
    
    @GetMapping("/registrar")
    public String registrar(ModelMap model){
        
        Map<String,String> autores= new HashMap<String, String>();
        
        autores= as.listarAutores();
        
        Map <String,String> editoriales= new HashMap<String, String>();
       
        editoriales= es.listarEditorial();
        
        model.addAttribute("autores",autores);
        model.addAttribute("editoriales",editoriales);
        
        return "libroForm.html";
    }
    
    @PostMapping("/registro")
    public String registrarLibro(@RequestParam(required= false) Long isbn,@RequestParam String titulo,
                                @RequestParam(required= false)Integer ejemplares,
                                @RequestParam String idAutor, @RequestParam String idEditorial,
                                ModelMap model){
        
        
        try {
            
            ls.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
        
            model.put("exito", "El libro fue cargado correctamente");
            
        } catch (MyException ex) {
            
            Logger.getLogger(LibroController.class.getName()).log(Level.SEVERE, null, ex);
            
            model.put("error", ex.getMessage());
            
            return "libroForm.html";
        }
        
        return "libroForm.html";
        
    }


    
    
    @GetMapping("/listaLibros")
    public String listarLibros(ModelMap model){
        
        List<Libro> libros= ls.listarLibros();
        model.addAttribute("lista",libros);
        

        
        return "listaLibros.html";
    }
    
    
}
