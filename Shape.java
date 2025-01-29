import java.util.Scanner;

class Shape {

    
    public double area(double length, double width) {
        return length * width;
    }

    
    public double areaForSquare(double side) {
        return side * side;
    }

    
    public double areaForCircle(double radius) {
        return Math.PI * radius * radius;
    }

   
    public double areaForTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.print("Enter the shape (Rectangle/Square/Circle/Triangle): ");
        String shapeType = sc.nextLine().toLowerCase();

        if (shapeType.equals("rectangle")) {
            System.out.print("Enter length of rectangle: ");
            double length = sc.nextDouble();
            System.out.print("Enter width of rectangle: ");
            double width = sc.nextDouble();
            double rectangleArea = shape.area(length, width);
            System.out.println("Area of Rectangle: " + rectangleArea);
        } 
        else if (shapeType.equals("square")) {
            System.out.print("Enter side length of square: ");
            double side = sc.nextDouble();
            double squareArea = shape.areaForSquare(side);
            System.out.println("Area of Square: " + squareArea);
        } 
        else if (shapeType.equals("circle")) {
            System.out.print("Enter radius of circle: ");
            double radius = sc.nextDouble();
            double circleArea = shape.areaForCircle(radius);
            System.out.println("Area of Circle: " + circleArea);
        } 
        else if (shapeType.equals("triangle")) {
            System.out.print("Enter base of triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter height of triangle: ");
            double height = sc.nextDouble();
            double triangleArea = shape.areaForTriangle(base, height);
            System.out.println("Area of Triangle: " + triangleArea);
        } 
        else {
            System.out.println("Invalid shape entered!");
        }

        sc.close();
    }
}
