package Praktikum03;

public class UserProject {
    private String username;
    private String password;

    public UserProject(String username, String password) { //constructor berparameter
        this.username = username;
        this.password = password;
    }

    public void loginUser() { 
        System.out.println("User : " + getUsername());
        System.out.println("Password: " + getPassword());
    }

    public String getUsername() { //method
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
