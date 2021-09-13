package exercises;

import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) {
        int[] horasEmpleados = new int[3];
        double[] sueldoEmpleados = new double[3];
        double[] cuotasPorHora = new double[3];
        int horasExtra;

        // Supongamos que estos son lo valores que le corresponden a cada trabajador
        cuotasPorHora[0] = 50;
        cuotasPorHora[1] = 90.5;
        cuotasPorHora[2] = 105;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cuotasPorHora.length; i++) {
            System.out.printf("\nIndique las horas trabajadas del empleado número %d: ", i+1);
            horasEmpleados[i] = scanner.nextInt();
            horasExtra = 0;

            if (horasEmpleados[i] > 40 ){
                horasExtra = horasEmpleados[i] - 40;
                horasEmpleados[i] = 40;
            }

            sueldoEmpleados[i] += (horasExtra * cuotasPorHora[i] * 1.5);
            sueldoEmpleados[i] += horasEmpleados[i] * cuotasPorHora[i];
        }// for

        System.out.println();
        for (int i = 0; i < sueldoEmpleados.length; i++) {
            System.out.printf("El sueldo del empleado número %d es $ %2f\n", i+1, sueldoEmpleados[i]);
        }

    }// main
}// class
