
import java.util.Scanner;

public class Anfibi {

    static Scanner stringa = new Scanner(System.in);
    private String nome;

    public Anfibi(String nome) {
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
        Registrazione.listaAnfibi.add(new Anfibi(stringa.nextLine()));
        System.out.println("Animale Registrato");
    }

    public static void stampa() {
        int i = 0;
        System.out.println("Anfibi registrati oggi " + Registrazione.listaAnfibi.size());
        for (i = 0; i < Registrazione.listaAnfibi.size(); i++) {
            System.out.println("Nome: " + Registrazione.listaAnfibi.get(i).getNome());
        }
    }
}
