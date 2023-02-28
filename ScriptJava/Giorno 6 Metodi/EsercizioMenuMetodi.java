import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class EsercizioMenuMetodi {
    final static String savedPass = "Pippo123";
    static public int incasso = 0;
    static public int nClienti = 0;
    public static int budgeCliente = 0;
    final static String savedPiattoNome[] = { "Pasta Al Forno", "Torta alle Mele" };
    public static ArrayList<String> piattoNome = new ArrayList<String>(Arrays.asList(savedPiattoNome));
    final static String savedPiattoIngrediente1[] = { "Passata di pomodoro", "Mele" };
    public static ArrayList<String> ingrediente1 = new ArrayList<String>(Arrays.asList(savedPiattoIngrediente1));
    final static String savedPiattoIngrediente2[] = { "Carne di Suino", "Uova" };
    public static ArrayList<String> ingrediente2 = new ArrayList<String>(Arrays.asList(savedPiattoIngrediente2));
    final static Integer savedPrezzoPiatto[] = { 5, 10 };
    public static ArrayList<Integer> prezzoPiatto = new ArrayList<Integer>(Arrays.asList(savedPrezzoPiatto));
    final static Integer savedDisp[] = { 2, 3 };
    public static ArrayList<Integer> disponibilitàPiatto = new ArrayList<Integer>(Arrays.asList(savedDisp));

    public static void main(String[] args) {

        Scanner ingressoApp = new Scanner(System.in);
        Scanner scelta = new Scanner(System.in);

        boolean a = true;
        boolean b = true;
        while (a) {
            System.out.println("Vuoi entrare? 1 Si 2 No");
            int ingresso = ingressoApp.nextInt();
            if (ingresso == 1) {
                b = true;
                nClienti++;
            } else {
                b = false; // USCITA *CLIENTE*
                a = false; // USCITA *INTERO PROGRAMMA*
            }
            budgeCliente = (int) (Math.random() * 50); // GENERO BUDGET CLIENTE RANDOM

            while (b) {
                System.out.println("1 Vedi 2 Compra 3 Aggiungi 4 Modifica 5 Esci.    Il tuo Budget " + budgeCliente);
                int sceltaUtente = scelta.nextInt();
                switch (sceltaUtente) {
                    case 1:
                        for (int i = 0; i < piattoNome.size(); i++) {
                            System.out.println("Piatto numero: " + (i + 1));
                            vedi(piattoNome.get(i), ingrediente1.get(i), ingrediente2.get(i), prezzoPiatto.get(i),
                                    disponibilitàPiatto.get(i));// STAMPA
                            // SEGUENDO
                            // L'INDICE
                        }
                        break;
                    case 2:
                        compra();
                        break;
                    case 3:
                        aggiungi();
                        break;
                    case 4:
                        modifica();
                        break;
                    default:
                        b = false; // USCITA LOOP *CLIENTE*

                }
            }

        }
        System.out.println("incasso di oggi è " + incasso);
        System.out.println("n totale di clienti " + nClienti);
        scelta.close();
        ingressoApp.close();
    }

    public static void vedi(String piattoNome, String ingrediente1, String ingrediente2, Integer prezzo,
            Integer disponibilità) {
        System.out.println("Piatto: " + piattoNome);
        System.out.println("Primo ingrediente: " + ingrediente1);
        System.out.println("Secondo ingrediente: " + ingrediente2);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Disponibilità: " + disponibilità);

        System.out.println(" ");

    }

    public static void compra() {
        System.out.println("Quale Piatto vuoi comprare? Ordine Numerico");
        Scanner a = new Scanner(System.in);
        int scelta = (a.nextInt()) - 1;
        if ((budgeCliente > (int) prezzoPiatto.get(scelta)) && ((int) disponibilitàPiatto.get(scelta) != 0)) {
            System.out.println("Acquisto confermato");
            incasso = incasso + ((int) prezzoPiatto.get(scelta));
            budgeCliente = budgeCliente - ((int) prezzoPiatto.get(scelta));
            disponibilitàPiatto.set(scelta, (disponibilitàPiatto.get(scelta) - 1));

        } else {
            System.out.println("Non hai abbastanza soldi o piatto non disponibile");

        }

    }

    public static void aggiungi() {
        String nomeInserito = "";
        String ingrediente1Inserito = "";
        String ingrediente2Inserito = "";
        int prezzoInserito = 0;
        int disponibilità = 0;
        System.out.println("Inserisci Password");
        Scanner pas = new Scanner(System.in);
        String passInserita = pas.nextLine();
        if (passInserita.equals(savedPass)) {
            System.out.println("Password Corretta");
            boolean errore = false;
            System.out.println("Nome Piatto:");
            Scanner nome = new Scanner(System.in);
            nomeInserito = nome.nextLine();

            if (nomeInserito.isEmpty()) {
                errore = true;
            }
            if (!errore) {
                System.out.println("Primo ingrediente:");
                Scanner ingrediente1Scanner = new Scanner(System.in);
                ingrediente1Inserito = ingrediente1Scanner.nextLine();

                if (ingrediente1Inserito.isEmpty()) {
                    errore = true;
                }
            }
            if (!errore) {
                System.out.println("Secondo ingrediente:");
                Scanner ingrediente2Scanner = new Scanner(System.in);
                ingrediente2Inserito = ingrediente2Scanner.nextLine();

                if (ingrediente2Inserito.isEmpty()) {
                    errore = true;
                }

            }
            if (!errore) {
                System.out.println("Prezzo:");
                Scanner prezzo = new Scanner(System.in);
                prezzoInserito = prezzo.nextInt();

                if (prezzoInserito == 0) {
                    errore = true;
                }
            }
            if (!errore) {
                System.out.println("Disponibilità:");
                Scanner disp = new Scanner(System.in);
                disponibilità = disp.nextInt();

                if (disponibilità == 0) {
                    errore = true;
                }
            }

            if (!errore) {
                piattoNome.add(nomeInserito);
                ingrediente1.add(ingrediente1Inserito);
                ingrediente2.add(ingrediente2Inserito);
                prezzoPiatto.add(prezzoInserito);
                disponibilitàPiatto.add(disponibilità);
                System.out.println("Aggiunta Confermata");
            } else {
                System.out.println("ERROE");
            }
        } else {
            System.out.println("Password Errata");
        }

    }

    public static void modifica() {
        String ingrediente1Inserito = "";
        String ingrediente2Inserito = "";
        int prezzoInserito = 0;
        int disponibilità = 0;
        System.out.println("Inserisci Password");
        Scanner pas = new Scanner(System.in);
        String passInserita = pas.nextLine();
        if (passInserita.equals(savedPass)) {
            boolean errore = false;
            System.out.println("Quale Piatto vuoi modificare in ordine numerico");
            Scanner scelta = new Scanner(System.in);
            int scaltaPiatto = (scelta.nextInt() - 1);
            if (scaltaPiatto < piattoNome.size()) {
                System.out.println("Nome:");
                Scanner nome = new Scanner(System.in);
                String nomeInserito = nome.nextLine();
                if (nomeInserito.isEmpty()) {
                    errore = true;
                }
                if (!errore) {
                    System.out.println("Primo ingrediente:");
                    Scanner ingrediente1Scanner = new Scanner(System.in);
                    ingrediente1Inserito = ingrediente1Scanner.nextLine();
                    if (ingrediente1Inserito.isEmpty()) {
                        errore = true;
                    }
                }
                if (!errore) {
                    System.out.println("Secondo ingrediente:");
                    Scanner ingrediente2Scanner = new Scanner(System.in);
                    ingrediente2Inserito = ingrediente2Scanner.nextLine();
                    if (ingrediente2Inserito.isEmpty()) {
                        errore = true;
                    }
                }
                if (!errore) {
                    System.out.println("Prezzo:");
                    Scanner prezzo = new Scanner(System.in);
                    prezzoInserito = prezzo.nextInt();
                    if (prezzoInserito == 0) {
                        errore = true;
                    }
                }
                if (!errore) {
                    System.out.println("Disponibilità:");
                    Scanner disp = new Scanner(System.in);
                    disponibilità = disp.nextInt();
                    if (disponibilità == 0) {
                        errore = true;
                    }
                }

                if (!errore) {
                    piattoNome.set(scaltaPiatto, nomeInserito);
                    ingrediente1.set(scaltaPiatto, ingrediente1Inserito);
                    ingrediente2.set(scaltaPiatto, ingrediente2Inserito);
                    prezzoPiatto.set(scaltaPiatto, prezzoInserito);
                    disponibilitàPiatto.set(scaltaPiatto, disponibilità);
                    System.out.println("Piatto modificato");
                } else {
                    System.out.println("ERRORE");
                }

            } else {
                System.out.println("Piatto non trovato");
            }

        } else {
            System.out.println("Password ERRATA");
        }
    }

}
