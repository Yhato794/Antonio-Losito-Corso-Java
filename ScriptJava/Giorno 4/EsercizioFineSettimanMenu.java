import java.util.Scanner;

public class EsercizioFineSettimanMenu {

    public static Scanner ingressoApp = new Scanner(System.in);
    public static int ingresso;
    public static Scanner scelta = new Scanner(System.in);
    public static int sceltaUtente;
    public static Scanner ingre1 = new Scanner(System.in);
    public static Scanner ingre2 = new Scanner(System.in);
    public static Scanner prez = new Scanner(System.in);
    public static Scanner disp = new Scanner(System.in);
    public static Scanner sceltaAcqui = new Scanner(System.in);
    public static Scanner primoloop = new Scanner(System.in);
    public static Scanner pass = new Scanner(System.in);

    public static String passAdmin = "Pippo123";
    public static String p1nome = "Pasta Al Forno";
    public static String p1ingrediente1 = "Passata di pomodoro";
    public static String p1ingrediente2 = "Carne di Suino";
    public static int p1prezzo = 15;
    public static int p1disponibilità = 7;
    public static String p2nome = "Torta alle Mele";
    public static String p2ingrediente1 = "Mele";
    public static String p2ingrediente2 = "Uovo";
    public static int p2prezzo = 5;
    public static int p2disponibilità = 20;

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        int incasso = 0;
        int nClienti = 0;

        while (a) { // LOOP *INTERO PROGRAMMA* ESCLUSI INCASSI E N CLIENTI

            System.out.println("Vuoi entrare? 1 SI 2 NO");
            ingresso = ingressoApp.nextInt();

            if (ingresso == 1) {
                b = true;
            } else {
                b = false; // USCITA *CLIENTE*
                a = false; // USCITA *INTERO PROGRAMMA*
            }

            int budgeCliente = (int) (Math.random() * 50); // GENERO BUDGET CLIENTE RANDOM

            while (b) { // LOOP *CLIENTE* SENZA CAMBIARE BUDGET

                System.out.println("1 Vedi 2 Compra 3 Modifica 4 Esci Il tuo Budget " + budgeCliente);
                sceltaUtente = scelta.nextInt();

                switch (sceltaUtente) {

                    case 1:
                        visual(p1nome, p1ingrediente1, p1ingrediente2, p1prezzo);
                        visual(p2nome, p2ingrediente1, p2ingrediente2, p2prezzo);
                        b = uscita();
                        break;

                    case 2:
                        // compra
                        System.out.println("Comprare piatto 1 o 2");
                        int acquisto = 0;
                        acquisto = sceltaAcqui.nextInt();
                        switch (acquisto) {
                            case 1:
                                if (budgeCliente > p1prezzo && p1disponibilità != 0) {
                                    System.out.println("Acquisto confermato"); // CALCOLO NUOVO INCASSO E BUDGET E
                                                                               // AGGIORNAMENTO N CLIENT TOTALI
                                    p1disponibilità--;
                                    incasso = incasso + p1prezzo;
                                    budgeCliente = budgeCliente - p1prezzo;
                                    nClienti++;
                                    System.out.println("Disponibilità piatto " + p2disponibilità);

                                } else {
                                    System.out.println("Non hai abbastanza soldi o piatto non disponibile");
                                }
                                break;

                            case 2:
                                if (budgeCliente > p2prezzo && p2disponibilità != 0) {
                                    System.out.println("Acquisto confermato"); // CALCOLO NUOVO INCASSO E BUDGET E
                                                                               // AGGIORNAMENTO N CLIENT TOTALI
                                    p2disponibilità--;
                                    incasso = incasso + p2prezzo;
                                    budgeCliente = budgeCliente - p2prezzo;
                                    nClienti++;
                                    System.out.println("Disponibilità piatto " + p2disponibilità);
                                } else {
                                    System.out.println("Non hai abbastanza soldi o piatto non disponibile");
                                }
                                break;

                            default:
                                System.out.println("Errore");

                        }
                        b = uscita();
                        break;

                    case 3:
                        System.out.println("Inserisci Password"); // RICHIESTA PASSWORD
                        String pass_utente = pass.nextLine();
                        if (pass_utente.equals(passAdmin)) {
                            piatto1mod(); // MODIFICA PIATTO1
                            piatto2mod(); // MODIFICA PIATTO2
                            b = uscita();
                        } else {
                            System.out.println("Password Errata");
                            b = uscita();
                        }
                        break;

                    default:
                        b = false; // USCITA LOOP *CLIENTE*
                }
            }
        }

        System.out.println("incasso di oggi è " + incasso);
        System.out.println("n totale di clienti " + nClienti);
    }

    public static void piatto1mod() {
        System.out.println("Modifica Piatto 1: ");

        System.out.println("Primo ingrediente ");
        p1ingrediente1 = ingre1.nextLine();

        System.out.println("Secondo ingrediente ");
        p1ingrediente2 = ingre2.nextLine();

        System.out.println("Prezzo ");
        p1prezzo = prez.nextInt();

        System.out.println("Disponibilità ");
        p1disponibilità = disp.nextInt();
    }

    public static void piatto2mod() {
        System.out.println("Modifica Piatto piatto 2 ");

        System.out.println("Primo ingrediente ");
        p2ingrediente1 = ingre1.nextLine();

        System.out.println("Secondo ingrediente ");
        p2ingrediente2 = ingre2.nextLine();

        System.out.println("Prezzo ");
        p2prezzo = prez.nextInt();

        System.out.println("Disponibilità ");
        p2disponibilità = disp.nextInt();
    }

    public static void visual(String nome, String ingrediente1, String ingrediente2, int prezzo) {

        System.out.println("piatto " + nome);
        System.out.println("Primo ingrediente " + ingrediente1);
        System.out.println("Secondo ingrediente " + ingrediente2);
        System.out.println("Prezzo " + prezzo);

    }

    public static boolean uscita() {

        boolean b = true;
        System.out.println("Continuare o Uscire 1 o 2");
        int x = primoloop.nextInt();
        if (x == 2) {
            b = false; // USCITA LOOP *CLIENTE*
        }
        return b;

    }
}