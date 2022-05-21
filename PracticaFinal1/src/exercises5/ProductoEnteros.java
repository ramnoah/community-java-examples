package exercises5;

public class ProductoEnteros {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i <= 15; i++) {
            if(i %2 == 0) {
                continue;
            }

            result *= i;


        } //for
        System.out.println("El resultado es: " + result);
    }//main
}// class
