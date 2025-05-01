public class Outer {
    private int data = 50;
    void display()
    {
        class Inner {
            void show() {
                System.out.println("Member Inner Class: " + data);
            }
    }
    Inner inner = new Inner();
    inner.show();
    
    }
}

