package L3;

public class Box
{

    public static void main(String[] args) {
        double length, width, height;

        length = 5.0; // 5
        width = 10.0; // 10
        height = length; // 5

        Box box1 = new Box(length, width, height);
        Box box2 = new Box(length); // 5, 5, 5
        box1.printDimensions();
        box2.printDimensions();

        String bigger;

        if (box1.volume() > box2.volume())
        {
            bigger = "box1 has greater volume";
        }
        else if (box1.volume() < box2.volume())
        {
            bigger = "box2 has greater volume";
        }
        else
        {
            bigger = "both boxes have equal volume";
        }

        System.out.println(bigger);

        boolean box1sides = box1.anySideLongerThan(length);
        boolean box2sides = box2.anySideLongerThan(length);

        System.out.println("box1 has a side that exceeds " + length + ": " + box1sides);
        System.out.println("box2 has a side that exceeds " + length + ": " + box2sides);
    }

    private double length;
    private double width;
    private double height;

    public Box(double l, double w, double h)
    {
        length = l;
        width = w;
        height = h;
    }

    public Box(double s)
    {
        length = s;
        width = s;
        height = s;
    }

    public double volume()
    {
        return length * width * height;
    }

    public boolean anySideLongerThan(double side)
    {
        if (length > side || width > side || height > side)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printDimensions()
    {
        System.out.println("L = " + length + ", W = " + width + ", H = " + height);
    }
}

