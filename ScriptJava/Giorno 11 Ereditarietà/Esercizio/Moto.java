public class Moto extends Veicolo{
    private int cilindrata;
    private String tipologia;
    private int potenza;
   
   
   
    public Moto(String marca, String modello, int annoImmatricolazione, int cilindrata, String tipologia, int potenza) {
        super(marca, modello,annoImmatricolazione);
        this.cilindrata=cilindrata;
        this.tipologia=tipologia;
        this.potenza=potenza;
    }

    
    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public String getTipologia() {
        return tipologia;
    }
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    public int getPotenza() {
        return potenza;
    }
    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }
    
}
