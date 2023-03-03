public class Libro {
    private String nomeLibro;
    private int nInprestito;
    private int nDisponibile;
    private boolean noleggiato=false;

    public Libro(String nome, int nInprestito, int nDisponibile) {
        this.nomeLibro = nome;
        this.nInprestito = nInprestito;
        this.nDisponibile = nDisponibile;

    }

    public boolean isNoleggiato() {
        return noleggiato;
    }

    public void setNoleggiato(boolean noleggiato) {
        this.noleggiato = noleggiato;
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
