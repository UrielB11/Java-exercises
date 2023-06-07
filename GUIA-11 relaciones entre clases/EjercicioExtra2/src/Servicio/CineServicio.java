/*

 */
package Servicio;

import java.io.*;
import Entidad.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CineServicio {

    private ArrayList<Espectador> espectadores;
    private Scanner sc = new Scanner(System.in);

    public void llenarSala(Cine c) {
        Asciento[][] salaAux = new Asciento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                char columna = 'x';
                switch (j) {
                    case 0:
                        columna = 'A';
                        break;
                    case 1:
                        columna = 'B';
                        break;
                    case 2:
                        columna = 'C';
                        break;
                    case 3:
                        columna = 'D';
                        break;
                    case 4:
                        columna = 'E';
                        break;
                    case 5:
                        columna = 'F';
                        break;
                }

                salaAux[i][j] = new Asciento(i, columna, false);
            }
        }
        c.setSala(salaAux);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(salaAux[i][j]);
            }
            System.out.println("");
        }
    }

    public void crearEspectadoresJunes(Cine c) {
        espectadores = new ArrayList();
//            System.out.println(System.getProperty("user.dir"));
        try {
            File listaNombres = new File("nombres.txt");
            Scanner Lector = new Scanner(listaNombres);
            Asciento[][] mAux = new Asciento[8][6];
            mAux = c.getSala();
            for (int i = 0; i < 48; i++) {
                while (Lector.hasNextLine()) {

//            System.out.println(Lector.nextLine());
                    String datosLector = Lector.nextLine();

                    espectadores.add(new Espectador(datosLector, 23,  1500, mAux[(int) (Math.random() * 8)][(int) Math.random() * 6]));
                }

            }
            System.out.println(espectadores.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

    }

}
