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

                case 6: {
                    int opcion2;
                    do {
                        System.out.println("Ingrese tipo de Spider man"
                                + "\n1.spider punk"
                                + "\n2.spider superior"
                                + "\n3.spider clasico"
                                + "\ningrese opcion: ");
                        opcion2 = leer.nextInt();

                        switch (opcion2) {
                            case 1: {
                                System.out.println("Spider punk\n");
                                System.out.println("Ingrese nombre: ");
                                String nombre = leer.next();
                                System.out.println("Ingrese puntos de ataque: ");
                                int ptsAtack = leer.nextInt();
                                System.out.println("Ingrese puntos de vida: ");
                                int ptsVida = leer.nextInt();
                                System.out.println("Ingrese nombre de universo: ");
                                String nombreUni = leer.next();

                                spidermans.add(new SpiderPunk(nombre, ptsAtack, ptsVida, nombreUni));

                            }
                            break;

                            case 2: {
                                System.out.println("Spider superior\n");
                                System.out.println("Ingrese nombre: ");
                                String nombre = leer.next();
                                System.out.println("Ingrese puntos de ataque: ");
                                int ptsAtack = leer.nextInt();
                                System.out.println("Ingrese puntos de vida: ");
                                int ptsVida = leer.nextInt();
                                System.out.println("Ingrese nombre de universo: ");
                                String nombreUni = leer.next();

                                spidermans.add(new SuperiorSpiderman(nombre, ptsAtack, ptsVida, nombreUni));
                            }
                            break;

                            case 3: {
                                System.out.println("Spider clasico\n");
                                System.out.println("Ingrese nombre: ");
                                String nombre = leer.next();
                                System.out.println("Ingrese puntos de ataque: ");
                                int ptsAtack = leer.nextInt();
                                System.out.println("Ingrese puntos de vida: ");
                                int ptsVida = leer.nextInt();
                                System.out.println("Ingrese nombre de universo: ");
                                String nombreUni = leer.next();

                                spidermans.add(new Spiderman(nombre, ptsAtack, ptsVida, nombreUni));
                            }
                            break;

                            default: {
                                System.out.println("fuera de rango");
                            }
                            break;

                        }
                    } while (opcion2 < 1 || opcion2 > 3);
                }
                break;
                default: {
                    System.out.println("opcion incorrecta o no es un entero!\n");
                }
                break;

            }
        } while (opcion != 0);
    }

}