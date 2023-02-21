import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);

        String[] anagrafica = { " Nome ", " Cognome ", " Email ", " Eta " };
        String[] utente = { "", "", "", "" };

        for (int i = 0; i < anagrafica.length; i++) {
            System.out.println("Inserire" + anagrafica[i]);
            utente[i] = nome.nextLine();

        }
        System.out.print("Utente salvato: ");

        for (int i = 0; i < anagrafica.length; i++) {

            System.out.print(utente[i] + " ");

        }
        nome.close();
    }

}
