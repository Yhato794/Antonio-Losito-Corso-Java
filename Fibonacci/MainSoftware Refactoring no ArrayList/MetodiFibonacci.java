
public class MetodiFibonacci {

    public void Ricerca(int sceltaNumeroUtente) {
        boolean b = false;

        long n1 = 0;
        long n2 = 1;
        long n3;
        int x = 0;
        do {
            n3 = n1 + n2; // somma numero attuale sequenza e numero precendente
            n1 = n2;// Numero sequenza
            n2 = n3;// Numero sequenza
            // Numero Somma 0 + 1
            if (sceltaNumeroUtente == n3 || sceltaNumeroUtente == 0)
                b = true;
            x++;
        } while (n3 <= sceltaNumeroUtente);

        if (b)
            System.out.println("Numero " + sceltaNumeroUtente + " trovato in posizione " + (x - 1));
        else
            System.out.println("Numero " + sceltaNumeroUtente + " non trovato");

    }

    public void pariDispari(int loop) {

        long n1 = 0;
        long n2 = 1;
        int i = 0;
        System.out.println("indice: " + 0 + " - numero: " + n1 + " pari ");
        System.out.println("indice: " + 1 + " - numero: " + n2 + " pari ");

        for (i = 0; i < loop; i++) {

            long n3 = n1 + n2; // somma numero attuale sequenza e numero precendente
            n1 = n2;// Numero sequenza
            n2 = n3;// Numero sequenza
            // Numero Somma 0 + 1
            if (n3 % 2 == 0)
                System.out.println("indice: " + (i + 2) + " - numero: " + n3 + " pari ");
            else
                System.out.println("indice: " + (i + 2) + " - numero: " + n3 + " dispari");

        }

    }

}
