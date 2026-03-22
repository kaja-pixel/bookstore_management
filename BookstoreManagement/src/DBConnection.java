import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/little_book_haven";
    private static final String USER = "root";       // default user in WAMP
    private static final String PASSWORD = "";       // default password is empty in WAMP

    public static Connection getConnection() /*throws SQLException*/ {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
