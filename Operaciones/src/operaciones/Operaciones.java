package operaciones;

public class Operaciones {
    public static void main(String[] args) {

        // Declaración de variables
        int n1= 5, n2= 3, result= 0;
        int param = 2;

        // switch case
        switch (10) {
            case 1: result = n1 + n2;
            System.out.println("El resultado de la suma es: " + result);
            break;
            case 2: result = n1 - n2;
                System.out.println("El resultado de la resta es: " + result);
                break;
            case 3: result = n1 * n2;
                System.out.println("El resultado de la multiplicación es: " + result);
                break;
            case 4: result = n1 / n2;
                System.out.println("El resultado de la división es: " + result);
                break;
            case 5: result = n1 % n2;
                System.out.println("El resultado del módulo es: " + result);
                break;
            default:
                System.out.println("Error, la opción no existe");
                break;
        }// switch


    }//main
}// class
