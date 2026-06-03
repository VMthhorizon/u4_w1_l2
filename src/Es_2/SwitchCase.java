package Es_2;

import java.util.Scanner;

public class SwitchCase {
    public static void newSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DAMMI UN NUMERO!");
        int x = Integer.parseInt(scanner.nextLine());
        String letter = switch (x) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "ERRORE";
        };
        System.out.println(letter);
    }

    static void main(String[] args) {
        newSwitch();
    }

}
