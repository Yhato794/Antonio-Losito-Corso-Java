import java.util.Scanner;

public class EsercizioFibonacci {
    public static void main(String[] args) {
        System.out.println("Selezione numeri di sequenza");
        Scanner scelta = new Scanner(System.in);
        int loop = scelta.nextInt();
        int n1 = 0;// Numero sequenza 0
        int n2 = 1;// Numero sequenza 1
        int n3; //Numero Somma 0 + 1
        for (int i = 0; i < loop; i++) {
            n3 = n1 + n2; //somma numero attuale sequenza e numero precendente 
            n1 = n2; // Scambio numero posizione -1 con posizione -2 
            n2 = n3; // Scambio numero posizione 0 con posione -1
            System.out.println(n3);
        }
        scelta.close();
    }
}