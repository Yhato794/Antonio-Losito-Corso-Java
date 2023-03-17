import java.util.ArrayList;
import java.util.Scanner;

public class mainSoftware {

    static Scanner interi = new Scanner(System.in);
    public static ArrayList<Utente> utentiInMemoria = new ArrayList<Utente>();
    public static ArrayList<Admin> savedAdmin = new ArrayList<Admin>();

    
    public static void main(String[] args) {

        Biblioteca.libriBib.add(new Libro("Harry Potter 1", 7, 0));
        Biblioteca.libriBib.add(new Libro("Harry Potter 2", 0, 10));
        Biblioteca.libriBib.add(new Libro("Harry Potter 3", 10, 0));
        Biblioteca.libriBib.add(new Libro("Harry Potter 4", 0, 15));
        Biblioteca.libriBib.add(new Libro("Harry Potter 5", 3, 0));
        Biblioteca.libriBib.add(new Libro("Harry Potter 6", 0, 22));
        menuLogin();

    }

    public static void menuLogin() {
        System.out.println("1:Login utente 2:Login Admin 3: Registra Admin");
        int scelte = interi.nextInt();
        if (scelte == 1) {
            Utente.LogIn();
        } else if (scelte == 2) {
            Admin.adminLogin();
        } else if (scelte == 3) {
            Admin.registrazioneAdmin();
        }
    }
    
}
