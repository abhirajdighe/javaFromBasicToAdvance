public class moveZeros {
    public static void solve(int arr[]){
        int n = arr.length;
        int insertPos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[insertPos++] = arr[i];
            }
        }

        while (insertPos < n) {
            arr[insertPos++] = 0;
        }

        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5,0, 12};
        solve(arr);

    }
}
