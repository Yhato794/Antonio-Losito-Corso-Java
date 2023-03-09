import java.util.ArrayList;
import java.util.Scanner;

public class Gestore {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);

    public static void main(String[] args) {
        int scelta = 0;
        ArrayList<String> savedData = new ArrayList<String>();
        Boolean boolInput = true;
        do {
            System.out.println("Vuoi inserire o uscire?");
            scelta = (int) inseNum();
            if (scelta == 2) {
                break;
            }
            System.out.println("Inserisci numero");
            Integer numUten = (int) inseNum(); //possibile perdita di precisione dato
            savedData.add(numUten.toString());
            System.out.println("Inserisci una stringa");
            String strigUtente = stringhe.nextLine();
            savedData.add(strigUtente);
            System.out.println("1: vero o 2: falso");
            int sceltab = (int) inseNum();
            if (sceltab == 2)
                boolInput = false;
            savedData.add(boolInput.toString());

        } while (scelta == 1);

        for (int i = 0; i < savedData.size(); i++) {
            System.out.println(savedData.get(i));
        }

    }

    public static double inseNum() { 
        boolean errore = true;
        double i = 0;
        do {
            try {
                i = interi.nextDouble();
                errore = false;
                break;
            } catch (Exception e) {
                System.out.println("ERRORE");
                interi.nextLine();
                errore = true;
            } finally {
                if (errore)
                    System.out.println("Hai sbagliato Riprova");
                else
                    System.out.println("Input corretto");
            }
        } while (errore);
        return i;
    }

}
