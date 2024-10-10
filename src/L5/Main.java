package L5;

public class Main {
    public static void main(String[] args) {
        String str5 = "1" + 2 + 3;
        str5 += "4" + 5 + 6;
        System.out.println("str5 = " + str5);

        String str6 = "";
        str6 += 1;
        str6 += 2;
        str6 += 3 + 4 + 5;
        System.out.println("str6 = " + str6);

        int five = 5;
        int six = 6;
        String s = "7";
        s += 8;
        System.out.println(five + six + s);

        String t = "2";
        int f = 4;
        int x = 7;
        x += 5;
        System.out.println(t + f + x);
    }
}
