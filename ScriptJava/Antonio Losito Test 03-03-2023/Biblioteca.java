import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);
    public static ArrayList<Libro> libriBib = new ArrayList<Libro>();

    public static void menuPrincipale() { // MENU PRINCIPALE
        System.out.println(
                "Quale Operazione vuoi eseguire?\n1:Lista libri disponibili \n2:Lista libri in prestito \n3:Noleggia libro \n4:Restituisci Libro \n5:Aggiungi Libro \n6:Rimuovi Libro \n7:Esci");
        int scelta = interi.nextInt();
        switch (scelta) {
            case 1:
                stampaLibriInBibDisponibili();
                break;
            case 2:
                stampaLibriInPrestito();
                break;
            case 3:
                noleggiaLibro();
                break;
            case 4:
                restituisciLibro();
                break;
            case 5:
                aggiungiLibro();
                break;
            case 6:
                rimuoviLibro();
                break;
            default:
                break;
        }
    }

    public static void noleggiaLibro() { // NOLEGGIA LIBRO SOLO SE DISPONIBILITA' DIVERSA DA 0
        stampaLibriInBib();
        System.out.println("Quale libro vuoi noleggiare?");
        int scelta = stringhe.nextInt();
        if (libriBib.get(scelta).getnDisponibile() != 0) {
            libriBib.get(scelta).setnDisponibile(libriBib.get(scelta).getnDisponibile() - 1);
            System.out.println("Hai noleggiato il libro");
        } else {
            System.out.println("Libro non disponibile");
            System.out.println("-----------------------------------");
            menuPrincipale();
        }

    }

    public static void stampaLibriInBib() { // STAMPA TUTTI I LIBRI IN MEMORIA ANCHE QUELLI NON DISPONIBILI O
        for (int i = 0; i < libriBib.size(); i++) {

            System.out.print("ID: " + i + " Nome :" + libriBib.get(i).getNomeLibro() + " ");
            System.out.println("Disponibilità :" + libriBib.get(i).getnDisponibile());

        }
    }

    public static void stampaLibriInPrestito() {
        for (int i = 0; i < libriBib.size(); i++) {
            if (libriBib.get(i).getnInprestito() != 0) {
                System.out.print("ID: " + i + " Nome :" + libriBib.get(i).getNomeLibro() + " ");
                System.out.println("Disponibilità :" + libriBib.get(i).getnDisponibile());

            }
        }
        System.out.println("-----------------------------------");
        menuPrincipale();
    }

    public static void stampaLibriInBibDisponibili() {
        for (int i = 0; i < libriBib.size(); i++) {
            if (libriBib.get(i).getnDisponibile() != 0) {
                System.out.print("ID: " + i + " Nome :" + libriBib.get(i).getNomeLibro() + " ");
                System.out.println("Disponibilità :" + libriBib.get(i).getnDisponibile());

            }
        }
        System.out.println("-----------------------------------");
        menuPrincipale();
    }

    public static void aggiungiLibro() {
        System.out.println("Nome libro:");
        String nomeLibUtente = stringhe.nextLine();
        libriBib.add(new Libro(nomeLibUtente, 0, 1));
        System.out.println("----------------------------------");
        menuPrincipale();
    }

    public static void rimuoviLibro() {
        stampaLibriInBib();
        System.out.println("Quale libro vuoi rimuovere?");
        int scelta = interi.nextInt();
        System.out.println("Hai scelto di rimuovere " + libriBib.get(scelta).getNomeLibro() + "Sei sicuro? 1 Si 2 No");
        int scelta1 = interi.nextInt();
        if (scelta1 == 1) {
            System.out.println("Libro rimosso");
            libriBib.remove(scelta);
        } else {
            System.out.println("Cancellazione annullata ritorno al menu principale");
            menuPrincipale();
        }
        System.out.println("--------------------------------");
        menuPrincipale();
    }

    public static void restituisciLibro() {
        int i;
        boolean trovato = false;
        System.out.println("Quale libro vuoi restituire?");
        String scelta = stringhe.nextLine();
        for (i = 0; i < libriBib.size(); i++) {
            if (libriBib.get(i).getNomeLibro().equals(scelta)) {
                trovato = true;
                break;
            }
        }
        int scelta1 = 0;
        if (trovato) {
            System.out.println("Libro restituito");
            libriBib.get(i).setnDisponibile(libriBib.get(i).getnDisponibile() + 1);
            libriBib.get(i).setnInprestito(libriBib.get(i).getnInprestito() - 1);

        } else {
            System.out.println("Libro non trovato vuoi aggiungerlo? 1:Si 2:No");
            scelta1 = interi.nextInt();

        }
        if (scelta1 == 1) {
            aggiungiLibro();
        } else {
            menuPrincipale();
        }
    }
}