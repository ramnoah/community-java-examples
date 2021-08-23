package exercises;

public class Exercises {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7,8,9,10
        System.out.println("Serie con for: ");
        for (int i = 1; i <=10 ; i++) {
            if (i < 10){
                System.out.printf("%d, ", i);
            } else{
                System.out.print(i);
            }
        } //for

        System.out.println("\n Serie con while: ");
        int i = 1;
        while (i <= 10) {
            if (i < 10){
                System.out.printf("%d, ", i);
            } else{
                System.out.print(i);
            }
            i++;
        }// while


        System.out.println("\n Serie con do-while: ");
        i = 1;
        do {
            if (i < 10){
                System.out.printf("%d, ", i);
            } else{
                System.out.print(i);
            }
            i++;
        } while (i <= 10);// do-while




    // TODO realizar las siguientes series:
    //1,99,2,98,3,97,4,96,5,95
    // 0,1,1,2,3,5,8,13,21,34


    } // main
} // class
