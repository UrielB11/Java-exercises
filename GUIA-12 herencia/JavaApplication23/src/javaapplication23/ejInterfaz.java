package javaapplication23;

import Entidade.nuevaEntidad;
import Entidade.nuevaEntidad2;

public class ejInterfaz {

    public static void main(String[] args) {
        nuevaEntidad entidad= new nuevaEntidad();
        nuevaEntidad2 entidad1= new nuevaEntidad2();
        
        entidad.saludar();
        System.out.println("---------------------------------");
        entidad1.saludar();
        
    }

}
