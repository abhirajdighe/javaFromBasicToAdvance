
class Television {
    private int television;

    public void channel(int ch){
        System.out.printf("Channel Number by user is %d \n",ch);
    }

    public void volume(int vol){
        System.out.printf("Volume of channle is %d \n",vol);
    }
}

public class classVsObject {
    public static void main(String[] args){
        Television tv = new Television();
        tv.channel(10);
        tv.volume(80);
    }
}
