import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class connectionDb {
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
            String query = "SELECT * FROM city WHERE name like 'Bari'";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String tableFormat = String.format("ID: %d Name: %s CountryCode: %s District: %s Population: %d",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
                System.out.println(tableFormat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
