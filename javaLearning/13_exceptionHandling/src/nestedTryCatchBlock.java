public class nestedTryCatchBlock {
    public static void main(String[] args) {
        try{
            try{
                int a=10,b=0,c;
                c = a/b;
            }
            catch (ArithmeticException e){
                System.out.println("Error in inner try block!!!");
                System.out.println(e);
            }
            finally {
//                int arr[] = {1,2,3};
//                int n=5;
//                for(int i =0;i<n;i++){
//                    System.out.print(arr[i] + " ");
//                }

                System.out.println("Inner try-catch block executed");
            }

            int arr[] = {1,2,3};
            int n=5;
            for(int i =0;i<n;i++){
                System.out.print(arr[i] + " ");
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error in outer try block!!!");
            System.out.println(e);
        }
        finally {
            System.out.println("Outer try-catch block executed");
        }
    }
}
