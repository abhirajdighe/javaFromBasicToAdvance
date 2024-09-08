public class pattern7 {
    public static void main(String[] args){
        int n = 15;

        int k = 1;

        for(int i =1;i<n && k<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

}
