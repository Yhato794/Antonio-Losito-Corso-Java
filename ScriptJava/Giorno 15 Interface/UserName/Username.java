public class Username{
    private String username;
    private String password;
    
    public Username(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean controlloPassword(String password) {
        return password.equals(password);
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