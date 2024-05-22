package ExamplesIO.FileAnatomy;

import java.io.*;
import java.util.*;
//import java.time.LocalDateTime;    //for adding time and date
//import java.time.format.DateTimeFormatter;

/*
Serialization in Java is the process of converting an object's state into a byte stream so that it can be saved to a file,
sent over a network, or stored in a database.
 */

public class StudentLoop implements Serializable {
    private String name;
    private int marks;

    public StudentLoop(String name, int marks) {
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

    public static void writeStudentsToFile(ArrayList<Student1> students, String filePath) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(students);
            System.out.println("Data written to the file.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void readStudentsFromFile(String filePath) {
        ArrayList<Student1> students;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            students = (ArrayList<Student1>) objectInputStream.readObject();
            System.out.println("\nData reading from the file: ");
            for (Student1 student : students) {
                System.out.println(student);
                student.showResult();
                objectInputStream.close();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void showResult() {
        if (marks > 35)
            System.out.println("Result : Pass");
        else
            System.out.println("Result : Fail");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student1> students = new ArrayList<>();

        while (true) {
            System.out.print("Enter name (or press 0 to stop): ");
            String name = scanner.nextLine();
            if (name.equals("0")) {
                break;
            }
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            students.add(new Student1(name, marks));
//            Add current date and time
//            LocalDateTime now = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//            String formattedDateTime = now.format(formatter);
//            System.out.println("Update Time: " + formattedDateTime + "\n");
        }


        writeStudentsToFile(students, "studentData.txt");
        readStudentsFromFile("studentData.txt");
    }
}

