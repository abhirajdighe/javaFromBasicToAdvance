import java.util.Scanner;

public class factorialOfNumber
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        int factorial =1;
        for(int i =1;i<=num;i++){
            factorial *=i;
        }
        System.out.printf("Factorial of number %2$d is %1$d",factorial,num);
    }
}
