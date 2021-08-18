package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact= 1, num = 0;
        System.out.println("Ingrese un número: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("El factorial es: " + fact);

    }// main

}// Factorial
