public class exceptionDemo {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b =0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }


        try{
            int arr[] = {1,2,3};
            int n=5;
            for(int i =0;i<n;i++){
                System.out.print(arr[i]);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


        try{
            int a = 10;
            int b =0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Program finished successfully!!");
        }

    }
}
