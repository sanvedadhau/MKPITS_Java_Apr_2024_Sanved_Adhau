package ExamplesIO.EncryptionDecryption;

//import java.io.*;
//
//public class Sender {
//    public static void main(String[] args) {
//        BufferedReader bufferedReader = null;
//        try {
//            bufferedReader = new BufferedReader(new FileReader("sanved.txt"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            String str = bufferedReader.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}

import java.io.*;

public class Sender {
    public static void textToAscii(String inputFileName, String outputFileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            FileWriter writer = new FileWriter(outputFileName);

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(Integer.toString(character));
                writer.write(" ");
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFileName = "sanved.txt";
        String outputFileName = "asciiFile.txt";
        textToAscii(inputFileName, outputFileName);
    }
}