import java.util.ArrayList;


public class Utente {

    private int id;
    private String username;
    private String password;
    private ArrayList<String> libPreso=new ArrayList<>();
    
    public ArrayList<String> getLibPreso() {
        return libPreso;
    }

    public void setLibPreso(ArrayList<String> libPreso) {
        this.libPreso = libPreso;
    }


    public Utente(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
