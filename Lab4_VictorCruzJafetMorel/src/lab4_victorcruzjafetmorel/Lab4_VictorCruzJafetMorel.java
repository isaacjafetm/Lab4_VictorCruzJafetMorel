/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_victorcruzjafetmorel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 24661
 */
public class Lab4_VictorCruzJafetMorel {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            ArrayList<Jugadores> lista1 = new ArrayList();
            ArrayList<Equipos> lista2 = new ArrayList();

            int menuPrincipal = 0;
            boolean seguir = true;
            while (seguir == true) {
                System.out.println("Ingrese una opcion: \n"
                        + "1-crear\n"
                        + "2-modificar\n"
                        + "3-listar\n"
                        + "4-eliminar\n"
                        + "5-Simulacion\n"
                        + "6-Salir\n");
                System.out.print("-> ");
                int op1 = 0;
                boolean seguir2 = true;
                menuPrincipal = sc.nextInt();
                switch (menuPrincipal) {
                    case 1:
                        while (seguir2) {
                            System.out.println("1-Equipos\n"
                                    + "2-Jugadores \n"
                                    + "3-Salir\n");
                            System.out.print("--> ");
                            op1 = sc.nextInt();
                            switch (op1) {
                                case 1:
                                    System.out.println("Ingrese el nombre del equipo: ");
                                    String nom_e = sc.next();
                                    System.out.println("Ingrese el nombre Estadio");
                                    String n_est = sc.next();
                                    System.out.println("Ingrese el Pais");
                                    String pais = sc.next();
                                    System.out.println("Ingrese el nombre del entrenador: ");
                                    String nom_entre = sc.next();
                                    System.out.println("Ingrese el nombre del dueño: ");
                                    String n_due = sc.next();
                                    System.out.println("Ingrese de la mascota: ");
                                    String n_mas = sc.next();
                                    System.out.println("Ingrese la fecha de creacion: ");
                                    String fecha_crea = sc.next();
                                    System.out.println("Ingrese el color");
                                    String color = sc.next();
                                    lista2.add(new Equipos(nom_e, n_est, pais, nom_entre, n_due, n_mas, fecha_crea, color));
                                    break;
                                case 2:

                                    System.out.println("Nombre del jugador: ");
                                    String n_jug = sc.next();
                                    System.out.println("Ingrese el apodo: ");
                                    String apod = sc.next();
                                    System.out.println("Ingrese el furbolista favorito: ");
                                    String fut_fav = sc.next();
                                    System.out.println("Ingrese basquebolista favorito: ");
                                    String bas_fav = sc.next();
                                    System.out.println("Ingrese el Jugador Favorito: ");
                                    String play_fav = sc.next();
                                    System.out.println("Ingrese el numero de camisa: ");
                                    int num_cam = sc.nextInt();
                                    System.out.println("Ingrese el año de nacimiento: ");
                                    int a_nac = sc.nextInt();
                                    System.out.println("Ingrese el numero de Estrellas: ");
                                    int num_estre = sc.nextInt();
                                    boolean may = true;
                                    char res;
                                    System.out.println("Es mayor de Edad?[S/N]: ");
                                    res = sc.next().charAt(0);
                                    if (res == 's' && res == 'S') {
                                        may = true;
                                    } else {
                                        may = false;

                                    }//fin de la validacion
                                    System.out.println("Es pateador(1) o tirador(2)?");
                                    
                                    lista1.add(new Tiradores());
                                    lista1.get(0).setNom_jug(n_jug);
                                    lista1.get(0).setA_nac(a_nac);
                                    lista1.get(0).setApodo(apod);
                                    lista1.get(0).setFav_bas(bas_fav);
                                    lista1.get(0).setFav_fut(fut_fav);
                                    lista1.get(0).setFav_play(play_fav);
                                    lista1.get(0).setMay_ed(may);
                                    lista1.get(0).setNum_cam(num_cam);
                                    lista1.get(0).setNum_cam(num_estre);
                                    int tipo_j=sc.nextInt();
                                    if(tipo_j==2){
                                    System.out.println("Ingrese estadistica del tiro de 3{1-100]");
                                    int tiro_tres = sc.nextInt();
                                    System.out.println("Ingrese estadistica del tiro de 2{1-100]");
                                    int tiro_dos = sc.nextInt();
                                    System.out.println("Ingrese estadistica del manejo del balon {1-100]");
                                    int man_b = sc.nextInt();
                                    lista1.add(new Tiradores(tiro_tres, tiro_dos, man_b));
                                    }else if(tipo_j==1){
                                        System.out.println("Ingrese estadistica de la habilidad pateadora{1-100]");
                                    int hp = sc.nextInt();
                                    System.out.println("Ingrese estadistica de la fuerza{1-100]");
                                    int f = sc.nextInt();
                                    System.out.println("Ingrese estadistica de la habilidad regateadora {1-100]");
                                    int hr = sc.nextInt();
                                    lista1.add(new Pateadores(hp, f, hr));
                                    
                                    }
                                    break;
                                
                                    
                                case 3:
                                    seguir2 = false;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida!");
                            }//fin del switch secundario
                        }//fin del while
                        break;

                    case 2:
                        while (seguir2) {
                            System.out.println("1-Equipos\n"
                                    + "2-Jugadores \n"
                                    + "3-Tiradores\n"
                                    + "4-Patedaores\n"
                                    + "5-Salir\n");
                            System.out.print("-> ");
                            op1 = sc.nextInt();

                            switch (op1) {
                                case 1:
                                    while (seguir2) {
                                        System.out.println("1-Nombre\n"
                                                + "2-Estadio \n"
                                                + "3-Pais\n"
                                                + "4-Nombre del entrenador\n"
                                                + "5-Nombre del Dueno\n"
                                                + "6-Nombre de Mascota"
                                                + "7-Fecha de Creacion"
                                                + "8-Color"
                                                + "9-Salir");
                                        System.out.print("-> ");
                                        op1 = sc.nextInt();
                                        switch (op1) {
                                            case 1:
                                                

                                                break;
                                            case 2:

                                                break;
                                            case 3:

                                                break;
                                            case 4:

                                                break;
                                            case 5:

                                                break;
                                            case 6:

                                                break;
                                            case 7:

                                                break;
                                            case 8:

                                                break;
                                            case 9:
                                                seguir2 = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese una opcion valida!");
                                        }//fin del switch
                                    }//fin del whileeeeeee
                                    break;
                                case 2:

                                    break;
                                case 3:

                                    break;
                                case 4:

                                    break;
                                case 5:
                                    seguir2 = false;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida!");
                            }//fin del switch secundario
                        }//fin del while
                        break;
                    case 3:
                        while (seguir2) {
                            System.out.println("1-Equipos\n"
                                    + "2-Jugadores \n"
                                    + "3-Tiradores\n"
                                    + "4-Patedaores\n"
                                    + "5-Salir\n");
                            System.out.print("-> ");
                            String output = "";
                            op1 = sc.nextInt();
                            switch (op1) {
                                case 1:
                                    for (Object t : lista2) {
                                        if (t instanceof Equipos) {
                                            output += lista1.indexOf(t) + "-->" + t + "\n";
                                        }//fin del if
                                    }//fin del for
                                    System.out.println(output);
                                    break;
                                case 2:
                                    for (Object t : lista1) {
                                        if (t instanceof Jugadores) {
                                            output += lista1.indexOf(t) + "-->" + t + "\n";
                                        }//fin del if
                                    }//fin del for
                                    System.out.println(output);
                                    break;
                                case 3:
                                    for (Object t : lista1) {
                                        if (t instanceof Tiradores) {
                                            output += lista1.indexOf(t) + "-->" + t + "\n";
                                        }//fin del if
                                    }//fin del for
                                    System.out.println(output);
                                    break;
                                case 4:
                                    for (Object t : lista1) {
                                        if (t instanceof Pateadores) {
                                            output += lista1.indexOf(t) + "-->" + t + "\n";
                                        }//fin del if
                                    }//fin del for
                                    System.out.println(output);
                                    break;
                                case 5:
                                    seguir2 = false;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida!");
                            }//fin del switch secundario
                        }//fin del while
                        break;
                    case 4:
                        while (seguir2) {
                            System.out.println("1-Equipos\n"
                                    + "2-Jugadores \n"
                                    + "3-Tiradores\n"
                                    + "4-Patedaores\n"
                                    + "5-Salir\n");
                            System.out.print("-> ");
                            op1 = sc.nextInt();
                            int pos = 0;
                            switch (op1) {
                                case 1:
                                    System.out.println("Ingrese la posicion del restaurante que desea eliminar: ");
                                    pos = sc.nextInt();
                                    if (lista2.get(pos) instanceof Equipos) {
                                        lista2.remove(pos);
                                    } else {
                                        System.out.println("La posicion ingresada no contiene un Equipo");
                                    }//fin del else
                                    break;

                                case 2:
                                    System.out.println("Ingrese la posicion del restaurante que desea eliminar: ");
                                    pos = sc.nextInt();
                                    if (lista1.get(pos) instanceof Jugadores) {
                                        lista1.remove(pos);
                                    } else {
                                        System.out.println("La posicion ingresada no contiene un Experimento");
                                    }//fin del else
                                    break;
                                case 3:
                                    System.out.println("Ingrese la posicion del restaurante que desea eliminar: ");
                                    pos = sc.nextInt();
                                    if (lista1.get(pos) instanceof Jugadores) {
                                        lista1.remove(pos);
                                    } else {
                                        System.out.println("La posicion ingresada no contiene un Experimento");
                                    }//fin del else
                                    break;
                                case 4:
                                    System.out.println("Ingrese la posicion del restaurante que desea eliminar: ");
                                    pos = sc.nextInt();
                                    if (lista1.get(pos) instanceof Jugadores) {
                                        lista1.remove(pos);
                                    } else {
                                        System.out.println("La posicion ingresada no contiene un Experimento");
                                    }//fin del else
                                    break;
                                case 5:
                                    seguir2 = false;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida!");
                            }//fin del switch secundario
                        }//fin del while
                        break;
                    case 5://simulacion
                        break;
                    case 6:
                        seguir = false;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }//fin del menu principal
            }//fin del switch
        } catch (Exception e) {
            System.out.println("Ocurrio un error FATAL!!!!!");
        }//fin del try and catch
    }//fin del main

    public void simulacion() {

    }
}
