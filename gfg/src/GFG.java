
//Java program to set up connection and get all data from table
import java.sql.*;

public class GFG {

    private Connection connection = null;
    private String url;
    private String user;
    private String password;

    public GFG(
            String url,
            String user,
            String password) {

        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() {
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                    this.url,
                    this.user,
                    this.password);
        } catch (Exception exception) {
            System.out.println(exception);
        }
        return this.connection;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
