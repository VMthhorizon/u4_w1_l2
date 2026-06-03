package Es_4;

import java.util.Scanner;

public class RocketLaunch {

    public static void countdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INSERISCI I SECONDI PER IL COUNTDOWN");
        int seconds = Integer.parseInt(scanner.nextLine());
        if (seconds < 0) {
            seconds = Math.abs(seconds);
            System.out.println(Math.abs(seconds));
        }
        if (seconds > 20) {
            seconds = 20;
            System.out.println(seconds);
        }
        System.out.println("Secondi al lancio: " + seconds);
        System.out.println(seconds);
//        for (int i = seconds; i >= 0; i--){
//            if()
//        }
    }

    static void main(String[] args) {
        countdown();
    }
}
