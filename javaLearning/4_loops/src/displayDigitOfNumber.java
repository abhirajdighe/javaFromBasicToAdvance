import java.util.Scanner;

public class displayDigitOfNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        while(num != 0){
            int d = num%10;
            System.out.println(d);;
            num = num /10;
        }
    }
}
