import java.util.Scanner;

public class metodistampa {

    public static int stampaInt() {
        int x = 5;
        return x;
    }

    public static double stampaDouble() {
        double x = 5.5d;
        return x;
    }

    public static String stampaString() {
        String x = "Cinque";
        return x;
    }

    public static boolean stampaBool() {
        boolean x = true;
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Cosa vuoi stampare? 1: Intero 2: Double 3: String 4: Boolean ");
        Scanner abc = new Scanner(System.in);
        int scelta = abc.nextInt();
        switch (scelta) {
            case 1:
                System.out.println("Intero è: " + stampaInt());
                break;
            case 2:
                System.out.println("Double è: " + stampaDouble());
                break;
            case 3:
                System.out.println("String è: " + stampaString());
                break;
            case 4:
                System.out.println("Boolean è: " + stampaBool());
                break;
            default:
                System.out.println("ERRORE");
        }
        abc.close();
    }

}
