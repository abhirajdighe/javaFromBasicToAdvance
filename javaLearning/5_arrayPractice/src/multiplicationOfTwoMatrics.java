public class multiplicationOfTwoMatrics {
    public static void main(String[] args){
        int A[][]={{1,2,3},{4,5,6},{13,14,15}};
        int B[][]={{7,8,9},{10,11,12},{16,17,18}};

        int C[][] = new int[3][3];

        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                C[i][j] = 0;
                for(int k =0;k<3;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        for(int x[]:C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }
    }
}
