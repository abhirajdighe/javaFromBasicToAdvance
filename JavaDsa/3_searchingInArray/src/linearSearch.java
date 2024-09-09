import java.util.Scanner;

public class linearSearch {
    boolean linearSearchInArray(int arr[],int k){
        for(int x:arr){
            if(x == k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array: ");
        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int k = scan.nextInt();

        linearSearch ls = new linearSearch();

        if(ls.linearSearchInArray(arr,k)){
            System.out.println("Element is Present");
        }
        else{
            System.out.println("Element is Absenet");
        }

    }
}
