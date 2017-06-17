
package parainfo.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectaDb {
    
    public Connection getConnection() throws SQLException {
        Connection cn = null;

        try {
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException 
                | InstantiationException 
                | IllegalAccessException e) {

            throw new SQLException(e.getMessage());
        }

        return cn;
    }
    
    private final String url = "jdbc:mysql://localhost:3306/usuarios";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "root";
}

