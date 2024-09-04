import java.util.Scanner;

public class cuboidArea {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, breath and height");

        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        double area = 2*(l*b*h);
        int volume = l*b*h;

        System.out.println("Area of Cuboid is: " + area);
        System.out.println("Volume of Cuboid is: " + volume);
    }

}
