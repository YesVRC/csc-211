package user;

public class User {
    private String name;
    private int id;
    static int counter = 0;

    public User(String name) {
        this.name = name;
        this.id = counter++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public String toString() {
        return String.format("[User] Name: %s, ID: %d", name, id);
    }
}
