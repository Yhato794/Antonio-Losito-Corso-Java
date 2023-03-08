import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public class UpdateCity {
    public static Scanner stringhe = new Scanner(System.in);
    public static Scanner interi = new Scanner(System.in);

    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            if (conn != null) {
                System.out.println("Connesso");
            } else {
                System.out.println("Connessione fallita");
            }
            String query = "SELECT * FROM world.city";
            boolean errore = false;
            Statement prpStm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = prpStm.executeQuery(query);

            System.out.println("Inserisci nome città:");
            String nomeCitTemp = stringhe.nextLine();
            rs.first();
            
            while (rs.next()) {
                if (nomeCitTemp.equals(rs.getString(2))) {
                    errore = true;
                    System.out.println("Città già presente"+rs.getString(2));
                }
            }
            rs.moveToInsertRow();;
            if (!errore) {
                System.out.println("Inserisci Regione Città");
                String nomeRegTemp = stringhe.nextLine();
                System.out.println("Inserisci Popolazione");
                int popCitTemp = interi.nextInt();
                rs.updateString("Name", nomeCitTemp);
                rs.updateString("CountryCode", "ITA");
                rs.updateString("District", nomeRegTemp);
                rs.updateInt("Population", popCitTemp);
                rs.insertRow();
                rs.moveToCurrentRow();
                System.out.println("Città aggiunta");
            }
            rs.first();
            stampRS(rs);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void stampRS(ResultSet rs) {
        try {
            // rs.first();
            ResultSetMetaData meta = rs.getMetaData();
            int numeroColonne = meta.getColumnCount();
            while (rs.next()) {

                for (int i = 1; i <= numeroColonne; i++)
                    System.out.print(meta.getColumnName(i) + ": " + rs.getString(i) + " ");

                System.out.println();
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}