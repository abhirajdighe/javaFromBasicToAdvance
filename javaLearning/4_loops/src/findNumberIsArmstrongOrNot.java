import java.util.Scanner;

public class findNumberIsArmstrongOrNot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        int checkNum = num;
        int sum = 0;

        while(checkNum!= 0){
            int d = checkNum %10;
            double cube = Math.pow(d,3);
            sum += cube;
            checkNum /= 10;
        }

        if(sum == num ){
            System.out.println("Number is armstrong number");
        }
        else{
            System.out.println("Number is not armstrong number");
        }
    }
}
