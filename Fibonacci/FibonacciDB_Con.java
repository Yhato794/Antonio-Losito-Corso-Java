
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.PreparedStatement;

public class FibonacciDB_Con {
    /*
     * Singleton
     * CONNESSIONE DB FIBONACCI
     * URL db
     * diver **AUTOMATICO**
     * USERNAME DB
     * PASSWORD DB
     * STATMENT STATICO
     * EXECUTE QUERY
     * COLLEGAMENTO FIBONACCI
     */
    private String myUrl;
    private String myNome;
    private String myPassword;

    public FibonacciDB_Con(String myUrl, String myNome, String myPassword) {

        this.myUrl = myUrl;
        this.myNome = myNome;
        this.myPassword = myPassword;

    }

    public Connection GetConnection() {

        try {
            Connection connection = DriverManager.getConnection(this.myUrl, this.myNome, this.myPassword);
            System.out.println(connection != null ? "Connesso!!!!" : "Non connesso!!!");
            return connection;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}
