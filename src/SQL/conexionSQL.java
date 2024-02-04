package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionSQL {

    Connection con;

    public Connection conectar() {

        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bdcomputadoras", "", "");

        } catch (Exception e) {
            System.err.print("Error: " + e);
            e.printStackTrace();

        }
        return conexion;
        
    }

     public static void main(String[] args) {
        conexionSQL conexionSQL = new conexionSQL();
        try (Connection connection = conexionSQL.conectar()) {
            // Your database operations go here
        } catch (SQLException e) {
            System.err.println("Error closing connection: " + e.getMessage());
            e.printStackTrace();
        }
    
     }
}
