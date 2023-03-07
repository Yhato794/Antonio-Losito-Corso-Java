
import java.util.Scanner;

public class MenuFibonacci {

    Scanner sc = new Scanner(System.in);
    public static Scanner intero = new Scanner(System.in);

    public void MenuPrincipale() { // Input numero da cercare e lunghezza serie
        MetodiFibonacci seqz = new MetodiFibonacci();
        boolean esecuzione = true;

        do {
            int loop = inputSelezione("Lunghezza sequenza");
            int scelta = inputSelezione("1: Cerca numero 2: Stampa Pari Dispari 3:Esci");
            switch (scelta) {
                case 1:
                    int sceltaNumeroUtente = inputSelezione("Numero da cercare");
                    seqz.Ricerca(sceltaNumeroUtente, loop);
                    break;
                case 2:
                    seqz.pariDispari(loop);
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
