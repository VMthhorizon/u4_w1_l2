package Es_1;

public class PariDispari {

    public static boolean stringPariDispari(String string1) {
        return string1.length() % 2 == 0;
    }

    static void main(String[] args) {
        System.out.println(stringPariDispari("mario"));
    }
}
