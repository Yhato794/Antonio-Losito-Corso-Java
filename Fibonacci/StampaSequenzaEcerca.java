import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class StampaSequenzaEcerca {
    public static void main(String[] args) {
        Programma();
    }

    public static void Programma() { // Input numero da cercare e lunghezza serie

        Scanner findNumber = new Scanner(System.in);

        System.out.println("Numero da cercare ");
        int sceltaNumeroUtente = findNumber.nextInt();

        System.out.println("Selezione numeri di sequenza");
        Scanner scelta = new Scanner(System.in);
        int loop = (scelta.nextInt() + 2);

        ArrayList<Integer> sequenza = new ArrayList<Integer>(Arrays.asList());
        sequenza.add(0);
        sequenza.add(1);
        sequenza.add(1);
        sequenza = CreaSequenza(sequenza, loop);
        RicercaPD(sequenza, sceltaNumeroUtente);
        findNumber.close();
        scelta.close();
    }

    public static void RicercaPD(ArrayList<Integer> sequenza, int sceltaNumeroUtente) { // Ricerca e Divisione Pari/Dispari
        boolean b = false;
        int x = 0;
        for (int i = 0; i < sequenza.size(); i++) {
            if (sequenza.get(i) == sceltaNumeroUtente) {
                System.out.print("TROVATO ");
                b = true;
                x = i + 1;
            }

            if (sequenza.get(i) % 2 == 0)
                System.out.println(sequenza.get(i) + " pari");
            else
                System.out.println(sequenza.get(i) + " dispari");
        }
        StampaRisultati(b, sceltaNumeroUtente, x);
    }

    public static ArrayList<Integer> CreaSequenza(ArrayList<Integer> sequenza, int loop) { //Creazione Successione di Fibonacci

        if (sequenza.size() == loop) {
            return sequenza;
        }
        int x = sequenza.size();
        int n1 = sequenza.get(x - 2);// Numero sequenza
        int n2 = sequenza.get(x - 1);// Numero sequenza
        // Numero Somma 0 + 1
        int n3 = n1 + n2; // somma numero attuale sequenza e numero precendente
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
