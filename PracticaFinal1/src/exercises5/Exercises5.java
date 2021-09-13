package exercises5;

import java.util.Random;

public class Exercises5 {
    public static void main(String[] args) {
       // a();
        //b();
       // c();
        d();
    }

    static void a(){
        // Dado que no se nos indica qué es lo que debe
        // hacer el programa, una forma de evitar consumir
        // toda la memoria disponible para la JVM, es hacer
        // que la variable `i` decrezca.
        for (int i = 100; i >= 1; i-- ){
            System.out.println ( i );
        } // <-- Si bien, no es obligatorio
        // poner las llaves al ciclo ayuda a
        // organizar el código.
    }

    static void b(){
        // Para probar que funciona siempre
        // hacemos que valor sea un número
        // aleatorio.
        Random rand = new Random();
        int valor = rand.nextInt();

        switch ( valor % 2 )
        {
            case 0:
                System.out.println( "Entero par" );
                break; // <-- Necesario para tomar la decisión
            case 1:
                System.out.println( "Entero impar" );
                break; // <-- Necesario para tomar la decisión
        }
    }

    static void c(){
        // Declaramos la variable `i` y hacemos
        // que decrezca
        for (int i = 19; i >= 1; i -= 2 ){
            System.out.println( i );
        }// <-- Si bien, no es obligatorio
        // poner las llaves al ciclo ayuda a
        // organizar el código.
    }

    static void d(){
        // Declaramos correctamente
        // la variable `contador`
        int contador = 2;
        do
        {
            System.out.println( contador );
            contador += 2;
        } while ( contador <= 100 ); // <-- el while
        // va con minúscula y en la evaluación
        // debe incluirse el 100
    }

}
