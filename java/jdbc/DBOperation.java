import java.sql.*;

public class DBOperation {
    public static void displayAllData() {
        Connection connection = DBConnection.dbConnect();
        if (connection != null) {
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery("select * FROM actor");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    public static void displayFilmById (int id){
        Connection connection = DBConnection.dbConnect();
        try {
            Statement statement = connection.createStatement();            //to send SQL query to database
            String sqlQuery = "select * from film where film_id = " + id;
            ResultSet resultSet = statement.executeQuery(sqlQuery);        // storing the result of query
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int count = resultSetMetaData.getColumnCount();
            if (resultSet.next()) {
                for (int i = 1; i <= count; i++) {
                    System.out.println(resultSetMetaData.getColumnName(i) + " : " + resultSet.getString(i));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void displayFilmByReleaseYear (int release_year, int film_id){
        Connection connection = DBConnection.dbConnect();
        try {
//            when we have a parameterised query we can use PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement("select * from film where release_year=??" );  //where ?? depends upon number of parameters passed to query
            preparedStatement.setInt(1,release_year);    //1 goes for first question mark and so on
            ResultSet resultSet = preparedStatement.executeQuery();
//            Statement statement = connection.createStatement();
//            String sqlQuery = "select * from film where release_year = " + release_year;
//            ResultSet resultSet = statement.executeQuery(sqlQuery);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int count = resultSetMetaData.getColumnCount();
            while (resultSet.next()) {
                if (resultSet.next()) {
                    for (int i = 1; i <= count; i++) {
                        System.out.println(resultSetMetaData.getColumnName(i) + " : " + resultSet.getString(i)+" ");
                    }
                    System.out.println();
                }
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
