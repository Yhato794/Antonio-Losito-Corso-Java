import java.util.ArrayList;

public class MetodiFibonacci {

    private ArrayList<Long> sequenza;

    public MetodiFibonacci(ArrayList<Long> sequenza) {
        sequenza.add((long) 0);
        sequenza.add((long) 1);
        sequenza.add((long) 1);
        this.sequenza = sequenza;
    }

    public ArrayList<Long> getSequenza() {
        return sequenza;
    }

    public void setSequenza(ArrayList<Long> sequenza) {
        this.sequenza = sequenza;
    }

    public void Ricerca(ArrayList<Long> sequenza, int sceltaNumeroUtente) {

        // Pari/Dispari
        boolean b = false;
        int x = 0;
        for (int i = 0; i < sequenza.size(); i++) {
            if (sequenza.get(i) == sceltaNumeroUtente) {
                System.out.print("TROVATO ");
                b = true;
                x = i + 1;
            }
        }
        if (!b) {
            System.out.println("Numero " + sceltaNumeroUtente + " non trovato");
        } else {
            System.out.println("Numero " + sceltaNumeroUtente + " trovato in posizione " + x);

        }
    }

    public ArrayList<Long> CreaSequenza(ArrayList<Long> sequenza, int loop) { // Creazione Successione
                                                                              // Fibonacci

        while (sequenza.size() < loop) {

            int x = sequenza.size();
            long n1 = sequenza.get(x - 2);// Numero sequenza
            long n2 = sequenza.get(x - 1);// Numero sequenza
            // Numero Somma 0 + 1
            long n3 = n1 + n2; // somma numero attuale sequenza e numero precendente
            sequenza.add(n3);

        }
        return sequenza;

    }

    public void pariDispari(ArrayList<Long> sequenza) {
        for (int i = 0; i < sequenza.size(); i++) {
            if (sequenza.get(i) % 2 == 0)
                System.out.println("indice: " + (i + 1) + " - numero: " + sequenza.get(i) + " pari ");
            else
                System.out.println("indice: " + (i + 1) + " - numero: " + sequenza.get(i) + " dispari");
        }
    }

    public void StampaRisultati(boolean b, int sceltaNumeroUtente, int x) { // Stampa risultati

        if (!b) {
            System.out.println("Numero " + sceltaNumeroUtente + " non trovato");
        } else {
            System.out.println("Numero " + sceltaNumeroUtente + " trovato in posizione " + x);

        }

    }

}
