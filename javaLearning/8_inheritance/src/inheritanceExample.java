class circle{
    public int radius;

    public void areaOfCircle(){
        double area = Math.PI*radius*radius;
        System.out.println(area);
    }
}

class circleCircumference extends circle{

    public circleCircumference(int r){
        radius = r;
    }

    public void circumference(){
        double cf = 2*Math.PI*radius;
        System.out.println(cf);
    }
}


public class inheritanceExample {
    public static void main(String[] args){
        circleCircumference cr = new circleCircumference(4);
        cr.areaOfCircle();
        cr.circumference();


    }
}
