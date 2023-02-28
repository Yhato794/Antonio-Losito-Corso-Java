import java.util.Scanner;

public class generoTarga {

    public static void main(String[] args) {
        motore motore = new motore();
        boolean b = true;
        while (b) {
            System.out.println("Inserisci cilindrata 1:800cc 2:1600cc 3:2500cc");
            Scanner input = new Scanner(System.in);
            int scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    motore.cilindrata = 800;
                    b = false;
                    break;
                case 2:
                    motore.cilindrata = 1500;
                    b = false;
                    break;
                case 3:
                    motore.cilindrata = 2500;
                    b = false;
                    break;
                default:
                    b = true;
                    System.out.println("Errore Riprova");

            }

            System.out.println("Quanti Pistoni");
            Scanner input1 = new Scanner(System.in);
            motore.pistoni = input.nextInt();

        }
    }

}
