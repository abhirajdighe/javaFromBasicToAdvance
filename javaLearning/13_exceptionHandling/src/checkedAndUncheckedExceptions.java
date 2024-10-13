import java.io.FileInputStream;

public class checkedAndUncheckedExceptions {
    static void fun1(){
//        FileInputStream fi = new FileInputStream("my.txt");  // checked exceptions
        try{
            System.out.println(10/0); // unchecked exceptions
        }catch( Exception e ){
            System.out.println(e.getMessage());
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String[] args) {
        fun3();
    }
}
