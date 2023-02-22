import java.util.Scanner;

public class metodiexample {
    static void name(String name) {
        System.out.println(name);

    }

    static String insnomi() {
        Scanner abc = new Scanner(System.in);
        String b = abc.nextLine();
        return b;
    }

    static int intero() {
        return 5;
    }

    static boolean bool() {
        return false;
    }

    static double doppio() {
        return 0.5d;
    }

    static String stringa() {
        return "Ciao";
    }

    static long lungo() {

        return (long) 100000000;
    }

    public static void main(String[] args) {
        System.out.println(bool());
        System.out.println(intero());
        System.out.println(doppio());
        System.out.println(stringa());
        System.out.println(lungo());

    }
}
