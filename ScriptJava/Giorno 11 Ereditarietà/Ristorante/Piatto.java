public class Piatto extends Ordinazione {
    private String nome;
    private String ingredinte;
    private String cheff;

    public Piatto(String nome, String ingrediente, String cheff, int prezzo) {
        super(prezzo);
        this.nome = nome;
        this.ingredinte = nome;
        this.cheff = cheff;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredinte() {
        return ingredinte;
    }

    public void setIngredinte(String ingredinte) {
        this.ingredinte = ingredinte;
    }

    public String getCheff() {
        return cheff;
    }

    public void setCheff(String cheff) {
        this.cheff = cheff;
    }

}
