package exercises3;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        //whileIf();
        //division();
        //suma100Nums();
        //sumaNumeros();
        errores2();

    }// main

    static void whileIf() {
        int i = 0;
        while (i <= 10){
            System.out.println("Nada");
            i++; // <--- Esto es igual a: `i = i+1`
        }// while

        if(i == 11) {
            System.out.println("Se terminó el ciclo");
        }
    }

    static void division(){

        System.out.println(15/2); // Esto imprime 7, porque de manera predeterminada
                                  // el resultado de una división entre enteros es
                                  // de tipo int.

        System.out.println(15/2.0); // Si queremos acceder al valor decimal,
                                    // debemos dividir por un float o por un double

        System.out.printf("%f", 15/2.0); // Funciona de la misma manera en la impresión
                                         // con  formato


    }

    static void sumaNumeros(){
        int[] numeros = {1,2,3,4,5};
        int resultado = 0;

        for (int numero : numeros) { // <-- foreach en java
            resultado += numero;
        }

        System.out.println(resultado);

    }

    static void suma100Nums(){
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
    }

    static void errores1(){
        int edad = 100;
        if ( edad >= 65 )
        System.out.println( "Edad es mayor o igual que 65" );
        else
        System.out.println( "Edad es menor que 65 ");
    }

    static void errores2(){
        int x = 1, total = 0;
        while ( x <= 10 )
        {
            total += x;
            ++x;
        }

    }

    static void errores3(){
        int x= 0, total = 0;
        while ( x <= 100 ) {
            total += x;
            ++x;
        }
    }

    static void errores4(){
        int y = 0;

        while ( y > 0 ) // <-- la variable y no está inicializada
        {
            System.out.println(y);
            ++y;
        }
    }
}
