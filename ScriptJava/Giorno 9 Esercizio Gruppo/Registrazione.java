import java.util.Scanner;

public class Registrazione {
    private static Scanner stringa = new Scanner(System.in);

    private static Scanner interi = new Scanner(System.in);

    public static void main(String[] args) {
        Utente utenteObj = new Utente();
        showFirstMenu1(utenteObj);

    }

    public static void showFirstMenu1(Utente utenteObj) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Vuoi 1:Registrare 2:Loggare 3:Visualizza Account in memoria 4:uscire \nInserisci codice admin per accedere al Pannello di controllo");
            int scelta = interi.nextInt();
            switch (scelta) {
                case 1:
                    registrazione(utenteObj);
                    break;
                case 2:
                    logIn(utenteObj);
                    break;
                case 3:
                    visualizza(utenteObj);
                    break;
                case 4:
                    exit = true;
                    break;
                case 0000:
                case 1111:
                    Admin.menuAdmin();
                break;

            }
        }

    }

    public static void visualizza(Utente x) {
        for (int i = 0; i < x.nome.size(); i++) {
            System.out.println("Nome:" + x.nome.get(i));
            System.out.println("---------------------------------------");
        }

    }

    public static void registrazione(Utente x) {
        String nomeTemp = "";
        
        boolean exit = false;
        boolean errore = false;
        while (!exit) {
            System.out.println("Inserisci Nome");
            nomeTemp = stringa.nextLine();
            for (int i = 0; i < x.nome.size(); i++) {
                if (x.nome.get(i).equals(nomeTemp)) {
                    System.out.println("Account già in memoria");
                    errore = true;
                } else {

                    errore = false;
                }
            }
            if (!errore) {
                x.nome.add(nomeTemp);
                System.out.println("Inserisci Password");
                x.password.add(stringa.nextLine());
                System.out.println("Registrare un altro account? 1 Si 2 no");
                int scelta = interi.nextInt();
                if (scelta == 2) {
                    exit = true;
                }
            }

        }
    }

    public static void logIn(Utente x) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Inserisci Nome Utente Oppure 0 per uscire");
            String nomeTemp = stringa.nextLine();
            boolean trovato = false;
            int i = 0;
            for (i = 0; i < x.nome.size(); i++) {
                if (x.nome.get(i).equals(nomeTemp)) {
                    trovato = true;
                    break;
                } else if (nomeTemp.equals("0")) {
                    exit = true;
                }
            }
            if (trovato) {
                System.out.println("Inserisci Password");
                String passTemp = stringa.nextLine();
                if (x.password.get(i).equals(passTemp)) {
                    System.out.println("Password Corretta");
                    x.budget.add(i, (int) (Math.random() * 50));
                    exit = true;
                    System.out.println("Il tuo Budget: " + x.budget.get(i));

                    GestioneRistorante.showFirstMenu(x, i);
                } else {
                    System.out.println("Password Errata riprova");
                }
            } else if (trovato) {
                System.out.println("Account non trovato");
            }

        }

    }
}
