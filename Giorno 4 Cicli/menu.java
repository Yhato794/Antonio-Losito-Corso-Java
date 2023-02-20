import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scelta = new Scanner(System.in);
        Scanner conf = new Scanner(System.in);
       

        int disp_1 = 15;
        int disp_2 = 7;
        int disp_3 = 11;
        boolean condizione = true;

        do {

            System.out.println("Scegli piatto");
            System.out.println("1:Pasta disponibilità: " + disp_1);
            System.out.println("2:Carne disponibilità: " + disp_2);
            System.out.println("3:Budino disponibilità: " + disp_3);
            int scelta_utente = scelta.nextInt();

            switch (scelta_utente) {
                case 1:
                    System.out.println();
                    System.out.println("prezzo: ");
                    System.out.println("disponibilità: " + disp_1);
                    break;
                case 2:
                    System.out.println("ingredienti: ");
                    System.out.println("prezzo: ");
                    System.out.println("disponibilità: " + disp_2);
                    break;
                case 3:
                    System.out.println("ingredienti: ");
                    System.out.println("prezzo: ");
                    System.out.println("disponibilità: " + disp_3);
                    break;

            }

            System.out.println("confermare ordine 1:Si 2:No");
            int conf_utente = conf.nextInt();
            if (conf_utente == 1) {
                switch (scelta_utente) {
                    case 1:
                        System.out.println("Ordine Confermato");
                        disp_1--;
                        break;
                    case 2:
                        System.out.println("Ordine Confermato");
                        disp_2--;
                        break;
                    case 3:
                        System.out.println("Ordine Confermato");
                        disp_3--;
                        break;
                }
            } else {
                System.out.println("Ordine Annullato");

            }

            System.out.println("Effettuare un altro ordine? 1:Si 2:No");
            int uscita = conf.nextInt();
            if (uscita != 1) {
                condizione = false;
            }

        } while (condizione);
        scelta.close();
        conf.close();

    }

}
//Ciiaoooo