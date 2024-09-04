import java.util.Scanner;
import  java.lang.Math;

public class rootsOfQuadraticEquation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Space seperated numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double ansOfSqrt= Math.sqrt((b*b) - 4*a*c);

        double root1 = (-b + (ansOfSqrt))/2*a;
        double root2 = (-b - (ansOfSqrt))/2*a;
        System.out.println("First Root: " + root1);
        System.out.println("Second Root: "+ root2);
    }
}
