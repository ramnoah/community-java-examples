package exercises;

import java.util.Scanner;
import java.util.Vector;

public class kilometros {
    public static void main(String[] args) {
        // Para no tener problemas con la longitud del arreglo
        // utilizamos un Vector, clase con la cual podemos
        // añadir items sin conocer la longitud del arreglo
        // subyacente.
        Vector<Double> kilometrosPorLitro = new Vector<>();

        int entrada = 0;
        double km, l;
        final int EXIT_VALUE = -1;
        final String EXIT_MSJ = "(-1 para salir): ";

        printAsterisks();
        System.out.println("Calcular km/l");
        printAsterisks();
        System.out.println("Ingrese los datos:");

        while (entrada != EXIT_VALUE) {
            System.out.printf("\nKilómetros conducidos %s", EXIT_MSJ);
            entrada = readInt();
            if(entrada == EXIT_VALUE) {
                continue;
            }

            km = entrada;

            System.out.printf("\nLitros consumidos %s", EXIT_MSJ);
            entrada = readInt();
            if(entrada == EXIT_VALUE) {
                continue;
            }

            l = entrada;

            kilometrosPorLitro.add(km/l);
        }

        printAsterisks();
        for (int i = 0; i < kilometrosPorLitro.size(); i++) {
            System.out.printf("Reabastacimiento %d : %f km/l\n", i+1, kilometrosPorLitro.get(i));
        }
        
    }// main

    static void printAsterisks(){
        System.out.println("**************************************");
    }//printAsterisks method

    static int readInt(){
        return new Scanner(System.in).nextInt();
    }// readInt method
}// class
