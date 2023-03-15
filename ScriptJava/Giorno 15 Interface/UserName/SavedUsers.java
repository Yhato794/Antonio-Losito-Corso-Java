import java.util.ArrayList;

public class SavedUsers {
    private static ArrayList<Username> savedUsers = new ArrayList<Username>();
    private static ArrayList<Admin> savedAdmin = new ArrayList<Admin>();

    public static ArrayList<Username> getSavedUsers() {
        return savedUsers;
    }

    public static void setSavedUsers(ArrayList<Username> savedUsers) {
        SavedUsers.savedUsers = savedUsers;
    }

    public static ArrayList<Admin> getSavedAdmin() {
        return savedAdmin;
    }

    public static void setSavedAdmin(ArrayList<Admin> savedAdmin) {
        SavedUsers.savedAdmin = savedAdmin;
    }

    public static void stampaUser() {
        for (int i = 0; i < savedUsers.size(); i++) {
            System.out.println(i + " Username: " + savedUsers.get(i).getUsername() + " Password: "
                    + savedUsers.get(i).getPassword());
        }
    }
}
