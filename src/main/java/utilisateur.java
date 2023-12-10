

public class utilisateur {
    private static String username;
    private String password;
    private static String email;
    private static String role;
    private String age;
    private int id;
    
    public utilisateur(String username, String password, String email, String role, String age, int id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.age = age;
        this.id = id;
    }

    public utilisateur(String username, String password, String email, String role, String age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.age = age;
    }

    public utilisateur(String nom, String email, String role, String age2) {
        this.username = nom;
        this.email = email;
        this.role = role;
        this.age= age2;
    }

    public static String getNom() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
    
    public static String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getage() {
        return age;
    }

    public static String getrole() {
        return role;
    }
}