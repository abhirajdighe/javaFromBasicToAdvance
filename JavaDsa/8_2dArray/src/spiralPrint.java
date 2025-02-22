import java.util.ArrayList;

public class spiralPrint {

    public static void printSpiral(int arr[][]){

        ArrayList<Integer> ans = new ArrayList<Integer>();

        int row = arr.length;
        int col = arr[0].length;

        int count = 0;
        int total = row*col;

        int startingRow = 0;
        int endingRow = row-1;

        int startingCol = 0;
        int endingCol = col-1;

        while(count<total){

            // print Starting Row
            for(int i = startingCol;i<=endingCol && count<total;i++){
                ans.add(arr[startingRow][i]);
                count++;
            }
            startingRow++;

            for(int i =startingRow;i<=endingRow && count<total;i++){
                ans.add(arr[i][endingCol]);
                count++;
            }
            endingCol--;

            for(int i = endingCol;i>=startingCol && count<total;i--){
                ans.add(arr[endingRow][i]);
                count++;
            }
            endingRow--;

            for(int i=endingRow;i>=startingRow && count<total;i--){
                ans.add(arr[i][startingCol]);
                count++;
            }
            startingCol++;

        }
        System.out.println(ans);
//        printArray(ans);


    }

    public static void printArray(ArrayList<Integer> arr){
        for(int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
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

        printSpiral(brr);
    }
}
