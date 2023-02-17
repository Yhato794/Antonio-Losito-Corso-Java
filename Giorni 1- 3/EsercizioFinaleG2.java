import java.util.Scanner;

public class EsercizioFinaleG2 {
    public static void main(String[] args) {
        Scanner stringhe = new Scanner(System.in);
        Scanner interi = new Scanner(System.in);

        System.out.println("Insire una String");
        String String_input = stringhe.nextLine();

        System.out.println("Insire un numero");
        double num_input = interi.nextDouble();

        System.out.println("seleziona 0 per vero 1 per falso");
        int boolean_input = interi.nextInt();

        System.out.println("Quale Operazione vuoi eseguire?");
        System.out.println("1: Funzioni Matematiche");
        System.out.println("2: Funzioni Stringhe");
        System.out.println("3: Casting");
        int scelta_utente = interi.nextInt();

        switch (scelta_utente) {
            case 1:
                System.out.println("La Potenza del numero inserito è:" + pot(num_input));
                System.out.println("La Radice del numero inserito è:" + sqr(num_input));
                System.out.println("Valore intero:" + intero(num_input));
                break;
            case 2:
                System.out.println("Le Prime due lettere della stringa sono " + stringa(String_input));
                System.out.println("La lunghezza totale della stringa è: " + lunghezza(String_input));
                break;
            case 3:
                // boolean c = boolean_input == 0;
                System.out.println("il valore intero del numero inserito è:" + casting_numero(num_input));
                System.out.println("La prima lettera della stringa è: " + primalettera(String_input));
                System.out.print("La tua scelta true\\false era: " + contraio(boolean_input));
                System.out.println(" il contrario è: " + !contraio(boolean_input));
                break;
            default:
                System.out.println("ERRORE");

        }

        stringhe.close();
        interi.close();

    }

    public static double pot(Double numero) { // classe potenza

        double potenza = Math.pow(numero, 2);
        return potenza;

    }

    public static double sqr(Double numero) { // classe radice

        double radice = Math.sqrt(numero);
        return radice;

    }

    public static int intero(Double numero) {// parte intera

        int risultato = numero.intValue();
        return risultato;

    }

    public static String stringa(String parola) {// classe primi 3 caratteri

        String A = parola.substring(0, 2);
        return A;

    }

    public static int lunghezza(String x) {// classe lunghezza stringa

        int y = x.length();
        return y;

    }

    public static double casting_numero(Double numero) {// classe arrotondamento per eccesso

        long valore_intero = Math.round(numero);
        return valore_intero;

    }

    public static char primalettera(String stringa) {// classe prima lettera

        char iniziale = stringa.charAt(0);
        return iniziale;

    }

    public static boolean contraio(int x) {

        boolean y = x == 0;
        return y;

    }

}
