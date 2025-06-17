import java.sql.*;

public class DB {

    private String URL = "jdbc:mysql:/localhost:3306/";
    private String USER = "admin";
    private String PASS = "root";

    Connection con = DriverManager.getConnection(URL,USER,PASS);
    Statement state = con.createStatement();
    ResultSet rs = state.executeQuery("SELECT * FROM --.--");

    public DB() throws SQLException {
    }
}
