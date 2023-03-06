import java.util.Scanner;

public class Felini {
    private String nome;
    static Scanner stringa = new Scanner(System.in);

    public Felini(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void inseNome() {
        System.out.println("Inserisci il nome");
        Registrazione.listaFelini.add(new Felini(stringa.nextLine()));
        System.out.println("Animale Registrato");
    }

    public static void stampa() {
        int i = 0;
        System.out.println("Felini registrati oggi " + Registrazione.listaFelini.size());
        for (i = 0; i < Registrazione.listaFelini.size(); i++) {
            System.out.println("Nome: " + Registrazione.listaFelini.get(i).getNome());
        }
    }
}
