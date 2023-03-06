import java.util.Scanner;

public class Canide {
    private String nome;
    static Scanner stringa = new Scanner(System.in);

    public Canide(String nome) {
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
        Registrazione.listaCanide.add(new Canide(stringa.nextLine()));
        System.out.println("Animale Registrato");
    }

    public static void stampa() {
        int i = 0;
        System.out.println("Canidi registrati oggi " + Registrazione.listaCanide.size());
        for (i = 0; i < Registrazione.listaCanide.size(); i++) {
            System.out.println("Nome: " + Registrazione.listaCanide.get(i).getNome());
        }
    }
}
