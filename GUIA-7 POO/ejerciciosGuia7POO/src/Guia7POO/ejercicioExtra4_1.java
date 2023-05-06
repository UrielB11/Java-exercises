
import ENTIDAD.Receta2;
import ENTIDAD.Cocina2;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uriel
 */
public class ejercicioExtra4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Receta2 receta1 = new Receta2();
        Receta2 receta2 = new Receta2();
        Receta2 receta3 = new Receta2();
        Receta2 receta4 = new Receta2();
        Cocina2 cocina1 = new Cocina2();
        ArrayList<String> ingred = new ArrayList<>();
        ArrayList<String> ingred1 = new ArrayList<>();
        ArrayList<String> ingred2 = new ArrayList<>();
        ArrayList<String> ingred3 = new ArrayList<>();
        ingred.add("papa");
        ingred.add("zanahoria");
        ingred.add("mayonesa");
//        ingred.add("tomate");
//        ingred.add("pollo");
//        ingred.add("arveja");
//        ingred.add("frijoles");

        ingred1.add("harina");
        ingred1.add("salsa");
        ingred1.add("cebolla");
//        ingred1.add("aceite");
//        ingred1.add("queso");
//        ingred1.add("oregano");

        ingred2.add("bife");
        ingred2.add("huevo");
        ingred2.add("pan rallado");
        ingred2.add("aceite");
        ingred2.add("papa");
        ingred2.add("leche");
        ingred2.add("manteca");


        ingred3.add("arroz");
        ingred3.add("cebolla");
        ingred3.add("ajo");
        ingred3.add("jamón");
        ingred3.add("vino blanco");
        ingred3.add("queso parmesano");
        ingred3.add("aceite de oliva");

        receta1.setNombre("Ensalada Rusa");
        receta1.setPasos("Refrigera la ensalada rusa durante al menos una hora antes de servirla."
                + "Lava y pela las papas y las zanahorias. Corta las papas y las zanahorias en cubos pequeños y ponlas a hervir en una olla con agua con sal durante unos 15 minutos o hasta que estén tiernas.\n"
                + "\n"
                + "Mientras tanto, corta las habichuelas verdes en trozos pequeños y cocínalas al vapor o hiérvelas en agua durante unos 5 minutos. Cuando estén listas, escúrrelas y déjalas enfriar.\n"
                + "\n"
                + "Cocina los guisantes con un poco de sal en una olla con agua durante unos 5 minutos. Escúrrelos y déjalos enfriar.\n"
                + "\n"
                + "Hierve los huevos durante unos 10 minutos o hasta que estén duros. Enfríalos, pela y córtalos en cubos pequeños.\n"
                + "\n"
                + "Cuando las papas y las zanahorias estén cocidas, escúrrelas y déjalas enfriar.\n"
                + "\n"
                + "En un bol grande, mezcla las papas, las zanahorias, los guisantes, las habichuelas verdes y los huevos.\n"
                + "\n"
                + "Agrega la mayonesa y mezcla bien todos los ingredientes. Si lo deseas, puedes agregar un poco de sal y pimienta al gusto.\n");
        receta1.setTiempo(20);
        receta1.setIngredientes(ingred);

        receta2.setNombre("Pizza Fugasetta");
        receta2.setPasos("Precalentar el horno a 220°C.\n"
                + "\n"
                + "Pelar las cebollas y cortarlas en rodajas finas.\n"
                + "\n"
                + "En una sartén grande, calentar 2 cucharadas de aceite de oliva a fuego medio. Agregar las cebollas y cocinarlas hasta que estén doradas y suaves, aproximadamente durante 15 minutos. Agregar sal y pimienta al gusto.\n"
                + "\n"
                + "Estirar la masa de pizza sobre una bandeja para horno.\n"
                + "\n"
                + "Agregar las cebollas cocidas sobre la masa de pizza.\n"
                + "\n"
                + "Espolvorear el queso mozzarella rallado y el queso parmesano rallado sobre las cebollas.\n"
                + "\n"
                + "Agregar un poco de orégano al gusto.\n"
                + "\n"
                + "Llevar la pizza al horno durante 12 a 15 minutos, o hasta que la masa esté dorada y el queso se haya derretido.\n"
                + "\n"
                + "Sacar del horno y dejar enfriar por unos minutos antes de servir");
        receta2.setTiempo(15);
        receta2.setIngredientes(ingred1);

        receta3.setNombre("Milanesas con Puré");
        receta3.setPasos("Pelar las papas y cortarlas en trozos pequeños. Colocarlas en una olla con agua fría y llevar a hervor. Cocinar hasta que estén suaves.\n"
                + "\n"
                + "Mientras se cocinan las papas, sazonar los bifes con sal y pimienta.\n"
                + "\n"
                + "Batir los huevos en un plato hondo y colocar el pan rallado en otro plato hondo.\n"
                + "\n"
                + "Pasar cada bife por el huevo batido y luego por el pan rallado, asegurándose de cubrirlos completamente.\n"
                + "\n"
                + "Calentar el aceite en una sartén a fuego medio-alto. Agregar los bifes y cocinar durante unos 3-4 minutos de cada lado, o hasta que estén dorados y crujientes. Colocar sobre papel absorbente para eliminar el exceso de aceite.\n"
                + "\n"
                + "Mientras tanto, escurrir las papas y machacarlas con un tenedor o con un prensa papas. Agregar la leche, la mantequilla y sazonar con sal y pimienta al gusto. Mezclar bien hasta que se forme un puré suave.\n"
                + "\n"
                + "Servir las milanesas con el puré de papas y disfrutar de una deliciosa cena.");
        receta3.setTiempo(17);
        receta3.setIngredientes(ingred2);

        receta4.setNombre("Risotto");
        receta4.setPasos("Calentar el caldo en una olla a fuego medio-bajo. Mantener caliente mientras se prepara el risotto.\n"
                + "\n"
                + "En otra olla grande, calentar 2 cucharadas de aceite de oliva a fuego medio. Agregar la cebolla y el ajo y cocinar hasta que estén dorados y fragantes, alrededor de 2-3 minutos.\n"
                + "\n"
                + "Agregar el arroz y cocinar por 2 minutos, revolviendo constantemente para que se cubra bien con el aceite.\n"
                + "\n"
                + "Agregar el vino blanco y cocinar por 2 minutos, o hasta que el arroz haya absorbido todo el líquido.\n"
                + "\n"
                + "Comenzar a agregar el caldo de pollo o vegetales, una taza a la vez, revolviendo constantemente hasta que el arroz haya absorbido todo el líquido antes de agregar la siguiente taza. Este proceso debe tomar alrededor de 20-25 minutos. El risotto estará listo cuando el arroz esté cocido pero aún al dente.\n"
                + "\n"
                + "Agregar la mantequilla y el queso parmesano rallado y mezclar bien hasta que se derritan y se integren completamente.\n"
                + "\n"
                + "Probar y ajustar la sazón con sal y pimienta al gusto.\n"
                + "\n"
                + "Servir caliente y disfrutar.");
        receta4.setIngredientes(ingred3);
        receta4.setTiempo(30);
        

        cocina1.agregarRecetas(receta1);
        cocina1.agregarRecetas(receta2);
        cocina1.agregarRecetas(receta3);
        cocina1.agregarRecetas(receta4);
//        cocina1.buscarReceta();
//        cocina1.agregarIngredientes();
//        cocina1.queRecetas();
//        cocina1.mostrarIngredientes();
        int op;
        do {
            
        System.out.println("---------MENU---------");
        System.out.println("1- BUSCAR RECETA");
        System.out.println("2- CARGAR INGREDIENTES");
        System.out.println("3- CREAR NUEVA RECETA");
        System.out.println("4- QUE PUEDO COCINAR?");
        System.out.println("5- SALIR");
        System.out.println("--ingrese una opcion:--");
        op = sc.nextInt();
        
        switch (op) {
            case 1:{
                    cocina1.buscarReceta();
                break;
            }
            case 2:{
                    cocina1.agregarIngredientes();
                break;
            }
            case 3:{
                        Receta2 nuevaReceta= new Receta2();
                        System.out.println("ingrese nombre de la receta:");
                        String name= sc.next();
                        nuevaReceta.setNombre(name);
                        nuevaReceta.agregarIngredientes();
                        System.out.println("ingrese tiempo de cocción:");
                        nuevaReceta.setTiempo(sc.nextInt());
                        System.out.println("ingrese las instrucciones:");
                        String steps= sc.next();
                        nuevaReceta.setPasos(steps);
                        cocina1.agregarRecetas(nuevaReceta);
                        
                break;
            }
            case 4:{
                System.out.println("Con los ingredientes disponibles usted puede preparar la/s siguiente/s receta/s:");
                    cocina1.queRecetas();
                break;
            }
            case 5:{
                break;
            }
            default:
                System.out.println("Opcion incorrecta.");;
        }
        } while (op!=5);
        

    }

}
