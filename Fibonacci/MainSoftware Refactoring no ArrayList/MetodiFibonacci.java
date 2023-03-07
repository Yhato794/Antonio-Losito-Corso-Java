
public class MetodiFibonacci {

    public void Ricerca(int sceltaNumeroUtente, int loop) {
        boolean b = false;

        long n1 = 0;
        long n2 = 1;
        int i = 0;
        int x = 0;
        for (i = 0; i < loop; i++) {
            long n3 = n1 + n2; // somma numero attuale sequenza e numero precendente
            n1 = n2;// Numero sequenza
            n2 = n3;// Numero sequenza
            // Numero Somma 0 + 1
            if (sceltaNumeroUtente == n3) {
                System.out.print("TROVATO ");
                b = true;
                x = i;
            }
        }

        if (!b) 
            System.out.println("Numero " + sceltaNumeroUtente + " non trovato");
         else 
            System.out.println("Numero " + sceltaNumeroUtente + " trovato in posizione " + x);
       
    }

    public void pariDispari(int loop) {

        long n1 = 0;
        long n2 = 1;
        int i = 0;
        for (i = 0; i < loop; i++) {

            long n3 = n1 + n2; // somma numero attuale sequenza e numero precendente
            n1 = n2;// Numero sequenza
            n2 = n3;// Numero sequenza
            // Numero Somma 0 + 1
            if (n3 % 2 == 0)
                System.out.println("indice: " + (i + 1) + " - numero: " + n3 + " pari ");
            else
                System.out.println("indice: " + (i + 1) + " - numero: " + n3 + " dispari");

        }

    }

}
