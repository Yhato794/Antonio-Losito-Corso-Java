import java.util.Scanner;

public class freni {
    String potenzaFreni;

    public String inseCilindrata() {
        System.out.println("Inserisci potenza frenante 1: 70% 2:80% 3:100%");
        Scanner input = new Scanner(System.in);
        int scelta = input.nextInt();
        boolean errore = false;
        while (errore) {
            switch (scelta) {
                case 1:
                    potenzaFreni = "70%";
                    break;
                case 2:
                    potenzaFreni = "80%";
                    break;
                case 3:
                    potenzaFreni = "100%";
                    break;
                default:
                    errore = true;
                    System.out.println("Errore Riprova");

            }
        }

        return potenzaFreni;
    }

    public int insePastiglie() {
        System.out.println("Quante Pastiglie?");
        Scanner input = new Scanner(System.in);
        int scelta = input.nextInt();
        return scelta;
    }
}
