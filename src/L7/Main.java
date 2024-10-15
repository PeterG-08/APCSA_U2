package L7;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello John!";
        String str2 = "My name is Jack.";
        String str3 = "Hello";
        String str4 = "Hello Jack";
        String str5 = "My name is jack.";
        String str6 = "Hello";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareTo(str3));
        System.out.println(str3.compareTo(str6));
        System.out.println(str2.compareTo(str5));
        System.out.println(str2.equals(str5));
    }
}
