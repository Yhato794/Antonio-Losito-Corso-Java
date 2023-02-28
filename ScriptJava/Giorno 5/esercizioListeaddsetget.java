import java.util.Scanner;
import java.util.ArrayList;

public class esercizioListeaddsetget {
    public static String nomeTemp;
    public static String passTemp;
    public static int etaTemp;

    public static void main(String[] args) {
        Scanner sceltaMenu = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Scanner eta = new Scanner(System.in);
        Scanner nomecerca = new Scanner(System.in);
        Scanner passcerca = new Scanner(System.in);
        Scanner conferma = new Scanner(System.in);

        ArrayList<String> savednome = new ArrayList<String>();
        ArrayList<String> savedpassword = new ArrayList<String>();
        ArrayList<Integer> savedeta = new ArrayList<Integer>();
        boolean b = true;
        int contatore = 0;
        boolean errore = false;
        while (b) {
            boolean a = true;
            System.out.print("1:Registrare Utente 2: Modifica 3: Visualizza ");
            System.out.println("4:Login 5:Delete Account 6:Esci(visualizza utenti in memoria)");
            int scelta = sceltaMenu.nextInt();
            switch (scelta) {
                case 1:
                    while (a) {
                        a = controlloNome(nome, errore, savednome);
                        a = controlloEta(eta, errore);
                        a = controlloPassword(password, errore);
                        if (!a) {
                            savednome.add(nomeTemp);
                            savedpassword.add(passTemp);
                            savedeta.add(etaTemp);
                            System.out.println("Utente registrato con successo");
                            contatore++;
                        }
                        a = uscita();
                    }
                    break;
                case 2:
                    System.out.println("Inserire nome utente");
                    String FindNome = nomecerca.nextLine();
                    int i = cercaNome(savednome, FindNome);
                    System.out.println("Inserisci password del account di " + savednome.get(i));
                    String FindPassword = passcerca.nextLine();
                    if (FindPassword.equals(savedpassword.get(i))) {
                        System.out.println("Password corretta");
                        errore = controlloNome(nomecerca, errore, savednome);
                        errore = controlloEta(eta, errore);
                        errore = controlloPassword(password, errore);
                        if (!errore) {
                            savednome.set(i, nomeTemp);
                            savedpassword.set(i, passTemp);
                            savedeta.set(i, etaTemp);
                        }
                        System.out.println(
                                "modifica avvenuta con successo");
                    } else {
                        System.out.println("Password ERRATA");
                    }
                    break;
                case 3:
                    int x = 0;
                    for (x = 0; x < savednome.size(); x++) {
                        System.out.println("Utente in posizione n: " + (x + 1));
                        System.out.println("Nome: " + savednome.get(x));
                        System.out.println("Eta: " + savedeta.get(x));

                    }
                    if (x == 0) {
                        System.out.println("Non ci sono utenti registrati in memoria");
                    }
                    break;
                case 4:
                    login(savednome, savedpassword);
                    break;
                case 5:
                    System.out.println("Inserire nome utente");
                    FindNome = nomecerca.nextLine();
                    i = cercaNome(savednome, FindNome);
                    System.out.println("Inserisci password del account di " + savednome.get(i));
                    FindPassword = passcerca.nextLine();
                    if (FindPassword.equals(savedpassword.get(i))) {
                        System.out.println("Password corretta");
                        System.out.println("Sei sicuro di voler eliminare questo account? 1 Si 2 No");
                        int conferma1 = conferma.nextInt();
                        if (conferma1 == 1) {
                            savedeta.remove(i);
                            savednome.remove(i);
                            savedpassword.remove(i);
                            System.out.println("Utente Eliminato");
                            contatore--;
                        }
                    } else {
                        System.out.println("Password Errata");
                    }

                    break;
                default:
                    b = false;

            }

        }
        System.out.println("Numero utenti registrati " + contatore);
        for (int i = 0; i < contatore; i++) {
            System.out.println("Utente numero: " + (i + 1) + " Nome: " + savednome.get(i) + " eta: " + savedeta.get(i));
        }

    }

    public static boolean controlloNome(Scanner nome, boolean errore, ArrayList savednome) {

        System.out.println("Inserisci nome");
        nomeTemp = nome.nextLine();
        if (!(nomeTemp.length() != 0)) {
            errore = true;
            System.out.println("ERRORE");

        }
        for (int i = 0; i < savednome.size(); i++) {
            if (nomeTemp.equals(savednome.get(i))) {
                errore = true;
                System.out.println("ERRORE");
            }
        }
        return errore;

    }

    public static boolean controlloEta(Scanner eta, boolean errore) {
        System.out.println("Inserisci eta");
        etaTemp = eta.nextInt();
        if (!(etaTemp > 0)) {
            errore = true;
            System.out.println("ERRORE");

        }
        return errore;
    }

    public static boolean controlloPassword(Scanner password, boolean errore) {
        System.out.println("Inserisci password");
        passTemp = password.nextLine();
        if (!(passTemp.length() != 0)) {
            errore = true;
            System.out.println("ERRORE");

        }
        return errore;

    }

    public static boolean uscita() { // Chiesta di uscita
        Scanner sceltaMenu = new Scanner(System.in);
        boolean a = true;
        System.out.println("1:Registrare un altro utente o 2:uscire?");
        int scelta = sceltaMenu.nextInt();
        if (scelta == 2) {
            a = false;
        }
        sceltaMenu.close();
        return a;
    }

    public static int cercaNome(ArrayList savednome, String FindNome) {// Metodo cerca nomi ritorna la posizione se
                                                                       // trovato -1 se non trovato
        int y = 0;
        for (int i = 0; i < savednome.size(); i++) {
            if (FindNome.equals(savednome.get(i))) {
                System.out.println("Utente trovato in posizione " + (i + 1));
                y = i;
                break;
            } else {
                y = -1;
            }
        }
        return y;
    }

    public static void login(ArrayList savednome, ArrayList savedpassword) {// Login
        Scanner nomecerca = new Scanner(System.in);
        Scanner passcerca = new Scanner(System.in);
        System.out.println("Inserire nome utente");
        String FindNome = nomecerca.nextLine();
        int i = cercaNome(savednome, FindNome);
        if (i != -1) {
            System.out.println("Inserisci password del account di " + savednome.get(i));
            String FindPassword = passcerca.nextLine();
            if (FindPassword.equals(savedpassword.get(i))) {
                System.out.println("Login effettuato");
            } else {
                System.out.println("Password Errata");
            }
        } else {
            System.out.println("Utente non trovato");

        }
        nomecerca.close();
        passcerca.close();
    }
}
