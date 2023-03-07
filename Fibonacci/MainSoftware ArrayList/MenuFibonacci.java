import java.util.ArrayList;

import java.util.Scanner;

public class MenuFibonacci {
    
    Scanner sc = new Scanner(System.in);
    public static Scanner intero = new Scanner(System.in);
    
    public void MenuPrincipale() { // Input numero da cercare e lunghezza serie
        MetodiFibonacci seqz = new MetodiFibonacci(new ArrayList<Long>());
        boolean esecuzione = true;

        do {
            int loop = inputSelezione("Lunghezza sequenza");
            seqz.setSequenza(seqz.CreaSequenza(seqz.getSequenza(), loop));
            int scelta = inputSelezione("1: Cerca numero 2: Stampa Pari Dispari 3:Esci");
            switch (scelta) {
                case 1:
                int sceltaNumeroUtente = inputSelezione("Numero da cercare");
                seqz.Ricerca(seqz.getSequenza(), sceltaNumeroUtente);
                break;
                case 2:
                seqz.pariDispari(seqz.getSequenza());
                break;
                case 3:
                esecuzione = false;
                break;
            }
            
        } while (esecuzione);
        
    }
    
    public int inputSelezione(String inputMessage) {
        
        System.out.println(inputMessage);
        int num = sc.nextInt();
        return num;
        
    }
    
}
