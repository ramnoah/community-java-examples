package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        /* Comparar enteros utilizando if's, operadores relacionales y de igualdad */

        Scanner scanner = new Scanner(System.in);

        int n1, n2;

        System.out.print("Escribe el primer entero: ");
        n1 = scanner.nextInt();

        System.out.print("Escribe el segundo entero: "); // indicador
        n2 = scanner.nextInt();

        // Java permite if's de "una línea" sin llaves.
        if (n1 == n2)
        System.out.printf("%d == %d\n", n1, n2); // <-- no es necesaria la indentación, pero es buena práctica realizarla
        if (n1 != n2)
            System.out.printf("%d != %d\n", n1, n2);
        if (n1 > n2)
            System.out.printf("%d > %d\n", n1, n2);
        if (n1 < n2)
            System.out.printf("%d < %d\n", n1, n2);
        if (n1 >= n2)
            System.out.printf("%d >= %d\n", n1, n2);
        if (n1 <= n2)
            System.out.printf("%d <= %d\n", n1, n2);
    }// main
}
