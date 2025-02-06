public class wrapperClass {
    public static void main(String[] args) {
//        int i =10;
            // Dont use this
        // Integer i = new Integer(10);
        // Integer a = new Integer.valueOf(10);

            // Use this
        Integer a = Integer.valueOf(10);
        System.out.println(a.getClass());

//        Byte f = new Byte(bb);
        Byte c = 15;
        Byte d = Byte.valueOf("15");
        byte bb = 15;
        Byte e = Byte.valueOf(bb);

        Short f = Short.valueOf("123");

        Float g = 12.3f;
        Float h = Float.valueOf(g);
        Float j = Float.valueOf("123.34");

        Double k = Double.valueOf(123.334);

        Character ch = Character.valueOf('A');

        Boolean l = Boolean.valueOf("true");


        // Boxing and Unboxing

        int m = 10;
        Integer n = m; // Auto Boxing
        Integer o = Integer.valueOf(12); // Boxing
        int p = o.intValue(); // Unboxing
        int q = n ; // Auto Unboxing

    }
}
