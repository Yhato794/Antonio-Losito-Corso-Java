import java.util.Scanner;

public class dirigenza {
    String dirigente1;
    String dirigente2;
    String boss;

    public void insdirigente1() {
        System.out.println("Inserisci dirigente1");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        dirigente1=s;

    }
    public void insdirigente2() {
        System.out.println("Inserisci dirigente2");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        dirigente2=s;

    }
    public void insBoss() {
        System.out.println("Inserisci boss");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boss=s;

    }

}
