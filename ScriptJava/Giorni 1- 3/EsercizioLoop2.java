
import java.util.Scanner;


public class EsercizioLoop2 {
    // inizializzo scanner
    public static Scanner nome_input = new Scanner(System.in);
    public static Scanner eta_input = new Scanner(System.in);
    public static Scanner data_input = new Scanner(System.in);
    public static Scanner pass_input = new Scanner(System.in);
    public static Scanner chiusura = new Scanner(System.in);
    // dichiaro variabili
    public static String saved_pass = "Pippo123";
    public static String nome_utente = "";
    public static int eta_utente = 0;
    public static String data_utente = "";

    public static void main(String[] args) {

        int a = 0; // contatori per i loop
        int b = 0;

        while (b == 0) {

            while (a == 0) {

                anagrafica(); // prima acquisizione dati
                a++;

            }

            System.out.println("Password");
            String pass_utente = pass_input.nextLine();

            if (saved_pass.equals(pass_utente)) {

                System.out.println("Password Corretta modifica i dati");
                anagrafica(); // modifica dati
                output_dati(); // output dati modificati

            } else {

                System.out.println("Dati originali:");
                output_dati(); // output dati non modificati
                System.out.println("Password Errata");

            }

            System.out.println("Vuoi continuare 0:Si 1:No");
            int contantore = chiusura.nextInt();

            if (contantore != 0) {
                b++; // uscita loop
            }

        }

        nome_input.close();
        eta_input.close();
        data_input.close();
        chiusura.close();
        pass_input.close();
        chiusura.close();

    }

    static void anagrafica() {

        System.out.println("Inserisci nome utente");
        nome_utente = nome_input.nextLine();
        // int c=0;
        // int maxtries=3;
        // boolean b=true;
        // while(b){
        // try {
        System.out.println("Inserisci eta");
        eta_utente = eta_input.nextInt();
        // b=false;
        // } catch (InputMismatchException e) {
        // System.out.println("Errore");
        // c++;
        // if(c==maxtries){
        // throw e;
        // }
        // }

        System.out.println("Inserisci data nascita gg/mm/yyyy");
        data_utente = data_input.nextLine();

    }

    static void output_dati() {

        System.out.println(nome_utente);
        System.out.println(eta_utente);
        System.out.println(data_utente);

    }
}