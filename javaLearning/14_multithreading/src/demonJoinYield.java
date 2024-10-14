
class firstThread extends Thread{
    public void run(){
        int counter = 1;

        while(true) {
            System.out.println(counter++ + "My thread");
        }
    }
}

public class demonJoinYield {
    public static void main(String[] args) {
        firstThread ft = new firstThread();
        ft.start();

        int counter = 1;

        while(true) {
            System.out.println(counter++ + "main thread");
            Thread.yield();
        }


//        ft.setDaemon(true);
//        ft.start();
//        Thread mainThread = Thread.currentThread();
//        mainThread.join();
    }
}
