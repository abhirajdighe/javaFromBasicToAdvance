import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        int arr[] = {12,13,15,17,19};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element: ");
        int k = scan.nextInt();

        int s = 0;
        int e = arr.length - 1;
        int mid = s+(e-s)/2;

        boolean flag = false;

        while(s<=e){
            if(mid == k){
                flag = true;
            }

            if(k> mid){
                s = mid;
            }
            else{
                e = mid-1;
            }
        }

        if(flag){
            System.out.println("Element is Present");
        }
        else{
            System.out.println("Element is Absent");
        }
    }
}
