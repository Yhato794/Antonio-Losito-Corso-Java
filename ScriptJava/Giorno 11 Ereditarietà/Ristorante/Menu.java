import java.util.ArrayList;

public class Menu {

    ArrayList<Piatto> piattiSaved=new ArrayList<Piatto>();

    public ArrayList<Piatto> getPiattiSaved() {
        return piattiSaved;
    }

    public void setPiattiSaved(ArrayList<Piatto> piattiSaved) {
        this.piattiSaved = piattiSaved;
    }

    public void aggiungiPiatto(Piatto piatto) {
        this.piattiSaved.add(piatto);
    }

    public Piatto getPiatto(int i ){
        return piattiSaved.get(i);
    }

    

    public void stampaMenu() {
        for (int i = 0; i < piattiSaved.size(); i++) {
            System.out.println("Piatto numero: "+(i+1));
            System.out.println("Nome Piatto: " + piattiSaved.get(i).getNome());
            System.out.println("Ingrediente: " + piattiSaved.get(i).getIngredinte());
            System.out.println("Prezzo: " + piattiSaved.get(i).getPrezzo());
            System.out.println("Preparato da: " + piattiSaved.get(i).getCheff());
            System.out.println("--------------------------------------------------------");
        }
    }

}