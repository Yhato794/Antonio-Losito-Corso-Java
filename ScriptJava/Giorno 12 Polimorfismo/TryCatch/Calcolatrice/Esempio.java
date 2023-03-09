
import java.util.Scanner;

public class Esempio {
    public static Scanner interi = new Scanner(System.in);

    public static void main(String[] args) {

        Integer myinteger= 55;

        int myint=myinteger.intValue();
        String myString=myinteger.toString();
        System.out.println(myString);
        boolean errore = true;
        int i=0;
        do {
            try {
                i = interi.nextInt();
                errore = false;
                break;
            } catch (Exception e) {
                System.out.println("ERRORE");
                interi.nextLine();
                errore = true;
            } finally {
                if (errore)
                    System.out.println("Hai sbagliato");
                else
                    System.out.println("Input corretto");
            }
        } while (errore);
        checkage(i);

    }

    static void checkage(int i){
        if(i<18){
            throw new ArithmeticException("Devi essere maggiorenne");
            
        }else{
            System.out.println("Sei maggiorenne");
        }
    }
}