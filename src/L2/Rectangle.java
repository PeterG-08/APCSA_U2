package L2;

public class Rectangle
{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(150, 200);
        Rectangle r2 = new Rectangle(100);
        Rectangle r3 = new Rectangle();

        r1.setWidth(150);
        r2.setWidth(150);

        r3.setWidth(150);
        r3.setLength(150);

        int totalFencing = r1.calculatePerimeter() + r2.calculatePerimeter() + r3.calculatePerimeter();
        int totalGrass = r1.calculateArea() + r2.calculateArea() + r3.calculateArea();

        System.out.println("Total fencing needed: " + totalFencing);
        System.out.println("Total grass needed: " + totalGrass);
    }

    /* Below are the Rectangle class "instance variables" (or "fields");
        these are the attributes (data) saved in each Rectangle object
    */
    private int length;
    private int width;


   /* Below are the Rectangle class "constructor" methods;
       this class has THREE constructors! (we will learn later about
       why this might be useful).  Each of these creates a Rectangle object.
   */


    // This is the constructor to create a Rectangle object with a particular width and length
    public Rectangle(int rectLength, int rectWidth)
    {
        length = rectLength;
        width = rectWidth;
    }


    //This is the constructor to create a Rectangle object with equal width and length (a square)
    public Rectangle(int side)
    {
        length = side;
        width = side;
    }


    // This is the "no-argument constructor" which creates a Rectangle object with default values
    public Rectangle()
    {
        length = 100;
        width = 50;
    }


   /* Below are the Rectangle class "instance methods": these are the "behaviors"
       that a Rectangle object can "do" (or have done to it). Some of these methods
       return a value (the type of the return value is listed to the right of "public"),
       while others don't (those that don't have "void" as the return type).
       Some of these methods have parameters -- something inside the () -- while others don't!
   */


    // Returns the length of the Rectangle (a "getter" method)
    public int getLength()
    {
        return length;
    }


    // Sets the length of the Rectangle to newLength ("setter" method)
    public void setLength(int newLength)
    {
        length = newLength;
    }


    // Returns the width of the Rectangle ("getter" method)
    public int getWidth()
    {
        return width;
    }


    // Sets the width of the Rectangle to newWidth ("setter" method)
    public void setWidth(int newWidth)
    {
        width = newWidth;
    }


    /**
     * Calculates the perimeter of the rectangle.
     */
    public int calculatePerimeter() {
        return width * 2 + length * 2;
    }

    // Calculates and returns the area of the Rectangle
    public int calculateArea()
    {
        int area = width * length;
        return area;
    }


    // Prints the Rectangle's dimensions
    public void printRectangleInfo()
    {
        System.out.println("This rectangle's length is " + length + " and width is " + width + ".");
        System.out.println("It has an area of " + calculateArea());
    }
}
