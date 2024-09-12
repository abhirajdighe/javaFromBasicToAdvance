class TestClass{
    public void displayOuter(){
        class inner{
            public void innerDisplay(){
                System.out.println("inner class function");
            }
        }
        inner i = new inner();
        i.innerDisplay();

//        new inner().innerDisplay(); ----> we can also do this
    }
}

public class localInnerClass {
    public static void main(String[] args){
        TestClass ot = new TestClass();
        ot.displayOuter();
    }
}
