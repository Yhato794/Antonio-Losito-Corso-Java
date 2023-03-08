import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public class esercizio {

    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            if (conn != null) {
                System.out.println("Connesso");
            } else {
                System.out.println("Connessione fallita");
            }
            String query = "SELECT * FROM world.v_italiane";

            Statement prpStm = conn.createStatement();
            ResultSet rs = prpStm.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int numeroColonne = meta.getColumnCount();

            while (rs.next()) {

                for (int i = 1; i <= numeroColonne; i++)
                    System.out.print(meta.getColumnName(i) + ": " + rs.getString(i) + " ");

                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}