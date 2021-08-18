package controlvacacional;

import java.util.Scanner;

public class ControlVacacional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name  = "";
        int key = 0;
        int laborOld = 0;

        System.out.println("***********************************************");
        System.out.println("Bienvenido al sistema vacaional de la empresa X");
        System.out.println("***********************************************");
        System.out.println("");

        System.out.println("¿Cuál es el nombre del trabajador? ");
        name = scanner.nextLine();


        System.out.println("\n¿Cuánto tiempo de servicio tiene el trabajador? ");
        laborOld = scanner.nextInt();


        System.out.println("\n¿Cuál es la clave del trabajador? ");
        key = scanner.nextInt();



        if (key == 1) {
            if (laborOld == 1) {
                System.out.println("El trabajador " + name + " tiene derecho a 7 días de vacaciones");
            } else if (laborOld >= 2 && laborOld <= 7) {
                System.out.println("El trabajador " + name + " tiene derecho a 14 días de vacaciones");
            } else if (laborOld >= 8 ){
                System.out.println("El trabajador " + name + " tiene derecho a 20 días de vacaciones");
            }
        } else if (key == 2) {
            if (laborOld == 1) {
                System.out.println("El trabajador " + name + " tiene derecho a 8 días de vacaciones");
            } else if (laborOld >= 2 && laborOld <= 9) {
                System.out.println("El trabajador " + name + " tiene derecho a 16 días de vacaciones");
            } else if (laborOld >= 9 ){ // <-- recordar que esta condición se salta hasta el 10
                System.out.println("El trabajador " + name + " tiene derecho a 23 días de vacaciones");
            }
        }
        else if (key == 3){
            if (laborOld == 1) {
                System.out.println("El trabajador " + name + " tiene derecho a 9 días de vacaciones");
            } else if (laborOld >= 2 && laborOld <= 9) {
                System.out.println("El trabajador " + name + " tiene derecho a 16 días de vacaciones");
            } else if (laborOld >= 10 ){
                System.out.println("El trabajador " + name + " tiene derecho a 25 días de vacaciones");
            }
        }
        else
            System.out.println("Error!: Clave departamental incorrecta.");
    }
}
