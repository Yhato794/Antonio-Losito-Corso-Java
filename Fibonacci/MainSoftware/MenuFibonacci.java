import java.util.ArrayList;

import java.util.Scanner;

public class MenuFibonacci {

    public static Scanner intero = new Scanner(System.in);
    private ArrayList<Integer> sequenza;

    public MenuFibonacci(ArrayList<Integer> sequenza) {
        this.sequenza = sequenza;
    }

    public ArrayList<Integer> getSequenza() {
        return sequenza;
    }

    public void setSequenza(ArrayList<Integer> sequenza) {
        this.sequenza = sequenza;
    }

    public static void Programma() { // Input numero da cercare e lunghezza serie

        System.out.println("Lunghezza sequenza");
        int loop = intero.nextInt();
        ArrayList<Integer> sequenza = creaArraySqz();
        sequenza = CreaSequenza(sequenza, loop);
        System.out.println("1: Cerca numero 2: Stampa Pari Dispari");
        int scelta = intero.nextInt();
        switch (scelta) {
            case 1:
                System.out.println("Numero da cercare ");
                int sceltaNumeroUtente = intero.nextInt();
                Ricerca(sequenza, sceltaNumeroUtente);
                break;
            case 2:
                pariDispari(sequenza);
                break;
        }

    }

    public static ArrayList<Integer> creaArraySqz() { //creo arrayList con primi 3 numeri

        MenuFibonacci mySqz = new MenuFibonacci(new ArrayList<Integer>());
        mySqz.getSequenza().add(0);
        mySqz.getSequenza().add(1);
        mySqz.getSequenza().add(1);
        return mySqz.getSequenza();

    }

    public static void Ricerca(ArrayList<Integer> sequenza, int sceltaNumeroUtente) {

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

    public static void pariDispari(ArrayList<Integer> sequenza) {
        for (int i = 0; i < sequenza.size(); i++) {
            if (sequenza.get(i) % 2 == 0)
                System.out.println(sequenza.get(i) + " pari");
            else
                System.out.println(sequenza.get(i) + " dispari");
        }
    }

    public static ArrayList<Integer> CreaSequenza(ArrayList<Integer> sequenza, int loop) { // Creazione Successione
                                                                                           // Fibonacci

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
