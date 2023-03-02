import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EsercizioQuery {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringa = new Scanner(System.in);

    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            if (conn != null) {
                System.out.println("Connesso");
            } else {
                System.out.println("Connessione fallita");
            }
            // Prova lettura db

            System.out.println("Inserisci Codice nazione");
            String codInput = "%" + stringa.nextLine() + "%";
            System.out.println("Inserisci controllo popolazione superiore a:");
            int popInput = interi.nextInt();
            System.out.println("Vuoi vedere il nome della nazione? 1 Si 0 No");
            int nome = stringa.nextInt();
            System.out.println("Ordina 1:crescente o 2:decrescente?");
            int ordInput = interi.nextInt();
            String tempOrd;
            if (ordInput == 1)
                tempOrd = "ASC";
            else
                tempOrd = "DESC";

            String query = "SELECT country.Code, city.name, CASE WHEN 0!=? THEN country.name else 'nascosto' end as NomeNazine, country.Population FROM world.country inner join  world.city  on world.country.Code=world.city.CountryCode where country.Population >= ? and country.code like ?  Order by Population "+ tempOrd;
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, nome);
            stm.setInt(2, popInput);
            stm.setString(3, codInput);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String tableFormat = String.format("CODICE: %s CITTA': %s NOMENAZIONE: %s POPULATION %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                System.out.println(tableFormat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
