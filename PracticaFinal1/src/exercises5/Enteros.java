package exercises5;

import java.util.Arrays;
import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        int numbersLen = 0;
        int[] numbers;

        printAsterisks();
        System.out.println("Encontrando el menor de varios números");
        printAsterisks();
        System.out.print("Instrucciones: Ingrese solo números enteros.\n");
        printAsterisks();
        System.out.print("\n¿Cuántos números desea ingresar?: ");

        numbersLen = readInt();
        if (numbersLen < 1 ){
            System.out.println("¡Debe ingresar al menos un número!");
            return;
        }

        numbers = readNumbers(numbersLen);

        // Podríamos implementar una función para ordenar los números,
        // pero es mucho más eficiente usar las bibliotecas de java.
        Arrays.sort(numbers);

        System.out.printf("\nEl número menor es : %d", numbers[0]);
    }// main

    static void printAsterisks(){
        System.out.println("**************************************");
    }//printAsterisks method

    static int readInt(){
        return new Scanner(System.in).nextInt();
    }// readInt method

    static int[] readNumbers(int len){
        int[] numbers = new int[len];
        int n;
        for (int i = 0; i < len; i++) {
            System.out.print("\nIngrese un número: ");
            n = readInt();
            numbers[i] = n;
        }


        return numbers;
    }// readNumbers method
}//class
