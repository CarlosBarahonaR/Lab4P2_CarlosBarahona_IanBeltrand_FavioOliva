/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona_ianbeltrand_faviooliva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab4P2_CarlosBarahona_IanBeltrand_FavioOliva {

    static ArrayList<Spiderman> spidermans = new ArrayList();
    static ArrayList<Siniestro> siniestros = new ArrayList();

    static ArrayList<String> NombreSpidermans = new ArrayList();
    static ArrayList<String> NombreSiniestros = new ArrayList();
    static ArrayList<String> NombreUniversos = new ArrayList();

    public static void Crear() {

        spidermans.clear();
        siniestros.clear();
        int ContadorN = 0;

        NombreSpidermans.add("Miles");
        NombreSpidermans.add("Favio");
        NombreSpidermans.add("Peter");
        NombreSpidermans.add("Ian");
        NombreSpidermans.add("Carlos");
        NombreSpidermans.add("Porky");
        NombreSpidermans.add("Andres");

        NombreSiniestros.add("Doc. Oct");
        NombreSiniestros.add("Morbius");
        NombreSiniestros.add("Buitre");
        NombreSiniestros.add("Samuel L. Jackson");
        NombreSiniestros.add("Duende Verde");
        NombreSiniestros.add("Andres");

        NombreUniversos.add("616");
        NombreUniversos.add("Oscuro");
        NombreUniversos.add("401");
        NombreUniversos.add("MC");
        NombreUniversos.add("Invertido");
        NombreUniversos.add("001");

        for (int j = 0; j < 2; j++) {
            SpiderPunk spiderpunk = new SpiderPunk(NombreSpidermans.get(ContadorN), 450, 1000, NombreUniversos.get(ContadorN));
            ContadorN = ContadorN + 1;
            spidermans.add(spiderpunk);
        }

        for (int j = 0; j < 2; j++) {
            Clasico spiderpunk = new Clasico(NombreSpidermans.get(ContadorN), 450, 1000, NombreUniversos.get(ContadorN));
            ContadorN = ContadorN + 1;
            spidermans.add(spiderpunk);
        }

        for (int j = 0; j < 2; j++) {
            SuperiorSpiderman spiderpunk = new SuperiorSpiderman(NombreSpidermans.get(ContadorN), 450, 1000, NombreUniversos.get(ContadorN));
            ContadorN = ContadorN + 1;
            spidermans.add(spiderpunk);
        }

        ContadorN = 0;

        for (int i = 0; i < 2; i++) {
            Blindado siniestro = new Blindado(NombreSiniestros.get(ContadorN), 450, 1000, NombreUniversos.get(0));
            ContadorN = ContadorN + 1;
            siniestros.add(siniestro);
        }

        for (int i = 0; i < 2; i++) {
            AlteradoGeneticamente siniestro = new AlteradoGeneticamente(NombreSiniestros.get(ContadorN), 450, 1000, NombreUniversos.get(0));
            ContadorN = ContadorN + 1;
            siniestros.add(siniestro);
        }

        for (int i = 0; i < 2; i++) {
            Alienigena siniestro = new Alienigena(NombreSiniestros.get(ContadorN), 450, 1000, NombreUniversos.get(0));
            ContadorN = ContadorN + 1;
            siniestros.add(siniestro);
        }

        Collections.shuffle(siniestros);
        Collections.shuffle(spidermans);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Crear();
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
                    + "\n6. crear spiderman"
                    + "\n7. crear siniestro"
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
                    int x;
                    do {
                        System.out.println("\nOpciones disponibles:"
                                + "\n1.editar un atributo"
                                + "\n2.editar todo"
                                + "\nseleccione una opcion: ");
                        x = leer.nextInt();

                        switch (x) {
                            case 1: {
                                System.out.println("editar un atributo\n");

                                System.out.println("Ingrese la posicion de la casa a modificar: ");
                                int pos = leer.nextInt();

                                int e;
                                do {
                                    System.out.println("\nOpciones disponibles:"
                                            + "\n1.modificar nombre"
                                            + "\n2.modificar pts de ataque"
                                            + "\n3.modificar pst de vida"
                                            + "\n4.modificar universo"
                                            + "\nseleccione una opcion: ");
                                    e = leer.nextInt();

                                    switch (e) {
                                        case 1:
                                            System.out.println("modificar nombre");

                                            System.out.println("Ingrese la nombre del spiderman: ");
                                            spidermans.get(pos).setNombre(leer.next());
                                            break;
                                        case 2:
                                            System.out.println("modificar pts de ataque");

                                            System.out.println("Ingrese puntos de ataque: ");
                                            spidermans.get(pos).setPuntosAtaque(leer.nextInt());
                                            break;
                                        case 3:
                                            System.out.println("modificar pst de vida");

                                            System.out.println("Ingrese puntos de vida: ");
                                            spidermans.get(pos).setPuntosVida(leer.nextInt());
                                            break;
                                        case 4:
                                            System.out.println("modificar universo");

                                            System.out.println("Ingrese nombre de universo: ");
                                            spidermans.get(pos).setNombreUniverso(leer.next());
                                            break;
                                        default:
                                            System.out.println("opcion incorrecta o no es un entero!\n");
                                            break;

                                    }
                                } while (e < 1 || e > 4);

                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese la posicion de la casa a modificar: ");
                                int pos = leer.nextInt();
                                System.out.println("Ingrese la nombre de la casa: ");
                                spidermans.get(pos).setNombre(leer.next());

                                System.out.println("Ingrese puntos de ataque: ");
                                spidermans.get(pos).setPuntosAtaque(leer.nextInt());

                                System.out.println("Ingrese puntos de vida: ");
                                spidermans.get(pos).setPuntosVida(leer.nextInt());

                                System.out.println("Ingrese nombre de universo: ");
                                spidermans.get(pos).setNombreUniverso(leer.next());

                            }
                            break;
                            default:
                                System.out.println("opcion incorrecta o no es un entero!\n");
                                break;

                        }
                    } while (x < 1 || x > 2);
                }
                break;

                case 4: {
                    System.out.println("-----Modificar Enemigos-----");
                    int x;
                    do {
                        System.out.println("\nOpciones disponibles:"
                                + "\n1.editar un atributo"
                                + "\n2.editar todo"
                                + "\nseleccione una opcion: ");
                        x = leer.nextInt();

                        switch (x) {
                            case 1: {
                                System.out.println("editar un atributo\n");

                                System.out.println("Ingrese la posicion de la casa a modificar: ");
                                int pos = leer.nextInt();

                                int e;
                                do {
                                    System.out.println("\nOpciones disponibles:"
                                            + "\n1.modificar nombre"
                                            + "\n2.modificar pts de ataque"
                                            + "\n3.modificar pst de vida"
                                            + "\n4.modificar universo"
                                            + "\nseleccione una opcion: ");
                                    e = leer.nextInt();

                                    switch (e) {
                                        case 1:
                                            System.out.println("modificar nombre");

                                            System.out.println("Ingrese la nombre del siniestro: ");
                                            siniestros.get(pos).setNombre(leer.next());
                                            break;
                                        case 2:
                                            System.out.println("modificar pts de ataque");

                                            System.out.println("Ingrese puntos de ataque: ");
                                            siniestros.get(pos).setPuntosAtaque(leer.nextInt());
                                            break;
                                        case 3:
                                            System.out.println("modificar pst de vida");

                                            System.out.println("Ingrese puntos de vida: ");
                                            siniestros.get(pos).setPuntosVida(leer.nextInt());
                                            break;
                                        case 4:
                                            System.out.println("modificar universo");

                                            System.out.println("Ingrese nombre de universo: ");
                                            siniestros.get(pos).setNombreUniverso(leer.next());
                                            break;
                                        default:
                                            System.out.println("opcion incorrecta o no es un entero!\n");
                                            break;

                                    }
                                } while (e < 1 || e > 4);

                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese la posicion de la casa a modificar: ");
                                int pos = leer.nextInt();
                                System.out.println("Ingrese la nombre del siniestro: ");
                                siniestros.get(pos).setNombre(leer.next());

                                System.out.println("Ingrese puntos de ataque: ");
                                siniestros.get(pos).setPuntosAtaque(leer.nextInt());

                                System.out.println("Ingrese puntos de vida: ");
                                siniestros.get(pos).setPuntosVida(leer.nextInt());

                                System.out.println("Ingrese nombre de universo: ");
                                siniestros.get(pos).setNombreUniverso(leer.next());

                            }
                            break;
                            default:
                                System.out.println("opcion incorrecta o no es un entero!\n");
                                break;

                        }
                    } while (x < 1 || x > 2);
                }
                break;

                case 5: {
                    System.out.println("-----Jugar-----");
                    
                    Jugar jugar = new Jugar();
                    
                    jugar.Jugar(spidermans, siniestros);
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

                                spidermans.add(new Clasico(nombre, ptsAtack, ptsVida, nombreUni));
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

                case 7: {
                    System.out.println("Crear Enemigo\n");
                    int opcion2;
                    do {
                        System.out.println("Ingrese tipo de Spider man"
                                + "\n1.blindado"
                                + "\n2.alienigena"
                                + "\n3.alterado geneticamente"
                                + "\ningrese opcion: ");
                        opcion2 = leer.nextInt();

                        switch (opcion2) {
                            case 1: {
                                System.out.println("Blindado\n");
                                System.out.println("Ingrese nombre: ");
                                String nombre = leer.next();
                                System.out.println("Ingrese puntos de ataque: ");
                                int ptsAtack = leer.nextInt();
                                System.out.println("Ingrese puntos de vida: ");
                                int ptsVida = leer.nextInt();
                                System.out.println("Ingrese nombre de universo: ");
                                String nombreUni = leer.next();

                                siniestros.add(new Blindado(nombre, ptsAtack, ptsVida, nombreUni));

                            }
                            break;

                            case 2: {
                                System.out.println("Alienigena\n");
                                System.out.println("Ingrese nombre: ");
                                String nombre = leer.next();
                                System.out.println("Ingrese puntos de ataque: ");
                                int ptsAtack = leer.nextInt();
                                System.out.println("Ingrese puntos de vida: ");
                                int ptsVida = leer.nextInt();
                                System.out.println("Ingrese nombre de universo: ");
                                String nombreUni = leer.next();

                                siniestros.add(new Alienigena(nombre, ptsAtack, ptsVida, nombreUni));
                            }
                            break;

                            case 3: {
                                System.out.println("Alterado Geneticamente\n");
                                System.out.println("Ingrese nombre: ");
                                String nombre = leer.next();
                                System.out.println("Ingrese puntos de ataque: ");
                                int ptsAtack = leer.nextInt();
                                System.out.println("Ingrese puntos de vida: ");
                                int ptsVida = leer.nextInt();
                                System.out.println("Ingrese nombre de universo: ");
                                String nombreUni = leer.next();

                                siniestros.add(new AlteradoGeneticamente(nombre, ptsAtack, ptsVida, nombreUni));
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
