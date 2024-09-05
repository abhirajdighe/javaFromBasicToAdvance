public class maximumElement {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,9,8,6};

        int maxi = arr[0];
        for(int x:arr){
            if(maxi < x){
                maxi = x;
            }
        }
        System.out.printf("Greatest element in the array is: %d",maxi);
    }
}
