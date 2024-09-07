public class addingCommandLineArguments {
    public static void main(String[] args){
        double sum = 0;
        for(int i =0;i<args.length;i++){
            String str = args[i];
            if(str.matches("[0-9\\.]")){
                double d = Double.parseDouble(args[i]);
                sum += d;
            }
        }

        System.out.printf("Sum of command line argument is: %f ",sum);
    }
}
