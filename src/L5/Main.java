package L5;

public class Main {
    public static void main(String[] args) {
        String str1 = "A" + 1 + "B" + 2;
        String str2 = 1 + "A" + 2 + "B";
        String str3 = "A" + "B" + 1 + 2;
        String str4 = "A" + 1 + 2 + "B";
        String str5 = 1 + 2 + "A" + "B";
        String str6 = "A" + 1 + 2 + 3;
        String str7 = 1 + 2 + 3 + "A";
        String str8 = "1" + 2 + 3 + 4;
        String str9 = 1 + 2 + 3 + "4";
        String str10 = 3.5 + 2 + 3 + "4";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        System.out.println("str5 = " + str5);
        System.out.println("str6 = " + str6);
        System.out.println("str7 = " + str7);
        System.out.println("str8 = " + str8);
        System.out.println("str9 = " + str9);
        System.out.println("str10 = " + str10);
    }
}
