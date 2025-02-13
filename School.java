// Superclass with a private member
class School {
  private String marks = "These are private marks" ;
  
  public String PrivateMarks() {
      return marks;
  }
}


class Subclass extends School {
  public void displayMessage() {
      
      System.out.println(PrivateMarks());
      
      
  }
}

// Main class to demonstrate the concept
public class Main {
  public static void main(String[] args) {
      School school = new School()
      school.displayMessage();
  }
}
