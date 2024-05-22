package ExamplesIO;
import java.io.*;

public class FileIP {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\sanve\\IdeaProjects\\MyProject\\src\\ExamplesIO","abc.txt");
        File f1 =new File("C:\\Users\\sanve\\IdeaProjects\\MyProject\\src\\ExamplesIO","mnop.txt");
        File f2 = new File ("C:\\Users\\sanve\\IdeaProjects\\MyProject\\src\\ExamplesIO\\xyz.txt");
        System.out.println(f2.delete());
//        deletes file
        System.out.println(f.exists());
        System.out.println(f1.exists());
        System.out.println(f.canWrite());
        System.out.println(f.length());
        System.out.println(f.getFreeSpace());
        System.out.println(f.getUsableSpace());
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(f2.getAbsolutePath());
    }
}
