
class Soldato extends ForzeSpeciali {
    private String nome;
    private int annoNasciata; // formato yyyy
    private boolean isInForzeSpeciale;
    private String gradoSpeciale;
    private int annoInizioGS;

    public Soldato(String nome, int annoNasciata, boolean isInForzeSpeciale) {
        this.nome = nome;
        this.annoNasciata = annoNasciata;
        this.isInForzeSpeciale = isInForzeSpeciale;
    }

    public String getGradoSpeciale() {
        return gradoSpeciale;
    }

    public void setGradoSpeciale(String gradoSpeciale) {
        this.gradoSpeciale = gradoSpeciale;
    }

    public int getAnnoInizioGS() {
        return annoInizioGS;
    }

    public void setAnnoInizioGS(int annoInizioGS) {
        this.annoInizioGS = annoInizioGS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoNasciata() {
        return annoNasciata;
    }

    public void setAnnoNasciata(int annoNasciata) {
        this.annoNasciata = annoNasciata;
    }

    public boolean isInForzeSpeciale() {
        return isInForzeSpeciale;
    }

    public void setInForzeSpeciale(boolean isInForzeSpeciale) {
        this.isInForzeSpeciale = isInForzeSpeciale;
    }

    public String gradoSpeciale() {
        return gradoSpeciale;
    }

    public int annoInizioGS() {
        return annoInizioGS;

    }
}
