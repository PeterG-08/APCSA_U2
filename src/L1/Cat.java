package L1;

public class Cat
{
    /* Below are the Cat class "instance variables" (or "fields");
        these are the attributes (data) saved in each Cat object
    */
    private String color;
    private String name;
    private int age;
    private boolean isSleeping;

    private final int COLOR_CHANGE_AGE = 10;

    /* Below is the Cat class "constructor" method;
        this special method creates Cat objects
    */
    public Cat(String catColor, String catName, int catAge, boolean sleeping)
    {
        color = catColor;
        name = catName;
        age = catAge;
        isSleeping = sleeping;
    }


   /* Below are the Cat class "instance methods": these are the "behaviors"
       that a Cat object can "do" (or have done to it)
   */

    /**
     * Changes the cat, so it represents this same cat in after the passed in years.
     */
    public void inYears(int years) {
        age += years;

        if (age > COLOR_CHANGE_AGE) {
            color = "black";
        }
    }


    // This "method" puts the cat to sleep by setting isSleeping to true
    public void goToSleep()
    {
        isSleeping = true;
    }


    // This method Wakes the cat up  by setting isSleeping to false
    public void wakeUp()
    {
        isSleeping = false;
    }


    // This method prints info about the cat!
    public void printCatInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);


        if (isSleeping)
        {
            System.out.println(name + " is sleeping... shh!");
        }
        else
        {
            System.out.println(name + " is awake! Time to play!");
        }


        // print an extra blank line at the end
        System.out.println();
    }

    @Override
    protected Cat clone() {
        return new Cat(color, name, age, isSleeping);
    }
}

