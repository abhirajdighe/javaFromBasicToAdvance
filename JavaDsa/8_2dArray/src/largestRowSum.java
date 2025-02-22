public class largestRowSum {

    public static void printSum(int [][] arr,int row,int col){
        int largestSum =0;
        for(int i =0;i<row;i++) {
            int sum =0;
            for (int j = 0; j < col; j++) {
                sum +=arr[i][j];
            }
            System.out.println(sum + " ");
            largestSum = Math.max(largestSum,sum);
        }

        System.out.println("Largest Sum : " + largestSum);
    }

    public static void main(String[] args) {
        int [][] brr = {{1,2},{4,5},{7,8}};

        int row = brr.length;
        int col = brr[0].length;


        for(int i =0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println( " ");
        }

        System.out.println("row "+ brr.length + " "+ "col " + brr[0].length);

        printSum(brr,row,col);
    }
}
