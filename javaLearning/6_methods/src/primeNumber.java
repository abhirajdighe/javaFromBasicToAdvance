import java.util.Scanner;

public class primeNumber {
    boolean isPrimeNumber(int n){
        if(n <=3){
            return true;
        }

        for(int i =2;i<n;i++){
            if(i%n!= 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();

        primeNumber ip = new primeNumber();

        if (ip.isPrimeNumber(n)){
            System.out.println("Number is prime number");
        }
        else{
            System.out.println("Number is not prime number");
        }
    }
}
