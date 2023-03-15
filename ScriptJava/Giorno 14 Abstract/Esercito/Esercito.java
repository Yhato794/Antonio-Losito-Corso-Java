import java.util.ArrayList;

// Creare un esercizio che gestisca un esercito

// creiamo la classe Esercito con l'attributo numero soldati

// a un figlio o inner class, che è soldato

// ogni volta che creiamo un soldato salirà numero soldati e li dovremo tenere in memoria, con nome annodinascita e appratenzaaforze speciali ( Bool )

// Se forzepsciali e true
// bisognerà richiamare due metodi specifici GradiSpeciali, Annodiinizio
// In una classe astratta detta ForzeSpeciali che avrà il metodo, oltre i due sopra, specializzazione che sarà un String inserita dal utente

public class Esercito {
    private ArrayList<ForzeSpeciali> savedSoldier;

    public Esercito() {
        savedSoldier = new ArrayList<ForzeSpeciali>();
    }

    public ArrayList<ForzeSpeciali> getSavedSoldier() {
        return savedSoldier;
    }

    public void setSavedSoldier(ArrayList<ForzeSpeciali> savedSoldier) {
        this.savedSoldier = savedSoldier;
    }

    public void addSoldier(ForzeSpeciali soldato) {
        savedSoldier.add(soldato);
    }

    public void stampaLista() {
        for (int i = 0; i < savedSoldier.size(); i++) {
            System.out.println("Nome soldato: " + savedSoldier.get(i).getNome());
            System.out.println("Data Nascita Soldato: " + savedSoldier.get(i).getAnnoNasciata());
            if (savedSoldier.get(i).isInForzeSpeciale()) {
                System.out.println("Forza Speciale Soldato: " + savedSoldier.get(i).gradoSpeciale());
                System.out.println("Anno partenza forze speciale: " + savedSoldier.get(i).annoInizioGS());
            }
        }
    }

}