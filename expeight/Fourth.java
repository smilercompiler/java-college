import java.io.*;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text file name: ");
        String fileName = scanner.nextLine();
        
        File file = new File(fileName);
        
        if (!file.exists()) {
            System.out.println("Error: File not found.");
            return;
          
        }
        
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            
            int charCount = 0;
            int wordCount = 0;
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                // Count non-whitespace characters
                charCount += line.replaceAll("\\s", "").length();
                
                // Count words (split by whitespace)
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
