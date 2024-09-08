class square{
    private int side;

    public square(){
        System.out.println("Side is not define...!");
    }

    public square(int s){
        side=s;
        areaOfSquare();
    }

    private void areaOfSquare(){
        int area = side*side;
        System.out.printf("Area of Square is: %d \n",area);
    }
}

public class constructor {
    public static void main(String[] args){
        square sq = new square(15);
    }
}
