public class sqrtUsingBinarySearch {

    public  static long binarySearch(int n){
        long s = 0;
        long e = n-1;
        long mid = s + (e-s)/2;
        long ans=0;

        while (s<=e){
            long square = mid*mid;
            if(square == n){
                return mid;
            }

            if(square < n){
                ans = mid;
                s= mid +1;
            }
            else{
                e = mid-1;
            }

            mid = s + (e-s)/2;
        }
        return ans;
    }

    static long mySqrt(int n){
        return binarySearch(n);
    }

    static double morePrecision(int n, int precision, long tempSol){
        double factor = 1d;
        double ans = tempSol;

        for(int i =0;i<precision;i++){
            factor = factor/10; // it will reduce in this way 0.1, 0.01, 0.001 to get precision

            for(double j= ans;(j*j)<n;j = j+factor){
                ans = j;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] testCases = {0, 1, 2, 3, 4, 10, 16, 25, 26, 36 , 101, 2147395600, 2147483647};

        for (int n : testCases) {
            long tempSol = mySqrt(n);

            System.out.println("√" + n + " ≈ " +morePrecision(n,3,tempSol));
        }
    }
}
