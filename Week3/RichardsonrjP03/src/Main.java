
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return 0.0;
    }

    public void display() {
        System.out.println("This is a " + color + " shape.");
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("This is a " + getColor() + " circle with radius " + radius);
    }
}

// Child class 2
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void display() {
        System.out.println("This is a " + getColor() + " rectangle with width " + width + " and height " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle("Red", 5.0);
        Rectangle myRectangle = new Rectangle("Blue", 4.0, 6.0);

        myCircle.display();
        System.out.println("Area of the circle: " + myCircle.calculateArea());

        myRectangle.display();
        System.out.println("Area of the rectangle: " + myRectangle.calculateArea());
    }
}