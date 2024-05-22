package ExamplesIO.FileAnatomy;
import java.io.*;
import java.util.*;

public class Student {
    private String name;
    private double marks;

    public Student(String name, double marks) {
//        here this refers to the instant variable names so that they can be differentiated from constructor parameters
        this.name = name;
        this.marks = marks;
    }
//    getter methods provides access to private var name and marks
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }

//    Overrides the toString() method from the Object class to provide a custom string representation of a Student object.
    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }
    public static void writeStudentToFile(Student student, String filePath) {
        try (BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedwriter.write(student.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name= s.nextLine();
        System.out.print("Enter marks : ");
        int marks= s.nextInt();
        Student student = new Student(name, marks);
        writeStudentToFile(student,"studentData.txt");
    }
}
