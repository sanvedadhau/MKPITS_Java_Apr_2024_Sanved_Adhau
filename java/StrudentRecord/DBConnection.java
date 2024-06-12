package StrudentRecord;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection dbConnect(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded...");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ourdb", "root", "sanved@123");
            System.out.println("Connected to the database...");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return connection;
    }
}