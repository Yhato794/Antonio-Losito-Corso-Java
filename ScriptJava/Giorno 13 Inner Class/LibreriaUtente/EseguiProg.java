import java.util.ArrayList;
import java.util.Scanner;

public class EseguiProg extends Libreria {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);

    public static void main(String[] args) {
        Libreria myLibreria = new Libreria();
        Libreria.Libro savedLib1 = myLibreria.new Libro("Harry Potter 1", "Fantasy");
        Libreria.Libro savedLib2 = myLibreria.new Libro("Harry Potter 2", "Fantasy");
        Libreria.Libro savedLib3 = myLibreria.new Libro("Harry Potter 3", "Fantasy");
        Libreria.Libro savedLib4 = myLibreria.new Libro("Harry Potter 4", "Fantasy");
        myLibreria.getLibri().add(savedLib1);
        myLibreria.getLibri().add(savedLib2);
        myLibreria.getLibri().add(savedLib3);
        myLibreria.getLibri().add(savedLib4);
        ArrayList<Utente> savedUsers = new ArrayList<Utente>();
        Utente savedUser1 = new Utente(01, "Antonio", "Pippo123");
        Utente savedUser2 = new Utente(02, "Francesco", "ciao1234");
        Utente savedUser3 = new Utente(03, "Giovanni", "banana33");
        savedUsers.add(savedUser1);
        savedUsers.add(savedUser2);
        savedUsers.add(savedUser3);

        boolean uscita = false;

        while (!uscita) {
            System.out.println("1: Inserisci Libro 2: Log in o 3:esci?");
            int scelta = insNum();
            switch (scelta) {
                case 1:
                    aggiungiLibro(myLibreria);
                    break;
                case 2:
                    logIn(savedUsers, myLibreria);
                    break;
                case 3:
                    uscita = true;
                    stampaLib(myLibreria.getLibri());
                    break;
                default:
                    System.out.println("ERRORE");
            }

        }
        stampaFin(savedUsers);

    }

    public static void logIn(ArrayList<Utente> savedUsers, Libreria myLibreria) {
        boolean utentetrovato = false;
        System.out.println("Nome utente");
        String userTemp = insStringhe();
        int i = 0;
        for (i = 0; i < savedUsers.size(); i++) {
            if (userTemp.equals(savedUsers.get(i).getUsername())) {
                utentetrovato = true;
                break;
            }
        }
        if (utentetrovato) {
            System.out.println("Inserisci password");
            String passInput = insStringhe();
            if (passInput.equals(savedUsers.get(i).getPassword())) {
                System.out.println("Ti sei loggato");
                stampaLib(myLibreria.getLibri());
                System.out.println("Quale libro vuoi prendere in prestito?");
                int sceltalib = insNum() - 1;
                savedUsers.get(i).getLibPreso().add(myLibreria.getLibri().get(i).getNome());
                myLibreria.getLibri().remove(sceltalib);
                System.out.println("Libro noleggiato");
            }
        }
    }

    public static void aggiungiLibro(Libreria myLibreria) {
        System.out.println("Nome libro:");
        String nomeTemp = insStringhe();
        System.out.println("Genere:");
        String geneTemp = insStringhe();
        Libreria.Libro myLibro = myLibreria.new Libro(nomeTemp, geneTemp);
        myLibreria.aggiungiLibro(myLibro);
    }

    public static void stampaLib(ArrayList<Libro> lib) {
        for (int i = 0; i < lib.size(); i++) {
            System.out.println();
            System.out.println("Libro numero:" + (i + 1));
            System.out.println("Nome: " + lib.get(i).getNome());
            System.out.println("Genere libro:" + lib.get(i).getGenere());
            System.out.println("----------------------------------------");
        }
    }

    public static int insNum() {
        boolean errore = true;
        int i = 0;
        do {
            try {
                i = interi.nextInt();
                errore = false;
                break;
            } catch (Exception e) {
                System.out.println("ERRORE");
                interi.nextLine();
                errore = true;
            } finally {
                if (errore)
                    System.out.println("Hai sbagliato");
                else
                    System.out.println("Input corretto");
            }
        } while (errore);
        return i;
    }

    public static String insStringhe() {
        boolean errore = true;
        String i = "";
        do {
            try {
                i = stringhe.nextLine();
                errore = false;
                break;
            } catch (Exception e) {
                System.out.println("ERRORE");
                interi.nextLine();
                errore = true;
            } finally {
                if (errore)
                    System.out.println("Hai sbagliato");
                else
                    System.out.println("Input corretto");
            }
        } while (errore);
        return i;
    }

    public static void stampaFin(ArrayList<Utente> savedUsers) {

        for (int i = 0; i < savedUsers.size(); i++) {
            System.out.println("Utente:" + savedUsers.get(i).getUsername() + " ha noleggiato "
                    + savedUsers.get(i).getLibPreso().size() + " libri");
            for (int j = 0; j < savedUsers.get(i).getLibPreso().size(); j++) {
                System.out.println("Libro: " + " " + (j + 1) + " " + savedUsers.get(i).getLibPreso().get(j));
            }
        }

    }
}
