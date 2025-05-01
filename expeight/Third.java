    import java.io.FileReader;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    
    public class Third {
        public static void main(String[] args) {
            try (FileReader reader = new FileReader("student.txt")) {
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: student.txt not found.");
            } catch (IOException e) {
                System.out.println("Error: Unable to read the file.");
            }
        }
    }
    

