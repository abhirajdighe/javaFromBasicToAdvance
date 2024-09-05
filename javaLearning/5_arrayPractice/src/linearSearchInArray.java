import java.util.Scanner;

public class linearSearchInArray {
    public static void main(String[] args){
        int arr[] = {1,3,5,6,8};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int k = scan.nextInt();

        boolean flag = false;
        for(int x:arr){
            if(x==k){
                flag= true;
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
