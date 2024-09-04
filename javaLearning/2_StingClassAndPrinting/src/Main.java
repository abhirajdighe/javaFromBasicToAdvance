//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str1 = "Java Program";
        String str2 = new String("ABHI");
        System.out.println(str2);

        char[] c = {'a','b','c','d','e'};
        String str3 = new String(c,1,3);
        System.out.println(str3);

        byte[] b = {1,2,3,4,5,6};
        String str4 = new String(b,1,3);
        System.out.println(str4);

        String str5 = "Java";
        String str6 = "Java";

        System.out.println(str5 == str6);

        String str7 = "Java";
        String str8 = new String("Java");
        System.out.println(str7==str8);
        System.out.println(str7.compareTo(str8));



    }
}