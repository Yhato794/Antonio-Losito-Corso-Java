import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        // inizializzazione scanners
        Scanner operazione_scanner = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("Quale operazione vuoi effettuare + - * % ");
        String operazione = operazione_scanner.nextLine();

        if (operazione.equals("+")) {
            // addizione
            System.out.println("dammi due numeri");
            int num_1 = num.nextInt();
            int num_2 = num.nextInt();
            int risultato = Math.addExact(num_1, num_2);
            System.out.println("Risultato: " + risultato);

        } else if (operazione.equals("-")) {
            // sottrazione
            System.out.println("Dammi due numeri");
            int num_1 = num.nextInt();
            int num_2 = num.nextInt();
            int risultato = Math.subtractExact(num_1, num_2);
            System.out.println("Risultato: " + risultato);

        } else if (operazione.equals("*")) {
            // moltiplicazione
            System.out.println("Dammi due numeri");
            int num_1 = num.nextInt();
            int num_2 = num.nextInt();
            int risultato = Math.multiplyExact(num_1, num_2);
            System.out.println("Risultato: " + risultato);

        } else if (operazione.equals("%")) {
            // resto
            System.out.println("Dammi due numeri");
            int num_1 = num.nextInt();
            int num_2 = num.nextInt();
            int risultato = num_1 % num_2;
            System.out.println("Risultato: " + risultato);

        } else {
            System.out.println("ERRORE ERRORE ORRORE");
        }
        num.close();
        operazione_scanner.close();

    }
}
