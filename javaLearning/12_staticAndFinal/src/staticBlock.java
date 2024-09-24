class Test{
    static int s;

    static void function1(){
        System.out.println("Block 1");
        s = 10;
        System.out.println(s);
    }

    static void function2(){
        System.out.println("Block 2");
        s = 20;
        System.out.println(s);
    }

    static void function3(){
        System.out.println("Block 3");
        s = 30;
        System.out.println(s);
    }
}

public class staticBlock {
    public static void main(String[] args){
        Test.function1();
        Test.function2();
        Test.function3();
    }
}
