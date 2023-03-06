import java.util.ArrayList;
import java.util.Scanner;

public class Registrazione {
    public static Scanner stringhe = new Scanner(System.in);
    public static Scanner interi = new Scanner(System.in);
    public static ArrayList<Anfibi> listaAnfibi = new ArrayList<Anfibi>();
    public static ArrayList<Canide> listaCanide = new ArrayList<Canide>();
    public static ArrayList<Felini> listaFelini = new ArrayList<Felini>();
    public static ArrayList<Roditori> listaRoditori = new ArrayList<Roditori>();

    public static void main(String[] args) {
        boolean a = true;
        while (a) {
            System.out.println("Ciao!! 1:Registrazione o 2:Uscita?");
            int reg = interi.nextInt();
            if (reg == 1) {
                System.out.println("1:Canide 2: Felini 3: Roditori 4:Anfibi");
                int scelta = interi.nextInt();
                switch (scelta) {
                    case 1:
                        Canide.inseNome();
                        break;
                    case 2:
                        Felini.inseNome();
                        break;
                    case 3:
                        Roditori.inseNome();
                        break;
                    case 4:
                        Anfibi.inseNome();
                        break;
                    default:
                        System.out.println("ERRORE");
                        break;
                }

            } else {
                a = false;
            }

        }
        Canide.stampa();
        Felini.stampa();
        Roditori.stampa();
        Anfibi.stampa();
        /*System.out.println("Cosa vuoi stampare 1:Canide 2: Felini 3: Roditori 4:Anfibi");
        int scelta = interi.nextInt();
        switch (scelta) {
            case 1:
                Canide.stampa();
                break;
            case 2:
                Felini.stampa();
                break;
            case 3:
                Roditori.stampa();
                break;
            case 4:
                Anfibi.stampa();
                break;
            default:
                System.out.println("ERRORE");
                break;
        }*/
    }
}