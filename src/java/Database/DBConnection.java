package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nathie
 */
public class DBConnection {

    static String url = "jdbc:mysql://localhost:3306/tourcom";
    static String user = "root";
    static String pw = "";
    static String driver = "com.mysql.jdbc.Driver";

    static Connection con;

    public static Connection getCon() throws Exception {
        if (con == null) {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pw);

        }
        return con;

    }

}
