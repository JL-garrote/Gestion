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

    void insertupdatedelete(String consulta) throws SQLException {
        state.executeUpdate(consulta);
    }

    void sacarResultados(String consulta,String columna) throws SQLException {
        state.execute(consulta);

        while (rs.next()) {
            System.out.println(rs.getString(columna));
        }
    }

    int igualarId (int id) throws SQLException {
        while (rs.next()) {
            id = rs.getInt("id");
        }
        return id;
    }
}
