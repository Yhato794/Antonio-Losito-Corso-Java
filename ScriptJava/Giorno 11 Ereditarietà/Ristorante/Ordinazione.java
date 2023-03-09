public class Ordinazione {

    private int prezzo;
    private static int incassoTotale;

    public Ordinazione(int prezzo){
        this.prezzo=prezzo;
    }

 
    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }


    public static int getIncassoTotale() {
        return incassoTotale;
    }

    public static void setIncassoTotale(int prezzo) {
        incassoTotale = incassoTotale+prezzo;
    }

}
