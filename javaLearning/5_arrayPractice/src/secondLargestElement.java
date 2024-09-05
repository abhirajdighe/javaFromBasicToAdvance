import java.lang.Integer;

public class secondLargestElement {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,9,8,6};

        int maxi = arr[0];
        for(int x:arr){
            if(maxi < x){
                maxi = x;
            }
        }
        System.out.printf("Greatest element in the array is: %d \n",maxi);

        int secondMaxi= Integer.MIN_VALUE;

        for(int x:arr){
            if(secondMaxi<x && x != maxi){
                secondMaxi = x;
            }
        }

        System.out.printf("Second Largest Element is : %d \n", secondMaxi);
    }
}
