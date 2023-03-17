public class Admin extends Utente {

    private boolean isAdmin;

    

    public Admin(String username, String password, int anniexp, int eta, boolean isAdmin) {
        super(username, password, anniexp, eta);
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
