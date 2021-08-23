package dowhile;

public class DoWhile {
    public static void main(String[] args) {
        int i = 5000;

        do {
            System.out.printf("%d , ", i);
            i -= 200;
        } while (i >= 3000); //<--- En este caso la condición va después de la instrucción

        System.out.println("");

        for (int j = 5000; j >= 3000; j -= 200) { // Mismo resultado con for
            System.out.printf("%d , ", j);
        }
    }
}
