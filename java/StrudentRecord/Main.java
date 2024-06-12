package StrudentRecord;

public class Main {
    public static void main(String[] args) {
//        insert data
//        DBOperation.insertStudentRecord("1005","Sanved","Tapovan","AMT");

//        Insertion using OOPS concept
        StudentBulk studentBulk =new StudentBulk("1005","Shaktiman","Earth","AMT");
        DBOperation.insertStudentRecordOOPS(studentBulk);

//        update data
//        DBOperation.UpdatedStudentDetails("1005","sagar","SGBAU","NGP");

//        delete record
//        DBOperation.DeleteRecord("1005");
    }
}
