import java.util.Scanner;

public class MainFibonacci {
    static Scanner intero = new Scanner(System.in);

    public static void main(String[] args) {
        MenuFibonacci myMenu = new MenuFibonacci();
        ConnectionFibonacci conn = new ConnectionFibonacci("jdbc:mysql://localhost:3306/fibonacci", "root", "root");
        conn.GetConnection();
        myMenu.Programma();

    }

}
