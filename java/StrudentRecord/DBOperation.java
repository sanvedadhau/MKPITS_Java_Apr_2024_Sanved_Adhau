package StrudentRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBOperation {
//    insert data
    public static void insertStudentRecord(String rollNo,String name, String address, String city){
        Connection connection = DBConnection.dbConnect();
//        int rv = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into studentdetails Values(?, ?, ?, ?) ");
            preparedStatement.setString(1,rollNo);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);
            preparedStatement.setString(4,city);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        return rv;
    }

//    insertion using OOPS concept
public static void insertStudentRecordOOPS(StudentBulk student){
    Connection connection = DBConnection.dbConnect();
    try {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into studentdetails Values(?, ?, ?, ?) ");
        preparedStatement.setString(1, student.getRollNo());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getAddress());
        preparedStatement.setString(4, student.getCity());
        preparedStatement.executeUpdate();

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}


//    update data
    public static void UpdatedStudentDetails(String rollNo, String name, String address, String city) {
        Connection connection = DBConnection.dbConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update studentdetails set name=?, address=?,city=? where rollno=?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, city);
            preparedStatement.setString(4, rollNo);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//        delete record
        public static void DeleteRecord(String rollNo){
            Connection connection = DBConnection.dbConnect();
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("DELETE FROM studentdetails WHERE RollNo =?");
                preparedStatement.setString(1,rollNo);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
//        MySQL is in by default safe update mode delete won't work in direct MySQL go to edit/preference/SQL Editor/last option safe mode
    }

