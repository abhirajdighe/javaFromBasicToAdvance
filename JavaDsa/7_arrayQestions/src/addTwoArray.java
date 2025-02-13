import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class addTwoArray {
    public static void solve(int arr[],int brr[], int n,int m){
        int i = n-1;
        int j = m-1;
        int carry =0;

        ArrayList<Integer> ans = new ArrayList<Integer>();

        while(i>=0 && j>=0){
            int val1= arr[i];
            int val2 = brr[j];

            int sum = val1+val2+carry;

            carry = sum/10;
            sum = sum%10;

            ans.add(sum);
            i--;
            j--;
        }

        while (i>=0){
            int sum = carry + arr[i];

            carry = sum/10;
            sum = sum%10;

            ans.add(sum);
            i--;
        }

        while (j>=0){
            int sum = carry + brr[i];

            carry = sum/10;
            sum = sum%10;

            ans.add(sum);
            j--;
        }

        while (carry!=0){
            int sum = carry;

            carry = sum/10;
            sum = sum%10;

            ans.add(sum);
        }


        System.out.println(ans.reversed());
    }
    public static void main(String[] args) {
        int arr[]={1,2,4};
        int brr[] ={9,9};

        solve(arr,brr,arr.length,brr.length);
        System.out.println();
    }
}
