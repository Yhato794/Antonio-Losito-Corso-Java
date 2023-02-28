import java.util.Scanner;

public class EsercizioFor {
    public static Scanner num_1 = new Scanner(System.in);
    public static Scanner num_2 = new Scanner(System.in);
    public static Scanner num_3 = new Scanner(System.in);
    public static Scanner scelta = new Scanner(System.in);
    public static Scanner stringa = new Scanner(System.in);
    public static Scanner exitLoop = new Scanner(System.in);

    Scanner sceltaOperazione = new Scanner(System.in);
    static boolean b = true;

    public static void main(String[] args) {

        Scanner sceltaOperazione = new Scanner(System.in);
        do {
            System.out.println("1:Numeri o 2:Stringa?");
            int SceltaOperazioneUtente = sceltaOperazione.nextInt();
            switch (SceltaOperazioneUtente) {
                case 1:
                    contanumero();
                    break;
                case 2:
                    contastringa();
                    break;
            }

        } while (exitLoop());

        num_1.close();
        num_2.close();
        num_3.close();
        scelta.close();
        stringa.close();
        exitLoop.close();
        sceltaOperazione.close();
    }

    public static void contanumero() {

        System.out.println("inserire 3 numeri");
        int num_1_input = num_1.nextInt();
        int num_2_input = num_1.nextInt();
        int num_3_input = num_1.nextInt();
        System.out.println("Quale numero vuoi contare?");
        int scelta_input = scelta.nextInt();

        switch (scelta_input) {
            case 1:
                for (int i = 1; i <= num_1_input; i++) {
                    System.out.println(i);
                }
                break;
            case 2:
                for (int i = 1; i <= num_2_input; i++) {
                    System.out.println(i);
                }
                break;
            case 3:
                for (int i = 1; i <= num_3_input; i++) {
                    System.out.println(i);
                }
                break;
        }
    }

    public static void contastringa() {
        System.out.println("inserira una stringa");
        String stringaInput = stringa.nextLine();
        String stringaInputUpperCase=stringaInput.toUpperCase();
        int lung = stringaInput.length();
        for (int i = 0; i < lung; i++) {
            System.out.println("Lettera numero: " + (i+1) + " " + stringaInputUpperCase.charAt(i));
        }
    }

    public static boolean exitLoop() {
        System.out.println("Vuoi continuare? 1 Si 2 No");
        int uscita = exitLoop.nextInt();
        if (uscita != 1) {
            b = false;
        }
        return b;
    }

}
