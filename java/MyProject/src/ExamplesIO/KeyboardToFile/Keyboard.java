package ExamplesIO.KeyboardToFile;
import java.io.*;

//taking input from keyboard and storing it in file

public class Keyboard {
    public static void main(String[] args) {
//        reading from the keyboard
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        we take input in buffer because it's faster and it can store input temporarily  like youtube buffering videos
//        we used System.in because we used standard ip device
        System.out.println("Enter your name : ");
        try {
            String name = bufferedReader.readLine();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sanved.txt"))) {
//            this will create the file named sanved.txt and write input in that file is stored in the root folder of the current project
//            path of file -> C:\Users\sanve\IdeaProjects\MyProject
//            BufferedWriter = new BufferedWriter(new FileWriter("sanved.txt" ,true)); // add text in existing file
                bufferedWriter.write(name + "\nsanved"+" ");
//            this methode will override if the program is run multiple time
                bufferedWriter.close();
            } //override the input
//            .close() is used for closing the input stream
//            can we do it in finally block - by making object of buffer writer outside the try block
        } catch (IOException e) {
            System.out.println(e);
//            throw new RuntimeException(e);
        }
    }
}
