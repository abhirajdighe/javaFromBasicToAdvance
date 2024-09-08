import java.util.Scanner;

public class binarySearch {

    boolean binarySearchInArray(int arr[],int k){
        int s = 0;
        int e = arr.length-1;
        int mid= s+(e-s)/2;

        while(s<=e){

            if(arr[mid] == k){
                return true;
            }
            else if(k>arr[mid]){
                s= mid+1;
            }
            else{
                e = mid-1;
            }

            mid= s+(e-s)/2;

        }
        return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i =0;i<n;i++){
            arr[i]= scan.nextInt();
        }

        System.out.println("Enter elements to search: ");
        int k = scan.nextInt();

        binarySearch bs = new binarySearch();

        if(bs.binarySearchInArray(arr,k)){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is absent");
        }
    }
}
