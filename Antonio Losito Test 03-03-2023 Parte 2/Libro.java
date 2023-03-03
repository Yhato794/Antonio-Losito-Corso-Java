public class Libro {
    private String nomeLibro;
    private int nInprestito;
    private int nDisponibile;


    public Libro(String nome, int nInprestito, int nDisponibile) {
        this.nomeLibro = nome;
        this.nInprestito = nInprestito;
        this.nDisponibile = nDisponibile;

    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public int getnInprestito() {
        return nInprestito;
    }

    public void setnInprestito(int nInprestito) {
        this.nInprestito = nInprestito;
    }

    public int getnDisponibile() {
        return nDisponibile;
    }

    public void setnDisponibile(int nDisponibile) {
        this.nDisponibile = nDisponibile;
    }

}
