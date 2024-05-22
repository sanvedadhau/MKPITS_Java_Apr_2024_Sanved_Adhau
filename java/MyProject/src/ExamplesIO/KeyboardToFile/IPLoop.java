package ExamplesIO.KeyboardToFile;
import java.io.*;
import java.time.LocalDateTime;    //for adding time and date
import java.time.format.DateTimeFormatter;       //for adding time and date

// taking inputs from keyboard and storing in file until user press key other than 1

public class IPLoop {
    public static void main(String[] args) {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter;
        try {
            String name,choice;
            bufferedWriter = new BufferedWriter(new FileWriter("sanvedLoop.txt",true));
            do{
                System.out.print("Enter name : ");
                name = bufferedReader.readLine();
                bufferedWriter.write(name+" ");
                System.out.print("Do you want to add another name (1/0) : ");
                choice = bufferedReader.readLine();
            }
//            while(choice.equalsIgnoreCase("1"));
            while ("1".equals(choice));
            bufferedWriter.write("\n"+"Updated on : ");
            // Add current date and time
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);
            bufferedWriter.write("Current Time: " + formattedDateTime + "\n");

            bufferedWriter.write("\n"+"-------------------"+"\n");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
