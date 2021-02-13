package lab4_victorcruzjafetmorel;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_VictorCruzJafetMorel {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Jugadores> lista1 = new ArrayList();
    static ArrayList<Equipos> lista2 = new ArrayList();

    public static void main(String[] args) {
        try {

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
                                    int tipo_j = sc.nextInt();
                                    if (tipo_j == 2) {
                                        System.out.println("Ingrese estadistica del tiro de 3{1-100]");
                                        int tiro_tres = sc.nextInt();
                                        System.out.println("Ingrese estadistica del tiro de 2{1-100]");
                                        int tiro_dos = sc.nextInt();
                                        System.out.println("Ingrese estadistica del manejo del balon {1-100]");
                                        int man_b = sc.nextInt();
                                        lista1.add(new Tiradores(tiro_tres, tiro_dos, man_b));
                                    } else if (tipo_j == 1) {
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
                                        int pos1;
                                        switch (op1) {
                                            case 1:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista2.get(pos1) instanceof Equipos) {
                                                    System.out.println("Ingrese el nuevo nombre del equipo: ");
                                                    String new_name = sc.next();
                                                    ((Equipos) lista2.get(pos1)).setNombre_e(new_name);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 2:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista2.get(pos1) instanceof Equipos) {
                                                    System.out.println("Ingrese el nuevo nombre del Estadio: ");
                                                    String new_estadio = sc.next();
                                                    ((Equipos) lista2.get(pos1)).setEstadio(new_estadio);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 3:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista2.get(pos1) instanceof Equipos) {
                                                    System.out.println("Ingrese el nuevo nombre Pais: ");
                                                    String new_pais = sc.next();
                                                    ((Equipos) lista2.get(pos1)).setPais(new_pais);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 4:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista2.get(pos1) instanceof Equipos) {
                                                    System.out.println("Ingrese el nuevo nombre del Entrenador: ");
                                                    String new_entre = sc.next();
                                                    ((Equipos) lista2.get(pos1)).setEntrenador_n(new_entre);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 5:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista2.get(pos1) instanceof Equipos) {
                                                    System.out.println("Ingrese el nuevo nombre del Dueno: ");
                                                    String new_due = sc.next();
                                                    ((Equipos) lista2.get(pos1)).setNombre_due(new_due);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 6:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista2.get(pos1) instanceof Equipos) {
                                                    System.out.println("Ingrese el nuevo nombre de la mascota: ");
                                                    String new_mas = sc.next();
                                                    ((Equipos) lista2.get(pos1)).setNombre_mas(new_mas);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 7:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista2.get(pos1) instanceof Equipos) {
                                                    System.out.println("Ingrese la nueva Fecha de creacion: ");
                                                    String new_fecha = sc.next();
                                                    ((Equipos) lista2.get(pos1)).setFecha_crea(new_fecha);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 8:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista2.get(pos1) instanceof Equipos) {
                                                    System.out.println("Ingrese el nuevo Color : ");
                                                    String new_color = sc.next();
                                                    ((Equipos) lista2.get(pos1)).setColor(new_color);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

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
                                    while (seguir2) {
                                        System.out.println("1-Nombre\n"
                                                + "2-Apodo \n"
                                                + "3-Numero de Camiseta\n"
                                                + "4-Equipo fav de Futbol\n"
                                                + "5-Equipo fav de Baloncesto\n"
                                                + "6-Jugador Fav"
                                                + "7-año de nacimiento"
                                                + "8-numero de estrellas"
                                                + "9-Salir");
                                        System.out.print("-> ");
                                        op1 = sc.nextInt();
                                        int pos1;
                                        switch (op1) {
                                            case 1:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Jugadores) {
                                                    System.out.println("Ingrese el nuevo nombre del Jugador: ");
                                                    String new_jug = sc.next();
                                                    ((Jugadores) lista1.get(pos1)).setNom_jug(new_jug);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 2:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Jugadores) {
                                                    System.out.println("Ingrese el nuevo apodo: ");
                                                    String new_apod = sc.next();
                                                    ((Jugadores) lista1.get(pos1)).setApodo(new_apod);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 3:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Jugadores) {
                                                    System.out.println("Ingrese el nuevo numero de camiseta: ");
                                                    int new_cam = sc.nextInt();
                                                    ((Jugadores) lista1.get(pos1)).setNum_cam(new_cam);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 4:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Jugadores) {
                                                    System.out.println("Ingrese el nuevo Equipo Favorito de Futbol: ");
                                                    String new_favF = sc.next();
                                                    ((Jugadores) lista1.get(pos1)).setFav_fut(new_favF);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 5:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Jugadores) {
                                                    System.out.println("Ingrese el nuevo Equipo favorito de Baloncesto: ");
                                                    String new_favB = sc.next();
                                                    ((Jugadores) lista1.get(pos1)).setFav_bas(new_favB);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 6:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Jugadores) {
                                                    System.out.println("Ingrese el nuevo Jugador Favorito: ");
                                                    String new_favJ = sc.next();
                                                    ((Jugadores) lista1.get(pos1)).setFav_play(new_favJ);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 7:

                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Jugadores) {
                                                    System.out.println("Ingrese el nuevo nombre año de nacimeinto : ");
                                                    int new_an = sc.nextInt();
                                                    ((Jugadores) lista1.get(pos1)).setA_nac(new_an);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 8:

                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Jugadores) {
                                                    System.out.println("Ingrese el nuevo nombre de numero de estrella[1-5]: ");
                                                    int new_nume = sc.nextInt();
                                                    ((Jugadores) lista1.get(pos1)).setNum_estre(new_nume);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 9:
                                                seguir2 = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese una opcion valida!");
                                        }//fin del switch
                                    }//fin del whileeeeeee 

                                    break;
                                case 3:
                                    while (seguir2) {
                                        System.out.println("1-Estadsitica tiro 2\n"
                                                + "2-Estadistica tiro 3 \n"
                                                + "3-Estadistica del manejo del balon\n"
                                                + "4-salir \n");
                                        System.out.print("-> ");
                                        op1 = sc.nextInt();
                                        int pos1;
                                        switch (op1) {
                                            case 1:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Tiradores) {
                                                    System.out.println("Ingrese la nueva Estadistica de tiro 2[1-100]: ");
                                                    int new_est2 = sc.nextInt();
                                                    ((Tiradores) lista1.get(pos1)).setTiro_2(new_est2);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 2:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Tiradores) {
                                                    System.out.println("Ingrese la nueva Estadistica de tiro 3[1-100]: ");
                                                    int new_est3 = sc.nextInt();
                                                    ((Tiradores) lista1.get(pos1)).setTiro_tres(new_est3);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                            case 3:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Tiradores) {
                                                    System.out.println("Ingrese la nueva Estadistica del manejo del balon[1-100]: ");
                                                    int new_mb = sc.nextInt();
                                                    ((Tiradores) lista1.get(pos1)).setMan_balon(new_mb);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 4:
                                                seguir2 = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese una opcion valida!");
                                        }//fin del switch
                                    }//fin del whileeeeeee 
                                    break;
                                case 4:
                                    while (seguir2) {
                                        System.out.println("1-Habilidad Pateadora\n"
                                                + "2-Fuerza \n"
                                                + "3-Habilidad Regateadora \n"
                                                + "4-salir \n");
                                        System.out.print("-> ");
                                        op1 = sc.nextInt();
                                        int pos1;
                                        switch (op1) {
                                            case 1:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Pateadores) {
                                                    System.out.println("Ingrese la nueva Estadistica Pateadora[1-100]: ");
                                                    int new_hp = sc.nextInt();
                                                    ((Pateadores) lista1.get(pos1)).setHp(new_hp);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 2:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Pateadores) {
                                                    System.out.println("Ingrese la nueva Estadistica de la Fuerza[1-100]: ");
                                                    int new_f = sc.nextInt();
                                                    ((Pateadores) lista1.get(pos1)).setF(new_f);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;

                                            case 3:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                pos1 = sc.nextInt();
                                                if (lista1.get(pos1) instanceof Pateadores) {
                                                    System.out.println("Ingrese la nueva Estadistica Regateadora[1-100]: ");
                                                    int new_hr = sc.nextInt();
                                                    ((Pateadores) lista1.get(pos1)).setHr(new_hr);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else

                                                break;
                                            case 4:
                                                seguir2 = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese una opcion valida!");
                                        }//fin del switch
                                    }//fin del whileeeeeee
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
                        simulacion();
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

    public static void simulacion() {
        boolean ganador1 = false, ganador2 = false, punto=false;
        int turno = 1, pt_j1 = 0, pt_j2 = 0, j11=0, j12=0,j13=0,j14=0,j15=0,j21=0,j22=0,j23=0,j24=0,j25=0;
        while (ganador1 == false & ganador2 == false) {
            
            String output = "";
            int pos=0;
            if (turno % 2 == 1) {
                for (Object t : lista2) {
                    if (t instanceof Jugadores) {
                        output += lista1.indexOf(t) + "-->" + t + "\n";
                    }//fin del if
                }//fin del for

                System.out.println();
                for (int i = 0; i < 5; i++) {
                    System.out.print("Desea pasar?");
                    char res = sc.next().charAt(0);
                    if (res == 'n' | res == 'N') {
                        break;
                    }
                    System.out.println("ingrese posición de jugador al que desea pasar");
                    pos = sc.nextInt();
                }
                switch(pos){
                    case 0:
                        j11++;
                        break;
                    case 1:
                        j12++;
                        break;
                    case 2:
                        j13++;
                        break;
                    case 3:
                        j14++;
                        break;
                    case 4:
                        j15++;
                        break;
                }
                Tiradores f = new Tiradores();
                Tiradores d = new tiro2();
                Pateadores p = new Pateadores();
                if (lista1.get(pos) instanceof Tiradores) {
                    System.out.println("Desea tirar de 3 o de 2 puntos?");
                    int pt= sc.nextInt();
                    if(pt==2){
                       punto=f.anotar();
                    }else if(pt==3){
                        punto=d.anotar();
                    }
                }else if(lista1.get(pos) instanceof Pateadores){
                    punto=p.anotar();
                }
                if (punto == true) {
                    pt_j1++;

                }
            }else{
                for (Object t : lista2) {
                    if (t instanceof Jugadores) {
                        output += lista1.indexOf(t) + "-->" + t + "\n";
                    }//fin del if
                }//fin del for

                System.out.println();
                for (int i = 0; i < 5; i++) {
                    System.out.print("Desea pasar?");
                    char res = sc.next().charAt(0);
                    if (res == 'n' | res == 'N') {
                        break;
                    }
                    System.out.println("ingrese posición de jugador al que desea pasar");
                    pos = sc.nextInt();
                }
                switch(pos){
                    case 0:
                        j21++;
                        break;
                    case 1:
                        j22++;
                        break;
                    case 2:
                        j23++;
                        break;
                    case 3:
                        j24++;
                        break;
                    case 4:
                        j25++;
                        break;
                }
                Tiradores f = new Tiradores();
                Tiradores d = new tiro2();
                Pateadores p = new Pateadores();
                if (lista1.get(pos) instanceof Tiradores) {
                    System.out.println("Desea tirar de 3 o de 2 puntos?");
                    int pt= sc.nextInt();
                    if(pt==2){
                       punto=f.anotar();
                    }else if(pt==3){
                        punto=d.anotar();
                    }
                }else if(lista1.get(pos) instanceof Pateadores){
                    punto=p.anotar();
                }
                if (punto == true) {
                    pt_j2++;

                }
            }
            if(pt_j1==11){
                ganador1=true;
            }else if(pt_j2 ==11){
                ganador2=true;
            }
            turno++;
        }
        if(ganador1==true){
            System.out.println("El ganador fue el jugador 1.");
        }else if(ganador2==true){
            System.out.println("El ganador fue el jugador 2.");
        }
        System.out.println("El jugador uno anotó "+pt_j1+" puntos. El jugador dos anotó "+" puntos.\n");
    }
}
