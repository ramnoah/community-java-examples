package pruebaanalisis;
import java.util.Scanner;

public class Analisis {
    public void procesoResultadosExamen(){
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables:
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;
        int resultado;


        while (contadorEstudiantes<= 10 ) {
            System.out.print("Escriba el resultado del examen (1 = aprobado, 2 = reprobado): ");
            resultado = scanner.nextInt();

            if (resultado == 1)
                aprobados++;
            else
                reprobados++;

            contadorEstudiantes++;
        } // while

        System.out.printf("Aprobados: %d\nReprobados: %d\n", aprobados, reprobados);


        if (aprobados >= 8) {
            System.out.println("Aumenta la colegiatura");
        }
    }
}
