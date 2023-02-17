import java.util.Scanner;

public class PrimoEserLoop {
    static Scanner intero_1 = new Scanner(System.in);
    static Scanner intero_2 = new Scanner(System.in);
    static Scanner scelta_1 = new Scanner(System.in);
    static Scanner scelta = new Scanner(System.in);
    static Scanner stringa = new Scanner(System.in);
    static Scanner break_1 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1 Numero o 2 Stringa");
        int scelta_utente = scelta_1.nextInt();

        switch (scelta_utente) {
            case 1:
                boolean b = true;
                while (b) {
                    System.out.println("inserire un numero da 1 a 10");
                    int x = intero_1.nextInt();
                    int y = x % 2;

                    if (x <= 10) {
                        if (y == 0) {
                            System.out.println("Il numero è pari");
                            System.out.println("il numero diviso 2 è:" + x / 2);
                        } else {
                            System.out.println("Secondo numero");
                            int c = intero_2.nextInt();
                            System.out.println("Risultato modulo " + x % c);
                        }
                    } else {
                        System.out.println("Il numero inserito è incorretto");
                        b = false;
                    }
                    break;
                }
            case 2:
                System.out.println("Inserisci una Stringa");
                String stringa_utenta = stringa.nextLine();
                System.out.println("Punto divisione stringa");
                int break_point = break_1.nextInt();
                System.out.println("Risultato " + stringa_utenta.substring(break_point));

        }
    }

}
