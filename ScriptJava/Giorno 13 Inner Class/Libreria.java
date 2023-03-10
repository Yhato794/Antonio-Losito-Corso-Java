import java.util.Scanner;

public class Libreria {

    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);
    private int numerolibri;

    public static class Libro {

        private String nome;
        private String genere;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getGenere() {
            return genere;
        }

        public void setGenere(String genere) {
            this.genere = genere;
        }

    }

    public static Libro creaLib() {
        Libro a = new Libro();
        return a;
    }

    public int getNumerolibri() {
        return numerolibri;
    }

    public void setNumerolibri(int numerolibri) {
        this.numerolibri = numerolibri;
    }

    public void aggiungiLibro() {

        System.out.println("Nome libro:");
        Libreria.Libro libroDaAggiungere = Libreria.creaLib();
        libroDaAggiungere.setNome(stringhe.nextLine());
        System.out.println("Genere:");
        libroDaAggiungere.setGenere(stringhe.nextLine());
        numerolibri++;

    }

    public static void main(String[] args) {

        Libreria myLib = new Libreria();
        boolean uscita = true;
        while (uscita) {
            System.out.println("1: Aggiungi Libro 2: Esci e stampa numero libri in memoria");
            int scelta = interi.nextInt();
            if (scelta == 1) {
                myLib.aggiungiLibro();
            } else {
                uscita = false;
            }
        }
        System.out.println("Libri inseriti oggi " + myLib.getNumerolibri());
    }
}
