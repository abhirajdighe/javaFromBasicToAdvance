public class reverseNumber {
    static int sum =0;
    public static void reverse1(int n){
        if(n==0){
            return;
        }

        int d = n%10;

        sum= sum*10+ d;

        reverse1(n/10);
    }

    public static void main(String[] args) {
        reverse1(1342);
        System.out.println(sum);
    }
}
