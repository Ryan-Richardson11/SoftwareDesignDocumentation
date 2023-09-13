/**
 * Shape class, contains methods for a shapes color and area.
 */
class Shape {
    private String color;

    /**
     * Constructor method for the shape class.
     * @param color An inputted shape color.
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * setColor method, sets the shape color.
     * @param color An inputted shape color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getColor method, returns the shape color.
     */
    public String getColor() {
        return color;
    }
    /**
     * calculateArea method, returns the shapes area.
     */
    public double calculateArea() {
        return 0.0;
    }

    /**
     * display method, prints the the shapes color information.
     */
    public void display() {
        System.out.println("This is a " + color + " shape.");
    }
}

/**
 * Circle class, extends Shape class and contains methods for color and area.
 */
class Circle extends Shape {
    private double radius;

    /**
     * Constructor method for the cirlce class.
     * Inherits color attribute from Shape class.
     * @param color An inputed shape color.
     * @param radius and inputed circle radius.
     */
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    /**
     * calculateArea method, returns the area of the cirle.
     * Overrides the Shape class method.
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    /**
     * display method, prints the the cicles color and area information.
     * Overrides the Shape class method.
     */
    @Override
    public void display() {
        System.out.println("This is a " + getColor() + " circle with radius " + radius);
    }
}

/**
 * Rectangle class, extends Shape class and contains methods for color and area.
 */
class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Constructor method for the Rectangle class.
     * Inherits color attribute from Shape class.
     * @param width An inputed rectangle width.
     * @param height and inputed rectangle height.
     */
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     * calculateArea method, returns the area of the rectangle.
     * Overrides the Shape class method.
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * display method, prints the the rectangles color and area information.
     * Overrides the Shape class method.
     */
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
