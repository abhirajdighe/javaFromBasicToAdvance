public class stringBuilderClass {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Abhiraj");

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'a');
        System.out.println(sb);

        sb.append('j');
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);
    }
}
