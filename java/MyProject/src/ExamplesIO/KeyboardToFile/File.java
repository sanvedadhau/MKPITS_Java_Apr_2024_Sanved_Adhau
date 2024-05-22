package ExamplesIO.KeyboardToFile;
import java.io.*;
import java.io.BufferedReader;

// reading from file and showing to screen

public class  File {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("sanvedLoop.txt"));
        String str = bufferedReader.readLine();
        while (str != null) {
            System.out.println(str);
            str = bufferedReader.readLine();
        }
    }
}
