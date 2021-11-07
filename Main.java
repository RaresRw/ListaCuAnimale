package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Caine> lista_caine = new ArrayList<Caine>();
        ArrayList<Pisica> lista_pisica = new ArrayList<Pisica>();
        ArrayList<Soparla> lista_soparla = new ArrayList<Soparla>();

        char opt = '0';
        int opt2 = 0;
        char opt3 = '0';
        int a_caine = 0, a_pisica = 0, a_soparla = 0;
        int j = 0;
        int opt4 = 0;

        while (opt != 'x') {
            System.out.println(" \n 1 - Add new pet\n 2 - List pets\n x - Quit\n");
            opt = scanner.next().charAt(0);

            switch (opt) {
                case '1':

                    System.out.println("\n 1 - Caine\n 2 - Pisica\n 3 - Soparla\n");
                    opt2 = scanner.nextInt();
                    scanner.nextLine();
                    String x, y;
                    opt3 = '0';
                    switch (opt2) {
                        case 1:

                            System.out.print(" \nNume: ");
                            x = scanner.nextLine();

                            System.out.print(" \nVarsta: ");
                            y = scanner.nextLine();

                            System.out.print("\nProprietate: \n 1 - Talie Mica\n 2 - Talie Mare\n 3 - Vedere Buna\n 4 - Vedere Foarte Buna\n\n q - Quit\n\n");

                            lista_caine.add(new Caine(x, y));
                            while (opt3 != 'q')
                            {
                                opt3 = scanner.next().charAt(0);
                                switch (opt3) {
                                    case '1':

                                        lista_caine.get(a_caine).addprop("Talie Mica");
                                        break;
                                    case '2':

                                        lista_caine.get(a_caine).addprop("Talie Mare");
                                        break;
                                    case '3':

                                        lista_caine.get(a_caine).addprop("Vedere Buna");
                                        break;
                                    case '4':

                                        lista_caine.get(a_caine).addprop("Vedere Foarte Buna");
                                        break;
                                }

                            }
                            System.out.println("\n");
                            a_caine++;
                            break;


                        case 2:

                            System.out.print(" \nNume: ");
                            x = scanner.nextLine();

                            System.out.print(" \nVarsta: ");
                            y = scanner.nextLine();

                            System.out.print("\nProprietate: \n 1 - Agitata\n 2 - Cuminte\n 3 - Fara coada\n 4 - Fara picioare\n\n q - Quit\n\n");

                            lista_pisica.add(new Pisica(x, y));
                            while (opt3 != 'q')
                            {
                                opt3 = scanner.next().charAt(0);
                                switch (opt3) {
                                    case '1':

                                        lista_pisica.get(a_pisica).addprop("Agitata");
                                        break;
                                    case '2':

                                        lista_pisica.get(a_pisica).addprop("Cuminte");
                                        break;
                                    case '3':

                                        lista_pisica.get(a_pisica).addprop("Fara coada");
                                        break;
                                    case '4':

                                        lista_pisica.get(a_pisica).addprop("Fara picioare");
                                        break;
                                }

                            }
                            System.out.println("\n");
                            a_pisica++;
                            break;


                        case 3:

                            System.out.print(" \nNume: ");
                            x = scanner.nextLine();

                            System.out.print(" \nVarsta: ");
                            y = scanner.nextLine();

                            System.out.print("\nProprietate: \n 1 - Micut\n 2 - Umpic crescut\n 3 - Vedere Buna\n 4 - Nu vede\n\n q - Quit\n\n");

                            //scanner.nextLine();
                            lista_soparla.add(new Soparla(x, y));
                            while (opt3 != 'q')
                            {
                                opt3 = scanner.next().charAt(0);
                                switch (opt3) {
                                    case '1':

                                        lista_soparla.get(a_soparla).addprop("Micut");
                                        break;
                                    case '2':

                                        lista_soparla.get(a_soparla).addprop("Umpic crescut");
                                        break;
                                    case '3':

                                        lista_soparla.get(a_soparla).addprop("Vedre Buna");
                                        break;
                                    case '4':

                                        lista_soparla.get(a_soparla).addprop("Nu vede");
                                        break;
                                }

                            }
                            System.out.println("\n");
                            a_soparla++;
                            break;
                    }
                    break;


                case '2':

                    System.out.println("\nList of pets:");
                    for (j = 0; j < lista_caine.size(); j++) {
                        System.out.print( j+1 + " - ");
                        lista_caine.get(j).display_caine();
                    }
                    System.out.println();
                    for (j = 0; j < lista_pisica.size(); j++) {
                        System.out.print( j+1 + " - ");
                        lista_pisica.get(j).display_pisica();
                    }
                    System.out.println();
                    for (j = 0; j < lista_soparla.size(); j++) {
                        System.out.print( j+1 + " - ");
                        lista_soparla.get(j).display_soparla();
                    }
                    System.out.println();
                    break;

            }



        }
        scanner.close();
    }
}


