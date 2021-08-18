package varios;

public class Varios {
    public static void main(String[] args) {

        // Variables, inicialización y asignación:
        int n1 = 4;
        int n2 = 22;
        int result = 0;


        result = n1 + n2;
        System.out.println("El resultado es: " + result);


        result = n1 - n2;
        System.out.println("El resultado es: " + result);

        result = n1 * n2;
        System.out.println("El resultado es: " + result);

        result = n1 / n2;   // <-- para obtener el decimal hay que usar otra variable.
        System.out.println("El resultado es: " + result);

        result = n1 % n2;
        System.out.println("El resultado es: " + result);



        int programacion = 8;
        int investigacion = 7;
        int administracion = 10;
        int promedio = 0;


        promedio = (programacion + investigacion + administracion) / 3;

        if (promedio >= 6) {
            System.out.println("Alumno aprobado: " + promedio);
        } else
            System.out.println("Alumno reprobado: " + promedio);


    }// main
}
