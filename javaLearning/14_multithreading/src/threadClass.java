//class MyThread extends Thread{
//    public void run(){
//        int i =0;
//        while (true){
//            System.out.println(i+"Hello");
//            i++;
//        }
//    }
//}


public class threadClass extends Thread{

    public void run(){
        int i =0;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
//         type 1
//
//        MyThread t = new MyThread();
//        t.start();
//        int i =0;
//        while (true){
//            System.out.println(i+"World");
//            i++:
//        }

        // type 2

        threadClass t = new threadClass();
        t.start();
        int i =0;
        while (true){
            System.out.println(i+"World");
            i++;
        }

    }
}
