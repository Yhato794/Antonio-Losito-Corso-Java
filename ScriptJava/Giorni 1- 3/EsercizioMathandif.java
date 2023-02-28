import java.util.Scanner;

public class EsercizioMathandif {
    public static void main(String[] args) {
        int x = 10;
        int y = 9;
        System.out.println(!(x > y));

        if (20 > 18) {
            System.out.println("20 is greater the 18");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day");

        } else {
            System.out.println("Good evening");

        }

        Scanner num_1 = new Scanner(System.in);
        String prova = num_1.nextLine();
        System.out.println(prova.equals("prova"));

        System.out.println("Dammi due numeri");
        int operatore_1 = num_1.nextInt();
        int operatore_2 = num_1.nextInt();

        System.out.println("Numero più grande " + Math.max(operatore_1, operatore_2));
        System.out.println("Numero più piccolo " + Math.min(operatore_1, operatore_2));

        System.out.println("Dammi due numeri da sottrarre");

        int operatore_3 = num_1.nextInt();
        int operatore_4 = num_1.nextInt();

        System.out.println(Math.subtractExact(operatore_3, operatore_4));

        System.out.println("Dammi due numeri da moltiplicare");

        int operatore_5 = num_1.nextInt();
        int operatore_6 = num_1.nextInt();

        System.out.println(Math.multiplyExact(operatore_5, operatore_6));

        System.out.println("Il tuo voto è: " + Math.random() * 1000);

        num_1.close();
        ;

    }

}
