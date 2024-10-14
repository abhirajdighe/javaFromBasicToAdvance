class MyThread implements Runnable{
    public void run(){
        int i =0;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        int i =0;
        while (true){
            System.out.println(i+"World");
            i++;
        }

    }
}
