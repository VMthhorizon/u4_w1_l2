package Es_1;

public class Bisestile {

    public static boolean annoBisestile(int anno) {
        return anno % 100 == 0 && anno % 400 == 0 || anno % 4 == 0 && anno % 100 != 0;
    }

    static void main(String[] args) {
        System.out.println(annoBisestile(1600));
    }
}
