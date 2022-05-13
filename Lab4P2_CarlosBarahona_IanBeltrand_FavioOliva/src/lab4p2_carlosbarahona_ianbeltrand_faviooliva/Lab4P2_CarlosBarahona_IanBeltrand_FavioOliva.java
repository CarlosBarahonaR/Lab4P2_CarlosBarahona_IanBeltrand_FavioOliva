/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona_ianbeltrand_faviooliva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab4P2_CarlosBarahona_IanBeltrand_FavioOliva {

    static ArrayList<Spiderman> spidermans = new ArrayList();
    static ArrayList<Siniestro> siniestros = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nOpciones disponibles:"
                    + "\n0. Salir"
                    + "\n1. Listar Spiderman"
                    + "\n2. Listar Enemigos"
                    + "\n3. Modificar Spiderman"
                    + "\n4. Modificar Enemigos"
                    + "\n5. Jugar"
                    + "\nseleccione una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 0: {
                    System.out.println("-----Saliendo-----");
                    System.exit(0);
                }
                break;

                case 1: {
                    System.out.println("-----Listar Spiderman-----");
                    for (int u = 0; u < spidermans.size(); u++) {
                        if (spidermans.get(u) instanceof Spiderman) {
                            System.out.println(spidermans.get(u).toString());

                        }
                    }

                }
                break;

                case 2: {
                    System.out.println("-----Listar Enemigos-----");
                    for (int u = 0; u < siniestros.size(); u++) {
                        if (siniestros.get(u) instanceof Siniestro) {
                            System.out.println(siniestros.get(u).toString());

                        }
                    }

                }
                break;

                case 3: {
                    System.out.println("-----Modificar Spiderman-----");

                }
                break;

                case 4: {
                    System.out.println("-----Modificar Enemigos-----");

                }
                break;

                case 5: {
                    System.out.println("-----Jugar-----");
                }
                break;

                default:
                    System.out.println("opcion incorrecta o no es un entero!\n");
                    break;

            }
        } while (opcion != 0);
    }

}
