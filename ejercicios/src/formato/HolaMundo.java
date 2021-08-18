package formato;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la programación en Java"); // Impresión de una línea

        System.out.println("****************** impresión no optimizada de múltiples líneas:");
        {
            System.out.println("Bienvenidos");
            System.out.println("a la");
            System.out.println("programación");
            System.out.println("en Java");

        } // impresión no optimizada de múltiples líneas

        System.out.println("****************** multilínea y tabuladores:");
        {
            System.out.println("Bienvenidos\n \ta la\n programación\n en Java");
        } // multilínea y tabuladores

        System.out.println("****************** impresión con formato: ");
        {
            System.out.printf("%s\n%s\n%s\n%s\n", "Bienvenidos", "a la", "programación", "en Java");
        }// impresión con formato (placeholders tipo C)
    }
}
