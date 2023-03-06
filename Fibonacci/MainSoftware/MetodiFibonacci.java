import java.util.ArrayList;

public class MetodiFibonacci {
    public static ArrayList<Long> creaArraySqz() { // creo arrayList con primi 3 numeri

        MenuFibonacci mySqz = new MenuFibonacci(new ArrayList<Long>());
        mySqz.getSequenza().add((long)0);
        mySqz.getSequenza().add((long)1);
        mySqz.getSequenza().add((long)1);
        return mySqz.getSequenza();

    }

    public static void Ricerca(ArrayList<Long> sequenza, int sceltaNumeroUtente) {

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
        StampaRisultati(b, sceltaNumeroUtente, x);
    }

    public static void pariDispari(ArrayList<Long> sequenza) {
        for (int i = 0; i < sequenza.size(); i++) {
            if (sequenza.get(i) % 2 == 0)
                System.out.println("indice: "+(i+1)+" numero: "+sequenza.get(i) + " pari ");
            else
                System.out.println("indice: "+(i+1)+" - numero: "+sequenza.get(i) + " dispari");
        }
    }

    public static ArrayList<Long> CreaSequenza(ArrayList<Long> sequenza, int loop) { // Creazione Successione
                                                                                           // Fibonacci

        if (sequenza.size() >= loop) {
            return sequenza;
        }
        int x = sequenza.size();
        long n1 = sequenza.get(x - 2);// Numero sequenza
        long n2 = sequenza.get(x - 1);// Numero sequenza
        // Numero Somma 0 + 1
        long n3 = n1 + n2; // somma numero attuale sequenza e numero precendente
        sequenza.add(n3);
        sequenza = CreaSequenza(sequenza, loop);
        return sequenza;

    }

    public static void StampaRisultati(boolean b, int sceltaNumeroUtente, int x) { // Stampa risultati

        if (!b) {
            System.out.println("Numero " + sceltaNumeroUtente + " non trovato");
        } else {
            System.out.println("Numero " + sceltaNumeroUtente + " trovato in posizione " + x);

        }

    }
    
}
