import java.util.Scanner;

public class Roditori {
    private String nome;
    static Scanner stringa = new Scanner(System.in);

    public Roditori(String nome) {
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
        Registrazione.listaRoditori.add(new Roditori(stringa.nextLine()));
        System.out.println("Animale Registrato");
    }

    public static void stampa() {
        int i = 0;
        System.out.println("Roditori registrati oggi " + Registrazione.listaRoditori.size());
        for (i =0; i < Registrazione.listaRoditori.size(); i++) {
            System.out.println("Nome: " + Registrazione.listaRoditori.get(i).getNome());
        }
    }
}
