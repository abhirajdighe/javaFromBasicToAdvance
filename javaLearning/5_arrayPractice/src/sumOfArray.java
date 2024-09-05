public class sumOfArray {
    public static void main(String[] args){
        int arr[] = {1,3,4,6,7};
        int sum =0;

        for (int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.printf("Sum of arr is %d", sum);
    }
}
