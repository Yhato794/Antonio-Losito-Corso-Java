import java.util.Scanner;

public class Run {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);

    public static void main(String[] args) {
        Esercito savedSoldier = new Esercito();
        while (true) {
            System.out.println("1: inserisci soldato 2: Esci");
            int scelta = insNum();
            if (scelta == 1) {
                inserimentoSoldato(savedSoldier);
            } else {
                break;
            }

        }
        savedSoldier.stampaLista();
    }

    public static void inserimentoSoldato(Esercito savedSoldier) {
        boolean forzeSpecialiTemp = false;
        String specTemp = "";
        int annoPartenzaTemp = 0;
        System.out.println("Inserisci nome Soldato");
        String nomeTemp = stringhe.nextLine();
        System.out.println("Inserisci anno nascita in formato YYYY");
        int annoNascTemp = insNum();
        System.out.println("Sei nelle forze speciali 1:si 2:no");
        int scelta = insNum();
        if (scelta == 1)
            forzeSpecialiTemp = true;
        if (forzeSpecialiTemp) {
            System.out.println("Inserisci Specializzazione");
            specTemp = stringhe.nextLine();
            System.out.println("Inserisci anno di partenza specializzazione");
            annoPartenzaTemp = insNum();
        }

        ForzeSpeciali soldTemp = new Soldato(nomeTemp, annoNascTemp, forzeSpecialiTemp);
        if (forzeSpecialiTemp) {
            soldTemp.setGradoSpeciale(specTemp);
            soldTemp.setAnnoInizioGS(annoPartenzaTemp);
        }
        savedSoldier.addSoldier(soldTemp);

    }

    public static int insNum() {
        boolean errore = true;
        int i = 0;
        do {
            try {
                i = interi.nextInt();
                errore = false;
                break;
            } catch (Exception e) {
                System.out.println("ERRORE");
                interi.nextLine();
                errore = true;
            } finally {
                if (errore)
                    System.out.println("Hai sbagliato");
                else
                    System.out.println("Input corretto");
            }
        } while (errore);
        return i;
    }
}
