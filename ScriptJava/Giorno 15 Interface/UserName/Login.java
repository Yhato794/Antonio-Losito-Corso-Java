import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Username> savedUsers = SavedUsers.getSavedUsers();
        ArrayList<Admin> savedAdmin = SavedUsers.getSavedAdmin();

        menuInserimento(savedUsers, savedAdmin);
        logIn(savedUsers, savedAdmin);

    }

    public static void menuAdmin(ArrayList<Username> savedUsers) {
        while (true) {
            System.out.println("1:Modifica o 2:elimina utente 3: esci");
            int scelta = (int) inseNum();
            if (scelta == 1) {
                SavedUsers.stampaUser();
                System.out.println("Quale utente vuoi modificare indica l'indice:");
                int sceltaMod = (int) inseNum();
                System.out.println("Inserisci nuovo username:");
                String newUsername = stringhe.nextLine();
                System.out.println("Inserisci nuova password:");
                String newPassword = stringhe.nextLine();
                Admin.modificaUser(savedUsers, sceltaMod, newUsername, newPassword);

            } else if (scelta == 2) {
                SavedUsers.stampaUser();
                System.out.println("Quale utente vuoi eliminare indica l'indice:");
                int sceltaElim = (int) inseNum();
                Admin.eliminaUser(savedUsers, sceltaElim);
            } else {
                return;
            }
        }
    }

    public static void logIn(ArrayList<Username> savedUsers, ArrayList<Admin> savedAdmin) {
        while (true) {
            int indiceUser = 0, indiceAdmin = 0;
            boolean trovatoUser = false;
            boolean trovatoAdmin = false;
            System.out.println("Login");
            System.out.println("Inserisci username:");
            String userTemp = stringhe.nextLine();
            for (indiceUser = 0; indiceUser < savedUsers.size(); indiceUser++) {
                if (savedUsers.get(indiceUser).getUsername().equals(userTemp)) {
                    trovatoUser = true;
                    break;
                }
            }
            if (trovatoUser) {
                for (indiceAdmin = 0; indiceAdmin < savedAdmin.size(); indiceAdmin++) {
                    if (savedAdmin.get(indiceAdmin).getUsername().equals(userTemp)) {
                        trovatoAdmin = true;
                        break;
                    }
                }
            }

            if (trovatoUser) {
                System.out.println("Inserisci password");
                String passTemp = stringhe.nextLine();
                if (savedUsers.get(indiceUser).controlloPassword(passTemp)) {
                    System.out.println("Ti sei Loggato come utente base");
                    break;
                }

            }

            if (trovatoAdmin) {
                System.out.println("Inserisci password");
                String passTemp = stringhe.nextLine();
                if (savedAdmin.get(indiceAdmin).controlloPassword(passTemp)) {
                    System.out.println("Ti sei loggato come admin");
                    menuAdmin(savedUsers);
                }
            }

        }
    }

    public static void menuInserimento(ArrayList<Username> savedUsers, ArrayList<Admin> savedAdmin) {
        while (true) {
            System.out.println("1: inserisci utente 2: vai a log in");
            int scelta = (int) inseNum();
            if (scelta == 1) {
                System.out.println("Inserisci username:");
                String userTemp = stringhe.nextLine();
                System.out.println("Inserisci password");
                String passTemp = stringhe.nextLine();
                System.out.println("Hai chiave di accesso admin? 1:Si 2:No");
                int scelta1 = (int) inseNum();
                if (scelta1 == 1) {
                    if (checkAdminToken()) {
                        Admin admin = new Admin(userTemp, passTemp);
                        savedAdmin.add(admin);
                        System.out.println("Ti sei registrato come admin");
                    }
                } else {
                    Username user = new Username(userTemp, passTemp);
                    savedUsers.add(user);
                    System.out.println("Ti sei registrato come utente base");
                    SavedUsers.stampaUser();
                }
            } else {
                break;
            }

        }
    }

    public static boolean checkAdminToken() {
        System.out.println("Inserisci chiave di accesso");
        String adminToken = stringhe.nextLine();
        return Admin.passwordCheck(adminToken);

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
