import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private static Scanner interi = new Scanner(System.in);
    private static Scanner stringa = new Scanner(System.in);

    ArrayList<String> nome = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    //private final int[] authCode = { 0000, 1111 };

    public static void menuAdmin() {
        Admin admin = new Admin();
        boolean exit = false;
        while (!exit) {
            System.out.println("---------CONTROL PANEL---------");
            System.out.println("Vuoi 1:Registrare 2:Login 3:Visualizza 4:uscire");
            int scelta = interi.nextInt();
            switch (scelta) {
                case 1:
                    registrazioneAdmin(admin);
                    break;
                case 2:
                    // logInAdmin(admin);
                    break;
                case 3:
                    visualizzaAdmin(admin);
                    break;
                case 4:
                    exit = true;
                    break;

            }
        }

    }

    public static void registrazioneAdmin(Admin x) {
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

    public static void visualizzaAdmin(Admin x) {
        for (int i = 0; i < x.nome.size(); i++) {
            System.out.println("Nome:" + x.nome.get(i));
            System.out.println("---------------------------------------");
        }
    }

    public static void loginAdmin(Admin x) {
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
                    exit = true;
                    // MODIFICA CREA E ELIMINA PIATTO MENU DA INSERIRE
                } else {
                    System.out.println("Password Errata riprova");
                }
            } else if (trovato) {
                System.out.println("Account non trovato");
            }

        }

    }
}
