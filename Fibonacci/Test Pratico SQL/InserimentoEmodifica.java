import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class InserimentoEmodifica {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);

    public static void main(String[] args) {

        boolean uscita = true;
        do {
            System.out.println("Aggiungere 1:autore 2:libro   0: esci");
            int scelta = (int) insInt();
            switch (scelta) {
                case 1:
                    inseAutore();
                    break;
                case 2:
                    insRomanzo();
                    break;
                case 0:
                    uscita = false;
                    break;
                default:
                    System.out.println("ERRORE");
                    break;
            }

        } while (uscita);

        System.out.println("Stampa 1:autori o 2:Libri");
        int sceltaStampa = (int) insInt();
        if (sceltaStampa == 1) {
            stampAutori();
        } else if (sceltaStampa == 2) {
            stampRomanzi();
        } else {
            System.out.println("Scelta non valida");
        }

    }

    public static double insInt() {
        boolean errore = true;
        double i = 0;
        do {
            try {
                i = interi.nextDouble();
                errore = false;
                break;
            } catch (Exception e) {
                System.out.println("ERRORE");
                interi.nextLine();
                errore = true;
            } finally {
                if (errore)
                    System.out.println("Hai sbagliato Riprova");
                else
                    System.out.println("Input corretto");
            }
        } while (errore);
        return i;
    }

    public static void inseAutore() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTECA", "root", "root");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM biblioteca.autori;";
            ResultSet rs = stmt.executeQuery(sql);
            boolean trovato = true;
            System.out.println("Inserisci Autore");
            String nomeAutore = stringhe.nextLine();
            while (rs.next()) {
                if (nomeAutore.equals(rs.getString("nome_autore"))) {
                    trovato = false;
                }
            }
            if (trovato) {
                System.out.println("Autore non trovato");
                System.out.println("Inserisci anno nascita YYYY"); // Molto sbagliato questo, Errore da parte del
                                                                   // utente è garantito ma sto finendo il tempo
                                                                   // :D :D :D
                int dataAutoNasc = (int) insInt();

                System.out.println("Inserisci anno morte YYYY"); // Molto sbagliato questo. Errore da parte del
                                                                 // utente è garantito ma sto finendo il tempo :D
                                                                 // :D :D
                int dataAutoMorte = (int) insInt();

                rs.moveToInsertRow();
                rs.updateString("nome_autore", nomeAutore);
                rs.updateInt("anno_nascita", dataAutoNasc);
                rs.updateInt("anno_morte", dataAutoMorte);
                rs.insertRow();
                rs.moveToCurrentRow();
                System.out.println("Autore inserito");

            }
        } catch (Exception e) {
            System.out.println("ERRORE"+e);
        }

    }

    public static void insRomanzo() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTECA", "root", "root");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM romanzi";
            ResultSet rs = stmt.executeQuery(sql);
            boolean trovato = true;
            System.out.println("Nome autore");
            String nomeAutore = stringhe.nextLine();
            while (rs.next()) {
                if (nomeAutore.equals(rs.getString("nome_autore"))) {
                    trovato = false;
                }
            }
            if (trovato) {

                System.out.println("Autore trovato");
                System.out.println("Inserisci Nome libro");
                String nomeLib = stringhe.nextLine();
                System.out.println("Inserisci anno pubblicazione YYYYMMDD"); // Molto sbagliato questo. Errore da parte del
                                                                     // utente è garantito ma sto finendo il tempo :D
                                                                     // :D :D
                int dataPubbInput = (int) insInt();

                rs.moveToInsertRow();
                rs.updateString("autore", nomeAutore);
                rs.updateString("titolo", nomeLib);
                rs.updateInt("anno_pubblicazione", dataPubbInput);
                rs.insertRow();
                rs.moveToCurrentRow();
                System.out.println("Libro inserito");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void stampAutori() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTECA", "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM autori";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData meta = rs.getMetaData();
            int numeroColonne = meta.getColumnCount();
            while (rs.next()) {

                for (int i = 1; i <= numeroColonne; i++)
                    System.out.print(meta.getColumnName(i) + ": " + rs.getString(i) + " ");

                System.out.println();
            }
            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void stampRomanzi() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTECA", "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM romanzi";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData meta = rs.getMetaData();
            int numeroColonne = meta.getColumnCount();
            while (rs.next()) {

                for (int i = 1; i <= numeroColonne; i++)
                    System.out.print(meta.getColumnName(i) + ": " + rs.getString(i) + " ");

                System.out.println();
            }
            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
