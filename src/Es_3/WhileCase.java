package Es_3;

import java.util.Arrays;
import java.util.Scanner;

public class WhileCase {

    public static void myWhile() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("INSERISCI UNA STRINGA");
            String parola = scanner.nextLine();
            String[] lettere = parola.split("");
            System.out.println(Arrays.toString(lettere));
            if (parola.equals(":q")) break;
        }
    }

    static void main(String[] args) {
        myWhile();
    }
}
