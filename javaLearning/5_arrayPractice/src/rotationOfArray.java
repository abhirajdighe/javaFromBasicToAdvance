import java.util.Scanner;

public class rotationOfArray {
    public static void main(String[] args){
        // right Rotation:
        int [] arr={1,2,3,4,5};


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of time array to be rotated");
        int t =1;
        int n = scan.nextInt();
        while(n!=0){
            int elementToBeRotated =arr[arr.length-1];
            for(int i = arr.length-1;i>=1;i--){
                arr[i] = arr[i-1];
            }
            arr[0]=elementToBeRotated;

            System.out.printf("Time %d \n",t++);
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println(" ");
            n--;
        }


    }
}
