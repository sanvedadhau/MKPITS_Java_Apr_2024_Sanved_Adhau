package ExamplesIO.FileAnatomy;
import java.io.*;

// write a code for taking input through object and then writing on a file

/*
Serialization in Java is the process of converting an object's state into a byte stream so that it can be saved to a file,
sent over a network, or stored in a database.
 */
public class Student1 implements Serializable {
    private String name;
    private int marks;

    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return "\n" + name + "\n" + marks;
        }

        public static void writeStudentToFile(Student1 student, String filePath) {
            // to write object to file
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
                objectOutputStream.writeObject(student);
                System.out.println("Data written to the file.");
            } catch (Exception e) {
                System.err.println(e);
            }
        }

        public static void readStudentFromFile(String filePath) {
            Student1 student;
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
                student = (Student1) objectInputStream.readObject();
                System.out.println("\nData reading from the file: " + student);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        public void showResult(){
            if(marks>35)
                System.out.println("Pass");
            else
                System.out.println("Fail");
        }

        public static void main(String[] args) {
            Student1 student = new Student1("Sanved", 17);
            writeStudentToFile(student, "studentData.txt");
            readStudentFromFile("studentData.txt");
            student.showResult();
        }
    }

