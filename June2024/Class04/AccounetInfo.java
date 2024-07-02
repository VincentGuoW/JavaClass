package June2024.Class04;

public class AccounetInfo {
    private String username;
    private String password;
    private String id;
    private int phone;

    public AccounetInfo() {
    }

    public AccounetInfo(String username, String password, String id, int phone) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.phone = phone;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
