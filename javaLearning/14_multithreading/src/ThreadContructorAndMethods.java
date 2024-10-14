class Mythread extends Thread{
//    public Mythread(String name){
//        super(name);
//    }

    public void run(){

        int counter = 1;

        while(true){
            System.out.println(counter++);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }
}

public class ThreadContructorAndMethods {
    public static void main(String[] args) {
        Mythread mt = new Mythread();

        mt.start();

//        System.out.println(mt.threadId());
//        System.out.println(mt.getName());
//        System.out.println(mt.getPriority());
//        System.out.println(mt.getState());
//        mt.start();
//        System.out.println(mt.getState());

    }
}
