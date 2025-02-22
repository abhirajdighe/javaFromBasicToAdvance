import java.util.Scanner;

public class insertAndPrint2dArray {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];

        Scanner sc = new Scanner(System.in);


        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        for(int i =0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
