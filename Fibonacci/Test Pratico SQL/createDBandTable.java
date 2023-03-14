
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createDBandTable {

    public static void connessione() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "CREATE DATABASE BIBLIOTECA";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public static void createAutori() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTECA", "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE Autori (nome_autore varchar(50) primary key, anno_nascita int not null, anno_morte int not null);";
            stmt.executeUpdate(sql);
            System.out.println("Table Autori Create Successfully");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public static void createRomanzi() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTECA", "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE Romanzi (id INT PRIMARY KEY AUTO_INCREMENT, titolo varchar(255) not null , autore varchar(50) not null , anno_pubblicazione int not null, foreign key(autore) references autori(nome_autore)) ;";
            stmt.executeUpdate(sql);
            System.out.println("Table Romanzi Create Successfully");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public static void main(String[] args) {
        createDBandTable.connessione(); // metodo usato per richiamare la creazione del

        createDBandTable.createAutori(); // metodo usato per richiamare la creazione

        createDBandTable.createRomanzi(); // metodo usato per richiamare la creazione

    }

}