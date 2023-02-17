import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input_utente = new Scanner(System.in);
        Scanner input_eta = new Scanner(System.in);
        Scanner pass_input = new Scanner(System.in);

        String nome = "Antonio";
        int eta = 28;
        String pass_word = "pippo";

        System.out.println("Nome Utente:");
        String nome_input = input_utente.nextLine();
        if (nome_input.equals(nome)) {

            System.out.println("Eta:");
            int eta_input = input_utente.nextInt();

            if (eta_input == eta) {

                System.out.println("Password");
                String password_input = pass_input.nextLine();

                if (password_input.equals(pass_word)) {
                    System.out.println("Accesso Eseguito");
                } else {
                    System.out.println("errore");
                }

                ;
            } else {
                System.out.println("errore");
            }

        } else {
            System.out.println("errore");
        }
        input_utente.close();
        input_eta.close();
    }

}
