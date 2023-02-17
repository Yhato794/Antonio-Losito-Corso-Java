import java.util.Scanner;
public class ContaLettere {
    public static void main(String[] args) {
        Scanner stringa= new Scanner(System.in);
        System.out.println("inserira una stringa");
        String stringaInput=stringa.nextLine();

        int lung=stringaInput.length();


        for (int i = 0; i <lung; i++ ){
            System.out.println("Lettera numero: "+(i+1)+" "+stringaInput.charAt(i));
        }

    }
    
}
