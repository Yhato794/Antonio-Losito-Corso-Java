import java.util.Scanner;

public class generatoreSquadre {
    public static void main(String[] args) {

        System.out.println("Vuoi modificare?");
        dirigenza c = new dirigenza();
        c.insdirigente1();
        c.insdirigente2();
        c.insBoss();
        giocatore g = new giocatore();
        g.insGioca1();
        g.insGioca2();
        g.insRiser();
        squadra sq = new squadra();
        sq.dirigente1 = c.dirigente1;
        sq.dirigente2 = c.dirigente2;
        sq.boss = c.boss;
        sq.giocatore1 = g.giocatore1;
        sq.giocatore2 = g.giocatore2;
        sq.riserva = g.riserva;
        System.out.println("Quale campo vuoi modificare? 1:dir1 2:dir2 3:boss 4:gioc1 5:gioc2 6:riserva 0:nessuna modifica");
        Scanner scelta = new Scanner(System.in);
        int sceltaa = scelta.nextInt();
        switch (sceltaa) {
            case 1:
                System.out.println("Dirigente 1:");
                Scanner aaa = new Scanner(System.in);
                String sceltdir = aaa.nextLine();
                sq.dirigente1 = sceltdir;
                break;
            case 2:
                System.out.println("Dirigente 2:");
                Scanner aaa1 = new Scanner(System.in);
                String sceltdir1 = aaa1.nextLine();
                sq.dirigente2 = sceltdir1;
                break;
            case 3:
                System.out.println("Boss:");
                Scanner aaa2 = new Scanner(System.in);
                String sceltdir2 = aaa2.nextLine();
                sq.boss = sceltdir2;
                break;
            case 4:
                System.out.println("Giocatore 1:");
                Scanner aaa3 = new Scanner(System.in);
                String sceltdir3 = aaa3.nextLine();
                sq.giocatore1 = sceltdir3;
                break;
            case 5:
                System.out.println("Giocatore 1:");
                Scanner aaa4 = new Scanner(System.in);
                String sceltdir4 = aaa4.nextLine();
                sq.giocatore2 = sceltdir4;
                break;
            case 6:
                System.out.println("Riserva");
                Scanner aaa5 = new Scanner(System.in);
                String sceltdir5 = aaa5.nextLine();
                sq.riserva = sceltdir5;
                break;


        }
        System.out.println(sq.dirigente1);
        System.out.println(sq.dirigente2);
        System.out.println(sq.boss);
        System.out.println(sq.giocatore1);
        System.out.println(sq.giocatore2);
        System.out.println(sq.riserva);


        /*
         * squadra Sq=new squadra();
         * dirigenza dirigenza = new dirigenza();
         * System.out.println("Inserisci dirigente");
         * Scanner input = new Scanner(System.in);
         * dirigenza.dirigente1 = input.nextLine();
         * System.out.println("Inserisci dirigente2");
         * Scanner input1 = new Scanner(System.in);
         * dirigenza.dirigente2 = input1.nextLine();
         * System.out.println("Inserisci boss");
         * Scanner input3 = new Scanner(System.in);
         * dirigenza.boss = input3.nextLine();
         * 
         * giocatore gioc = new giocatore();
         * System.out.println("Inserisci giocatore1");
         * Scanner input4 = new Scanner(System.in);
         * gioc.giocatore1 = input4.nextLine();
         * System.out.println("Inserisci giocatore 2");
         * Scanner input5 = new Scanner(System.in);
         * gioc.giocatore1 = input5.nextLine();
         * System.out.println("Inserisci riserva");
         * Scanner input6 = new Scanner(System.in);
         * gioc.riserva = input6.nextLine();
         */
    }
}
