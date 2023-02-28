import java.util.ArrayList;
import java.util.Scanner;

public class esercizioMetodiOverload {
    final static String adminPassword = "Pippo123";
    final static String sowftwareOwnerPass = "Pippo456";
    static ArrayList<Integer> securityLevel = new ArrayList<Integer>();
    static ArrayList<String> savedName = new ArrayList<String>();
    static ArrayList<String> savedEmail = new ArrayList<String>();
    static ArrayList<String> savedPass = new ArrayList<String>();

    public static void main(String[] args) {
        boolean adminCheck = false;
        boolean onlyboss = false;

        int indiceUtente = -1;
        int sceltaMainMenu = 1;
        boolean a = true;
        boolean b = true;
        while (a) {
            System.out.println("Vuoi entrare");
            Scanner scelta = new Scanner(System.in);
            sceltaMainMenu = scelta.nextInt();
            if (sceltaMainMenu == 1) {
                a = true;
            } else {
                a = false;
                b = false;
            }
            while (b) {

                registrazione();
                indiceUtente++;
                System.out.println("Password admin 0 per uscire");
                Scanner passwordAdmin = new Scanner(System.in);
                String passwordAdminUtente = passwordAdmin.nextLine();
                if (passwordAdminUtente.equals(adminPassword)) {
                    securityLevel.set(indiceUtente, 1);
                    adminCheck = true;
                    System.out.println("Account Settato ad Admin");
                    if (adminCheck) {
                        System.out.println("Password Software Owner 0 per uscire");
                        Scanner passwordSys = new Scanner(System.in);
                        String passwordSystemOwner = passwordSys.nextLine();
                        if (passwordSystemOwner.equals(sowftwareOwnerPass) && !onlyboss) {
                            securityLevel.set(indiceUtente, 2);
                            onlyboss = true;
                            System.out.println("Account Settato a Software Owner");

                        } else if (onlyboss) {
                            System.out.println("There can only be one");
                        }

                    }
                }
                System.out.println("Registrare un altro utente?");
                Scanner sceltaRegUte = new Scanner(System.in);
                int RegUte = sceltaRegUte.nextInt();
                if (RegUte == 1) {
                    b = true;
                } else {
                    b = false;
                }

            }
        }

        stampa();

    }

    public static void registrazione() {
        Scanner nome = new Scanner(System.in);
        System.out.println("Inserisci Nome");
        String nomeUtente = nome.nextLine();
        savedName.add(nomeUtente);
        System.out.println("Inserisci Email");
        Scanner email = new Scanner(System.in);
        String emailUtente = email.nextLine();
        savedEmail.add(emailUtente);
        System.out.println("Inserisci Password");
        Scanner pass = new Scanner(System.in);
        String passUtente = pass.nextLine();
        savedPass.add(passUtente);
        securityLevel.add(0);
        System.out.println("Untente registrato");
    }

    public static void stampa() {
        for (int i = 0; i < savedName.size(); i++) {
            System.out.println("Nome utente: " + savedName.get(i));
            System.out.println("Email: " + savedName.get(i));
            switch (securityLevel.get(i)) {
                case 0:
                    System.out.println("Security Level Guess");
                    break;
                case 1:
                    System.out.println("Security Level Admin");
                    break;
                case 2:
                    System.out.println("Securyty level Software Owner");
                    break;
                default:
                    break;

            }

        }

    }
}