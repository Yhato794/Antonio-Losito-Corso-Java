public class Ordinazione {

    private int prezzo;
    private int incassoTotale;

    public Ordinazione(int prezzo){
        this.prezzo=prezzo;
    }

 
    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }


    public int getIncassoTotale() {
        return incassoTotale;
    }




    public void setIncassoTotale(int prezzo) {
        this.incassoTotale = this.incassoTotale+prezzo;
    }

}
