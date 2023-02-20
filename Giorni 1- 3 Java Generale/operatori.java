import java.util.Scanner;

public class operatori {
    public static void main(String[] args) {

        Scanner dividendo = new Scanner(System.in);
        System.out.println("Primo Numero");
        double dividendo_input;
        dividendo_input = dividendo.nextDouble();

        Scanner divisore = new Scanner(System.in);
        System.out.println("Secondo Numero");
        double divisore_input;
        divisore_input = divisore.nextDouble();
        // verifica che la divisione sia possibile
        if (dividendo_input >= divisore_input) {
            double resto = dividendo_input % divisore_input;
            System.out.println(dividendo_input);
            System.out.println(divisore_input);
            System.out.println("Il resto è " + resto);

            Boolean controllo = (dividendo_input % 2) == 0;
            System.out.println("Il primo numero è pari: " + controllo);
            /*
             * if (calcolo_pari == 0) {
             * System.out.println("Pari");
             * } else {
             * System.out.print("Dispari");
             * }
             */
        } else {
            System.out.println("Errore");
        }
        // float x = 10.5f;
        // int y = 1;
        // System.out.println(x % y);

        dividendo.close();
        divisore.close();

    }
}
