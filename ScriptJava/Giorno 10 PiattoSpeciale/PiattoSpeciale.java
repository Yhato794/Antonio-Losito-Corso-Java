import java.util.ArrayList;

public class PiattoSpeciale {
    private String tipoPane;
    public ArrayList<String> ingredienti=new ArrayList<String>();
    public String note;
    public int prezzo;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTipoPane() {
        return tipoPane;
    }

    public void setTipoPane(String tipoPane) {
        this.tipoPane = tipoPane;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {

        this.ingredienti.add(ingredienti);
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
