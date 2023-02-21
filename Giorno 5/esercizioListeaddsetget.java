import java.util.Scanner;
import java.util.ArrayList;

public class esercizioListeaddsetget {
    public static void main(String[] args) {
        Scanner sceltaMenu = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Scanner eta = new Scanner(System.in);
        Scanner nomecerca = new Scanner(System.in);
        Scanner passcerca = new Scanner(System.in);

        ArrayList<String> savednome = new ArrayList<String>();
        ArrayList<String> savedpassword = new ArrayList<String>();
        ArrayList<Integer> savedeta = new ArrayList<Integer>();
        boolean b = true;
        int contatore = 0;
        boolean errore = false;
        boolean erroreMod = false;
        while (b) {
            boolean a = true;
            System.out.println(
                    "1:Registrare Utente 2: Modifica 3: Visualizza 4:Delete Account 5:Esci(visualizza utenti in memoria)");
            int scelta = sceltaMenu.nextInt();
            switch (scelta) {
                case 1:
                    while (a) {
                        System.out.println("Inserisci nome");
                        String nomeTemp = nome.nextLine();
                        if (!(nomeTemp.length() != 0)) {
                            errore = true;
                            System.out.println("ERRORE");
                            break;
                        }
                        for (int i = 0; i < savednome.size(); i++) {
                            if (nomeTemp.equals(savednome.get(i))) {
                                errore = true;
                                System.out.println("ERRORE");
                            }
                        }
                        if (errore) {
                            break;
                        }
                        System.out.println("Inserisci eta");
                        int etatemp = eta.nextInt();
                        if (!(etatemp > 0)) {
                            errore = true;
                            System.out.println("ERRORE");
                            break;
                        }
                        System.out.println("Inserisci password");
                        String passTemp = password.nextLine();
                        if (!(passTemp.length() != 0)) {
                            errore = true;
                            System.out.println("ERRORE");
                            break;
                        }
                        if (!errore) {
                            savednome.add(nomeTemp);
                            savedpassword.add(passTemp);
                            savedeta.add(etatemp);
                        }
                        contatore++;
                        System.out.println(
                                "Registrazione avvenuta con successo, registrare un altro utente?1 Si 2 No");

                        scelta = sceltaMenu.nextInt();
                        if (scelta == 2) {
                            a = false;
                        }

                    }

                    break;
                case 2:
                    System.out.println("Inserire nome utente");
                    String FindNome = nomecerca.nextLine();
                    int i = 0;
                    for (i = 0; i < savednome.size(); i++) {
                        if (FindNome.equals(savednome.get(i))) {
                            System.out.println("Utente trovato in posizione " + (i + 1));
                            break;
                        }
                    }
                    System.out.println("Inserisci password del account di " + savednome.get(i));
                    String FindPassword = passcerca.nextLine();
                    if (FindPassword.equals(savedpassword.get(i))) {
                        System.out.println("Password corretta");
                        System.out.println("Inserisci nome");
                        String nomeTemp = nome.nextLine();
                        if (!(nomeTemp.length() != 0)) {
                            errore = true;
                            System.out.println("ERRORE");
                            break;
                        }
                        for (int j = 0; j < savednome.size(); j++) {
                            if (nomeTemp.equals(savednome.get(j))) {
                                errore = true;
                            }
                        }
                        if (errore) {
                            break;
                        }

                        System.out.println("Inserisci eta");
                        int etatemp = eta.nextInt();
                        if (!(etatemp > 0)) {
                            errore = true;
                            System.out.println("ERRORE");
                            break;
                        }
                        System.out.println("Inserisci password");
                        String passTemp = password.nextLine();
                        if (!(passTemp.length() != 0)) {
                            errore = true;
                            System.out.println("ERRORE");
                            break;
                        }
                        if (!errore) {
                            savednome.set(i, nomeTemp);
                            savedpassword.set(i, passTemp);
                            savedeta.set(i, etatemp);
                        }
                        System.out.println(
                                "modifica avvenuta con successo");
                    } else {
                        System.out.println("Password ERRATA");
                    }
                    break;
                case 3:
                    for (int x = 0; x < savednome.size(); x++) {
                        System.out.println("Utente in posizione n: " + (x+1));
                        System.out.println("Nome: " + savednome.get(x));
                        System.out.println("Eta: " + savedeta.get(x));

                    }
                    break;
                case 4:
                    System.out.println("Inserire nome utente");
                    FindNome = nomecerca.nextLine();
                    i = 0;
                    for (i = 0; i < savednome.size(); i++) {
                        if (FindNome.equals(savednome.get(i))) {
                            System.out.println("Utente trovato in posizione " + (i + 1));
                            break;
                        }
                    }
                    savedeta.remove(i);
                    savednome.remove(i);
                    savedpassword.remove(i);
                    System.out.println("Utente Eliminato");
                    contatore--;
                    break;
                default:
                    b = false;

            }

        }
        System.out.println("Numero utenti registrati " + contatore);
        for (int i = 0; i < contatore; i++) {
            System.out.println("Utente numero: " + (i + 1) + "Nome: " + savednome.get(i) + " eta: " + savedeta.get(i));
        }

    }

}
