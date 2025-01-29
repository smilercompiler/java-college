import java.util.Scanner;
public class Stringreverse {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter a string: ");
            String s = scanner.nextLine();
    
            String reversedString = reverseWords(s);
    
            System.out.println("Reversed string: " + reversedString);
            
            scanner.close();
        }
    
        public static String reverseWords(String s) {
            String[] words = s.split(" ");
            
            String reversed = "";
    
            for (int i = words.length - 1; i >= 0; i--) {
                reversed += words[i]; 
                if (i > 0) {
                    reversed += " "; 
                }
            }
            
            return reversed;
        }
    }
    