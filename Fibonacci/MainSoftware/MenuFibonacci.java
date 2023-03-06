import java.util.ArrayList;

import java.util.Scanner;

public class MenuFibonacci {

    public static Scanner intero = new Scanner(System.in);
    private ArrayList<Long> sequenza;

    public MenuFibonacci(ArrayList<Long> sequenza) {
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

    public static void Programma() { // Input numero da cercare e lunghezza serie
        MenuFibonacci seqz = new MenuFibonacci(new ArrayList<Long>());
        boolean a = true;

        do {
            System.out.println("Lunghezza sequenza");
            int loop = intero.nextInt();
            seqz.setSequenza(MetodiFibonacci.CreaSequenza(seqz.getSequenza(), loop));
            System.out.println("1: Cerca numero 2: Stampa Pari Dispari 3:Esci");
            int scelta = intero.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Numero da cercare ");
                    int sceltaNumeroUtente = intero.nextInt();
                    MetodiFibonacci.Ricerca(seqz.getSequenza(), sceltaNumeroUtente);
                    break;
                case 2:
                    MetodiFibonacci.pariDispari(seqz.getSequenza());
                    break;
                case 3:
                    a = false;
                    break;
            }

        } while (a);

    }

}
