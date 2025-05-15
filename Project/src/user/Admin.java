package user;

public class Admin extends User {
    private String password;

    public Admin(String name, String password) {
        super(name);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, String oldPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = password;
        }
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
