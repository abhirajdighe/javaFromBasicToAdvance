import java.util.Scanner;

public class wrapperClassPartTwo {
    public static void main(String[] args) {
//        int m1 = 15;
//        Integer m2 = m1;
//        Integer m3 = 15;
//
//        System.out.println(m2.equals(m1));
//        System.out.println(m3.equals(m1));

        int m1 = 15;

        Integer m2 = Integer.valueOf("123");
        Integer m3 = Integer.valueOf("1010",2);
        Integer m4 = Integer.valueOf("A7",16);

        System.out.println(m4);

        String str = "123";
        System.out.println(Integer.parseInt(str));

        System.out.println(Integer.toBinaryString(6 ));

        // Binary to Integer-

//        Scanner scan = new Scanner(System.in);
//
//        String str = scan.nextLine();
//
//        Integer b = Integer.valueOf(str,2);
//
//        System.out.println(b);


    }
}
