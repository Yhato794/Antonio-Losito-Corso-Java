import java.util.Scanner;

public class Admin {
    public static Scanner stringhe = new Scanner(System.in);
    public static Scanner interi = new Scanner(System.in);
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void registrazioneAdmin() {
        boolean errore = true;
        System.out.println("Inserisci Nome Utente:");
        String userInput = stringhe.nextLine();
        for (int i = 0; i < mainSoftware.savedAdmin.size(); i++) {
            if (mainSoftware.savedAdmin.get(i).username.equals(userInput)) {
                errore = false;
            }
        }
        if (errore) {
            System.out.println("Inserisci Password;");
            String passInput = stringhe.nextLine();
            if (mainSoftware.savedAdmin.size() < 2) {
                mainSoftware.savedAdmin.add(new Admin(userInput, passInput));
                System.out.println("Admin registrato");
                mainSoftware.menuLogin();

            } else {
                System.out.println("Limite massimo di admin raggiunto");
            }

        } else {
            System.out.println("Admin già in memoria");
            // registrazioneUtente();
        }
    }

    public static void adminLogin() {
        int i = 0;
        boolean log = false;
        System.out.println("Inserisci Nome:");
        String userInput = stringhe.nextLine();
        for (i = 0; i < mainSoftware.savedAdmin.size(); i++) {
            if (mainSoftware.savedAdmin.get(i).getUsername().equals(userInput)) {
                log = true;
                break;

            }
        }
        if (log) {
            System.out.println("Inserisci Password");
            String inputPass = stringhe.nextLine();
            if (mainSoftware.savedAdmin.get(i).getPassword().equals(inputPass)) {
                System.out.println("Password Corretta");
                menuAdmin();
            } else {
                System.out.println("Password Errata");
            }

        } else {
            System.out.println("Account Admin non trovato");
        }
    }

    public static void menuAdmin() {
        System.out.println("1: Visualizza dettagli utenti \n2: Modifica utenti \n3: Elimina Utenti \n5: Log Out");
        int scelta = interi.nextInt();
        switch (scelta) {
            case 1:
                visualizzaUsers();
                break;
            case 2:
                modificaUsers();
                break;
            case 3:
                eliminaUsers();
                break;
            default:
                mainSoftware.menuLogin();
                break;
        }
    }

    public static void visualizzaUsers() {

        for (int i = 0; i < mainSoftware.utentiInMemoria.size(); i++) {
            System.out.println("ID: " + i + " Nome: " + mainSoftware.utentiInMemoria.get(i).getNome() + " Email: "
                    + mainSoftware.utentiInMemoria.get(i).getEmail());
        }
        menuAdmin();

    }

    public static void visualizzaUsers(int a) {

        for (int i = 0; i < mainSoftware.utentiInMemoria.size(); i++) {
            System.out.println("ID: " + i + " Nome: " + mainSoftware.utentiInMemoria.get(i).getNome() + " Email: "
                    + mainSoftware.utentiInMemoria.get(i).getEmail());
        }

    }

    public static void modificaUsers() {

        visualizzaUsers(5);
        System.out.println("Quale account vuoi modificare?");
        int scelta = interi.nextInt();
        System.out.println("Account scelto: " + mainSoftware.utentiInMemoria.get(scelta).getNome());
        System.out.println("Inserisci nome");
        String nomeMod = stringhe.nextLine();
        System.out.println("Inserisci email");
        String emailMod = stringhe.nextLine();

        System.out.println("Sei sicuro? 1:Si 2:No");
        int confirmed = interi.nextInt();
        if (confirmed == 1) {
            mainSoftware.utentiInMemoria.get(scelta).setNome(nomeMod);
            mainSoftware.utentiInMemoria.get(scelta).setEmail(emailMod);
            System.out.println("Account modificato");
            menuAdmin();
        }

    }

    public static void eliminaUsers() {

        visualizzaUsers(4);
        System.out.println("Quale account vuoi eliminare?");
        int scelta = interi.nextInt();
        System.out.println("Sei sicuro? 1:Si 2:No");
        int confirmed = interi.nextInt();
        if (confirmed == 1) {
            mainSoftware.utentiInMemoria.remove(scelta);
            System.out.println("Account eliminato");
        }
        menuAdmin();
    }

}
