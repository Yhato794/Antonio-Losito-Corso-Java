import java.util.ArrayList;
import java.util.Scanner;

public class EseguiProg {
    public final static Admin adminsaved = new Admin("Pippo", "Pippo123", 0, 0, true);
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);
    public static ArrayList<Utente> savedUsers = new ArrayList<Utente>();

    public static void main(String[] args) {
        boolean uscita = true;
        while (uscita) {
            System.out.println("Registra 1:nuovo utente 2:accedi utente 3: accedi Admin 4:esci");
            int scelta = interi.nextInt();
            switch (scelta) {
                case 1:
                    savedUsers.add(registraUtente());
                    break;
                case 2:
                    // loginUser
                    break;
                case 3:
                    System.out.println("Vuoi lavorare come 1:Cheff 2:Programmatore 3:Becchino 4:Tester di materassi");
                    int scelta1 = interi.nextInt();
                    switch (scelta1) {
                        case 1:
                          System.out.print("Utente "+savedUsers.get(0).getUsername()+" ");  savedUsers.get(0).nomeLavoroChef();
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            break;
                    }
                case 4:
                    uscita = false;
                    break;
                default:
                    break;
            }

        }
    }

    public static void loginAdmin() {
        System.out.println("Inserisci nome:");
        String nomeTemp = stringhe.nextLine();
        if (nomeTemp.equals(adminsaved.getUsername())) {
            System.out.println("Inserisci password");
            String passTemp = stringhe.nextLine();
            if (adminsaved.checkPsw(passTemp)) {
                // menuAdmin
            } else {
                System.out.println("Password Errata");
            }

        } else {
            System.out.println("Username Errato");
        }
    }

    public static void menuAdmin() {
        System.out.println("1:Crea posizione 2:Vedi posizioni aperte");
    }

    public static Utente registraUtente() {
        System.out.println("Inserisci nome:");
        String nomeTemp = stringhe.nextLine();
        System.out.println("Inserisci password");
        String passTemp = stringhe.nextLine();
        System.out.println("Inserisci età");
        int etaTemp = interi.nextInt();
        System.out.println("Inserisci anni esperienza");
        int anniExpTemp = interi.nextInt();
        return new Utente(nomeTemp, passTemp, anniExpTemp, etaTemp);

    }
}
