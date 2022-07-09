
package ud16315_lab2;

public class encapsolate {
    private String User;
    private String Password;
    private String role;

    public encapsolate() {
    }

    public encapsolate(String User, String Password, String role) {
        this.User = User;
        this.Password = Password;
        this.role = role;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
}
