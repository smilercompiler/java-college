/*class Subclass extends Superclass {
    public void display() {
        System.out.println("Private Variable before modification " + getPrivateVar());
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
        
        obj.setPrivateVar(20); 
        System.out.println("Private Variable after modification: " + obj.getPrivateVar());
    }
}*/
class Subclass extends Superclass {
    public void display() {
        // Trying to access privateVar directly will cause a compilation error
        // System.out.println("Private Variable: " + privateVar); // Not allowed

        // Accessing privateVar using a public method
        System.out.println("Private Variable via getter: " + getPrivateVar());
    }
}


