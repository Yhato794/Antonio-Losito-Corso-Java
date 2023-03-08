import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
            String query = "SELECT " +
                    "Name, " +
                    " CASE " +
                    "WHEN SurfaceArea > ? THEN concat(? , SurfaceArea) " +
                    "ELSE concat('SurfaceArea minore di 100k: ', SurfaceArea) " +
                    "END AS ControlloSuperficie, " +
                    "CASE " +
                    "WHEN isnull(indepYear) THEN 'anno non trovato' " +
                    "ELSE concat('anno trovato ', IndepYear)" +
                    "END AS AnnoIndipendenza " +
                    "FROM " +
                    "world.country;";

            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, 100000);
            stm.setString(2, "SurfaceArea maggiore di 100k: ");
            

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String tableFormat = String.format("Name: %s SurfaceArea: %s IndepYear: %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
                System.out.println(tableFormat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
