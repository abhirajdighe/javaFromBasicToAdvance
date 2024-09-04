import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        String reversedNumber = "";
        int reverseNum =0;
        while(num != 0){
            reverseNum= reverseNum * 10 + num %10;
            reversedNumber += num%10;
            num = num /10;
        }
        System.out.println("Reversed Number in String: "+reversedNumber);
        System.out.println("Reversed Number in Integer: "+reverseNum);
    }
}
