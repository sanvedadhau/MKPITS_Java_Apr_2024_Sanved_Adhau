package ExamplesIO.FileToFile;
import java.io.*;

    public class FileToFile {
        public static void main(String[] args) throws IOException {
            String sourceFilePath = "sanvedLoop.txt";
            String destinationFilePath = "sanvedCopy.txt";

            File file = new File(sourceFilePath);
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFilePath));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFilePath, true))) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();  // Ensure each line in the source file is separated by a new line in the destination file
//                    bufferedWriter.close();
                }

            } catch (FileNotFoundException e) {
                System.err.println(e);
            }
        }
    }
