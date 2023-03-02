
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ConnectionFibonacci {
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

    public ConnectionFibonacci(String myUrl, String myNome, String myPassword) {

        this.myUrl = myUrl;
        this.myNome = myNome;
        this.myPassword = myPassword;

    }

    public ConnectionFibonacci GetConnection() {

        try {
            ConnectionFibonacci connection = new ConnectionFibonacci(this.myUrl, this.myNome, this.myPassword);
            System.out.println(connection != null ? "Connesso" : "Non connesso");
            return connection;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}
