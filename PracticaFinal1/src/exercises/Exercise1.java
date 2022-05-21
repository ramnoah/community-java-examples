package exercises;
/*
* Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
*
* a) Mostrar el mensaje "Escriba un entero", dejando el cursor en la misma línea
*
* b) Asignar el producto de las variables b y c a la variable a.
*
* c) Indicar que un programa va a realizar un cálculo de nómina de muestra
*   (es  decir, usar texto que ayude a documentar un programa).
 *
* */
public class Exercise1 {
    public static void main(String[] args) {
        a();
        b();
        c();
    }

    // Mostrar el mensaje "Escriba un entero:", dejando el cursor en la misma línea.
    static void a() {
        System.out.print("Escriba un entero");
    }

    // Asignar el producto de las variables b y c a la variable a.
    static void b() {
        int a; // Crear variable
        int b; // Crear variable
        int c; // Crear variable


        b = 4; // asignar valor
        c = 2; // asignar valor
        a = b * c;

    }

    //Indicar que un programa va a realizar un cálculo de nómina de muestra
    // (es  decir, usar texto que ayude a documentar un programa).
    static void c() {
        int x = 10;
        double nomina = Nomina(x);

        System.out.printf("\nLa nómina es:$ %f\n", nomina);

    }


    /**
     * Nomina método
     * @param empleados int
     *
     *  La nómina se calcula con base en el número de empleados.
    */
    static double Nomina(int empleados) {
        return 0;
    }

}
