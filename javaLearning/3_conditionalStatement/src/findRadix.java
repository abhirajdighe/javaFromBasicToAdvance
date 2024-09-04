import java.util.Scanner;

public class findRadix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");

        String str = scan.nextLine();

        if(str.matches("[01]+")){
            System.out.println("String is binary and radix is 2");
        }
        else if(str.matches("[0-7]+")){
            System.out.println("String is octal and radix is 8");
        }
        else if(str.matches("[0-9]+")){
            System.out.println("String is decimal and radix is 10");
        }
        else if(str.matches("[0-9A-F]+")){
            System.out.println("String is hexa-decimal and radix is 16");
        }
        else{
            System.out.println("Its not a number");
        }

    }
}
