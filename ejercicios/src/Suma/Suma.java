package Suma;

import java.util.Scanner; // Así se importa de la librería estandar.

public class Suma {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // El objeto Scanner permite leer la StdIn
        String name = "";
        int numUno, numDos, result = 0; // múltiple declaración en línea

        // System.out.println(numUno, numDos); <<------ Esta operación es ilegal, pues las variables no están inicializadas

        System.out.println("¿Cuál es tu nombre?");
        name = in.nextLine(); // forma de leer la entrada estándar y transformarlo en String

        System.out.println("Dame el primer valor para tu suma");
        numUno = in.nextInt(); // leer stdIn y transformar en int

        System.out.println("Dame el segundo valor para tu suma");
        numDos = in.nextInt();

        result = numUno + numDos;

        System.out.println("Hola "+ name +". Tu resultado es: " + result);

    }

}
