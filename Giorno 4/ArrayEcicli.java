import java.util.Scanner;

public class ArrayEcicli {
    public static void main(String[] args) {
        Scanner stringa = new Scanner(System.in);
        System.out.println("Cosa cerchi");
        String sceltaUtente = stringa.nextLine();

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        int[] potenza = { 123, 321, 456, 654 };
        int x = 0;
        int a = 0;
        boolean[] b = { true, false, true, true, false };
        for (String i : cars) {
            if (sceltaUtente.equals(cars[x])) {
                System.out.println("trovato "+cars[x]);
                
            } else {
                System.out.println("ERRORE");
            }
            x++;
            
        }
       // for (boolean c : b) {
         //   System.out.println(b[a]);
           // a++;
        //}

    }
}
