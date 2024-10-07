package L3;

public class SlopeCalculator
{
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 5;

        SlopeCalculator calc = new SlopeCalculator();
        int x2 = calc.square(x1);
        int y2 = calc.square(y1);

        double slope = calc.slope(x1, y1, x2, y2);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
        System.out.println("y1 = " + y1 + ", y2 = " + y2);
        System.out.println("slope = " + slope);
    }

    /* this class contains no instance variables or constructors */

    public int sum(int x, int y)
    {
        return x + y;
    }

    public int difference(int x, int y)
    {
        return y - x;
    }

    public double slope(int x1, int y1, int x2, int y2)
    {
        int rise = difference(y1, y2);
        int run = difference(x1, x2);
        double slope = (double) rise / run;
        return slope;
    }

    public int square(int value)
    {
        value *= value;
        return value;
    }
}
