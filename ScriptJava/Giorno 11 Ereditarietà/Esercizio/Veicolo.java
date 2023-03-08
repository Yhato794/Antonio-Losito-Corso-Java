
public class Veicolo {

    private String marca;
    private String modello;
    private int annoImmatricolazione;

    public Veicolo(String marca, String modello,int annoImmatricolazione) {
        this.marca = marca;
        this.modello = modello;
        this.annoImmatricolazione=annoImmatricolazione;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

}