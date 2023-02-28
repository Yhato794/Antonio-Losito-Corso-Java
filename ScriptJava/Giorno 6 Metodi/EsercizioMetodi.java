import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioMetodi {
    public static String inserimentoNome() {
        Scanner nome = new Scanner(System.in);
        String nomeUtente = nome.nextLine();
        return nomeUtente;
    }

    public static String inserimentoPass() {
        Scanner pass = new Scanner(System.in);
        String passUtente = pass.nextLine();
        return passUtente;
    }

    public static int inserimentoEta() {
        Scanner nome = new Scanner(System.in);
        int etaUtente = nome.nextInt();
        return etaUtente;
    }

    public static void main(String[] args) {
        Scanner scelta = new Scanner(System.in);
        Scanner scelta1 = new Scanner(System.in);

        ArrayList<String> savednome = new ArrayList<String>();
        ArrayList<String> savedpassword = new ArrayList<String>();
        ArrayList<Integer> savedeta = new ArrayList<Integer>();
        boolean a = true;
        boolean b = true;
        while (b) {
            while (a) {
                System.out.println("Inserisci nome");
                savednome.add(inserimentoNome());
                System.out.println("Inserisci Eta");
                savedeta.add(inserimentoEta());
                System.out.println("Inserisci Password");
                savedpassword.add(inserimentoPass());
                System.out.println("Inserire un altro utente?");
                int sceltamainmenu = scelta.nextInt();
                if (sceltamainmenu == 2) {
                    a = false;
                }

            }
            System.out.println("LOGIN");
            System.out.println("Nome Utente:");
            boolean l = true;
            int i = 0;
            for (i = 0; i < savednome.size(); i++) {
                if (inserimentoNome().equals(savednome.get(i))) {
                    l = false;
                    break;
                }
            }
            if (!l) {
                System.out.println("Password:");
                if (inserimentoPass().equals(savedpassword.get(i))) {
                    System.out.println("LOGIN EFFETTUATO");
                } else {
                    System.out.println("PASSWORD ERRATA");
                }
            }
            System.out.println("Continuare?");
            int y = scelta1.nextInt();
            if (y == 1) {
                a = true;
            }
        }
    }

}
