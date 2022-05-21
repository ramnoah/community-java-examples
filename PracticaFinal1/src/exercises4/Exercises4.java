package exercises4;

public class Exercises4 {
    public static void main(String[] args) {
        //whileFor();
        //doWhileWhile();
        breakContinue();
    }

    static void whileFor() {
        int numero = 50;
        while (numero%2 != 0 || numero > 1){ // <-- El ciclo while permite controlar el ciclo por medio de un valor binario
            System.out.println(numero);
            numero -= 3;
        }

        System.out.println("****************");

        for (int i = 50; i >= -1 ; i-=3) { // <-- En el ciclo for debemos conocer siempre valor final donde queremos que se detenga.
            System.out.println(i);
        }

    }

    static void doWhileWhile(){
        int j = 0;
        while (j > 10){
            System.out.print("*");
            j++;
        }
        System.out.print("\n");


        int i = 0;
        do {
            System.out.print("*");
            i++;
        } while (i > 10);
        System.out.print("\n");


    }

    static void breakContinue(){
        int numero = 20;
        while (numero >= 1){ // <-- recorremos los números del 20 al 1

            if (numero%2 != 1 ) { // <-- si el número es par...
                numero -= 1;
                continue;         // <-- ...pasamos a la siguiente iteración
            }

            System.out.println(numero);

            if (numero == 5) { //<--- si esto se cumple...
                break; // ... rompemos el ciclo
            }


            numero -= 1;
        }
    }
}
