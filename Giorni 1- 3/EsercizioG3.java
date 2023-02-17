import java.util.Scanner;

public class EsercizioG3 {
    public static void main(String[] args) {
        Scanner scelta = new Scanner(System.in);
        Scanner interi = new Scanner(System.in);
        Scanner num_1_1 = new Scanner(System.in);
        Scanner num_2_1 = new Scanner(System.in);

        System.out.println("Inserire primo numero");
        double num_1 = num_1_1.nextDouble();
        System.out.println("Inserire secondo numero");
        double num_2 = num_2_1.nextDouble();
        
        System.out.println("Quale Operazione vuoi eseguire?");
        System.out.println("1: Somma");
        System.out.println("2: Sottrazione");
        System.out.println("3: Somma radici quadrate");
        System.out.println("3: Somma tra radici");
        System.out.println("4: Sottrazione numero più grande con radice del più piccolo");
        int scelta_utente = interi.nextInt();
        switch (scelta_utente) {
            case 1:
                double risultato = num_1 + num_2;
                System.out.println("Risultato somma: " + risultato);
                operazioni_sul_risultato(risultato);
                break;
            case 2:
                risultato = num_1 - num_2;
                System.out.println("Risultato sottraione: " + risultato);
                operazioni_sul_risultato(risultato);

                break;
            case 3:
                risultato = Math.sqrt(num_1) + Math.sqrt(num_2);
                System.out.println("Risultato sottraione: " + risultato);
                operazioni_sul_risultato(risultato);
                break;
            case 4:
                if (num_1 < num_2) {
                    risultato = num_2 - Math.sqrt(num_1);
                } else {
                    risultato = num_1 - Math.sqrt(num_2);
                }
                System.out.println("Risultato sottraione primo numero con radice del secondo: " + risultato);
                operazioni_sul_risultato(risultato);
                break;
            default:
                System.out.println("ERRORE");

        }
        num_2_1.close();
        num_1_1.close();
        scelta.close();
        interi.close();
    }

    

    public static void operazioni_sul_risultato(double d) {

        // controllo positivo negativo
        if (d >= 0) {
            System.out.println("Il risultato è positivo");

        } else {
            System.out.println("il risultato è negativo");
        }
        // controllo intero
        if (d == (int) d) {
            System.out.println("Il risultato è intero");

        } else {
            System.out.println("Il risultato non è intero");
            System.out.println("parte intera: " + (int) d);
            System.out.println("Parte dopo la virgola: " + (d - (int) d));
        }

        boolean b = d % 2 == 0;
        if (b) {
            System.out.println("Il risultato è pari");

        } else {
            System.out.println("Il risultato è dispari");

        }
    }

}
