import java.util.Scanner;

public class pivoteElement {
    public static int solve(int arr[],int n){
        int s =0;
        int e = n-1;
        int mid = s+(e-s)/2;
        int ans = arr[0];
        while(s<=e){
            if(arr[mid]<arr[0]){
                ans = arr[mid-1];
                s=mid;
            }

            if(arr[mid]>arr[0]){
                s= mid;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }

        return ans;
    }
    public static void main(String[] args){
        int n =5;
//        int arr[8]={9,8,7,6,1,2,3,4};
        int arr[] = new int[n];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter element in array:");
        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.printf("Pivote Element is: %d \n",solve(arr,8));
    }
}
