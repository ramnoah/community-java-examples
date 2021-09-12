package exercises2;

public class Exercise2 {
    public static void main(String[] args) {
        Elefante elefante = new Elefante();
        String name;
        Read reader = new Read();

        System.out.print("Escribe el nombre de tu elefante:");
        name = reader.readLine();

        elefante.setNombre(name);

        System.out.printf("El nombre del elefante es %s", elefante.getNombre());

    }
}

class Elefante {
    private String nombre;
    private int edad;
    /**
     * Getter method for name attribute
     * */
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}