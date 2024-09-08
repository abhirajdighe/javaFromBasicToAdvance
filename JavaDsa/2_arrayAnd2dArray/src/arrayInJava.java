import java.util.Scanner;

public class arrayInJava {
    public static void main(String[] args){
//        1d array / Normal array
        int[] arr={1,2,3};
        for(int i =0;i<3;i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();
        int[] brr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i =0;i<n;i++){
            brr[i] = scan.nextInt();
        }
        System.out.println("Printing elements of the array: ");
        for(int i =0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println(" ");

//        2d array
        int[][] array = new int[3][3];
        System.out.println("Enter elements in 2d array: ");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Printing the elements");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
