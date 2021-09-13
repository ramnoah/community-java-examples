package exercises5;

public class Factoriales {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d! = %d\n", i, fac(i));
        }
    }

    static int fac(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result  = result * i;
        }
        return result;
    }
}
