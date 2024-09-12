class outer{
    int x = 10;
    class inner{
        int y = 50;

        public void displayInnerclass(){
            System.out.println("display x in innerclass: "+x);
            System.out.println("display y in innerclass: "+y);
        }
    }

    public void displaOuterClass(){
        System.out.println("display x in outer class "+x);
        inner in = new inner();
        System.out.println("display y in outer classv "+in.y);
    }
}



public class nestedInnerClass {
    public static void main(String[] args){
        outer ot = new outer();
        ot.displaOuterClass();
        // ot.displaInnerClass(); ----> this will not run

        // inner in = new inner(); -----> this will also not run
        outer.inner oin = new outer().new inner();
        oin.displayInnerclass();

    }
}
