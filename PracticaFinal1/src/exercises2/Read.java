package exercises2;

import java.util.Scanner;

public class Read {

    public String readLine(){
        String line;

        Scanner scanner = new Scanner(System.in);

        line = scanner.nextLine();
        return line;
    }
}
