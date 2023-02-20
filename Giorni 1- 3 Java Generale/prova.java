import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        Scanner stringhe = new Scanner(System.in);
        Scanner interi = new Scanner(System.in);

        System.out.println("Insire una String");
        String string_input = stringhe.nextLine(); // input stringa

        System.out.println("Insire un numero");
        double num_input = interi.nextDouble();// input numero in forma double

        System.out.println("seleziona 0 per vero 1 per falso");
        int bool_input = interi.nextInt();// input booleana in forma 0 - 1

        System.out.println("Quale Operazione vuoi eseguire?");
        System.out.println("1: Funzioni Matematiche");
        System.out.println("2: Funzioni Stringhe");
        System.out.println("3: Casting");
        int scelta_utente = interi.nextInt(); // scelta utente da 1 a 3

        switch (scelta_utente) {
            case 1:
                operazioniMate(num_input);
                break;
            case 2:
                operaioni_casting(string_input);
                break;
            case 3:
                operazioni_casting(string_input, num_input, bool_input);
                break;
            default:
                System.out.println("ERRORE");

        }

        stringhe.close();
        interi.close();

    }

    static void operazioniMate(double d) { // classe operazioni matematiche
        double potenza = Math.pow(d, 2);
        System.out.println("La Potenza del numero inserito è: " + potenza);
        double radice = Math.sqrt(d);
        System.out.println("La Radice del numero inserito è: " + radice);
        long parte_intera = Math.round(d);
        System.out.println("Valore arrotondato: " + parte_intera);
    }

    static void operaioni_casting(String s) { // classe operazione su stringa
        String iniziali = s.substring(0, 2);
        int y = s.length();
        System.out.println("Le Prime due lettere della stringa sono " + iniziali);
        System.out.println("La lunghezza totale della stringa è: " + y);

    }

    static void operazioni_casting(String s, double d, int b) { // classe operazioni casting
        int x = 0;
        long valore_intero = Math.round(d);
        char iniziale = s.charAt(0);
        boolean y = x == 0;
        System.out.println("il valore intero del numero inserito è:" + valore_intero);
        System.out.println("La prima lettera della stringa è: " + iniziale);
        System.out.print("La tua scelta true\\false era: " + y);
        System.out.println(" il contrario è: " + !y);

    }

}
