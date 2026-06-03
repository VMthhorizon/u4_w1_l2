package Es_4;

import java.util.Scanner;

public class RocketLaunch {

    public static void countdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INSERISCI I SECONDI PER IL COUNTDOWN");
        int seconds = Integer.parseInt(scanner.nextLine());
        if (seconds < 0) {
            seconds = Math.abs(seconds);
        }
        if (seconds > 20 || seconds < 11) {
            seconds = 20;
        }
        System.out.println("Secondi al lancio: " + seconds);
        for (int i = seconds; i >= 0; i--) {
            if (i == 10) {
                System.out.println("[OK] " + i);
                System.out.println("-- SEPARAZIONE STADIO --");
            } else if (i == 0) {
                System.out.println("--- IGNITION ---");
            } else if (i % 2 == 0) {
                System.out.println("[OK] " + i);
            } else {
                System.out.println("[CHECK] " + i);
            }
        }
    }

    static void main(String[] args) {
        countdown();
    }
}
