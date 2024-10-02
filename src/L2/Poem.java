package L2;

public class Poem
{
    public static void main(String[] args) {
        Poem poem = new Poem("Adrian");
        poem.printPoem();
    }

    private String name;

    public Poem(String yourName)
    {
        name = yourName;
    }

    // this method prints the entire poem
    public void printPoem()
    {
        printFirstLine();
        printRemainingPoem();
    }

    public void printFirstLine() {
        System.out.println("Hello " + name + " !");
    }

    public void printRemainingPoem() {
        System.out.println(
            "I have a poem for you\n" +
            "Roses are red\n" +
            "Violets are blue\n" +
            "AP CSA is awesome!\n" +
            "And that's the end - see you!\n"
        );
    }
}

