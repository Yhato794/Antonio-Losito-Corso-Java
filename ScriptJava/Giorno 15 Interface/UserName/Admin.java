import java.util.ArrayList;

public class Admin extends Username implements AdminInterface {

    private final static String savedPassword = "Pippo123";

    public Admin(String username, String password) {
        super(username, password);
    }

    public static boolean passwordCheck(String password) {
        return savedPassword.equals(password);
    }

    @Override
    public void eliminaUser() {

    }

    @Override
    public void modificaUser() {

    }

    public static void eliminaUser(ArrayList<Username> savedUsers, int sceltaElim) {
        savedUsers.remove(sceltaElim);

    }

    public static void modificaUser(ArrayList<Username> savedUsers, int sceltaMod, String newUsername,
            String newPassword) {
        savedUsers.get(sceltaMod).setUsername(newUsername);
        savedUsers.get(sceltaMod).setPassword(newPassword);

    }

}
