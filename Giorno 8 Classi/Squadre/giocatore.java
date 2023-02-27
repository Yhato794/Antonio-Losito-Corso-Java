import java.util.Scanner;

public class giocatore {
    String giocatore1;
    String giocatore2;
    String riserva;

    public void insGioca1() {
        System.out.println("Inserisci giocatore 1");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        giocatore1=s;

    }
    public void insGioca2() {
        System.out.println("Inserisci giocatore 2");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        giocatore2=s;

    }
    public void insRiser() {
        System.out.println("Inserisci riserva");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        riserva=s;

    }
}
