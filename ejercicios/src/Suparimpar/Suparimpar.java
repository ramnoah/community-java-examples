package Suparimpar;

import java.util.Scanner;

public class Suparimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, supar = 0, suimpar = 0;

        System.out.println("Ingrese el número a calcular");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) { // verificar si es par
            if (i%2 == 0){
                supar += i;
            }
            else {
                suimpar += i;
            }
        }

        System.out.println("La suma de los pares es: " + supar);
        System.out.println("Y la suma de los impares es: " + suimpar);

    }
}
