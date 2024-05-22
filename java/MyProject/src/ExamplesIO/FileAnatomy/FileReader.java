package ExamplesIO.FileAnatomy;

import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "sanvedCopy.txt";

        // Create a File object
        File file = new File(filePath);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        // Variables to count lines, characters, and words
        int lineCount = 0;
        int charCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++; // Increment line count for each line read

                charCount += line.length(); // Add the length of each line to character count

                // Split the line into words by whitespace
                String[] words;
                words = line.split("\\s+");
                wordCount = wordCount + words.length; // Add the number of words in the line to word count
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Output the results
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
    }
}


