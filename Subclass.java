class Subclass extends Superclass {
    public void display() {
        System.out.println("Private Variable before modification " + getPrivateVar());
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
        
        obj.setPrivateVar(20); 
        System.out.println("Private Variable after modification: " + obj.getPrivateVar());
    }
}


