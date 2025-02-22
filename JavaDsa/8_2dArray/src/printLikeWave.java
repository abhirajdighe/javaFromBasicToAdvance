public class printLikeWave {

    public static void printWave(int [][] arr,int row,int col){

        for(int i =0;i<col;i++){
            if(i%2 ==0){
                for(int j=0;j<row;j++){
                    System.out.print(arr[j][i] + " ");
                }
            }
            else{
                for(int j=row-1;j>=0;j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        int [][] brr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int row = brr.length;
        int col = brr[0].length;


        for(int i =0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println( " ");
        }

        System.out.println("row "+ brr.length + " "+ "col " + brr[0].length);

        printWave(brr,row,col);
    }
}
