public class Auto extends Veicolo {

    private int nPorte;
    private String tipoCarburante;
    private int consumoCarburante;

    public Auto(String marca, String modello, int annoImmatricolazione, int nPorte, String tipoCarburante, int consumoCarburante) {
        super(marca, modello,annoImmatricolazione);
        this.nPorte = nPorte;
        this.tipoCarburante = tipoCarburante;
        this.consumoCarburante = consumoCarburante;
    }

    public int getnPorte() {
        return nPorte;
    }

    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }

    public String getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    public int getConsumoCarburante() {
        return consumoCarburante;
    }

    public void setConsumoCarburante(int consumoCarburante) {
        this.consumoCarburante = consumoCarburante;
    }
}
