public class Utente extends lavoro {

    private String username;
    private String password;
    private int anniexp;
    private int eta;

    

    public Utente(String username, String password, int anniexp, int eta) {
        this.username = username;
        this.password = password;
        this.anniexp = anniexp;
        this.eta = eta;
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

    public int getAnniexp() {
        return anniexp;
    }

    public void setAnniexp(int anniexp) {
        this.anniexp = anniexp;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public boolean checkPsw(String pass) {
        return this.password.equals(pass);
    }

}
