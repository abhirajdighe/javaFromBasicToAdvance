import java.util.Scanner;

class Circle{
    public double radius;
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }
}

public class writingClasses {
    public static void main(String[] args){
        Circle cir = new Circle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        cir.radius= scan.nextInt();
        System.out.printf("Area of circle is: %f\n",cir.area());

    }
}
