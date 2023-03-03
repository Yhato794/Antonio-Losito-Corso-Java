
import java.util.Scanner;

public class Utente {
    public static Scanner stringhe = new Scanner(System.in);
    public static Scanner interi = new Scanner(System.in);
    private String nome;
    private String email;
    private String nLibriNoleggiati;
    // utentiInMemoria.add(new Utente("",""));

    // public static ArrayList<Admin> adminInMemoria= new ArrayList<Admin>();
    // ***********FORSE SBAGLIATO*************
    public Utente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnLibriNoleggiati() {
        return nLibriNoleggiati;
    }

    public void setnLibriNoleggiati(String nLibriNoleggiati) {
        this.nLibriNoleggiati = nLibriNoleggiati;
    }

    public static void LogIn() {

        boolean log = false;
        System.out.println("Inserisci Nome:");
        String userInput = stringhe.nextLine();
        for (int i = 0; i < mainSoftware.utentiInMemoria.size(); i++) {
            if (mainSoftware.utentiInMemoria.get(i).getNome().equals(userInput)) {
                System.out.println("Ti sei Loggato");
                Biblioteca.menuPrincipale();
                log = true;

            }
        }
        if (!log) {
            System.out.println("Utente non in memoria vuoi registrarti? 1:Si 2:No");
            int scelta = interi.nextInt();
            if (scelta == 1) {
                registrazioneUtente();
            } else {
                mainSoftware.menuLogin();
            }

        }
        // if()
    }

    public static void registrazioneUtente() {
        boolean errore = true;
        System.out.println("Inserisci Nome Utente:");
        String userInput = stringhe.nextLine();
        for (int i = 0; i < mainSoftware.utentiInMemoria.size(); i++) {
            if (mainSoftware.utentiInMemoria.get(i).nome.equals(userInput)) {
                errore = false;
            }
        }
        if (errore) {
            System.out.println("Inserisci email;");
            String emailInput = stringhe.nextLine();
            mainSoftware.utentiInMemoria.add(new Utente(userInput, emailInput));
            System.out.println("Utente registrato");
            mainSoftware.menuLogin();

        } else {
            System.out.println("Utente già in memoria riprova");
            registrazioneUtente();
        }

    }
}
