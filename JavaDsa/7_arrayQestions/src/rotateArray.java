public class rotateArray {

    public static void solve(int arr[] ,int k){
        int n = arr.length;
        while(k>=0){
            int ele = arr[0];
            for(int i = 1;i<arr.length;i++){
                arr[i-1] = arr[i];
            }

            arr[n-1] = ele;
            k--;
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int k =2;

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        solve(arr,k);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
