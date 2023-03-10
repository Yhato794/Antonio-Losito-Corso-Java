import java.util.ArrayList;

public class Libreria {

    private ArrayList<Libro> libri=new ArrayList<Libro>();

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    public void aggiungiLibro(Libro lib) {
        libri.add(lib);
    }

    public class Libro {
        private String nome;
        private String genere;

        public Libro(String nome, String genere) {
            this.nome = nome;
            this.genere = genere;
        }

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

}