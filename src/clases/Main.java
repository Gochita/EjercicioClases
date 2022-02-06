package clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, propulsores, peso, zonas, tripulantes, camaras;
        String nombre, pais, estabilizador;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Bienvenido a la ESA, que tipo de nave quiere fabricar?");
            System.out.println("1.Nave tripulada \n" + "2.Nave no tripulada \n" + "3.Nave lanzadera");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre de la nave");
                    nombre = leer.next();
                    System.out.println("Ingrese pais fabricante");
                    pais = leer.next();
                    System.out.println("Cuantas zonas va a tener?");
                    zonas = leer.nextInt();
                    System.out.println("Cuantos tripulantes va a tener?");
                    tripulantes = leer.nextInt();
                    System.out.println("Ingrese cantidad de propulsores\n" + "1\n 2\n 3\n 4");
                    propulsores = leer.nextInt();
                    if (propulsores < 1) {
                        propulsores = 1;
                    }
                    if (propulsores > 4) {
                        propulsores = 4;
                    }
                    peso = 3500 * propulsores;

                    naveTripulada t = new naveTripulada(nombre, "Nave tripulada", pais, propulsores, peso, zonas, tripulantes);
                    System.out.println("----------------------------------------------------");
                    System.out.println("->Nave tripulada<- \nNombre: "+nombre+"\nPais fabricante: "+ pais+ "\nNumero de propulsores: "+ propulsores+
                            "\nZonas de la nave: "+ zonas+ "\nNumero de tripulantes: "+ tripulantes);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Desea crear otra nave?\n 4.Si\n 5.No");
                    opcion=leer.nextInt();
                    break;

                case 2:

                    System.out.println("Ingrese nombre de la nave");
                    nombre = leer.next();
                    System.out.println("Ingrese cantidad de propulsores " + " \n  1 \n 2 \n 3 \n 4");
                    propulsores = leer.nextInt();
                    if (propulsores < 1) {
                        propulsores = 1;
                    }
                    if (propulsores > 4) {
                        propulsores = 4;
                    }
                    peso = 2500 * propulsores;
                    System.out.println("Pais fabricante");
                    pais = leer.next();
                    System.out.println("Numero de camaras");
                    camaras = leer.nextInt();
                    naveNoTripulada noTripulada = new naveNoTripulada(nombre, "Nave no tripulada", pais, propulsores, peso, camaras);
                    System.out.println("Desea crear otra nave?\n 4.Si\n 5.No");
                    opcion=leer.nextInt();
                    break;

                case 3:
                    System.out.println("Ingrese nombre de la nave");
                    nombre = leer.next();
                    System.out.println("Ingrese cantidad de propulsores\n" + "1\n 2\n 3\n 4");
                    propulsores = leer.nextInt();
                    if (propulsores < 1) {
                        propulsores = 1;
                    }
                    if (propulsores > 4) {
                        propulsores = 4;
                    }
                    peso = 4500 * propulsores;
                    System.out.println("Pais fabricante");
                    pais = leer.next();
                    System.out.println("Ingrese tipo de estabilizador");
                    estabilizador = leer.next();
                    NaveLanzadera lanzadera = new NaveLanzadera(nombre, "Nave lanzadera", pais, propulsores, peso, estabilizador);
                    System.out.println("Desea crear otra nave?\n 4.Si\n 5.No");
                    opcion=leer.nextInt();
                    break;

                default:
                    System.out.println("Opcion no existe");
                    opcion= leer.nextInt();
            }
        } while (opcion != 5);

    }
}
