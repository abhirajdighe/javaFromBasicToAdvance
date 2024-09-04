import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        String stringNumber = "";
        while(num!=0){
            stringNumber += num%10;
            num /= 10;
        }
        int i =0;
        int j = stringNumber.length()-1;

        boolean isPalindrome = true;
        while(i<=j){
            if(stringNumber.charAt(i) != stringNumber.charAt(j)){
                isPalindrome = false;
            }
            i++;
            j--;
        }

        if(isPalindrome){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
