package firstProject;

public class Area implements Shape {

    @Override
    public void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    public void CircleArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Main method
    public static void main(String[] args) {
    	System.out.println("Made By Muhammad Kaif Shamim!");
        Area a = new Area();
        a.RectangleArea(10, 5);
        a.SquareArea(4);
        a.CircleArea(3);
    }
}
