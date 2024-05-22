package ExamplesIO.EncryptionDecryption;

import java.io.*;

public class Receiver {
    public static void asciiToText(String inputFileName, String outputFileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            FileWriter writer = new FileWriter(outputFileName);

            String line;
            while ((line = reader.readLine()) != null) {
                String[] asciiValues = line.split(" ");
                for (String asciiValue : asciiValues) {
                    int intValue = Integer.parseInt(asciiValue);
                    char character = (char) intValue;
                    writer.write(character);
                }
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFileName = "asciiFile.txt";
        String outputFileName = "ReceivedFile.txt";
        asciiToText(inputFileName, outputFileName);
    }
}