import java.util.Scanner;
import java.util.ArrayList;

public class esempioOggetti {
    String nome = "";
    String password = "";

    public static void main(String[] args) {
        ArrayList<esempioOggetti> account = new ArrayList<esempioOggetti>();
        int i = 0;
        i = inserimento(account);
        stampa(i, account);

    }

    public static int inserimento(ArrayList<esempioOggetti> account) {
        int menu = 1;
        int i = 0;
        while (menu == 1) {
            account.add(new esempioOggetti());
            Scanner name = new Scanner(System.in);
            System.out.println("Inserisci nome utente");
            account.get(i).nome = name.nextLine();
            System.out.println("Inserisci password");
            Scanner Pass = new Scanner(System.in);
            account.get(i).password = Pass.nextLine();
            i++;
            System.out.println("Registra un altro utente o esci?");
            Scanner scelta = new Scanner(System.in);
            menu = scelta.nextInt();

        }
        return i;

    }

    public static void stampa(int i, ArrayList<esempioOggetti> account) {
        for (int y = 0; y < i; y++) {
            System.out.println("Account numero " + (y + 1));
            System.out.println("Nome Account: " + account.get(y).nome);
            System.out.println("Password: " + account.get(y).password);
            System.out.println("----------------------");

        }
    }

}
