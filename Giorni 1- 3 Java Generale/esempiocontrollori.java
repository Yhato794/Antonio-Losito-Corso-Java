import java.util.Scanner;

public class esempiocontrollori {
    public static void main(String[] args) {
        Scanner scelta = new Scanner(System.in);
        System.out.println("Calcolatrice o calendario?");
        String scelta_utente = scelta.nextLine();
        int x = 0;
        if (scelta_utente.equals("Calcolatrice")) {
            x = 1;

        }
        if (scelta_utente.equals("calendario")) {
            x = 2;
        }

        if (x == 0) {
            System.out.println("errore");
        }

        switch (x) {
            case 1:
                calcolatrice();

                break;
            case 2:
                calendario();

        }
        scelta.close();
    }

    static void calcolatrice() {

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

    static void calendario() {
        Scanner scelta = new Scanner(System.in);
        int giorno = scelta.nextInt();
        System.out.println("giorno della settimana");
        String giorni = "";
        switch (giorno) {
            case 1:
                giorni = "Lunedì";
                break;
            case 2:
                giorni = "Martedì";
                break;
            case 3:
                giorni = "Mercoledì";
                break;
            case 4:
                giorni = "Giovedì";
                break;
            case 5:
                giorni = "Venerdì";
                break;
            case 6:
                giorni = "Sabato";
                break;
            case 7:
                giorni = "Domenica";
                break;

        }
        System.out.println(giorni);
        scelta.close();
    }

}
